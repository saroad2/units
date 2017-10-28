/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.temperature;

import com.units.internal.*;

public class Kelvins extends NumericValue implements Temperature{

	public static final double _scale =
		1;
	
	public Kelvins(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kelvins";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Kelvins zero() {
		return new Kelvins(0);
	}
	
	public static Kelvins one() {
		return new Kelvins(1);
	}
	
	public Kelvins plus(Kelvins other) {
		return new Kelvins(value() + other.value());
	}
	
	public Kelvins minus(Kelvins other) {
		return new Kelvins(value() - other.value());
	}
	
	public Kelvins opposite() {
		return new Kelvins(-value());
	}

	public Kelvins multiplyByScalar(double scalar) {
		return new Kelvins(scalar * value());
	}
	
	public Kelvins divideByScalar(double scalar) {
		return new Kelvins(value() / scalar);
	}
	
	public boolean equals(Kelvins other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}