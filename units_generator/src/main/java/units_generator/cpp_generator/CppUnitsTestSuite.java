package units_generator.cpp_generator;

import java.util.ArrayList;
import java.util.List;

import units_generator.internal.UnitsTestCaseInterface;
import units_generator.internal.UnitsTestSuiteInterface;
import units_schema.TestCase;
import units_schema.TestSuite;

public class CppUnitsTestSuite implements UnitsTestSuiteInterface {

	private String unitType;
	private List<UnitsTestCaseInterface> testCases;
	
	
	public CppUnitsTestSuite(TestSuite testSuite) {
		unitType = testSuite.getUnitType();
		testCases = new ArrayList<>();
		for (TestCase testCase : testSuite.getTestCases()) {
			testCases.add(new CppUnitsTestCase(testCase));
		}
	}
	
	@Override
	public String getUnitType() {
		return unitType;
	}

	@Override
	public List<UnitsTestCaseInterface> getTestCases() {
		return testCases;
	}

}
