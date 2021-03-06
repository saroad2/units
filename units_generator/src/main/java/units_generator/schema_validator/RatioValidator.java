package units_generator.schema_validator;

import units_generator.schema_validator.exceptions.InvalidSchema;
import units_schema.Ratio;
import units_schema.Schema;

public class RatioValidator {

	/* Validation Functions*/
	public static void validateUnitTypesRatio(
			Schema schema,
			Ratio ratio,
			String context) throws InvalidSchema{
		for (String unitTypeName : ratio.getNumerators())
			UnitsExistanceValidator.validateUnitTypeExistanceCount(
					schema,
					unitTypeName,
					context);
		for (String unitTypeName : ratio.getDenominators())
			UnitsExistanceValidator.validateUnitTypeExistanceCount(
					schema,
					unitTypeName,
					context);
	}
	
	public static void validateUnitScalesRatio(
			Schema schema,
			Ratio ratio,
			String context) throws InvalidSchema{
		for (String unitTypeName : ratio.getNumerators())
			UnitsExistanceValidator.validateUnitScaleExistanceCount(
					schema,
					unitTypeName,
					context);
		for (String unitTypeName : ratio.getDenominators())
			UnitsExistanceValidator.validateUnitScaleExistanceCount(
					schema, 
					unitTypeName,
					context);
	}
}
