/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.mass;

import com.units.internal.*;
import com.units.internal.Multipliers;


public class Milligrams extends NumericValue implements Mass{

	public static final double _scale =
		Multipliers.milli * Grams._scale;
	
	public Milligrams(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "milligrams";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Milligrams zero() {
		return new Milligrams(0);
	}
	
	public static Milligrams one() {
		return new Milligrams(1);
	}
	
	public Milligrams plus(Milligrams other) {
		return new Milligrams(value() + other.value());
	}
	
	public Milligrams minus(Milligrams other) {
		return new Milligrams(value() - other.value());
	}
	
	public Milligrams opposite() {
		return new Milligrams(-value());
	}

	public Milligrams multiplyByScalar(double scalar) {
		return new Milligrams(scalar * value());
	}
	
	public Milligrams divideByScalar(double scalar) {
		return new Milligrams(value() / scalar);
	}
	
	public boolean equals(Milligrams other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}