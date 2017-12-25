/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.energy;

import com.units.internal.*;
import com.units.internal.Multipliers;


public class Megajoules extends NumericValue implements Energy{

	public static final double _scale =
		Multipliers.mega * Joules._scale;
	
	public Megajoules(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "megajoules";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Megajoules zero() {
		return new Megajoules(0);
	}
	
	public static Megajoules one() {
		return new Megajoules(1);
	}
	
	public Megajoules plus(Megajoules other) {
		return new Megajoules(value() + other.value());
	}
	
	public Megajoules minus(Megajoules other) {
		return new Megajoules(value() - other.value());
	}
	
	public Megajoules opposite() {
		return new Megajoules(-value());
	}

	public Megajoules multiplyByScalar(double scalar) {
		return new Megajoules(scalar * value());
	}
	
	public Megajoules divideByScalar(double scalar) {
		return new Megajoules(value() / scalar);
	}
	
	public boolean equals(Megajoules other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Megajoules other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Megajoules other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Megajoules other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Megajoules other) {
		return !lessThan(other);
	}
}