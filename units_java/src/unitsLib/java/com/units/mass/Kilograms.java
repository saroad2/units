/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.mass;

import com.units.internal.Multipliers;


public class Kilograms extends Mass {

	public static final double _scale =
		Multipliers.kilo * Grams._scale;
	
	public Kilograms(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilograms";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Kilograms zero() {
		return new Kilograms(0);
	}
	
	public static Kilograms one() {
		return new Kilograms(1);
	}
	
	public Kilograms plus(Kilograms other) {
		return new Kilograms(value() + other.value());
	}
	
	public Kilograms minus(Kilograms other) {
		return new Kilograms(value() - other.value());
	}
	
	public Kilograms opposite() {
		return new Kilograms(-value());
	}

	public Kilograms multiplyByScalar(double scalar) {
		return new Kilograms(scalar * value());
	}
	
	public Kilograms divideByScalar(double scalar) {
		return new Kilograms(value() / scalar);
	}
	
	public double scalarRatio(Kilograms other) {
		return value() / other.value();
	}
	
	public boolean equals(Kilograms other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Kilograms other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Kilograms other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Kilograms other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Kilograms other) {
		return !lessThan(other);
	}
}