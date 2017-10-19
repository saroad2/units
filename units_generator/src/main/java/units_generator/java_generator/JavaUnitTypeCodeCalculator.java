package units_generator.java_generator;

import java.util.List;
import java.util.StringJoiner;

import units_generator.internal.PrimesGetter;
import units_schema.Ratio;
import units_schema.UnitType;

public class JavaUnitTypeCodeCalculator {

	private static PrimesGetter primesGetter = new PrimesGetter();
	
	public static String getCode(UnitType unitType) {
		if (unitType.getRatio() == null)
			return "new Ratio(" + primesGetter.getNextPrimeAndBump() + ")";
		return getRatioCode(unitType.getRatio());
	}
	
	public static String getRatioCode(Ratio ratio) {
		StringJoiner joiner = new StringJoiner("");
		joiner.add(calculateNumeratorType(ratio.getNumerators()));
		for (String unitTypeName : ratio.getDenominators()) {
			joiner.add("\n.divide(" + unitTypeToCode(unitTypeName) + ")");
		}
		return joiner.toString();
	};
	
	public static String calculateNumeratorType(List<String> numerators) {
		if (numerators == null || numerators.isEmpty())
			return "Ratio.one()";
		StringJoiner joiner = new StringJoiner("");
		joiner.add(unitTypeToCode(numerators.get(0)));
		for (int i=1; i < numerators.size(); ++i) {
			joiner.add("\n.multiply(" + unitTypeToCode(numerators.get(i)) + ")");
		}
		return joiner.toString();
	}
	
	public static String unitTypeToCode(String unitTypeName) {
		return JavaNamesFormatter.formatClassName(unitTypeName) + "._typeCode";
	}
}
