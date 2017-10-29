/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.frequency;

import com.units.internal.*;
import com.units.internal.Multipliers;


public class Kilohertz extends NumericValue implements Frequency{

	public static final double _scale =
		Multipliers.kilo * Hertz._scale;
	
	public Kilohertz(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilohertz";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Kilohertz zero() {
		return new Kilohertz(0);
	}
	
	public static Kilohertz one() {
		return new Kilohertz(1);
	}
	
	public Kilohertz plus(Kilohertz other) {
		return new Kilohertz(value() + other.value());
	}
	
	public Kilohertz minus(Kilohertz other) {
		return new Kilohertz(value() - other.value());
	}
	
	public Kilohertz opposite() {
		return new Kilohertz(-value());
	}

	public Kilohertz multiplyByScalar(double scalar) {
		return new Kilohertz(scalar * value());
	}
	
	public Kilohertz divideByScalar(double scalar) {
		return new Kilohertz(value() / scalar);
	}
	
	public boolean equals(Kilohertz other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}