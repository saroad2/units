package units_generator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import units_schema.Schema;
import units_schema.UnitType;
import units_schema.UnitScale;

public class SchemaValidator {
	public static String normalize(String name) {
		return name.toLowerCase().replace("_", " ");
	}
	
	public static void validateSchema(Schema schema) throws InvalidSchemaException {
		List<String> typeNames = new ArrayList<String>();
		for (UnitType unitType : schema.getUnitTypes()) {
			String name = NamesManipulator.getName(unitType);
			if(name == null) {
				int thisTypeIndex = schema.getUnitTypes().indexOf(unitType) + 1;
				String errorMessage = 
						"Unit type number " + 
								Integer.toString(thisTypeIndex) +
								" has no type name";
				throw new InvalidSchemaException(errorMessage);
			}
			int indexOfCopyType = typeNames.indexOf(name);
			if (indexOfCopyType != -1)
				throw new InvalidSchemaException(name + " unit type found twice in schema");
			validateUnitType(unitType);
			typeNames.add(name);
		}
	}
	
	public static void validateUnitType(UnitType unitType) throws InvalidSchemaException {
		List<String> scaleNames = new ArrayList<String>();
		for (UnitScale scale : unitType.getUnitScales()) {
			validateUnitScalePrintNames(scale, unitType);
			String name = NamesManipulator.getName(scale);
			if (name == null) {
				throw new InvalidSchemaException(
					"Unit scale number " + 
					Integer.toString(unitType.getUnitScales().indexOf(scale) + 1) +
					" of type " + unitType.getTypeName() + 
					" must have one of the followings:\n" +
					"\t * \"plural name\" slot with string value that has only letters and spaces\n" +
					"\t * \"name\" slot with string value that has only letters and spaces\n");
			}
			int indexOfScale = scaleNames.indexOf(name);
			if (indexOfScale != -1) {
				String errorString = name + " scale of unit type " +
						unitType.getTypeName() + " found twice in schema";
				throw new InvalidSchemaException(errorString);
			}
			validateUnitScale(name, scale);
			scaleNames.add(name);
		}
	}
	
	public static void validateUnitScalePrintNames(UnitScale scale, UnitType unitType) throws InvalidSchemaException {
		if (!NamesManipulator.isValidString(scale.getPluralName())) {
			throw new InvalidSchemaException(
				"Unit scale number " + 
				Integer.toString(unitType.getUnitScales().indexOf(scale) + 1) +
				" of type " + unitType.getTypeName() + 
				" has no plural name."
				);
		}
		if (!NamesManipulator.isValidString(scale.getSingularName())) {
			throw new InvalidSchemaException(
				"Unit scale number " + 
				Integer.toString(unitType.getUnitScales().indexOf(scale) + 1) +
				" of type " + unitType.getTypeName() + 
				" has no singular name."
				);
		}
	}
	
	public static void validateUnitScale(String name, UnitScale scale) throws InvalidSchemaException {
		boolean isBasic = scale.getIsBasic();
		boolean isRatio = scale.getRatio() != null;
		boolean isStringMultiplyer = 
				NamesManipulator.isValidName(scale.getRelativeTo()) &&
				NamesManipulator.isValidName(scale.getMultiplyerString());
		boolean isNumberMultiplyer = 
				NamesManipulator.isValidName(scale.getRelativeTo()) &&
				scale.getMultiplyerNumber() != null;
		if (!BooleanChecker.exactlyOne(isBasic, isRatio, isStringMultiplyer, isNumberMultiplyer)) {
			throw new InvalidSchemaException(
				name + " scale must match EXACTLY ONE of the followings:\n" +
				"\t * has \"is basic\" to be true\n" +
				"\t * has \"multiplyer string\" and \"relative to\"\n" +
				"\t * has \"multiplyer number\" and \"relative to\"\n" +
				"\t * has \"ratio\"\n");
		}
	}
}
