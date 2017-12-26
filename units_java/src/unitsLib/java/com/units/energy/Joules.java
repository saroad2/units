/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.energy;

import com.units.internal.*;
import com.units.duration.Seconds;
import com.units.length.Meters;
import com.units.mass.Kilograms;


public class Joules extends NumericValue implements Energy{

	public static final double _scale =
		(Kilograms._scale * Meters._scale * Meters._scale)
		 / (Seconds._scale * Seconds._scale);
	
	public Joules(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "joules";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Joules zero() {
		return new Joules(0);
	}
	
	public static Joules one() {
		return new Joules(1);
	}
	
	public Joules plus(Joules other) {
		return new Joules(value() + other.value());
	}
	
	public Joules minus(Joules other) {
		return new Joules(value() - other.value());
	}
	
	public Joules opposite() {
		return new Joules(-value());
	}

	public Joules multiplyByScalar(double scalar) {
		return new Joules(scalar * value());
	}
	
	public Joules divideByScalar(double scalar) {
		return new Joules(value() / scalar);
	}
	
	public double scalarRatio(Joules other) {
		return value() / other.value();
	}
	
	public boolean equals(Joules other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Joules other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Joules other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Joules other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Joules other) {
		return !lessThan(other);
	}
}