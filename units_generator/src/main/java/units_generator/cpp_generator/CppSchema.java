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
	private Map<String, CppUnitType> nameToUnitType;
	
	public List<CppUnitType> getUnitTypes() {
		return unitTypes;
	}

	public CppSchema (Schema schema) {
		unitTypes = new ArrayList<CppUnitType>();
		nameToUnitType = new HashMap<String, CppUnitType>();
		for (UnitType unitType : schema.getUnitTypes()) {
			CppUnitType cppUnitType = new CppUnitType(unitType, nameToUnitType); 
			unitTypes.add(cppUnitType);
			nameToUnitType.put(cppUnitType.getTypeName(), cppUnitType);
		}
	}
	
	public String toString() {
		return "{unit_types=" + unitTypes + "}";
	}
}
