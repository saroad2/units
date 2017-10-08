package units_generator.java_generator;

import units_schema.Ratio;
import units_schema.UnitScale;

public class JavaScaleCalculator {
	
	public static String calculateScale(UnitScale unitScale) {
		if (unitScale.getIsBasic())
			return "1";
		if(unitScale.getRatio() != null)
			return calculateRatioScale(unitScale.getRatio());
		String relativeToScale = JavaNamesFormatter.formatClassName(unitScale.getRelativeTo()) + "._scale";
		if (unitScale.getMultiplyerNumber() != null)
			return unitScale.getMultiplyerNumber() + " * " + relativeToScale;
		return "Multiplyers." + unitScale.getMultiplyerString() + " * " + relativeToScale;
	}
	
	private static String calculateRatioScale(Ratio ratio) {
		return unitScaleNameToScale(ratio.getNumerators().get(0)) +
				" / " + unitScaleNameToScale(ratio.getDenumerators().get(0));
	}
	
	private static String unitScaleNameToScale(String unitScaleName) {
		return JavaNamesFormatter.formatClassName(unitScaleName) + "._scale";
	}
}
