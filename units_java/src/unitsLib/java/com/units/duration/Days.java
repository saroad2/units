/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.duration;


public class Days extends Duration {

	public static final double _scale =
		24.0 * Hours._scale;
	
	public Days(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "days";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Days zero() {
		return new Days(0);
	}
	
	public static Days one() {
		return new Days(1);
	}
	
	public Days plus(Days other) {
		return new Days(value() + other.value());
	}
	
	public Days minus(Days other) {
		return new Days(value() - other.value());
	}
	
	public Days opposite() {
		return new Days(-value());
	}

	public Days multiplyByScalar(double scalar) {
		return new Days(scalar * value());
	}
	
	public Days divideByScalar(double scalar) {
		return new Days(value() / scalar);
	}
	
	public double scalarRatio(Days other) {
		return value() / other.value();
	}
	
	public boolean equals(Days other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Days other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Days other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Days other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Days other) {
		return !lessThan(other);
	}
}