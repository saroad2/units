/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.energy;

import com.units.internal.*;
import com.units.internal.Multiplyers;


public class Megajoules extends NumericValue implements Energy{

	public static final double _scale =
		Multiplyers.mega * Joules._scale;
	
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
}