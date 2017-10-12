/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.frequency;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.internal.Multiplyers;


public class Kilohertz extends NumericValue implements Frequency{

	public static final double _scale =
		Multiplyers.kilo * Hertz._scale;
	
	public Kilohertz(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilohertz";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Kilohertz zero() {
		return new Kilohertz(0);
	}
	
	public static Kilohertz one() {
		return new Kilohertz(1);
	}
	
	public Kilohertz plus(Kilohertz other) {
		return new Kilohertz(value() + other.value());
	}
	
	public Kilohertz minus(Kilohertz other) {
		return new Kilohertz(value() - other.value());
	}
	
	public Kilohertz opposite() {
		return new Kilohertz(-value());
	}

	public Kilohertz multiplyByScalar(double scalar) {
		return new Kilohertz(scalar * value());
	}
	
	public Kilohertz divideByScalar(double scalar) {
		return new Kilohertz(value() / scalar);
	}
	
	public boolean equals(Kilohertz other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Kilohertz castFromScale(double value, double scale) {
		return new Kilohertz(value * scale / _scale);
	}

	public static Kilohertz castFrom(Frequency other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Kilohertz divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Kilohertz multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}