/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.area;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.exceptions.*;
import com.units.internal.*;
import com.units.length.Feet;


public class SquareFeet extends NumericValue implements Area{

	public static final double _scale =
		Feet._scale * Feet._scale;
	
	public SquareFeet(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "feet^2";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static SquareFeet zero() {
		return new SquareFeet(0);
	}
	
	public static SquareFeet one() {
		return new SquareFeet(1);
	}
	
	public SquareFeet plus(SquareFeet other) {
		return new SquareFeet(value() + other.value());
	}
	
	public SquareFeet minus(SquareFeet other) {
		return new SquareFeet(value() - other.value());
	}
	
	public SquareFeet opposite() {
		return new SquareFeet(-value());
	}

	public SquareFeet multiplyByScalar(double scalar) {
		return new SquareFeet(scalar * value());
	}
	
	public SquareFeet divideByScalar(double scalar) {
		return new SquareFeet(value() / scalar);
	}
	
	public boolean equals(SquareFeet other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static SquareFeet castFrom(Area other) {
		return castFromWithoutValidate(other);
	}

	public static SquareFeet castFrom(AnonymousUnit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static SquareFeet castFromWithoutValidate(Unit other) {
		return new SquareFeet(other.value() * other.scale() / _scale);
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

	public static SquareFeet divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static SquareFeet multiply(Unit... units) {
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