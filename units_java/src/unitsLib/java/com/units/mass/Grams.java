/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.mass;

import com.units.internal.*;

public class Grams extends NumericValue implements Mass{

	public static final double _scale =
		1;
	
	public Grams(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "grams";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Grams zero() {
		return new Grams(0);
	}
	
	public static Grams one() {
		return new Grams(1);
	}
	
	public Grams plus(Grams other) {
		return new Grams(value() + other.value());
	}
	
	public Grams minus(Grams other) {
		return new Grams(value() - other.value());
	}
	
	public Grams opposite() {
		return new Grams(-value());
	}

	public Grams multiplyByScalar(double scalar) {
		return new Grams(scalar * value());
	}
	
	public Grams divideByScalar(double scalar) {
		return new Grams(value() / scalar);
	}
	
	public boolean equals(Grams other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Grams other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Grams other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Grams other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Grams other) {
		return !lessThan(other);
	}
}