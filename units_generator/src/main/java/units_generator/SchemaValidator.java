package units_generator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import units_schema.Schema;
import units_schema.UnitType;
import units_schema.UnitScale;

public class SchemaValidator {
	public static void validateSchema(Schema schema) throws InvalidSchemaException {
		for (UnitType unitType : schema.getUnitTypes()) {
			if(!isStringValid(unitType.getTypeName())) {
				String errorMessage = 
						"Unit type number " + 
						Integer.toString(schema.getUnitTypes().indexOf(unitType) + 1) +
						" has no type name";
				throw new InvalidSchemaException(errorMessage);
			}
			validateUnitType(unitType);
		}
	}
	
	public static void validateUnitType(UnitType unitType) throws InvalidSchemaException {
		for (UnitScale scale : unitType.getUnitScales()) {
			validateUnitScalePrintNames(scale, unitType);
			String name = getName(scale, unitType);
			validateUnitScale(name, scale);
		}
	}
	
	public static void validateUnitScalePrintNames(UnitScale scale, UnitType unitType) throws InvalidSchemaException {
		if (!isStringValid(scale.getPluralName())) {
			throw new InvalidSchemaException(
				"Unit scale number " + 
				Integer.toString(unitType.getUnitScales().indexOf(scale) + 1) +
				" of type " + unitType.getTypeName() + 
				" has no plural name."
				);
		}
		if (!isStringValid(scale.getSingularName())) {
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
				isStringValid(scale.getRelativeTo()) &&
				isStringValid(scale.getMultiplyerString());
		boolean isNumberMultiplyer = 
				isStringValid(scale.getRelativeTo()) &&
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
	
	public static boolean isStringValid(String s) {
		return s != null && !s.isEmpty();
	}
	
	public static boolean isValidName(String s) {
		if (!isStringValid(s))
			return false;
		Pattern p = Pattern.compile("^[ A-Za-z]+$");
		Matcher m = p.matcher(s);
		return m.matches();
	}
	
	public static String getName(UnitScale scale, UnitType unitType) throws InvalidSchemaException{
		if (isValidName(scale.getName()))
			return scale.getName();
		if (!isValidName(scale.getPluralName())) {
			throw new InvalidSchemaException(
				"Unit scale number " + 
				Integer.toString(unitType.getUnitScales().indexOf(scale) + 1) +
				" of type " + unitType.getTypeName() + 
				" must have one of the followings:\n" +
				"\t * \"plural name\" slot with string value that has only letters and spaces\n" +
				"\t * \"name\" slot with string value that has only letters and spaces\n");
		}
		return scale.getPluralName();
	}
}
