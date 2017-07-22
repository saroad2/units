package units_generator.cpp_generator;

import java.util.ArrayList;
import java.util.List;
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
		CppUnitType numeratorType = UnitsRepository.getInstance().getType(unitType.getRatio().getNumerator());
		CppUnitType denumeratorType = UnitsRepository.getInstance().getType(unitType.getRatio().getDenumerator());

		result.code = "ratio_type_tag<" +
				numeratorType.getNamespace() + "::tags::" + numeratorType.getTagName() + ", " +
				denumeratorType.getNamespace() + "::tags::" + denumeratorType.getTagName()  + ">::code";
		result.tagIncludes.add("\"internal/units_ratio_type.h\"");
		result.tagIncludes.add("\"" + numeratorType.getTagsHeaderFileName() + "\"");
		result.tagIncludes.add("\"" + denumeratorType.getTagsHeaderFileName() + "\"");
		result.unitIncludes.add("\"" + numeratorType.getHeaderFileName() + "\"");
		result.unitIncludes.add("\"" + denumeratorType.getHeaderFileName() + "\"");
	}
}
