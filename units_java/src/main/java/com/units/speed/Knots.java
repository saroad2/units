/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.speed;

import com.units.internal.*;

public class Knots extends NumericValue implements Speed{

	public static final double _scale =
		0.514444773689 * MetersPerSecond._scale;
	
	public Knots(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "knots";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Knots zero() {
		return new Knots(0);
	}
	
	public static Knots one() {
		return new Knots(1);
	}
	
	public Knots plus(Knots other) {
		return new Knots(value() + other.value());
	}
	
	public Knots minus(Knots other) {
		return new Knots(value() - other.value());
	}
	
	public Knots opposite() {
		return new Knots(-value());
	}

	public Knots multiplyByScalar(double scalar) {
		return new Knots(scalar * value());
	}
	
	public Knots divideByScalar(double scalar) {
		return new Knots(value() / scalar);
	}
	
	public boolean equals(Knots other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}