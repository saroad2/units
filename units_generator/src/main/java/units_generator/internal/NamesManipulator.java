package units_generator.internal;

import units_schema.UnitType;
import units_schema.UnitScale;

import units_generator.schema_validator.NamesValidator;

public class NamesManipulator {

	public static String normalize(String name) {
		if(name == null)
			return null;
		return name.trim().toLowerCase().replace("_", " ");
	}
	
	public static String getName(UnitType unitType) {
		if (!NamesValidator.isValidPrintName(unitType.getTypeName()))
			return null;
		return normalize(unitType.getTypeName());
	}
	
	public static String getName(UnitScale scale) {
		if (NamesValidator.isValidName(scale.getName()))
			return normalize(scale.getName());
		if (NamesValidator.isValidName(scale.getPluralName()))
			return normalize(scale.getPluralName());
		return null;
	}
}
