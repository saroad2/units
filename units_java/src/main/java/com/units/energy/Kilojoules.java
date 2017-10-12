/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.energy;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.internal.Multiplyers;


public class Kilojoules extends NumericValue implements Energy{

	public static final double _scale =
		Multiplyers.kilo * Joules._scale;
	
	public Kilojoules(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilojoules";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Kilojoules zero() {
		return new Kilojoules(0);
	}
	
	public static Kilojoules one() {
		return new Kilojoules(1);
	}
	
	public Kilojoules plus(Kilojoules other) {
		return new Kilojoules(value() + other.value());
	}
	
	public Kilojoules minus(Kilojoules other) {
		return new Kilojoules(value() - other.value());
	}
	
	public Kilojoules opposite() {
		return new Kilojoules(-value());
	}

	public Kilojoules multiplyByScalar(double scalar) {
		return new Kilojoules(scalar * value());
	}
	
	public Kilojoules divideByScalar(double scalar) {
		return new Kilojoules(value() / scalar);
	}
	
	public boolean equals(Kilojoules other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Kilojoules castFromScale(double value, double scale) {
		return new Kilojoules(value * scale / _scale);
	}

	public static Kilojoules castFrom(Energy other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Kilojoules divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Kilojoules multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}