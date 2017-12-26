/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.length;

import com.units.internal.*;
import com.units.internal.Multipliers;


public class Micrometers extends NumericValue implements Length{

	public static final double _scale =
		Multipliers.micro * Meters._scale;
	
	public Micrometers(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "micrometers";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Micrometers zero() {
		return new Micrometers(0);
	}
	
	public static Micrometers one() {
		return new Micrometers(1);
	}
	
	public Micrometers plus(Micrometers other) {
		return new Micrometers(value() + other.value());
	}
	
	public Micrometers minus(Micrometers other) {
		return new Micrometers(value() - other.value());
	}
	
	public Micrometers opposite() {
		return new Micrometers(-value());
	}

	public Micrometers multiplyByScalar(double scalar) {
		return new Micrometers(scalar * value());
	}
	
	public Micrometers divideByScalar(double scalar) {
		return new Micrometers(value() / scalar);
	}
	
	public double scalarRatio(Micrometers other) {
		return value() / other.value();
	}
	
	public boolean equals(Micrometers other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Micrometers other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Micrometers other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Micrometers other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Micrometers other) {
		return !lessThan(other);
	}
}