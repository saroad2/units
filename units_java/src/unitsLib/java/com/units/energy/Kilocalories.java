/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.energy;

import com.units.internal.Multipliers;


public class Kilocalories extends Energy {

	public static final double _scale =
		Multipliers.kilo * Calories._scale;
	
	public Kilocalories(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilocalories";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Kilocalories zero() {
		return new Kilocalories(0);
	}
	
	public static Kilocalories one() {
		return new Kilocalories(1);
	}
	
	public Kilocalories plus(Kilocalories other) {
		return new Kilocalories(value() + other.value());
	}
	
	public Kilocalories minus(Kilocalories other) {
		return new Kilocalories(value() - other.value());
	}
	
	public Kilocalories opposite() {
		return new Kilocalories(-value());
	}

	public Kilocalories multiplyByScalar(double scalar) {
		return new Kilocalories(scalar * value());
	}
	
	public Kilocalories divideByScalar(double scalar) {
		return new Kilocalories(value() / scalar);
	}
	
	public double scalarRatio(Kilocalories other) {
		return value() / other.value();
	}
	
	public boolean equals(Kilocalories other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Kilocalories other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Kilocalories other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Kilocalories other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Kilocalories other) {
		return !lessThan(other);
	}
}