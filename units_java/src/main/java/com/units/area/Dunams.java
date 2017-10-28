/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.area;

import com.units.internal.*;
import com.units.internal.Multiplyers;


public class Dunams extends NumericValue implements Area{

	public static final double _scale =
		Multiplyers.kilo * SquareMeters._scale;
	
	public Dunams(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "dunams";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Dunams zero() {
		return new Dunams(0);
	}
	
	public static Dunams one() {
		return new Dunams(1);
	}
	
	public Dunams plus(Dunams other) {
		return new Dunams(value() + other.value());
	}
	
	public Dunams minus(Dunams other) {
		return new Dunams(value() - other.value());
	}
	
	public Dunams opposite() {
		return new Dunams(-value());
	}

	public Dunams multiplyByScalar(double scalar) {
		return new Dunams(scalar * value());
	}
	
	public Dunams divideByScalar(double scalar) {
		return new Dunams(value() / scalar);
	}
	
	public boolean equals(Dunams other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}