/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.force;

import com.units.internal.*;

public class Dynes extends NumericValue implements Force{

	public static final double _scale =
		1.0E-5 * Newtons._scale;
	
	public Dynes(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "dynes";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Dynes zero() {
		return new Dynes(0);
	}
	
	public static Dynes one() {
		return new Dynes(1);
	}
	
	public Dynes plus(Dynes other) {
		return new Dynes(value() + other.value());
	}
	
	public Dynes minus(Dynes other) {
		return new Dynes(value() - other.value());
	}
	
	public Dynes opposite() {
		return new Dynes(-value());
	}

	public Dynes multiplyByScalar(double scalar) {
		return new Dynes(scalar * value());
	}
	
	public Dynes divideByScalar(double scalar) {
		return new Dynes(value() / scalar);
	}
	
	public double scalarRatio(Dynes other) {
		return value() / other.value();
	}
	
	public boolean equals(Dynes other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Dynes other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Dynes other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Dynes other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Dynes other) {
		return !lessThan(other);
	}
}