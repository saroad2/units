package units_generator.internal;

import units_schema.Schema;
import units_schema.UnitScale;
import units_schema.UnitType;

public class UnitsExtractor {
	
	public static UnitType getUnitType(Schema schema, String unitTypeName) {
		for (UnitType unitType : schema.getUnitTypes()) {
			if (NamesManipulator.getName(unitType).equals(unitTypeName))
				return unitType;
		}
		return null;
	}
	
	public static UnitScale getUnitScale(Schema schema, String unitScaleName) {
		for (UnitType unitType : schema.getUnitTypes()) {
			UnitScale checkUnitScale = getUnitScale(unitType, unitScaleName);
			if (checkUnitScale != null)
				return checkUnitScale;
		}
		return null;
	}
	
	public static UnitScale getUnitScale(UnitType unitType, String unitScaleName) {
		for (UnitScale unitScale : unitType.getUnitScales()) {
			if (NamesManipulator.getName(unitScale).equals(unitScaleName))
				return unitScale;
		}
		return null;
	}
}
