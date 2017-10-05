package units_generator.java_generator;

import units_schema.UnitScale;

public class JavaScaleCalculator {
	
	public static String calculateScale(UnitScale unitScale) {
		if (unitScale.getIsBasic())
			return "1";
		String relativeToScale = JavaNamesFormatter.formatClassname(unitScale.getRelativeTo()) + "._scale";
		if (unitScale.getMultiplyerNumber() != null)
			return unitScale.getMultiplyerNumber() + " * " + relativeToScale;
		return "Multiplyers." + unitScale.getMultiplyerString() + " * " + relativeToScale;
	}
}
