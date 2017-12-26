/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.energy;


public class Calories extends Energy {

	public static final double _scale =
		4.184 * Joules._scale;
	
	public Calories(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "calories";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Calories zero() {
		return new Calories(0);
	}
	
	public static Calories one() {
		return new Calories(1);
	}
	
	public Calories plus(Calories other) {
		return new Calories(value() + other.value());
	}
	
	public Calories minus(Calories other) {
		return new Calories(value() - other.value());
	}
	
	public Calories opposite() {
		return new Calories(-value());
	}

	public Calories multiplyByScalar(double scalar) {
		return new Calories(scalar * value());
	}
	
	public Calories divideByScalar(double scalar) {
		return new Calories(value() / scalar);
	}
	
	public double scalarRatio(Calories other) {
		return value() / other.value();
	}
	
	public boolean equals(Calories other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Calories other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Calories other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Calories other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Calories other) {
		return !lessThan(other);
	}
}