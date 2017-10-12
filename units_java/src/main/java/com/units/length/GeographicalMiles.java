/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.length;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class GeographicalMiles extends NumericValue implements Length{

	public static final double _scale =
		1855.3248 * Meters._scale;
	
	public GeographicalMiles(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "geographical miles";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static GeographicalMiles zero() {
		return new GeographicalMiles(0);
	}
	
	public static GeographicalMiles one() {
		return new GeographicalMiles(1);
	}
	
	public GeographicalMiles plus(GeographicalMiles other) {
		return new GeographicalMiles(value() + other.value());
	}
	
	public GeographicalMiles minus(GeographicalMiles other) {
		return new GeographicalMiles(value() - other.value());
	}
	
	public GeographicalMiles opposite() {
		return new GeographicalMiles(-value());
	}

	public GeographicalMiles multiplyByScalar(double scalar) {
		return new GeographicalMiles(scalar * value());
	}
	
	public GeographicalMiles divideByScalar(double scalar) {
		return new GeographicalMiles(value() / scalar);
	}
	
	public boolean equals(GeographicalMiles other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static GeographicalMiles castFromScale(double value, double scale) {
		return new GeographicalMiles(value * scale / _scale);
	}

	public static GeographicalMiles castFrom(Length other) {
		return castFromScale(other.value(), other.scale());
	}

	public static GeographicalMiles divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static GeographicalMiles multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}