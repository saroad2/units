/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.temperature;

import com.units.internal.*;

public class Rankines extends NumericValue implements Temperature{

	public static final double _scale =
		0.5555555555 * Kelvins._scale;
	
	public Rankines(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "rankines";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Rankines zero() {
		return new Rankines(0);
	}
	
	public static Rankines one() {
		return new Rankines(1);
	}
	
	public Rankines plus(Rankines other) {
		return new Rankines(value() + other.value());
	}
	
	public Rankines minus(Rankines other) {
		return new Rankines(value() - other.value());
	}
	
	public Rankines opposite() {
		return new Rankines(-value());
	}

	public Rankines multiplyByScalar(double scalar) {
		return new Rankines(scalar * value());
	}
	
	public Rankines divideByScalar(double scalar) {
		return new Rankines(value() / scalar);
	}
	
	public boolean equals(Rankines other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}