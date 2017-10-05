/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.length;

import com.units.internal.NumericValue;

public class StatuteMiles extends NumericValue implements Length{

	public static final double _scale = 621.371192237 * Meters._scale;
	
	public StatuteMiles(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "statute miles";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static StatuteMiles zero() {
		return new StatuteMiles(0);
	}
	
	public static StatuteMiles one() {
		return new StatuteMiles(1);
	}
	
	public StatuteMiles plus(StatuteMiles other) {
		return new StatuteMiles(value() + other.value());
	}
	
	public StatuteMiles minus(StatuteMiles other) {
		return new StatuteMiles(value() - other.value());
	}
	
	public StatuteMiles opposite() {
		return new StatuteMiles(-value());
	}

	public StatuteMiles multiplyByScalar(double scalar) {
		return new StatuteMiles(scalar * value());
	}
	
	public StatuteMiles divideByScalar(double scalar) {
		return new StatuteMiles(value() / scalar);
	}
	
	public boolean equals(StatuteMiles other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public static StatuteMiles castFrom(Length other) {
		return new StatuteMiles(other.value() * other.scale() / _scale);
	}
}