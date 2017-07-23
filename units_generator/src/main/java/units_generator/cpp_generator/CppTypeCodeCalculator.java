package units_generator.cpp_generator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import units_schema.UnitType;

public class CppTypeCodeCalculator {
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
		result.code = "std::ratio<" + Integer.toString(CppNewCodeGetter.getInstance().getNextAndBump()) + ", 1>";
	}

	private static void initializeRatioCode(Result result, UnitType unitType) {
		List<String> numerators = unitType.getRatio().getNumerators();
		List<String> denumerators = unitType.getRatio().getDenumerators();

		result.code = getCodeFromNumeratorsAndDenumerators(numerators, denumerators);
		addIncludes(result, numerators, denumerators);
	}
	
	private static String getCodeFromNumeratorsAndDenumerators(
			List<String> numerators,
			List<String> denumerators) {
		String result = "";
		String numeratorsTag = toTag(numerators);
		if (denumerators.size() == 0)
			result = numeratorsTag;
		else {
			result = "ratio_type_tag<" + numeratorsTag +
					", " + toTag(denumerators) + ">";
		}
		return result + "::code";
	}
	
	private static String toTag(List<String> unitTypeNames) {
		List<String> tagsList = new ArrayList<String>();
		for (String unitTypeName : unitTypeNames) {
			CppUnitType unitType = UnitsRepository.getInstance().getType(unitTypeName);
			tagsList.add(unitType.getNamespace() + "::tags::" + unitType.getTagName());
		}
		return combineTags(tagsList);
	}
	
	private static String combineTags(List<String> tags) {
		if (tags.size() == 0)
			return "";
		if (tags.size() == 1)
			return tags.get(0);
		return "multiply_type_tag<" + String.join(", ", tags) + ">";
	}

	private static void addIncludes(
			Result result,
			List<String> numerators,
			List<String> denumerators) {
		if (denumerators.size() >= 1)
			result.tagIncludes.add("\"internal/units_ratio_type.h\"");
		if (numerators.size() >= 2 || denumerators.size() >= 2)
			result.tagIncludes.add("\"internal/units_multiply_type.h\"");
		
		addUnitTypesInclude(result, numerators);
		addUnitTypesInclude(result, denumerators);
	}
	
	private static void addUnitTypesInclude(
			Result result,
			List<String> unitTypesNamesList) {
		Set<String> unitTypesNamesSet = new HashSet<String>(unitTypesNamesList);
		for (String unitTypeName : unitTypesNamesSet) {
			CppUnitType unitType = UnitsRepository.getInstance().getType(unitTypeName);
			result.tagIncludes.add("\"" + unitType.getTagsHeaderFileName() + "\"");
			result.unitIncludes.add("\"" + unitType.getHeaderFileName() + "\"");
		}
		
	}
}
