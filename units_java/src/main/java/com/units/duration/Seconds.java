/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.duration;

import com.units.internal.NumericValue;

public class Seconds extends NumericValue implements Duration{

	public static final double _scale = 1;
	
	public Seconds(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "seconds";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Seconds zero() {
		return new Seconds(0);
	}
	
	public static Seconds one() {
		return new Seconds(1);
	}
	
	public Seconds plus(Seconds other) {
		return new Seconds(value() + other.value());
	}
	
	public Seconds minus(Seconds other) {
		return new Seconds(value() - other.value());
	}
	
	public Seconds opposite() {
		return new Seconds(-value());
	}

	public Seconds multiplyByScalar(double scalar) {
		return new Seconds(scalar * value());
	}
	
	public Seconds divideByScalar(double scalar) {
		return new Seconds(value() / scalar);
	}
	
	public boolean equals(Seconds other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public static Seconds castFrom(Duration other) {
		return new Seconds(other.value() * other.scale() / _scale);
	}
}