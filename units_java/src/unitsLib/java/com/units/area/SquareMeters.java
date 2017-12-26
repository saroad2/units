/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.area;

import com.units.length.Meters;


public class SquareMeters extends Area {

	public static final double _scale =
		Meters._scale * Meters._scale;
	
	public SquareMeters(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "meters^2";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static SquareMeters zero() {
		return new SquareMeters(0);
	}
	
	public static SquareMeters one() {
		return new SquareMeters(1);
	}
	
	public SquareMeters plus(SquareMeters other) {
		return new SquareMeters(value() + other.value());
	}
	
	public SquareMeters minus(SquareMeters other) {
		return new SquareMeters(value() - other.value());
	}
	
	public SquareMeters opposite() {
		return new SquareMeters(-value());
	}

	public SquareMeters multiplyByScalar(double scalar) {
		return new SquareMeters(scalar * value());
	}
	
	public SquareMeters divideByScalar(double scalar) {
		return new SquareMeters(value() / scalar);
	}
	
	public double scalarRatio(SquareMeters other) {
		return value() / other.value();
	}
	
	public boolean equals(SquareMeters other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(SquareMeters other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(SquareMeters other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(SquareMeters other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(SquareMeters other) {
		return !lessThan(other);
	}
}