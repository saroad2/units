/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.length;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.internal.Multiplyers;


public class Centimeters extends NumericValue implements Length{

	public static final double _scale = Multiplyers.centi * Meters._scale;
	
	public Centimeters(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "centimeters";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Centimeters zero() {
		return new Centimeters(0);
	}
	
	public static Centimeters one() {
		return new Centimeters(1);
	}
	
	public Centimeters plus(Centimeters other) {
		return new Centimeters(value() + other.value());
	}
	
	public Centimeters minus(Centimeters other) {
		return new Centimeters(value() - other.value());
	}
	
	public Centimeters opposite() {
		return new Centimeters(-value());
	}

	public Centimeters multiplyByScalar(double scalar) {
		return new Centimeters(scalar * value());
	}
	
	public Centimeters divideByScalar(double scalar) {
		return new Centimeters(value() / scalar);
	}
	
	public boolean equals(Centimeters other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Centimeters castFromScale(double value, double scale) {
		return new Centimeters(value * scale / _scale);
	}

	public static Centimeters castFrom(Length other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Centimeters divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Centimeters multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}