package units_generator.java_generator;

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
		return unitTypeToCode(ratio.getNumerators().get(0)) + ".divide("
				+ unitTypeToCode(ratio.getDenumerators().get(0)) + ")";
	};
	
	public static String unitTypeToCode(String unitTypeName) {
		return JavaNamesFormatter.formatClassName(unitTypeName) + "._typeCode";
	}
}
