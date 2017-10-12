/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.area;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.length.Feet;


public class SquareFeet extends NumericValue implements Area{

	public static final double _scale =
		Feet._scale * Feet._scale;
	
	public SquareFeet(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "feet^2";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static SquareFeet zero() {
		return new SquareFeet(0);
	}
	
	public static SquareFeet one() {
		return new SquareFeet(1);
	}
	
	public SquareFeet plus(SquareFeet other) {
		return new SquareFeet(value() + other.value());
	}
	
	public SquareFeet minus(SquareFeet other) {
		return new SquareFeet(value() - other.value());
	}
	
	public SquareFeet opposite() {
		return new SquareFeet(-value());
	}

	public SquareFeet multiplyByScalar(double scalar) {
		return new SquareFeet(scalar * value());
	}
	
	public SquareFeet divideByScalar(double scalar) {
		return new SquareFeet(value() / scalar);
	}
	
	public boolean equals(SquareFeet other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static SquareFeet castFromScale(double value, double scale) {
		return new SquareFeet(value * scale / _scale);
	}

	public static SquareFeet castFrom(Area other) {
		return castFromScale(other.value(), other.scale());
	}

	public static SquareFeet divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static SquareFeet multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}