/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.duration;

import com.units.internal.*;

public class Seconds extends NumericValue implements Duration{

	public static final double _scale =
		1;
	
	public Seconds(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "seconds";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Seconds zero() {
		return new Seconds(0);
	}
	
	public static Seconds one() {
		return new Seconds(1);
	}
	
	public Seconds plus(Seconds other) {
		return new Seconds(value() + other.value());
	}
	
	public Seconds minus(Seconds other) {
		return new Seconds(value() - other.value());
	}
	
	public Seconds opposite() {
		return new Seconds(-value());
	}

	public Seconds multiplyByScalar(double scalar) {
		return new Seconds(scalar * value());
	}
	
	public Seconds divideByScalar(double scalar) {
		return new Seconds(value() / scalar);
	}
	
	public boolean equals(Seconds other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Seconds other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Seconds other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Seconds other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Seconds other) {
		return !lessThan(other);
	}
}