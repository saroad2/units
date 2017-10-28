/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.duration;

import com.units.internal.*;
import com.units.internal.Multiplyers;


public class Milliseconds extends NumericValue implements Duration{

	public static final double _scale =
		Multiplyers.milli * Seconds._scale;
	
	public Milliseconds(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "milliseconds";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Milliseconds zero() {
		return new Milliseconds(0);
	}
	
	public static Milliseconds one() {
		return new Milliseconds(1);
	}
	
	public Milliseconds plus(Milliseconds other) {
		return new Milliseconds(value() + other.value());
	}
	
	public Milliseconds minus(Milliseconds other) {
		return new Milliseconds(value() - other.value());
	}
	
	public Milliseconds opposite() {
		return new Milliseconds(-value());
	}

	public Milliseconds multiplyByScalar(double scalar) {
		return new Milliseconds(scalar * value());
	}
	
	public Milliseconds divideByScalar(double scalar) {
		return new Milliseconds(value() / scalar);
	}
	
	public boolean equals(Milliseconds other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}