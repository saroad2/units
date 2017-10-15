/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.electric_current;

import com.units.internal.*;

public class Amperes extends NumericValue implements ElectricCurrent{

	public static final double _scale =
		1;
	
	public Amperes(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "amperes";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Amperes zero() {
		return new Amperes(0);
	}
	
	public static Amperes one() {
		return new Amperes(1);
	}
	
	public Amperes plus(Amperes other) {
		return new Amperes(value() + other.value());
	}
	
	public Amperes minus(Amperes other) {
		return new Amperes(value() - other.value());
	}
	
	public Amperes opposite() {
		return new Amperes(-value());
	}

	public Amperes multiplyByScalar(double scalar) {
		return new Amperes(scalar * value());
	}
	
	public Amperes divideByScalar(double scalar) {
		return new Amperes(value() / scalar);
	}
	
	public boolean equals(Amperes other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}