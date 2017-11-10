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
		UnitsExistanceValidator.validateUnitTypeExistance(schema, testSuite.getUnitType());
		UnitType unitType = UnitsExtractor.getUnitType(schema, testSuite.getUnitType());
		for (TestCase testCase : testSuite.getTestCases()) {
			validateTestCase(testCase, unitType);
		}
	}
	
	private static void validateTestCase(
			TestCase testCase,
			UnitType unitType) throws InvalidSchema {
		UnitsExistanceValidator.validateUnitScaleExistance(
				unitType,
				testCase.getFrom());
		UnitsExistanceValidator.validateUnitScaleExistance(
				unitType, 
				testCase.getTo());
	}
}
