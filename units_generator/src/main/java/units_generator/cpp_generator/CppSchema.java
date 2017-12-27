package units_generator.cpp_generator;

import units_schema.ConstantsGroup;
import units_schema.Schema;
import units_schema.TestSuite;
import units_schema.UnitType;

import java.util.ArrayList;
import java.util.List;

import units_generator.cpp_generator.CppUnitType;
import units_generator.internal.ConstantsGroupInterface;
import units_generator.internal.AbstractUnitType;
import units_generator.internal.AbstractUnitsSchema;
import units_generator.internal.UnitsTestSuiteInterface;

public class CppSchema extends AbstractUnitsSchema {
	
	private List<AbstractUnitType> unitTypes;
	private List<UnitsTestSuiteInterface> testSuites;
	private List<ConstantsGroupInterface> constantsGroups;
	
	private static CppSupportChecker supportChecker = new CppSupportChecker();
	
	@Override
	public List<AbstractUnitType> getUnitTypes() {
		return unitTypes;
	}
	
	@Override
	public List<UnitsTestSuiteInterface> getTestSuites() {
		return testSuites;
	}
	
	@Override
	public List<ConstantsGroupInterface> getConstantsGroups() {
		return constantsGroups;
	}

	public CppSchema (Schema schema) {
		unitTypes = new ArrayList<AbstractUnitType>();
		testSuites = new ArrayList<>();
		constantsGroups = new ArrayList<>();
		for (UnitType unitType : schema.getUnitTypes()) {
			if (!supportChecker.isSupported(unitType))
				continue;
			CppUnitType cppUnitType = new CppUnitType(this, unitType); 
			unitTypes.add(cppUnitType);
			TestSuite testSuite = schema.getTests().getTestSuites().stream()
					.filter((someTestSuite) -> someTestSuite.getUnitType().equals(unitType.getTypeName()))
					.findFirst()
					.orElse(null);
			if (testSuite != null)
				testSuites.add(new CppUnitsTestSuite(testSuite));
		}
		for (ConstantsGroup group : schema.getConstants().getConstantsGroups()) {
			constantsGroups.add(new CppConstantsGroup(this, group));
		}
	}

	@Override
	public String toString() {
		return "CppSchema [unitTypes=" + unitTypes + ", testSuites=" + testSuites + "]";
	}
}
