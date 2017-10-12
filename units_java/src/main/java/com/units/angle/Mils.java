/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.angle;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Mils extends NumericValue implements Angle{

	public static final double _scale = 0.05625 * Degrees._scale;
	
	public Mils(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "mils";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Mils zero() {
		return new Mils(0);
	}
	
	public static Mils one() {
		return new Mils(1);
	}
	
	public Mils plus(Mils other) {
		return new Mils(value() + other.value());
	}
	
	public Mils minus(Mils other) {
		return new Mils(value() - other.value());
	}
	
	public Mils opposite() {
		return new Mils(-value());
	}

	public Mils multiplyByScalar(double scalar) {
		return new Mils(scalar * value());
	}
	
	public Mils divideByScalar(double scalar) {
		return new Mils(value() / scalar);
	}
	
	public boolean equals(Mils other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Mils castFromScale(double value, double scale) {
		return new Mils(value * scale / _scale);
	}

	public static Mils castFrom(Angle other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Mils divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Mils multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}