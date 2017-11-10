package units_generator.schema_validator;

import units_generator.internal.NamesManipulator;
import units_generator.schema_validator.exceptions.InvalidScaleDefinition;
import units_generator.schema_validator.exceptions.InvalidSchema;
import units_schema.Schema;
import units_schema.UnitScale;

public class UnitScaleValidator {

	/*Validation Functions*/
	public static void validateUnitScale(
			Schema schema,
			UnitScale unitScale)  throws InvalidSchema {
		NamesValidator.validatePrintedName(unitScale.getSingularName());
		NamesValidator.validatePrintedName(unitScale.getPluralName());
		String unitScaleName = NamesManipulator.getName(unitScale);
		NamesValidator.validateName(unitScaleName);
		UnitsExistanceValidator.validateUnitScaleExistance(schema, unitScaleName);
		validateUnitScaleDefinition(unitScale);
		if (unitScale.getRatio() != null)
			RatioValidator.validateUnitScalesRatio(schema, unitScale.getRatio());
	}

	private static void validateUnitScaleDefinition(
			UnitScale scale) throws InvalidSchema {
		boolean isBasic = scale.getIsBasic();
		boolean isRatio = scale.getRatio() != null;
		boolean isStringMultiplier = 
				NamesManipulator.isValidName(scale.getRelativeTo()) &&
				NamesManipulator.isValidName(scale.getMultiplierString());
		boolean isNumberMultiplier = 
				NamesManipulator.isValidName(scale.getRelativeTo()) &&
				scale.getMultiplierNumber() != null;
		if (!BooleanChecker.exactlyOne(
				isBasic,
				isRatio,
				isStringMultiplier,
				isNumberMultiplier)) {
			throw new InvalidScaleDefinition(NamesManipulator.getName(scale));
		}
	}
}
