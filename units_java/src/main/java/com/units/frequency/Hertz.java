/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.frequency;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.duration.Seconds;


public class Hertz extends NumericValue implements Frequency{

	public static final double _scale =
		1.0 / Seconds._scale;
	
	public Hertz(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "hertz";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Hertz zero() {
		return new Hertz(0);
	}
	
	public static Hertz one() {
		return new Hertz(1);
	}
	
	public Hertz plus(Hertz other) {
		return new Hertz(value() + other.value());
	}
	
	public Hertz minus(Hertz other) {
		return new Hertz(value() - other.value());
	}
	
	public Hertz opposite() {
		return new Hertz(-value());
	}

	public Hertz multiplyByScalar(double scalar) {
		return new Hertz(scalar * value());
	}
	
	public Hertz divideByScalar(double scalar) {
		return new Hertz(value() / scalar);
	}
	
	public boolean equals(Hertz other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Hertz castFromScale(double value, double scale) {
		return new Hertz(value * scale / _scale);
	}

	public static Hertz castFrom(Frequency other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Hertz divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Hertz multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}