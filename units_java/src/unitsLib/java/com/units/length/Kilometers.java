/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.length;

import com.units.internal.*;
import com.units.internal.Multipliers;


public class Kilometers extends NumericValue implements Length{

	public static final double _scale =
		Multipliers.kilo * Meters._scale;
	
	public Kilometers(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilometers";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Kilometers zero() {
		return new Kilometers(0);
	}
	
	public static Kilometers one() {
		return new Kilometers(1);
	}
	
	public Kilometers plus(Kilometers other) {
		return new Kilometers(value() + other.value());
	}
	
	public Kilometers minus(Kilometers other) {
		return new Kilometers(value() - other.value());
	}
	
	public Kilometers opposite() {
		return new Kilometers(-value());
	}

	public Kilometers multiplyByScalar(double scalar) {
		return new Kilometers(scalar * value());
	}
	
	public Kilometers divideByScalar(double scalar) {
		return new Kilometers(value() / scalar);
	}
	
	public double scalarRatio(Kilometers other) {
		return value() / other.value();
	}
	
	public boolean equals(Kilometers other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Kilometers other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Kilometers other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Kilometers other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Kilometers other) {
		return !lessThan(other);
	}
}