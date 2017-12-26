/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.pressure;

import com.units.duration.Seconds;
import com.units.length.Meters;
import com.units.mass.Kilograms;


public class Pascals extends Pressure {

	public static final double _scale =
		Kilograms._scale
		 / (Meters._scale * Seconds._scale * Seconds._scale);
	
	public Pascals(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "pascals";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Pascals zero() {
		return new Pascals(0);
	}
	
	public static Pascals one() {
		return new Pascals(1);
	}
	
	public Pascals plus(Pascals other) {
		return new Pascals(value() + other.value());
	}
	
	public Pascals minus(Pascals other) {
		return new Pascals(value() - other.value());
	}
	
	public Pascals opposite() {
		return new Pascals(-value());
	}

	public Pascals multiplyByScalar(double scalar) {
		return new Pascals(scalar * value());
	}
	
	public Pascals divideByScalar(double scalar) {
		return new Pascals(value() / scalar);
	}
	
	public double scalarRatio(Pascals other) {
		return value() / other.value();
	}
	
	public boolean equals(Pascals other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Pascals other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Pascals other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Pascals other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Pascals other) {
		return !lessThan(other);
	}
}