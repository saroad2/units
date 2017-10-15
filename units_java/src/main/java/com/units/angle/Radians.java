/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.angle;

import com.units.internal.*;

public class Radians extends NumericValue implements Angle{

	public static final double _scale =
		57.2957795131 * Degrees._scale;
	
	public Radians(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "radians";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Radians zero() {
		return new Radians(0);
	}
	
	public static Radians one() {
		return new Radians(1);
	}
	
	public Radians plus(Radians other) {
		return new Radians(value() + other.value());
	}
	
	public Radians minus(Radians other) {
		return new Radians(value() - other.value());
	}
	
	public Radians opposite() {
		return new Radians(-value());
	}

	public Radians multiplyByScalar(double scalar) {
		return new Radians(scalar * value());
	}
	
	public Radians divideByScalar(double scalar) {
		return new Radians(value() / scalar);
	}
	
	public boolean equals(Radians other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}