package units_generator.schema_validator;

import units_generator.schema_validator.exceptions.InvalidSchema;
import units_schema.Ratio;
import units_schema.Schema;

public class RatioValidator {

	/* Validation Functions*/
	public static void validateUnitTypesRatio(
			Schema schema,
			Ratio ratio) throws InvalidSchema{
		for (String unitTypeName : ratio.getNumerators())
			UnitsExistanceValidator.validateUnitTypeExistance(schema, unitTypeName);
		for (String unitTypeName : ratio.getDenominators())
			UnitsExistanceValidator.validateUnitTypeExistance(schema, unitTypeName);
	}
	
	public static void validateUnitScalesRatio(
			Schema schema,
			Ratio ratio) throws InvalidSchema{
		for (String unitTypeName : ratio.getNumerators())
			UnitsExistanceValidator.validateUnitScaleExistance(schema, unitTypeName);
		for (String unitTypeName : ratio.getDenominators())
			UnitsExistanceValidator.validateUnitScaleExistance(schema, unitTypeName);
	}
}
