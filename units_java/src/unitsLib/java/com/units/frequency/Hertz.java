/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.frequency;

import com.units.internal.*;
import com.units.duration.Seconds;


public class Hertz extends NumericValue implements Frequency{

	public static final double _scale =
		1.0 / Seconds._scale;
	
	public Hertz(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "hertz";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Hertz zero() {
		return new Hertz(0);
	}
	
	public static Hertz one() {
		return new Hertz(1);
	}
	
	public Hertz plus(Hertz other) {
		return new Hertz(value() + other.value());
	}
	
	public Hertz minus(Hertz other) {
		return new Hertz(value() - other.value());
	}
	
	public Hertz opposite() {
		return new Hertz(-value());
	}

	public Hertz multiplyByScalar(double scalar) {
		return new Hertz(scalar * value());
	}
	
	public Hertz divideByScalar(double scalar) {
		return new Hertz(value() / scalar);
	}
	
	public boolean equals(Hertz other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Hertz other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Hertz other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Hertz other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Hertz other) {
		return !lessThan(other);
	}
}