/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.volume;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.exceptions.*;
import com.units.internal.*;
import com.units.length.Meters;


public class CubicMeters extends NumericValue implements Volume{

	public static final double _scale =
		Meters._scale * Meters._scale * Meters._scale;
	
	public CubicMeters(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "meters^3";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static CubicMeters zero() {
		return new CubicMeters(0);
	}
	
	public static CubicMeters one() {
		return new CubicMeters(1);
	}
	
	public CubicMeters plus(CubicMeters other) {
		return new CubicMeters(value() + other.value());
	}
	
	public CubicMeters minus(CubicMeters other) {
		return new CubicMeters(value() - other.value());
	}
	
	public CubicMeters opposite() {
		return new CubicMeters(-value());
	}

	public CubicMeters multiplyByScalar(double scalar) {
		return new CubicMeters(scalar * value());
	}
	
	public CubicMeters divideByScalar(double scalar) {
		return new CubicMeters(value() / scalar);
	}
	
	public boolean equals(CubicMeters other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static CubicMeters castFrom(Volume other) {
		return castFromWithoutValidate(other);
	}

	public static CubicMeters castFrom(AnonymousUnit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static CubicMeters castFromWithoutValidate(Unit other) {
		return new CubicMeters(other.value() * other.scale() / _scale);
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

	public static CubicMeters divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static CubicMeters multiply(Unit... units) {
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