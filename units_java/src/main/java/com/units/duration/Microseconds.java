/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.duration;

import com.units.internal.*;
import com.units.internal.Multiplyers;


public class Microseconds extends NumericValue implements Duration{

	public static final double _scale =
		Multiplyers.micro * Seconds._scale;
	
	public Microseconds(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "microseconds";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Microseconds zero() {
		return new Microseconds(0);
	}
	
	public static Microseconds one() {
		return new Microseconds(1);
	}
	
	public Microseconds plus(Microseconds other) {
		return new Microseconds(value() + other.value());
	}
	
	public Microseconds minus(Microseconds other) {
		return new Microseconds(value() - other.value());
	}
	
	public Microseconds opposite() {
		return new Microseconds(-value());
	}

	public Microseconds multiplyByScalar(double scalar) {
		return new Microseconds(scalar * value());
	}
	
	public Microseconds divideByScalar(double scalar) {
		return new Microseconds(value() / scalar);
	}
	
	public boolean equals(Microseconds other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}