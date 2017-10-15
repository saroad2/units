/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.energy;

import com.units.internal.*;
import com.units.internal.Multiplyers;


public class Kilocalories extends NumericValue implements Energy{

	public static final double _scale =
		Multiplyers.kilo * Calories._scale;
	
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
	
	public boolean equals(Kilocalories other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}