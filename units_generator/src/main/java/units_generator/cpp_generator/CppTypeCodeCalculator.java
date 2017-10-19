package units_generator.cpp_generator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import units_generator.internal.PrimesGetter;
import units_schema.UnitType;

public class CppTypeCodeCalculator {
	
	private static PrimesGetter primesGetter = new PrimesGetter();
	
	public static class Result {
		public String code;
		public List<String> tagIncludes;
		public List<String> unitIncludes;
		
		public Result() {
			code = "";
			tagIncludes = new ArrayList<String>();
			unitIncludes = new ArrayList<String>();
		}
	}
	
	public static Result calculate(UnitType unitType) {
		Result result = new Result();
		if (unitType.getRatio() == null)
			initializeBasicCode(result);
		else
			initializeRatioCode(result, unitType);
		return result;
	}

	private static void initializeBasicCode(Result result) {
		result.code = "std::ratio<" + Integer.toString(primesGetter.getNextPrimeAndBump()) + ", 1>";
	}

	private static void initializeRatioCode(Result result, UnitType unitType) {
		List<String> numerators = unitType.getRatio().getNumerators();
		List<String> denominators = unitType.getRatio().getDenominators();

		result.code = getCodeFromNumeratorsAndDenominators(numerators, denominators);
		addIncludes(result, numerators, denominators);
	}
	
	private static String getCodeFromNumeratorsAndDenominators(
			List<String> numerators,
			List<String> denominators) {
		if (numerators.size() == 0)
			return getInverseCode(denominators);
		if (denominators.size() == 0)
			return toCode(numerators);
		return getRatioCode(numerators, denominators);
	}
	
	private static String toCode(List<String> unitTypeNames) {
		List<String> tagsList = new ArrayList<String>();
		for (String unitTypeName : unitTypeNames) {
			tagsList.add(
					CppNamesFormatter.formatNamespaceName(unitTypeName) +
					"::tags::" +
					CppNamesFormatter.formatCodeName(unitTypeName));
		}
		return combineCodes(tagsList);
	}
	
	private static String combineCodes(List<String> tags) {
		if (tags.size() == 1)
			return tags.get(0);
		return "multiply_type_code<" + String.join(", ", tags) + ">::code";
	}
	
	private static String getInverseCode(List<String> denominators) {
		return "inverse_type_code<" + toCode(denominators) + ">::code";
	}
	
	private static String getRatioCode(
			List<String> numerators,
			List<String> denominators) {
		String result = "";
		boolean addTabs = numerators.size() >= 2 || denominators.size() >= 2;
		result += "typename ratio_type_code<";
		if (addTabs)
			result += "\n\t";
		result += toCode(numerators) + ", ";
		if (addTabs)
			result += "\n\t";
		result += toCode(denominators) + ">::code";
		return result;
	}

	private static void addIncludes(
			Result result,
			List<String> numerators,
			List<String> denominators) {
		if (denominators.size() >= 1)
			result.tagIncludes.add("<units/internal/units_ratio_type.h>");
		if (numerators.size() >= 2 || denominators.size() >= 2)
			result.tagIncludes.add("<units/internal/units_multiply_type.h>");
		
		addUnitTypesInclude(result, numerators);
		addUnitTypesInclude(result, denominators);
	}
	
	private static void addUnitTypesInclude(
			Result result,
			List<String> unitTypesNamesList) {
		Set<String> unitTypesNamesSet = new HashSet<String>(unitTypesNamesList);
		for (String unitTypeName : unitTypesNamesSet) {
			result.tagIncludes.add(
					"<units/tags/" +
					CppNamesFormatter.formatUnitTypeTagHeaderName(unitTypeName) +
					">");
			result.unitIncludes.add(
					"<units/" +
					CppNamesFormatter.formatUnitTypeHeaderName(unitTypeName) +
					">");
		}
		
	}
}
