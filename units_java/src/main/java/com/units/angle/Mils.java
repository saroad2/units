/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.angle;

import com.units.internal.*;

public class Mils extends NumericValue implements Angle{

	public static final double _scale =
		0.05625 * Degrees._scale;
	
	public Mils(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "mils";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Mils zero() {
		return new Mils(0);
	}
	
	public static Mils one() {
		return new Mils(1);
	}
	
	public Mils plus(Mils other) {
		return new Mils(value() + other.value());
	}
	
	public Mils minus(Mils other) {
		return new Mils(value() - other.value());
	}
	
	public Mils opposite() {
		return new Mils(-value());
	}

	public Mils multiplyByScalar(double scalar) {
		return new Mils(scalar * value());
	}
	
	public Mils divideByScalar(double scalar) {
		return new Mils(value() / scalar);
	}
	
	public boolean equals(Mils other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}