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


public class Kilometers extends NumericValue implements Length{

	public static final double _scale =
		Multiplyers.kilo * Meters._scale;
	
	public Kilometers(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilometers";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Kilometers zero() {
		return new Kilometers(0);
	}
	
	public static Kilometers one() {
		return new Kilometers(1);
	}
	
	public Kilometers plus(Kilometers other) {
		return new Kilometers(value() + other.value());
	}
	
	public Kilometers minus(Kilometers other) {
		return new Kilometers(value() - other.value());
	}
	
	public Kilometers opposite() {
		return new Kilometers(-value());
	}

	public Kilometers multiplyByScalar(double scalar) {
		return new Kilometers(scalar * value());
	}
	
	public Kilometers divideByScalar(double scalar) {
		return new Kilometers(value() / scalar);
	}
	
	public boolean equals(Kilometers other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Kilometers castFrom(Length other) {
		return castFromWithoutValidate(other);
	}

	public static Kilometers castFrom(AnonymousUnit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Kilometers castFromWithoutValidate(Unit other) {
		return new Kilometers(other.value() * other.scale() / _scale);
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

	public static Kilometers divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static Kilometers multiply(Unit... units) {
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