package units_generator.schema_validator;

import java.util.List;
import java.util.stream.Collectors;

import units_generator.internal.NamesManipulator;
import units_generator.schema_validator.exceptions.InvalidConversionTest;
import units_generator.schema_validator.exceptions.InvalidSchema;
import units_generator.schema_validator.exceptions.InvalidTestSuiteCount;
import units_schema.Schema;
import units_schema.TestSuite;
import units_schema.UnitScale;
import units_schema.UnitType;

public class UnitTypeValidator {

	/*Validation Functions*/
	public static void validate(
			Schema schema,
			UnitType unitType) throws InvalidSchema{
		String unitTypeName = NamesManipulator.getName(unitType);
		NamesValidator.validateName(unitTypeName);
		UnitsExistanceValidator.validateUnitTypeExistanceCount(schema, unitTypeName);
		if (unitType.getRatio() != null)
			RatioValidator.validateUnitTypesRatio(schema, unitType.getRatio());
		for (UnitScale scale : unitType.getUnitScales()) {
			UnitScaleValidator.validateUnitScale(schema, scale);
		}
		validateUnitTypeTestSuite(schema, unitType);
	}
	
	private static void validateUnitTypeTestSuite(
			Schema schema,
			UnitType unitType) throws InvalidSchema {
		String typeName = NamesManipulator.getName(unitType);
		TestSuite testSuite = getTestSuite(schema, typeName);
		for (int i=1; i < unitType.getUnitScales().size(); ++i) {
			for (int j=0; j < i; ++j) {
				String unitScale1 = NamesManipulator.getName(unitType.getUnitScales().get(i));
				String unitScale2 = NamesManipulator.getName(unitType.getUnitScales().get(j));
				validateTestCaseExistance(unitScale1, unitScale2, testSuite);
				validateTestCaseExistance(unitScale2, unitScale1, testSuite);
			}
		}
	}
	
	private static TestSuite getTestSuite(
			Schema schema,
			String typeName) throws InvalidSchema{
		List<TestSuite> unitTypeTestSuites = schema.getTests().getTestSuites().stream()
				.filter((testSuite) -> typeName.equals(testSuite.getUnitType()))
				.collect(Collectors.toList());
		if (unitTypeTestSuites.size() != 1)
			throw new InvalidTestSuiteCount(typeName, unitTypeTestSuites.size());
		return unitTypeTestSuites.get(0);
	}

	private static void validateTestCaseExistance(
			String from,
			String to,
			TestSuite testSuite) throws InvalidSchema {
		long testCaseCount = testSuite.getTestCases().stream()
			.filter((testCase) ->
				from.equals(testCase.getFrom()) &&
				to.equals(testCase.getTo()))
			.count();
		if (testCaseCount != 1) {
			throw new InvalidConversionTest(testCaseCount, from, to);
		}
	}
}
