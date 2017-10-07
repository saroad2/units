package units_generator.cpp_generator;

import units_schema.Schema;
import units_schema.TestSuite;
import units_schema.UnitType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import units_generator.cpp_generator.CppUnitType;
import units_generator.internal.UnitTypeInterface;
import units_generator.internal.UnitsSchemaInterface;
import units_generator.internal.UnitsTestSuiteInterface;

public class CppSchema implements UnitsSchemaInterface{
	
	private List<UnitTypeInterface> unitTypes;
	private List<UnitsTestSuiteInterface> testSuites;
	
	private static CppSupportChecker supportChecker = new CppSupportChecker();
	
	@Override
	public List<UnitTypeInterface> getUnitTypes() {
		return unitTypes;
	}
	
	@Override
	public List<UnitsTestSuiteInterface> getTestSuites() {
		return testSuites;
	}

	public CppSchema (Schema schema) {
		unitTypes = new ArrayList<UnitTypeInterface>();
		testSuites = new ArrayList<>();
		for (UnitType unitType : schema.getUnitTypes()) {
			if (!supportChecker.isSupported(unitType))
				continue;
			CppUnitType cppUnitType = new CppUnitType(unitType); 
			unitTypes.add(cppUnitType);
			UnitsRepository.getInstance().addType(cppUnitType);
			TestSuite testSuite = schema.getTests().getTestSuites().stream()
					.filter((someTestSuite) -> someTestSuite.getUnitType().equals(unitType.getTypeName()))
					.collect(Collectors.toList()).get(0);			
			testSuites.add(new CppUnitsTestSuite(testSuite));
		}
	}

	@Override
	public String toString() {
		return "CppSchema [unitTypes=" + unitTypes + ", testSuites=" + testSuites + "]";
	}
}
