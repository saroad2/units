/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.duration;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Years extends NumericValue implements Duration{

	public static final double _scale = 365.0 * Days._scale;
	
	public Years(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "years";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Years zero() {
		return new Years(0);
	}
	
	public static Years one() {
		return new Years(1);
	}
	
	public Years plus(Years other) {
		return new Years(value() + other.value());
	}
	
	public Years minus(Years other) {
		return new Years(value() - other.value());
	}
	
	public Years opposite() {
		return new Years(-value());
	}

	public Years multiplyByScalar(double scalar) {
		return new Years(scalar * value());
	}
	
	public Years divideByScalar(double scalar) {
		return new Years(value() / scalar);
	}
	
	public boolean equals(Years other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Years castFromScale(double value, double scale) {
		return new Years(value * scale / _scale);
	}

	public static Years castFrom(Duration other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Years divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Years multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}