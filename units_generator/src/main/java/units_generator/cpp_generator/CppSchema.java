package units_generator.cpp_generator;

import units_schema.Schema;
import units_schema.UnitType;

import java.util.ArrayList;
import java.util.List;

import units_generator.cpp_generator.CppUnitType;
import units_generator.internal.UnitTypeInterface;
import units_generator.internal.UnitsSchemaInterface;
import units_generator.internal.UnitsTestSuiteInterface;

public class CppSchema implements UnitsSchemaInterface{
	
	private List<UnitTypeInterface> unitTypes;
	
	private static CppSupportChecker supportChecker = new CppSupportChecker();
	
	@Override
	public List<UnitTypeInterface> getUnitTypes() {
		return unitTypes;
	}
	
	@Override
	public List<UnitsTestSuiteInterface> getTestSuites() {
		return null;
	}

	public CppSchema (Schema schema) {
		unitTypes = new ArrayList<UnitTypeInterface>();
		for (UnitType unitType : schema.getUnitTypes()) {
			if (!supportChecker.isSupported(unitType))
				continue;
			CppUnitType cppUnitType = new CppUnitType(unitType); 
			unitTypes.add(cppUnitType);
			UnitsRepository.getInstance().addType(cppUnitType);
		}
	}
	
	public String toString() {
		return "{unit_types=" + unitTypes + "}";
	}
}
