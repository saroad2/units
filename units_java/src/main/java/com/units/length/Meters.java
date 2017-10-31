/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.length;

import com.units.internal.*;

public class Meters extends NumericValue implements Length{

	public static final double _scale =
		1;
	
	public Meters(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "meters";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Meters zero() {
		return new Meters(0);
	}
	
	public static Meters one() {
		return new Meters(1);
	}
	
	public Meters plus(Meters other) {
		return new Meters(value() + other.value());
	}
	
	public Meters minus(Meters other) {
		return new Meters(value() - other.value());
	}
	
	public Meters opposite() {
		return new Meters(-value());
	}

	public Meters multiplyByScalar(double scalar) {
		return new Meters(scalar * value());
	}
	
	public Meters divideByScalar(double scalar) {
		return new Meters(value() / scalar);
	}
	
	public boolean equals(Meters other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Meters other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Meters other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Meters other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Meters other) {
		return !lessThan(other);
	}
}