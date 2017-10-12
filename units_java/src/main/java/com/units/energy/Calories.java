/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.energy;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Calories extends NumericValue implements Energy{

	public static final double _scale =
		4.184 * Joules._scale;
	
	public Calories(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "calories";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Calories zero() {
		return new Calories(0);
	}
	
	public static Calories one() {
		return new Calories(1);
	}
	
	public Calories plus(Calories other) {
		return new Calories(value() + other.value());
	}
	
	public Calories minus(Calories other) {
		return new Calories(value() - other.value());
	}
	
	public Calories opposite() {
		return new Calories(-value());
	}

	public Calories multiplyByScalar(double scalar) {
		return new Calories(scalar * value());
	}
	
	public Calories divideByScalar(double scalar) {
		return new Calories(value() / scalar);
	}
	
	public boolean equals(Calories other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Calories castFromScale(double value, double scale) {
		return new Calories(value * scale / _scale);
	}

	public static Calories castFrom(Energy other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Calories divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Calories multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}