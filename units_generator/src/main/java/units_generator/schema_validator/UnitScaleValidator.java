package units_generator.schema_validator;

import units_generator.internal.NamesManipulator;
import units_generator.schema_validator.exceptions.InvalidScaleDefinition;
import units_generator.schema_validator.exceptions.InvalidSchema;
import units_schema.Schema;
import units_schema.UnitScale;
import units_schema.UnitType;

public class UnitScaleValidator {

	/*Validation Functions*/
	public static void validateUnitScale(
			Schema schema,
			UnitType unitType,
			UnitScale unitScale)  throws InvalidSchema {
		String context = getAnonymousUnitScaleContext(unitType, unitScale);
		NamesValidator.validatePrintedName(unitScale.getSingularName(), context);
		NamesValidator.validatePrintedName(unitScale.getPluralName(), context);
		String unitScaleName = NamesManipulator.getName(unitScale);
		NamesValidator.validateName(unitScaleName, context);
		UnitsExistanceValidator.validateUnitScaleExistanceCount(schema, unitScaleName, context);
		validateUnitScaleDefinition(schema, unitScale);
	}

	private static void validateUnitScaleDefinition(
			Schema schema,
			UnitScale unitScale) throws InvalidSchema {
		String context = getContext(unitScale);
		boolean isBasic = unitScale.getIsBasic();
		boolean isRatio = unitScale.getRatio() != null;
		boolean isStringMultiplier = 
				NamesManipulator.isValidName(unitScale.getRelativeTo()) &&
				NamesManipulator.isValidName(unitScale.getMultiplierString());
		boolean isNumberMultiplier = 
				NamesManipulator.isValidName(unitScale.getRelativeTo()) &&
				unitScale.getMultiplierNumber() != null;
		if (!BooleanChecker.exactlyOne(
				isBasic,
				isRatio,
				isStringMultiplier,
				isNumberMultiplier)) {
			throw new InvalidScaleDefinition(NamesManipulator.getName(unitScale), context);
		}
		if (unitScale.getRatio() != null)
			RatioValidator.validateUnitScalesRatio(schema, unitScale.getRatio(), context);
	}
	
	/*Contexts*/
	private static String getAnonymousUnitScaleContext(
			UnitType unitType,
			UnitScale unitScale)
	{
		int unitScaleIndex = unitType.getUnitScales().indexOf(unitScale) + 1;
		String unitTypeName = NamesManipulator.getName(unitType);
		return "in unit scale number " + unitScaleIndex + " of \"" + unitTypeName + "\"";
	}
	
	/*Contexts*/
	private static String getContext(UnitScale unitScale)
	{
		String unitScaleName = NamesManipulator.getName(unitScale);
		return "in \"" + unitScaleName + "\" definition";
	}
}
