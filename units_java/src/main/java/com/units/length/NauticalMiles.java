/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.length;

import com.units.internal.NumericValue;

public class NauticalMiles extends NumericValue implements Length{

	public static final double _scale = 1852.0 * Meters._scale;
	
	public NauticalMiles(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "nautical miles";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static NauticalMiles zero() {
		return new NauticalMiles(0);
	}
	
	public static NauticalMiles one() {
		return new NauticalMiles(1);
	}
	
	public NauticalMiles plus(NauticalMiles other) {
		return new NauticalMiles(value() + other.value());
	}
	
	public NauticalMiles minus(NauticalMiles other) {
		return new NauticalMiles(value() - other.value());
	}
	
	public NauticalMiles opposite() {
		return new NauticalMiles(-value());
	}

	public NauticalMiles multiplyByScalar(double scalar) {
		return new NauticalMiles(scalar * value());
	}
	
	public NauticalMiles divideByScalar(double scalar) {
		return new NauticalMiles(value() / scalar);
	}
	
	public boolean equals(NauticalMiles other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public static NauticalMiles castFrom(Length other) {
		return new NauticalMiles(other.value() * other.scale() / _scale);
	}
}