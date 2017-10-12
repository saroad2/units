/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.angle;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Radians extends NumericValue implements Angle{

	public static final double _scale =
		57.2957795131 * Degrees._scale;
	
	public Radians(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "radians";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Radians zero() {
		return new Radians(0);
	}
	
	public static Radians one() {
		return new Radians(1);
	}
	
	public Radians plus(Radians other) {
		return new Radians(value() + other.value());
	}
	
	public Radians minus(Radians other) {
		return new Radians(value() - other.value());
	}
	
	public Radians opposite() {
		return new Radians(-value());
	}

	public Radians multiplyByScalar(double scalar) {
		return new Radians(scalar * value());
	}
	
	public Radians divideByScalar(double scalar) {
		return new Radians(value() / scalar);
	}
	
	public boolean equals(Radians other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Radians castFromScale(double value, double scale) {
		return new Radians(value * scale / _scale);
	}

	public static Radians castFrom(Angle other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Radians divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Radians multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}