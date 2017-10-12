/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.duration;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Days extends NumericValue implements Duration{

	public static final double _scale = 24.0 * Hours._scale;
	
	public Days(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "days";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Days zero() {
		return new Days(0);
	}
	
	public static Days one() {
		return new Days(1);
	}
	
	public Days plus(Days other) {
		return new Days(value() + other.value());
	}
	
	public Days minus(Days other) {
		return new Days(value() - other.value());
	}
	
	public Days opposite() {
		return new Days(-value());
	}

	public Days multiplyByScalar(double scalar) {
		return new Days(scalar * value());
	}
	
	public Days divideByScalar(double scalar) {
		return new Days(value() / scalar);
	}
	
	public boolean equals(Days other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Days castFromScale(double value, double scale) {
		return new Days(value * scale / _scale);
	}

	public static Days castFrom(Duration other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Days divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Days multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}