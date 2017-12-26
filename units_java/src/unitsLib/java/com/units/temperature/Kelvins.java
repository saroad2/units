/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.temperature;


public class Kelvins extends Temperature {

	public static final double _scale =
		1;
	
	public Kelvins(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kelvins";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Kelvins zero() {
		return new Kelvins(0);
	}
	
	public static Kelvins one() {
		return new Kelvins(1);
	}
	
	public Kelvins plus(Kelvins other) {
		return new Kelvins(value() + other.value());
	}
	
	public Kelvins minus(Kelvins other) {
		return new Kelvins(value() - other.value());
	}
	
	public Kelvins opposite() {
		return new Kelvins(-value());
	}

	public Kelvins multiplyByScalar(double scalar) {
		return new Kelvins(scalar * value());
	}
	
	public Kelvins divideByScalar(double scalar) {
		return new Kelvins(value() / scalar);
	}
	
	public double scalarRatio(Kelvins other) {
		return value() / other.value();
	}
	
	public boolean equals(Kelvins other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Kelvins other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Kelvins other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Kelvins other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Kelvins other) {
		return !lessThan(other);
	}
}