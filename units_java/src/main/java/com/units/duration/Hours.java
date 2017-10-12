/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.duration;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Hours extends NumericValue implements Duration{

	public static final double _scale =
		60.0 * Minutes._scale;
	
	public Hours(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "hours";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Hours zero() {
		return new Hours(0);
	}
	
	public static Hours one() {
		return new Hours(1);
	}
	
	public Hours plus(Hours other) {
		return new Hours(value() + other.value());
	}
	
	public Hours minus(Hours other) {
		return new Hours(value() - other.value());
	}
	
	public Hours opposite() {
		return new Hours(-value());
	}

	public Hours multiplyByScalar(double scalar) {
		return new Hours(scalar * value());
	}
	
	public Hours divideByScalar(double scalar) {
		return new Hours(value() / scalar);
	}
	
	public boolean equals(Hours other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Hours castFromScale(double value, double scale) {
		return new Hours(value * scale / _scale);
	}

	public static Hours castFrom(Duration other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Hours divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Hours multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}