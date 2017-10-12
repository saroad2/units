/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.area;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.length.Meters;


public class SquareMeters extends NumericValue implements Area{

	public static final double _scale =
		Meters._scale * Meters._scale;
	
	public SquareMeters(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "meters^2";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static SquareMeters zero() {
		return new SquareMeters(0);
	}
	
	public static SquareMeters one() {
		return new SquareMeters(1);
	}
	
	public SquareMeters plus(SquareMeters other) {
		return new SquareMeters(value() + other.value());
	}
	
	public SquareMeters minus(SquareMeters other) {
		return new SquareMeters(value() - other.value());
	}
	
	public SquareMeters opposite() {
		return new SquareMeters(-value());
	}

	public SquareMeters multiplyByScalar(double scalar) {
		return new SquareMeters(scalar * value());
	}
	
	public SquareMeters divideByScalar(double scalar) {
		return new SquareMeters(value() / scalar);
	}
	
	public boolean equals(SquareMeters other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static SquareMeters castFromScale(double value, double scale) {
		return new SquareMeters(value * scale / _scale);
	}

	public static SquareMeters castFrom(Area other) {
		return castFromScale(other.value(), other.scale());
	}

	public static SquareMeters divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static SquareMeters multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}