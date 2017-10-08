package units_generator.java_generator;

import java.util.ArrayList;
import java.util.List;

import units_generator.internal.UnitsTestCaseInterface;
import units_generator.internal.UnitsTestSuiteInterface;
import units_schema.TestCase;
import units_schema.TestSuite;

public class JavaTestSuite implements UnitsTestSuiteInterface {

	private String unitType;
	private List<UnitsTestCaseInterface> testCases;
	private String name;
	private String packageName;
	
	public JavaTestSuite(TestSuite testSuite) {
		unitType = testSuite.getUnitType();
		testCases = new ArrayList<>();
		for (TestCase testCase : testSuite.getTestCases()) {
			testCases.add(new JavaTestCase(testCase));
		}
		name = JavaNamesFormatter.formatClassName( unitType + " casting tests");
		packageName = JavaNamesFormatter.formatPackageName(unitType);
	}
	
	@Override
	public String getUnitType() {
		return unitType;
	}

	@Override
	public List<UnitsTestCaseInterface> getTestCases() {
		return testCases;
	}

	public String getName() {
		return name;
	}

	public String getPackageName() {
		return packageName;
	}

}
