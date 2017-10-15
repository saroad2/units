/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.length;

import com.units.internal.*;

public class Feet extends NumericValue implements Length{

	public static final double _scale =
		12.0 * Inches._scale;
	
	public Feet(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "feet";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Feet zero() {
		return new Feet(0);
	}
	
	public static Feet one() {
		return new Feet(1);
	}
	
	public Feet plus(Feet other) {
		return new Feet(value() + other.value());
	}
	
	public Feet minus(Feet other) {
		return new Feet(value() - other.value());
	}
	
	public Feet opposite() {
		return new Feet(-value());
	}

	public Feet multiplyByScalar(double scalar) {
		return new Feet(scalar * value());
	}
	
	public Feet divideByScalar(double scalar) {
		return new Feet(value() / scalar);
	}
	
	public boolean equals(Feet other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}