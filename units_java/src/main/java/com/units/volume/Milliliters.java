/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.volume;

import com.units.internal.*;
import com.units.internal.Multipliers;


public class Milliliters extends NumericValue implements Volume{

	public static final double _scale =
		Multipliers.milli * Liters._scale;
	
	public Milliliters(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "milliliters";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Milliliters zero() {
		return new Milliliters(0);
	}
	
	public static Milliliters one() {
		return new Milliliters(1);
	}
	
	public Milliliters plus(Milliliters other) {
		return new Milliliters(value() + other.value());
	}
	
	public Milliliters minus(Milliliters other) {
		return new Milliliters(value() - other.value());
	}
	
	public Milliliters opposite() {
		return new Milliliters(-value());
	}

	public Milliliters multiplyByScalar(double scalar) {
		return new Milliliters(scalar * value());
	}
	
	public Milliliters divideByScalar(double scalar) {
		return new Milliliters(value() / scalar);
	}
	
	public boolean equals(Milliliters other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}