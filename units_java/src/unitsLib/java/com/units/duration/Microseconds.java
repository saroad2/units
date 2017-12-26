/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.duration;

import com.units.internal.*;
import com.units.internal.Multipliers;


public class Microseconds extends NumericValue implements Duration{

	public static final double _scale =
		Multipliers.micro * Seconds._scale;
	
	public Microseconds(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "microseconds";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Microseconds zero() {
		return new Microseconds(0);
	}
	
	public static Microseconds one() {
		return new Microseconds(1);
	}
	
	public Microseconds plus(Microseconds other) {
		return new Microseconds(value() + other.value());
	}
	
	public Microseconds minus(Microseconds other) {
		return new Microseconds(value() - other.value());
	}
	
	public Microseconds opposite() {
		return new Microseconds(-value());
	}

	public Microseconds multiplyByScalar(double scalar) {
		return new Microseconds(scalar * value());
	}
	
	public Microseconds divideByScalar(double scalar) {
		return new Microseconds(value() / scalar);
	}
	
	public double scalarRatio(Microseconds other) {
		return value() / other.value();
	}
	
	public boolean equals(Microseconds other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Microseconds other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Microseconds other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Microseconds other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Microseconds other) {
		return !lessThan(other);
	}
}