package units_generator.general_generator;

import java.util.List;
import java.util.StringJoiner;

import units_schema.UnitScale;

public class GeneralScaleCalculator {

	public static String calculateScale(UnitScale unitScale) {
		if (unitScale.getIsBasic())
			return "basic";
		if (unitScale.getRatio() != null)
			return calculateRatioScale(unitScale);
		return calculateMultiplyerScale(unitScale);
	}
	
	public static String calculateRatioScale(UnitScale unitScale) {
		List<String> numerators = unitScale.getRatio().getNumerators();
		List<String> denumerators = unitScale.getRatio().getDenumerators();
		if (numerators.size() == 0)
			return combineWithBrackets(denumerators) + "^(-1)";
		if (denumerators.size() == 0)
			return combine(numerators);
		return combineWithBrackets(numerators) + " / " + combineWithBrackets(denumerators);
	}
	
	public static String combine(List<String> scalesList) {
		if (scalesList.size() == 1)
			return scalesList.get(0);
		StringJoiner joiner = new StringJoiner(" * ");
		scalesList.stream().forEach((s) -> joiner.add(s));
		return joiner.toString();
	}
	
	public static String combineWithBrackets(List<String> scalesList) {
		String combined = combine(scalesList);
		if (scalesList.size() >= 2)
			return "(" + combined + ")";
		return combined;
	}
	
	public static String calculateMultiplyerScale(UnitScale unitScale) {
		if (unitScale.getMultiplyerNumber() != null)
			return unitScale.getMultiplyerNumber() + " * " + unitScale.getRelativeTo();
		if (unitScale.getMultiplyerString() != null)
			return unitScale.getMultiplyerString() + " * " + unitScale.getRelativeTo();
		return "";
	}
}
