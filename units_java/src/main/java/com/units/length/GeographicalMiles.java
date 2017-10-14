/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.length;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.exceptions.*;
import com.units.internal.*;

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

	public static GeographicalMiles castFrom(AnonymousUnit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static GeographicalMiles castFromWithoutValidate(Unit other) {
		return new GeographicalMiles(other.value() * other.scale() / _scale);
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
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static GeographicalMiles multiply(Unit... units) {
		List<Unit> unitsAsList = Arrays.asList(units);
		validateTypeCode(
				unitsAsList.stream()
				.map((unit) -> unit.typeCode())
				.reduce(Ratio.one(), (a, b) -> a.multiply(b)),
				IllegalUnitsMultiplication.class);
		return castFromWithoutValidate(
				unitsAsList.stream()
				.reduce(NoneScale.one(), (a, b) -> a.multiply(b)));
	}
}