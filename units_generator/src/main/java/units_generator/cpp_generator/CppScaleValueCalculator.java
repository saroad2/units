package units_generator.cpp_generator;

import java.util.ArrayList;
import java.util.List;
import units_schema.UnitScale;

public class CppScaleValueCalculator {
	public static class Result {
		public String scale;
		public boolean isStringMultiplyer;
		
		public Result() {
			scale = "";
			isStringMultiplyer = false;
		}
	}
	
	public static Result calculate(UnitScale unitScale) {
		Result result = new Result();
		if (unitScale.getIsBasic()) {
			initializeBasicScale(result);
		}
		else if(unitScale.getRatio() != null) {
			initializeRatioScale(result, unitScale);
		}
		else {
			initializeRelativeScale(result, unitScale);
		}
		return result;
	}
	
	public static void initializeBasicScale(Result result) {
		result.scale = "1";
	}
	
	public static void initializeRatioScale(Result result, UnitScale unitScale) {
		List<String> numerators = unitScale.getRatio().getNumerators();
		List<String> denumerators = unitScale.getRatio().getDenumerators();

		result.scale = getScaleFromNumeratorsAndDenumerators(numerators, denumerators);
	}
	
	private static String getScaleFromNumeratorsAndDenumerators(
			List<String> numerators,
			List<String> denumerators) {
		String result = "";
		String numeratorsTag = toTag(numerators);
		if (denumerators.size() == 0)
			result = numeratorsTag;
		else {
			result = "ratio_scale_tag<" + numeratorsTag +
					", " + toTag(denumerators) + ">";
		}
		return result + "::scale";
	}
	
	private static String toTag(List<String> unitTypeNames) {
		List<String> tagsList = new ArrayList<String>();
		for (String unitTypeName : unitTypeNames) {
			CppUnitScale unitType = UnitsRepository.getInstance().getScale(unitTypeName);
			tagsList.add(unitType.getNamespace() + "::tags::" + unitType.getTagName());
		}
		return combineTags(tagsList);
	}
	
	private static String combineTags(List<String> tags) {
		if (tags.size() == 0)
			return "";
		if (tags.size() == 1)
			return tags.get(0);
		return "multiply_scale_tag<" + String.join(", ", tags) + ">";
	}
	
	
	public static void initializeRelativeScale(Result result, UnitScale unitScale) {
		if (unitScale.getMultiplyerNumber() != null) {
			result.scale = Double.toString(unitScale.getMultiplyerNumber());
		}
		if (unitScale.getMultiplyerString() != null) {
			result.scale = unitScale.getMultiplyerString();
			result.isStringMultiplyer = true;
		}
		if (unitScale.getRelativeTo() != null) {
			CppUnitScale relativeTo = UnitsRepository.getInstance().getScale(unitScale.getRelativeTo());
			result.scale += " * " + relativeTo.getTagName() + "::scale";
		}
	}
}
