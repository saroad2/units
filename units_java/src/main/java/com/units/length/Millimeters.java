/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.length;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.internal.Multiplyers;


public class Millimeters extends NumericValue implements Length{

	public static final double _scale =
		Multiplyers.milli * Meters._scale;
	
	public Millimeters(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "millimeters";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Millimeters zero() {
		return new Millimeters(0);
	}
	
	public static Millimeters one() {
		return new Millimeters(1);
	}
	
	public Millimeters plus(Millimeters other) {
		return new Millimeters(value() + other.value());
	}
	
	public Millimeters minus(Millimeters other) {
		return new Millimeters(value() - other.value());
	}
	
	public Millimeters opposite() {
		return new Millimeters(-value());
	}

	public Millimeters multiplyByScalar(double scalar) {
		return new Millimeters(scalar * value());
	}
	
	public Millimeters divideByScalar(double scalar) {
		return new Millimeters(value() / scalar);
	}
	
	public boolean equals(Millimeters other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Millimeters castFromScale(double value, double scale) {
		return new Millimeters(value * scale / _scale);
	}

	public static Millimeters castFrom(Length other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Millimeters divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Millimeters multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}