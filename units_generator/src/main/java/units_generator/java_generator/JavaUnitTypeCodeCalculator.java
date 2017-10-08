package units_generator.java_generator;

import units_generator.internal.PrimesGetter;
import units_schema.UnitType;

public class JavaUnitTypeCodeCalculator {

	private static PrimesGetter primesGetter = new PrimesGetter();
	
	public static String getCode(UnitType unitType) {
		return "new Ratio(" + primesGetter.getNextPrimeAndBump() + ")";
	}
}
