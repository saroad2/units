/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
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
	
	public double scalarRatio(CubicFeet other) {
		return value() / other.value();
	}
	
	public boolean equals(CubicFeet other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(CubicFeet other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(CubicFeet other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(CubicFeet other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(CubicFeet other) {
		return !lessThan(other);
	}
}