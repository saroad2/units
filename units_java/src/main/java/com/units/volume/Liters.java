/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.volume;

import com.units.internal.*;
import com.units.internal.Multiplyers;


public class Liters extends NumericValue implements Volume{

	public static final double _scale =
		Multiplyers.milli * CubicMeters._scale;
	
	public Liters(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "liters";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Liters zero() {
		return new Liters(0);
	}
	
	public static Liters one() {
		return new Liters(1);
	}
	
	public Liters plus(Liters other) {
		return new Liters(value() + other.value());
	}
	
	public Liters minus(Liters other) {
		return new Liters(value() - other.value());
	}
	
	public Liters opposite() {
		return new Liters(-value());
	}

	public Liters multiplyByScalar(double scalar) {
		return new Liters(scalar * value());
	}
	
	public Liters divideByScalar(double scalar) {
		return new Liters(value() / scalar);
	}
	
	public boolean equals(Liters other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}