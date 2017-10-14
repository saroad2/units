/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.volume;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.*;
import com.units.internal.Multiplyers;


public class Milliliters extends NumericValue implements Volume{

	public static final double _scale =
		Multiplyers.milli * Liters._scale;
	
	public Milliliters(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "milliliters";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Milliliters zero() {
		return new Milliliters(0);
	}
	
	public static Milliliters one() {
		return new Milliliters(1);
	}
	
	public Milliliters plus(Milliliters other) {
		return new Milliliters(value() + other.value());
	}
	
	public Milliliters minus(Milliliters other) {
		return new Milliliters(value() - other.value());
	}
	
	public Milliliters opposite() {
		return new Milliliters(-value());
	}

	public Milliliters multiplyByScalar(double scalar) {
		return new Milliliters(scalar * value());
	}
	
	public Milliliters divideByScalar(double scalar) {
		return new Milliliters(value() / scalar);
	}
	
	public boolean equals(Milliliters other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Milliliters castFrom(Volume other) {
		return castFromWithoutValidate(other);
	}

	public static Milliliters castFrom(AnonymousUnit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Milliliters castFromWithoutValidate(Unit other) {
		return new Milliliters(other.value() * other.scale() / _scale);
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

	public static Milliliters divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static Milliliters multiply(Unit... units) {
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