package units_generator.cpp_generator;

import units_schema.Schema;
import units_schema.UnitType;

import java.util.ArrayList;
import java.util.logging.Level;

import units_generator.cpp_generator.CppUnitScale;
import units_generator.cpp_generator.CppUnitType;
public class CppSchema {
	
	private ArrayList<CppUnitType> unitTypes;
	
	public ArrayList<CppUnitType> getUnitTypes() {
		return unitTypes;
	}

	public CppSchema (Schema schema) {
		unitTypes = new ArrayList<CppUnitType>();
		for (UnitType unitType : schema.getUnitTypes()) {
			unitTypes.add(new CppUnitType(unitType));
		}
	}
	
	public String toString() {
		return "{unit_types=" + unitTypes + "}";
	}
}
