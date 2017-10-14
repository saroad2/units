/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.length;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.exceptions.*;
import com.units.internal.*;
import com.units.internal.Multiplyers;


public class Millimeters extends NumericValue implements Length{

	public static final double _scale =
		Multiplyers.milli * Meters._scale;
	
	public Millimeters(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "millimeters";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Millimeters zero() {
		return new Millimeters(0);
	}
	
	public static Millimeters one() {
		return new Millimeters(1);
	}
	
	public Millimeters plus(Millimeters other) {
		return new Millimeters(value() + other.value());
	}
	
	public Millimeters minus(Millimeters other) {
		return new Millimeters(value() - other.value());
	}
	
	public Millimeters opposite() {
		return new Millimeters(-value());
	}

	public Millimeters multiplyByScalar(double scalar) {
		return new Millimeters(scalar * value());
	}
	
	public Millimeters divideByScalar(double scalar) {
		return new Millimeters(value() / scalar);
	}
	
	public boolean equals(Millimeters other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Millimeters castFrom(Length other) {
		return castFromWithoutValidate(other);
	}

	public static Millimeters castFrom(AnonymousUnit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Millimeters castFromWithoutValidate(Unit other) {
		return new Millimeters(other.value() * other.scale() / _scale);
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

	public static Millimeters divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static Millimeters multiply(Unit... units) {
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