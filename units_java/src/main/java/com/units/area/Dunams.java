/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.area;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.internal.Multiplyers;


public class Dunams extends NumericValue implements Area{

	public static final double _scale =
		Multiplyers.kilo * SquareMeters._scale;
	
	public Dunams(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "dunams";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Dunams zero() {
		return new Dunams(0);
	}
	
	public static Dunams one() {
		return new Dunams(1);
	}
	
	public Dunams plus(Dunams other) {
		return new Dunams(value() + other.value());
	}
	
	public Dunams minus(Dunams other) {
		return new Dunams(value() - other.value());
	}
	
	public Dunams opposite() {
		return new Dunams(-value());
	}

	public Dunams multiplyByScalar(double scalar) {
		return new Dunams(scalar * value());
	}
	
	public Dunams divideByScalar(double scalar) {
		return new Dunams(value() / scalar);
	}
	
	public boolean equals(Dunams other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Dunams castFromScale(double value, double scale) {
		return new Dunams(value * scale / _scale);
	}

	public static Dunams castFrom(Area other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Dunams divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Dunams multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}