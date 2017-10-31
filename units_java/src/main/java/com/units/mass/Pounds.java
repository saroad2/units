/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.mass;

import com.units.internal.*;

public class Pounds extends NumericValue implements Mass{

	public static final double _scale =
		453.592333346094 * Grams._scale;
	
	public Pounds(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "pounds";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Pounds zero() {
		return new Pounds(0);
	}
	
	public static Pounds one() {
		return new Pounds(1);
	}
	
	public Pounds plus(Pounds other) {
		return new Pounds(value() + other.value());
	}
	
	public Pounds minus(Pounds other) {
		return new Pounds(value() - other.value());
	}
	
	public Pounds opposite() {
		return new Pounds(-value());
	}

	public Pounds multiplyByScalar(double scalar) {
		return new Pounds(scalar * value());
	}
	
	public Pounds divideByScalar(double scalar) {
		return new Pounds(value() / scalar);
	}
	
	public boolean equals(Pounds other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Pounds other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Pounds other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Pounds other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Pounds other) {
		return !lessThan(other);
	}
}