/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.length;

import com.units.internal.NumericValue;

public class DegreesOfLatitude extends NumericValue implements Length{

	public static final double _scale = 60.0 * GeographicalMiles._scale;
	
	public DegreesOfLatitude(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "degrees of latitude";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static DegreesOfLatitude zero() {
		return new DegreesOfLatitude(0);
	}
	
	public static DegreesOfLatitude one() {
		return new DegreesOfLatitude(1);
	}
	
	public DegreesOfLatitude plus(DegreesOfLatitude other) {
		return new DegreesOfLatitude(value() + other.value());
	}
	
	public DegreesOfLatitude minus(DegreesOfLatitude other) {
		return new DegreesOfLatitude(value() - other.value());
	}
	
	public DegreesOfLatitude opposite() {
		return new DegreesOfLatitude(-value());
	}

	public DegreesOfLatitude multiplyByScalar(double scalar) {
		return new DegreesOfLatitude(scalar * value());
	}
	
	public DegreesOfLatitude divideByScalar(double scalar) {
		return new DegreesOfLatitude(value() / scalar);
	}
	
	public boolean equals(DegreesOfLatitude other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public static DegreesOfLatitude castFrom(Length other) {
		return new DegreesOfLatitude(other.value() * other.scale() / _scale);
	}
}