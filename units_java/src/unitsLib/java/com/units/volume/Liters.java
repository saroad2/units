/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.volume;

import com.units.internal.Multipliers;


public class Liters extends Volume {

	public static final double _scale =
		Multipliers.milli * CubicMeters._scale;
	
	public Liters(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "liters";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Liters zero() {
		return new Liters(0);
	}
	
	public static Liters one() {
		return new Liters(1);
	}
	
	public Liters plus(Liters other) {
		return new Liters(value() + other.value());
	}
	
	public Liters minus(Liters other) {
		return new Liters(value() - other.value());
	}
	
	public Liters opposite() {
		return new Liters(-value());
	}

	public Liters multiplyByScalar(double scalar) {
		return new Liters(scalar * value());
	}
	
	public Liters divideByScalar(double scalar) {
		return new Liters(value() / scalar);
	}
	
	public double scalarRatio(Liters other) {
		return value() / other.value();
	}
	
	public boolean equals(Liters other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Liters other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Liters other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Liters other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Liters other) {
		return !lessThan(other);
	}
}