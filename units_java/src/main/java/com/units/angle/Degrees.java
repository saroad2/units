/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.angle;

import com.units.internal.*;

public class Degrees extends NumericValue implements Angle{

	public static final double _scale =
		1;
	
	public Degrees(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "degrees";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Degrees zero() {
		return new Degrees(0);
	}
	
	public static Degrees one() {
		return new Degrees(1);
	}
	
	public Degrees plus(Degrees other) {
		return new Degrees(value() + other.value());
	}
	
	public Degrees minus(Degrees other) {
		return new Degrees(value() - other.value());
	}
	
	public Degrees opposite() {
		return new Degrees(-value());
	}

	public Degrees multiplyByScalar(double scalar) {
		return new Degrees(scalar * value());
	}
	
	public Degrees divideByScalar(double scalar) {
		return new Degrees(value() / scalar);
	}
	
	public boolean equals(Degrees other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}