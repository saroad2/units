/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.frequency;

import com.units.internal.*;
import com.units.internal.Multipliers;


public class Megahertz extends NumericValue implements Frequency{

	public static final double _scale =
		Multipliers.mega * Hertz._scale;
	
	public Megahertz(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "megahertz";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Megahertz zero() {
		return new Megahertz(0);
	}
	
	public static Megahertz one() {
		return new Megahertz(1);
	}
	
	public Megahertz plus(Megahertz other) {
		return new Megahertz(value() + other.value());
	}
	
	public Megahertz minus(Megahertz other) {
		return new Megahertz(value() - other.value());
	}
	
	public Megahertz opposite() {
		return new Megahertz(-value());
	}

	public Megahertz multiplyByScalar(double scalar) {
		return new Megahertz(scalar * value());
	}
	
	public Megahertz divideByScalar(double scalar) {
		return new Megahertz(value() / scalar);
	}
	
	public boolean equals(Megahertz other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}