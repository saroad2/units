package units_generator.docs_generator;

import java.util.List;
import java.util.StringJoiner;

import units_schema.Constant;
import units_schema.Ratio;
import units_schema.UnitScale;

public class DocsScaleCalculator {

	public static String calculateScale(UnitScale unitScale) {
		if (unitScale.getIsBasic())
			return "basic";
		if (unitScale.getRatio() != null)
			return calculateRatioScale(unitScale.getRatio());
		return calculateMultiplierScale(unitScale);
	}
	
	public static String calculateConstantScale(Constant constant) {
		if (constant.getUnitScale() != null)
			return constant.getUnitScale();
		if (constant.getRatio() != null)
			return calculateRatioScale(constant.getRatio());
		return "";
	}
	
	public static String calculateRatioScale(Ratio ratio) {
		List<String> numerators = ratio.getNumerators();
		List<String> denominators = ratio.getDenominators();
		if (numerators.size() == 0)
			return combineWithBrackets(denominators) + "^(-1)";
		if (denominators.size() == 0)
			return combine(numerators);
		return combineWithBrackets(numerators) + " / " + combineWithBrackets(denominators);
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
	
	public static String calculateMultiplierScale(UnitScale unitScale) {
		if (unitScale.getMultiplierNumber() != null)
			return unitScale.getMultiplierNumber() + " * " + unitScale.getRelativeTo();
		if (unitScale.getMultiplierString() != null)
			return unitScale.getMultiplierString() + " * " + unitScale.getRelativeTo();
		return "";
	}
}
