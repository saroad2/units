package units_generator.schema_validator;

import units_generator.internal.NamesManipulator;
import units_generator.schema_validator.exceptions.EmptyName;
import units_generator.schema_validator.exceptions.InvalidSchema;
import units_generator.schema_validator.exceptions.InvalidUnitScaleCount;
import units_generator.schema_validator.exceptions.InvalidUnitTypeCount;
import units_schema.Schema;
import units_schema.UnitType;

public class UnitsExistanceValidator {
	
	/* Validation Functions*/
	public static void validateUnitTypeExistanceCount(
			Schema schema,
			String unitTypeName,
			String context) throws InvalidSchema {
		if (unitTypeName == null || unitTypeName.isEmpty())
			throw new EmptyName(context);
		long count = getUnitTypeNameCount(schema, unitTypeName); 
		if (count != 1)
			throw new InvalidUnitTypeCount(unitTypeName, count, context);
	}

	public static void validateUnitScaleExistanceCount(
			Schema schema,
			String unitScaleName,
			String context) throws InvalidSchema {
		if (unitScaleName == null || unitScaleName.isEmpty())
			throw new EmptyName(context);
		long count = getUnitScaleNameCount(schema, unitScaleName); 
		if (count != 1)
			throw new InvalidUnitScaleCount(unitScaleName, count, context);
	}
	
	public static void validateUnitScaleExistanceCount(
			UnitType unitType,
			String unitScaleName,
			String context) throws InvalidSchema {
		if (unitScaleName == null || unitScaleName.isEmpty())
			throw new EmptyName(context);
		long count = getUnitScaleNameCount(unitType, unitScaleName); 
		if (count != 1)
			throw new InvalidUnitScaleCount(unitScaleName, count, context);
	}
	
	/* Count Functions*/
	private static long getUnitTypeNameCount(Schema schema, String unitTypeName) {
		return schema.getUnitTypes().stream()
				.filter((someUnitType) -> unitTypeName.equals(NamesManipulator.getName(someUnitType)))
				.count();
	}

	private static long getUnitScaleNameCount(Schema schema, String unitScaleName) {
		return schema.getUnitTypes().stream()
				.mapToLong((unitType) -> getUnitScaleNameCount(unitType, unitScaleName))
				.sum();
	}
	
	private static long getUnitScaleNameCount(
			UnitType unitType,
			String unitScaleName) {
		return unitType.getUnitScales().stream()
				.filter((someUnitScale) -> unitScaleName.equals(NamesManipulator.getName(someUnitScale)))
				.count();
	}

}
