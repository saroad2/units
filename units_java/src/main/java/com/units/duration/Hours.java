/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.duration;

import com.units.internal.NumericValue;

public class Hours extends NumericValue implements Duration{

	public static final double _scale = 60.0 * Minutes._scale;
	
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
	
	public static Hours castFrom(Duration other) {
		return new Hours(other.value() * other.scale() / _scale);
	}
}