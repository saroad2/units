package units_generator.cpp_generator;

import units_generator.internal.UnitsTestCaseInterface;
import units_schema.TestCase;

public class CppUnitsTestCase implements UnitsTestCaseInterface {

	private String from;
	private String to;
	private double value;
	private String testName;
	
	public CppUnitsTestCase(TestCase testCase) {
		from = CppNamesFormatter.formatClassName(testCase.getFrom());
		to = CppNamesFormatter.formatClassName(testCase.getTo());
		value = testCase.getValue();
		testName = from.replace(" ", "_") + "_to_" + to.replace(" ", "_"); 
	}
	
	@Override
	public String getFrom() {
		return from;
	}

	@Override
	public String getTo() {
		return to;
	}

	@Override
	public double getValue() {
		return value;
	}

	public String getTestName() {
		return testName;
	}

}
