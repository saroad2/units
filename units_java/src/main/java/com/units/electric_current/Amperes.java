/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.electric_current;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Amperes extends NumericValue implements ElectricCurrent{

	public static final double _scale = 1;
	
	public Amperes(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "amperes";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Amperes zero() {
		return new Amperes(0);
	}
	
	public static Amperes one() {
		return new Amperes(1);
	}
	
	public Amperes plus(Amperes other) {
		return new Amperes(value() + other.value());
	}
	
	public Amperes minus(Amperes other) {
		return new Amperes(value() - other.value());
	}
	
	public Amperes opposite() {
		return new Amperes(-value());
	}

	public Amperes multiplyByScalar(double scalar) {
		return new Amperes(scalar * value());
	}
	
	public Amperes divideByScalar(double scalar) {
		return new Amperes(value() / scalar);
	}
	
	public boolean equals(Amperes other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Amperes castFromScale(double value, double scale) {
		return new Amperes(value * scale / _scale);
	}

	public static Amperes castFrom(ElectricCurrent other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Amperes divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}
}