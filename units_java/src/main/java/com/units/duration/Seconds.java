/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.duration;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Seconds extends NumericValue implements Duration{

	public static final double _scale = 1;
	
	public Seconds(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "seconds";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Seconds zero() {
		return new Seconds(0);
	}
	
	public static Seconds one() {
		return new Seconds(1);
	}
	
	public Seconds plus(Seconds other) {
		return new Seconds(value() + other.value());
	}
	
	public Seconds minus(Seconds other) {
		return new Seconds(value() - other.value());
	}
	
	public Seconds opposite() {
		return new Seconds(-value());
	}

	public Seconds multiplyByScalar(double scalar) {
		return new Seconds(scalar * value());
	}
	
	public Seconds divideByScalar(double scalar) {
		return new Seconds(value() / scalar);
	}
	
	public boolean equals(Seconds other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Seconds castFromScale(double value, double scale) {
		return new Seconds(value * scale / _scale);
	}

	public static Seconds castFrom(Duration other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Seconds divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Seconds multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}