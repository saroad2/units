/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.volume;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.exceptions.*;
import com.units.internal.*;
import com.units.length.Feet;


public class CubicFeet extends NumericValue implements Volume{

	public static final double _scale =
		Feet._scale * Feet._scale * Feet._scale;
	
	public CubicFeet(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "feet^3";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static CubicFeet zero() {
		return new CubicFeet(0);
	}
	
	public static CubicFeet one() {
		return new CubicFeet(1);
	}
	
	public CubicFeet plus(CubicFeet other) {
		return new CubicFeet(value() + other.value());
	}
	
	public CubicFeet minus(CubicFeet other) {
		return new CubicFeet(value() - other.value());
	}
	
	public CubicFeet opposite() {
		return new CubicFeet(-value());
	}

	public CubicFeet multiplyByScalar(double scalar) {
		return new CubicFeet(scalar * value());
	}
	
	public CubicFeet divideByScalar(double scalar) {
		return new CubicFeet(value() / scalar);
	}
	
	public boolean equals(CubicFeet other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static CubicFeet castFrom(Volume other) {
		return castFromWithoutValidate(other);
	}

	public static CubicFeet castFrom(AnonymousUnit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static CubicFeet castFromWithoutValidate(Unit other) {
		return new CubicFeet(other.value() * other.scale() / _scale);
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

	public static CubicFeet divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static CubicFeet multiply(Unit... units) {
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