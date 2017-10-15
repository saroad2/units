/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.volume;

import com.units.internal.*;
import com.units.length.Feet;


public class CubicFeet extends NumericValue implements Volume{

	public static final double _scale =
		Feet._scale * Feet._scale * Feet._scale;
	
	public CubicFeet(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "feet^3";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static CubicFeet zero() {
		return new CubicFeet(0);
	}
	
	public static CubicFeet one() {
		return new CubicFeet(1);
	}
	
	public CubicFeet plus(CubicFeet other) {
		return new CubicFeet(value() + other.value());
	}
	
	public CubicFeet minus(CubicFeet other) {
		return new CubicFeet(value() - other.value());
	}
	
	public CubicFeet opposite() {
		return new CubicFeet(-value());
	}

	public CubicFeet multiplyByScalar(double scalar) {
		return new CubicFeet(scalar * value());
	}
	
	public CubicFeet divideByScalar(double scalar) {
		return new CubicFeet(value() / scalar);
	}
	
	public boolean equals(CubicFeet other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}