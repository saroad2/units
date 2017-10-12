/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.energy;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.duration.Seconds;
import com.units.length.Meters;
import com.units.mass.Kilograms;


public class Joules extends NumericValue implements Energy{

	public static final double _scale =
		(Kilograms._scale * Meters._scale * Meters._scale)
		 / (Seconds._scale * Seconds._scale);
	
	public Joules(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "joules";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Joules zero() {
		return new Joules(0);
	}
	
	public static Joules one() {
		return new Joules(1);
	}
	
	public Joules plus(Joules other) {
		return new Joules(value() + other.value());
	}
	
	public Joules minus(Joules other) {
		return new Joules(value() - other.value());
	}
	
	public Joules opposite() {
		return new Joules(-value());
	}

	public Joules multiplyByScalar(double scalar) {
		return new Joules(scalar * value());
	}
	
	public Joules divideByScalar(double scalar) {
		return new Joules(value() / scalar);
	}
	
	public boolean equals(Joules other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Joules castFromScale(double value, double scale) {
		return new Joules(value * scale / _scale);
	}

	public static Joules castFrom(Energy other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Joules divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Joules multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}