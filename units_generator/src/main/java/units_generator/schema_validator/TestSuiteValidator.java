package units_generator.schema_validator;

import units_generator.internal.UnitsExtractor;
import units_generator.schema_validator.exceptions.InvalidSchema;
import units_schema.Schema;
import units_schema.TestCase;
import units_schema.TestSuite;
import units_schema.UnitType;

public class TestSuiteValidator {

	public static void validate(
			Schema schema,
			TestSuite testSuite) throws InvalidSchema {
		validateUnitTypeOfTestSuite(schema, testSuite);
		String context = getContext(testSuite);
		UnitType unitType = UnitsExtractor.getUnitType(schema, testSuite.getUnitType());
		for (TestCase testCase : testSuite.getTestCases()) {
			validateTestCase(testCase, unitType, context);
		}
	}

	private static void validateUnitTypeOfTestSuite(Schema schema, TestSuite testSuite) throws InvalidSchema {
		String context = getAnonymousTestSuiteContext(schema, testSuite);
		UnitsExistanceValidator.validateUnitTypeExistanceCount(
				schema,
				testSuite.getUnitType(),
				context);
	}
	
	private static void validateTestCase(
			TestCase testCase,
			UnitType unitType,
			String context) throws InvalidSchema {
		UnitsExistanceValidator.validateUnitScaleExistanceCount(
				unitType,
				testCase.getFrom(),
				context);
		UnitsExistanceValidator.validateUnitScaleExistanceCount(
				unitType, 
				testCase.getTo(),
				context);
	}

	/*Contexts*/
	private static String getAnonymousTestSuiteContext(
			Schema schema,
			TestSuite testSuite)
	{
		int testSuiteIndex = schema.getTests().getTestSuites().indexOf(testSuite) + 1;
		return "in test suite number " + testSuiteIndex;
	}
	
	/*Contexts*/
	private static String getContext(TestSuite testSuite)
	{
		return "in \"" + testSuite.getUnitType() + "\" test suite";
	}
}
