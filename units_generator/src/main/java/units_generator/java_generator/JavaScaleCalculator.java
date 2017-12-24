package units_generator.java_generator;

import java.util.List;
import java.util.StringJoiner;
import java.util.logging.Logger;

import units_generator.internal.NamesManipulator;
import units_schema.Ratio;
import units_schema.UnitScale;

public class JavaScaleCalculator {
	
	private static final Logger logger =
			Logger.getLogger(JavaScaleCalculator.class.getSimpleName());
	
	public static String calculateScale(UnitScale unitScale) {
		logger.fine("calculate scale of " + NamesManipulator.getName(unitScale));
		if (unitScale.getIsBasic())
			return "1";
		if(unitScale.getRatio() != null)
			return calculateRatioScale(unitScale.getRatio());
		return calculateRelativeScale(unitScale);
	}
	
	private static String calculateRatioScale(Ratio ratio) {
		String numeratorScale = combineScales(ratio.getNumerators());
		if (ratio.getDenominators().isEmpty())
			return numeratorScale;
		String denominatorScale = combineScales(ratio.getDenominators());
		return addBracketsIfNeeaded(
					ratio.getNumerators().size(),
					numeratorScale)
				+ getSeperator(ratio)
				+ addBracketsIfNeeaded(
					ratio.getDenominators().size(),
					denominatorScale);
	}
	
	public static String combineScales(List<String> numerators) {
		if (numerators == null || numerators.isEmpty())
			return "1.0";
		StringJoiner joiner = new StringJoiner(" * ");
		for (String unitScaleName : numerators) {
			joiner.add(unitScaleNameToScale(unitScaleName));
		}
		return joiner.toString();
	}
	
	private static String unitScaleNameToScale(String unitScaleName) {
		return JavaNamesFormatter.toUpperCamelCase(unitScaleName) + "._scale";
	}
	
	private static String calculateRelativeScale(UnitScale unitScale) {
		String relativeToScale = JavaNamesFormatter.toUpperCamelCase(unitScale.getRelativeTo()) + "._scale";
		if (unitScale.getMultiplierNumber() != null)
			return unitScale.getMultiplierNumber() + " * " + relativeToScale;
		return "Multipliers." + unitScale.getMultiplierString() + " * " + relativeToScale;
	}
	
	private static String addBracketsIfNeeaded(int listSize, String str) {
		if (listSize >= 2)
			return "(" + str + ")";
		return str;
	}
	
	private static String getSeperator(Ratio ratio) {
		if (ratio.getNumerators().size() >=2 || ratio.getDenominators().size() >=2)
			return "\n / ";
		return " / ";
	};
}
