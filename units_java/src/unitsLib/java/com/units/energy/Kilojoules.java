/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.energy;

import com.units.internal.*;
import com.units.internal.Multipliers;


public class Kilojoules extends NumericValue implements Energy{

	public static final double _scale =
		Multipliers.kilo * Joules._scale;
	
	public Kilojoules(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilojoules";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Kilojoules zero() {
		return new Kilojoules(0);
	}
	
	public static Kilojoules one() {
		return new Kilojoules(1);
	}
	
	public Kilojoules plus(Kilojoules other) {
		return new Kilojoules(value() + other.value());
	}
	
	public Kilojoules minus(Kilojoules other) {
		return new Kilojoules(value() - other.value());
	}
	
	public Kilojoules opposite() {
		return new Kilojoules(-value());
	}

	public Kilojoules multiplyByScalar(double scalar) {
		return new Kilojoules(scalar * value());
	}
	
	public Kilojoules divideByScalar(double scalar) {
		return new Kilojoules(value() / scalar);
	}
	
	public boolean equals(Kilojoules other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Kilojoules other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Kilojoules other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Kilojoules other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Kilojoules other) {
		return !lessThan(other);
	}
}