/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.energy;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.*;
import com.units.internal.Multiplyers;


public class Kilojoules extends NumericValue implements Energy{

	public static final double _scale =
		Multiplyers.kilo * Joules._scale;
	
	public Kilojoules(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilojoules";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Kilojoules zero() {
		return new Kilojoules(0);
	}
	
	public static Kilojoules one() {
		return new Kilojoules(1);
	}
	
	public Kilojoules plus(Kilojoules other) {
		return new Kilojoules(value() + other.value());
	}
	
	public Kilojoules minus(Kilojoules other) {
		return new Kilojoules(value() - other.value());
	}
	
	public Kilojoules opposite() {
		return new Kilojoules(-value());
	}

	public Kilojoules multiplyByScalar(double scalar) {
		return new Kilojoules(scalar * value());
	}
	
	public Kilojoules divideByScalar(double scalar) {
		return new Kilojoules(value() / scalar);
	}
	
	public boolean equals(Kilojoules other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Kilojoules castFrom(Energy other) {
		return castFromWithoutValidate(other);
	}

	public static Kilojoules castFrom(AnonymousUnit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Kilojoules castFromWithoutValidate(Unit other) {
		return new Kilojoules(other.value() * other.scale() / _scale);
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

	public static Kilojoules divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static Kilojoules multiply(Unit... units) {
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