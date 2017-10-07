package units_generator.cpp_generator;

import units_generator.internal.UnitsTestCaseInterface;
import units_schema.TestCase;

public class CppUnitsTestCase implements UnitsTestCaseInterface {

	private String from;
	private String to;
	private double value;
	
	public CppUnitsTestCase(TestCase testCase) {
		from = testCase.getFrom();
		to = testCase.getTo();
		value = testCase.getValue();
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

}
