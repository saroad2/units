/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.volume;

import com.units.internal.*;
import com.units.length.Meters;


public class CubicMeters extends NumericValue implements Volume{

	public static final double _scale =
		Meters._scale * Meters._scale * Meters._scale;
	
	public CubicMeters(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "meters^3";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static CubicMeters zero() {
		return new CubicMeters(0);
	}
	
	public static CubicMeters one() {
		return new CubicMeters(1);
	}
	
	public CubicMeters plus(CubicMeters other) {
		return new CubicMeters(value() + other.value());
	}
	
	public CubicMeters minus(CubicMeters other) {
		return new CubicMeters(value() - other.value());
	}
	
	public CubicMeters opposite() {
		return new CubicMeters(-value());
	}

	public CubicMeters multiplyByScalar(double scalar) {
		return new CubicMeters(scalar * value());
	}
	
	public CubicMeters divideByScalar(double scalar) {
		return new CubicMeters(value() / scalar);
	}
	
	public boolean equals(CubicMeters other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(CubicMeters other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(CubicMeters other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(CubicMeters other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(CubicMeters other) {
		return !lessThan(other);
	}
}