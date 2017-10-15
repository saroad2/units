/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.length;

import com.units.internal.*;

public class Yards extends NumericValue implements Length{

	public static final double _scale =
		3.0 * Feet._scale;
	
	public Yards(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "yards";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Yards zero() {
		return new Yards(0);
	}
	
	public static Yards one() {
		return new Yards(1);
	}
	
	public Yards plus(Yards other) {
		return new Yards(value() + other.value());
	}
	
	public Yards minus(Yards other) {
		return new Yards(value() - other.value());
	}
	
	public Yards opposite() {
		return new Yards(-value());
	}

	public Yards multiplyByScalar(double scalar) {
		return new Yards(scalar * value());
	}
	
	public Yards divideByScalar(double scalar) {
		return new Yards(value() / scalar);
	}
	
	public boolean equals(Yards other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}