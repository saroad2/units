/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.length;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsCasting;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
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

	public static GeographicalMiles castFrom(Length other) {
		return castFromWithoutValidate(other);
	}

	public static GeographicalMiles castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static GeographicalMiles castFromWithoutValidate(Unit other) {
		return castFromScale(other.value(), other.scale());
	}

	private static GeographicalMiles castFromScale(double value, double scale) {
		return new GeographicalMiles(value * scale / _scale);
	}

	private static <E extends IllegalArgumentException> void
		validateTypeCode(Ratio typeCode, Class<E> exceptionClass) {
		try {
			if (!typeCode.equals(_typeCode))
				throw exceptionClass.newInstance();
		}
		catch(ReflectiveOperationException e) {
		}
	}

	public static GeographicalMiles divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static GeographicalMiles multiply(Unit... units) {
		List<Unit> unitsAsList = Arrays.asList(units);
		validateTypeCode(
				unitsAsList.stream()
				.map((unit) -> unit.typeCode())
				.reduce(Ratio.one(), (a, b) -> a.multiply(b)),
				IllegalUnitsMultiplication.class);
		double newValue = unitsAsList.stream()
				.mapToDouble((unit) -> unit.value())
				.reduce(1, (a, b) -> a * b);
		double newScale = unitsAsList.stream()
				.mapToDouble((unit) -> unit.scale())
				.reduce(1, (a, b) -> a * b);
		return castFromScale(newValue, newScale);
	}
}