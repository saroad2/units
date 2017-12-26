/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.area;

import com.units.internal.*;
import com.units.length.Feet;


public class SquareFeet extends NumericValue implements Area{

	public static final double _scale =
		Feet._scale * Feet._scale;
	
	public SquareFeet(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "feet^2";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static SquareFeet zero() {
		return new SquareFeet(0);
	}
	
	public static SquareFeet one() {
		return new SquareFeet(1);
	}
	
	public SquareFeet plus(SquareFeet other) {
		return new SquareFeet(value() + other.value());
	}
	
	public SquareFeet minus(SquareFeet other) {
		return new SquareFeet(value() - other.value());
	}
	
	public SquareFeet opposite() {
		return new SquareFeet(-value());
	}

	public SquareFeet multiplyByScalar(double scalar) {
		return new SquareFeet(scalar * value());
	}
	
	public SquareFeet divideByScalar(double scalar) {
		return new SquareFeet(value() / scalar);
	}
	
	public double scalarRatio(SquareFeet other) {
		return value() / other.value();
	}
	
	public boolean equals(SquareFeet other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(SquareFeet other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(SquareFeet other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(SquareFeet other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(SquareFeet other) {
		return !lessThan(other);
	}
}