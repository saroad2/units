package units_generator.schema_validator;

import units_generator.schema_validator.exceptions.*;
import units_schema.Schema;
import units_schema.TestSuite;
import units_schema.UnitType;

public class SchemaValidator {

	public static void validateSchema(
			Schema schema) throws InvalidSchema {
		for (UnitType unitType : schema.getUnitTypes()) {
			UnitTypeValidator.validate(schema, unitType);
		}
		for (TestSuite testSuite : schema.getTests().getTestSuites()) {
			TestSuiteValidator.validate(schema, testSuite);
		}
	}
}
