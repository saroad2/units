package units_generator.schema_validator;

import java.util.List;
import java.util.stream.Collectors;

import units_generator.internal.NamesManipulator;
import units_generator.schema_validator.exceptions.InvalidConversionTestCount;
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
		validateUnitTypeName(schema, unitType);
		validateRatio(schema, unitType);
		validateUnitScales(schema, unitType);
		validateUnitTypeTestSuite(schema, unitType);
	}

	private static void validateUnitTypeName(Schema schema, UnitType unitType) throws InvalidSchema {
		String context = getAnonymousUnitTypeContext(schema, unitType);
		String unitTypeName = NamesManipulator.getName(unitType);
		NamesValidator.validateName(unitTypeName, context);
		UnitsExistanceValidator.validateUnitTypeExistanceCount(schema, unitTypeName, context);
	}

	private static void validateRatio(Schema schema, UnitType unitType) throws InvalidSchema {
		String context = getContext(unitType);
		if (unitType.getRatio() != null)
			RatioValidator.validateUnitTypesRatio(schema, unitType.getRatio(), context);
	}
	
	private static void validateUnitScales(Schema schema, UnitType unitType) throws InvalidSchema {
		for (UnitScale scale : unitType.getUnitScales()) {
			UnitScaleValidator.validateUnitScale(schema, unitType, scale);
		}
	}
	
	private static void validateUnitTypeTestSuite(
			Schema schema,
			UnitType unitType) throws InvalidSchema {
		if (unitType.getUnitScales().size() <= 1)
			return;
		String context = getContext(unitType);
		String typeName = NamesManipulator.getName(unitType);
		TestSuite testSuite = getTestSuite(schema, typeName, context);
		for (int i=1; i < unitType.getUnitScales().size(); ++i) {
			for (int j=0; j < i; ++j) {
				String unitScale1 = NamesManipulator.getName(unitType.getUnitScales().get(i));
				String unitScale2 = NamesManipulator.getName(unitType.getUnitScales().get(j));
				validateTestCaseExistance(unitScale1, unitScale2, testSuite, context);
				validateTestCaseExistance(unitScale2, unitScale1, testSuite, context);
			}
		}
	}
	
	private static TestSuite getTestSuite(
			Schema schema,
			String unitTypeName,
			String context) throws InvalidSchema{
		List<TestSuite> unitTypeTestSuites = schema.getTests().getTestSuites().stream()
				.filter((testSuite) -> unitTypeName.equals(testSuite.getUnitType()))
				.collect(Collectors.toList());
		if (unitTypeTestSuites.size() != 1)
			throw new InvalidTestSuiteCount(unitTypeName, unitTypeTestSuites.size(), context);
		return unitTypeTestSuites.get(0);
	}

	private static void validateTestCaseExistance(
			String from,
			String to,
			TestSuite testSuite,
			String context) throws InvalidSchema {
		long testCaseCount = testSuite.getTestCases().stream()
			.filter((testCase) ->
				from.equals(testCase.getFrom()) &&
				to.equals(testCase.getTo()))
			.count();
		if (testCaseCount != 1) {
			throw new InvalidConversionTestCount(from, to, testCaseCount, context);
		}
	}
	
	/*Contexts*/
	private static String getAnonymousUnitTypeContext(
			Schema schema,
			UnitType unitType)
	{
		int unitScaleIndex = schema.getUnitTypes().indexOf(unitType) + 1;
		return "in unit type number " + unitScaleIndex;
	}
	
	/*Contexts*/
	private static String getContext(UnitType unitType)
	{
		String unitTypeName = NamesManipulator.getName(unitType);
		return "in \"" + unitTypeName + "\" definition";
	}
}
