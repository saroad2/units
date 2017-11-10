package units_generator.schema_validator;

import java.util.List;
import java.util.stream.Collectors;

import units_generator.internal.NamesManipulator;
import units_generator.schema_validator.exceptions.*;
import units_schema.Ratio;
import units_schema.Schema;
import units_schema.TestCase;
import units_schema.TestSuite;
import units_schema.UnitType;
import units_schema.UnitScale;

public class SchemaValidator {

	public static void validateSchema(
			Schema schema) throws InvalidSchema {
		for (UnitType unitType : schema.getUnitTypes()) {
			validateUnitType(schema, unitType);
		}
		for (TestSuite testSuite : schema.getTests().getTestSuites()) {
			validateTestSuite(testSuite, schema);
		}
	}
	
	public static void validateUnitType(
			Schema schema,
			UnitType unitType) throws InvalidSchema {
		int thisTypeIndex = schema.getUnitTypes().indexOf(unitType) + 1;
		String typeName = NamesManipulator.getName(unitType);
		validateUnitTypeName(typeName, thisTypeIndex);
		UnitsExistanceValidator.validateUnitTypeExistance(schema, typeName);
		if (unitType.getRatio() != null)
			validateRatioType(schema, typeName, unitType.getRatio());
		for (UnitScale scale : unitType.getUnitScales()) {
			validateUnitScale(schema, unitType, scale);
		}
		validateUnitTypeTestSuite(schema, unitType);
	}

	private static void validateUnitTypeName(
			String name,
			int thisTypeIndex) throws InvalidSchema {
		if(name == null) {
			throw new InvalidUnitTypeName(thisTypeIndex);
		}
	}
	
	private static void validateRatioType(
			Schema schema,
			String typeName,
			Ratio ratio
			) throws InvalidSchema {
		validateRatio(typeName, ratio);
		validateUnitTypesList(schema, ratio.getNumerators());
		validateUnitTypesList(schema, ratio.getDenominators());
	}
	
	private static void validateRatio(
			String definedUnit,
			Ratio ratio) throws InvalidSchema {
		if (ratio.getNumerators() == null)
			throw new InvalidNumeratorsInRatio(definedUnit);
		if (ratio.getDenominators() == null)
			throw new InvalidDenominatorsInRatio(definedUnit);
	}
	
	private static void validateUnitTypesList(
			Schema schema,
			List<String> unitTypesList) throws InvalidSchema {
		for (String unitTypeName : unitTypesList) {
			UnitsExistanceValidator.validateUnitTypeExistance(schema, unitTypeName);
		}
	}
	
	public static void validateUnitScale(
			Schema schema,
			UnitType unitType,
			UnitScale scale) throws InvalidSchema {
		String typeName = NamesManipulator.getName(unitType);
		int thisScaleIndex = unitType.getUnitScales().indexOf(scale) + 1;
		validateUnitScalePrintNames(scale, thisScaleIndex, typeName);
		String scaleName = NamesManipulator.getName(scale);
		validateUnitScaleName(scaleName, thisScaleIndex, typeName);
		UnitsExistanceValidator.validateUnitScaleExistance(schema, scaleName);
		validateUnitScaleDefinition(scale);
		if (scale.getRatio() != null)
			validateRatioScale(schema, scaleName, scale.getRatio());
	}

	public static void validateUnitScalePrintNames(
			UnitScale scale,
			int index,
			String typeName) throws InvalidSchema {
		if (!NamesManipulator.isValidString(scale.getPluralName()))
			throw new InvalidPluralName(index, typeName);
		if (!NamesManipulator.isValidString(scale.getSingularName()))
			throw new InvalidSingularName(index, typeName);
	}
	
	private static void validateUnitScaleName(
			String scaleName,
			int thisScaleIndex,
			String typeName) throws InvalidSchema {
		if (scaleName == null) {
			throw new InvalidUnitScaleName(thisScaleIndex, typeName);
		}
	}

	private static void validateUnitScaleDefinition(
			UnitScale scale) throws InvalidSchema {
		boolean isBasic = scale.getIsBasic();
		boolean isRatio = scale.getRatio() != null;
		boolean isStringMultiplier = 
				NamesManipulator.isValidName(scale.getRelativeTo()) &&
				NamesManipulator.isValidName(scale.getMultiplierString());
		boolean isNumberMultiplier = 
				NamesManipulator.isValidName(scale.getRelativeTo()) &&
				scale.getMultiplierNumber() != null;
		if (!BooleanChecker.exactlyOne(
				isBasic,
				isRatio,
				isStringMultiplier,
				isNumberMultiplier)) {
			throw new InvalidScaleDefinition(NamesManipulator.getName(scale));
		}
	}
	
	private static void validateRatioScale(
			Schema schema,
			String scaleName,
			Ratio ratio
			) throws InvalidSchema {
		validateRatio(scaleName, ratio);
		validateUnitScalesList(schema, ratio.getNumerators());
		validateUnitScalesList(schema, ratio.getDenominators());
	}
	
	private static void validateUnitScalesList(
			Schema schema,
			List<String> unitScalesList) throws InvalidSchema {
		for (String unitScaleName : unitScalesList) {
			UnitsExistanceValidator.validateUnitScaleExistance(schema, unitScaleName);;
		}
	}

	private static void validateUnitTypeTestSuite(
			Schema schema,
			UnitType unitType) throws InvalidSchema {
		String typeName = NamesManipulator.getName(unitType);
		TestSuite testSuite = getTestSuite(schema, typeName);
		validateTestSuiteExistance(testSuite, typeName);
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
			String typeName) {
		List<TestSuite> unitTypeTestSuites = schema.getTests().getTestSuites().stream()
				.filter((testSuite) -> typeName.equals(testSuite.getUnitType()))
				.collect(Collectors.toList());
		if (unitTypeTestSuites.size() != 1)
			return null;
		return unitTypeTestSuites.get(0);
	}
	
	private static void validateTestSuiteExistance(
			TestSuite testSuite,
			String typeName) throws InvalidSchema {
		if (testSuite == null)
			throw new InvalidTestSuite(typeName);
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
	
	private static UnitType getUnitType(Schema schema, TestSuite testSuite) {
		List<UnitType> filteredUnitTypes = schema.getUnitTypes().stream()
				.filter((unitType) -> NamesManipulator.getName(unitType).equals(testSuite.getUnitType()))
				.collect(Collectors.toList());
		if (filteredUnitTypes.size() != 1)
			return null;
		return filteredUnitTypes.get(0);
	}

	private static void validateTestSuite(
			TestSuite testSuite,
			Schema schema) throws InvalidSchema {
		UnitsExistanceValidator.validateUnitTypeExistance(schema, testSuite.getUnitType());
		UnitType unitType = getUnitType(schema, testSuite);
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
