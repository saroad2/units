/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.area;

import com.units.length.Kilometers;


public class SquareKilometers extends Area {

	public static final double _scale =
		Kilometers._scale * Kilometers._scale;
	
	public SquareKilometers(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilometers^2";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static SquareKilometers zero() {
		return new SquareKilometers(0);
	}
	
	public static SquareKilometers one() {
		return new SquareKilometers(1);
	}
	
	public SquareKilometers plus(SquareKilometers other) {
		return new SquareKilometers(value() + other.value());
	}
	
	public SquareKilometers minus(SquareKilometers other) {
		return new SquareKilometers(value() - other.value());
	}
	
	public SquareKilometers opposite() {
		return new SquareKilometers(-value());
	}

	public SquareKilometers multiplyByScalar(double scalar) {
		return new SquareKilometers(scalar * value());
	}
	
	public SquareKilometers divideByScalar(double scalar) {
		return new SquareKilometers(value() / scalar);
	}
	
	public double scalarRatio(SquareKilometers other) {
		return value() / other.value();
	}
	
	public boolean equals(SquareKilometers other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(SquareKilometers other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(SquareKilometers other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(SquareKilometers other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(SquareKilometers other) {
		return !lessThan(other);
	}
}