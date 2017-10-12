/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.length;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class StatuteMiles extends NumericValue implements Length{

	public static final double _scale = 621.371192237 * Meters._scale;
	
	public StatuteMiles(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "statute miles";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static StatuteMiles zero() {
		return new StatuteMiles(0);
	}
	
	public static StatuteMiles one() {
		return new StatuteMiles(1);
	}
	
	public StatuteMiles plus(StatuteMiles other) {
		return new StatuteMiles(value() + other.value());
	}
	
	public StatuteMiles minus(StatuteMiles other) {
		return new StatuteMiles(value() - other.value());
	}
	
	public StatuteMiles opposite() {
		return new StatuteMiles(-value());
	}

	public StatuteMiles multiplyByScalar(double scalar) {
		return new StatuteMiles(scalar * value());
	}
	
	public StatuteMiles divideByScalar(double scalar) {
		return new StatuteMiles(value() / scalar);
	}
	
	public boolean equals(StatuteMiles other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static StatuteMiles castFromScale(double value, double scale) {
		return new StatuteMiles(value * scale / _scale);
	}

	public static StatuteMiles castFrom(Length other) {
		return castFromScale(other.value(), other.scale());
	}

	public static StatuteMiles divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static StatuteMiles multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}