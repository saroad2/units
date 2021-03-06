/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.duration;


public class Years extends Duration {

	public static final double _scale =
		365.0 * Days._scale;
	
	public Years(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "years";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Years zero() {
		return new Years(0);
	}
	
	public static Years one() {
		return new Years(1);
	}
	
	public Years plus(Years other) {
		return new Years(value() + other.value());
	}
	
	public Years minus(Years other) {
		return new Years(value() - other.value());
	}
	
	public Years opposite() {
		return new Years(-value());
	}

	public Years multiplyByScalar(double scalar) {
		return new Years(scalar * value());
	}
	
	public Years divideByScalar(double scalar) {
		return new Years(value() / scalar);
	}
	
	public double scalarRatio(Years other) {
		return value() / other.value();
	}
	
	public boolean equals(Years other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Years other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Years other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Years other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Years other) {
		return !lessThan(other);
	}
}