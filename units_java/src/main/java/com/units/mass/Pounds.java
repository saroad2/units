/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.mass;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Pounds extends NumericValue implements Mass{

	public static final double _scale =
		453.592333346094 * Grams._scale;
	
	public Pounds(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "pounds";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Pounds zero() {
		return new Pounds(0);
	}
	
	public static Pounds one() {
		return new Pounds(1);
	}
	
	public Pounds plus(Pounds other) {
		return new Pounds(value() + other.value());
	}
	
	public Pounds minus(Pounds other) {
		return new Pounds(value() - other.value());
	}
	
	public Pounds opposite() {
		return new Pounds(-value());
	}

	public Pounds multiplyByScalar(double scalar) {
		return new Pounds(scalar * value());
	}
	
	public Pounds divideByScalar(double scalar) {
		return new Pounds(value() / scalar);
	}
	
	public boolean equals(Pounds other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Pounds castFromScale(double value, double scale) {
		return new Pounds(value * scale / _scale);
	}

	public static Pounds castFrom(Mass other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Pounds divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Pounds multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}