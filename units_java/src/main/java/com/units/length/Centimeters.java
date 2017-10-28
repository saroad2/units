/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.length;

import com.units.internal.*;
import com.units.internal.Multiplyers;


public class Centimeters extends NumericValue implements Length{

	public static final double _scale =
		Multiplyers.centi * Meters._scale;
	
	public Centimeters(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "centimeters";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Centimeters zero() {
		return new Centimeters(0);
	}
	
	public static Centimeters one() {
		return new Centimeters(1);
	}
	
	public Centimeters plus(Centimeters other) {
		return new Centimeters(value() + other.value());
	}
	
	public Centimeters minus(Centimeters other) {
		return new Centimeters(value() - other.value());
	}
	
	public Centimeters opposite() {
		return new Centimeters(-value());
	}

	public Centimeters multiplyByScalar(double scalar) {
		return new Centimeters(scalar * value());
	}
	
	public Centimeters divideByScalar(double scalar) {
		return new Centimeters(value() / scalar);
	}
	
	public boolean equals(Centimeters other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}