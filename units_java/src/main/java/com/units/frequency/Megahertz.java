/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.frequency;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.internal.Multiplyers;


public class Megahertz extends NumericValue implements Frequency{

	public static final double _scale =
		Multiplyers.mega * Hertz._scale;
	
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
	
	private static Megahertz castFromScale(double value, double scale) {
		return new Megahertz(value * scale / _scale);
	}

	public static Megahertz castFrom(Frequency other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Megahertz divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Megahertz multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}