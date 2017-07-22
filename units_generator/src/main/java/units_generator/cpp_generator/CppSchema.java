package units_generator.cpp_generator;

import units_schema.Schema;
import units_schema.UnitType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import units_generator.cpp_generator.CppUnitScale;
import units_generator.cpp_generator.CppUnitType;
public class CppSchema {
	
	private List<CppUnitType> unitTypes;
	
	public List<CppUnitType> getUnitTypes() {
		return unitTypes;
	}

	public CppSchema (Schema schema) {
		unitTypes = new ArrayList<CppUnitType>();
		for (UnitType unitType : schema.getUnitTypes()) {
			CppUnitType cppUnitType = new CppUnitType(unitType); 
			unitTypes.add(cppUnitType);
			UnitsRepository.getInstance().addType(cppUnitType);
		}
	}
	
	public String toString() {
		return "{unit_types=" + unitTypes + "}";
	}
}
