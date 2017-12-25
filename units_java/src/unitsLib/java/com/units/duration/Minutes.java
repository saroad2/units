/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.duration;

import com.units.internal.*;

public class Minutes extends NumericValue implements Duration{

	public static final double _scale =
		60.0 * Seconds._scale;
	
	public Minutes(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "minutes";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Minutes zero() {
		return new Minutes(0);
	}
	
	public static Minutes one() {
		return new Minutes(1);
	}
	
	public Minutes plus(Minutes other) {
		return new Minutes(value() + other.value());
	}
	
	public Minutes minus(Minutes other) {
		return new Minutes(value() - other.value());
	}
	
	public Minutes opposite() {
		return new Minutes(-value());
	}

	public Minutes multiplyByScalar(double scalar) {
		return new Minutes(scalar * value());
	}
	
	public Minutes divideByScalar(double scalar) {
		return new Minutes(value() / scalar);
	}
	
	public boolean equals(Minutes other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Minutes other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Minutes other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Minutes other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Minutes other) {
		return !lessThan(other);
	}
}