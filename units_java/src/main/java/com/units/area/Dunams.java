/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.area;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.exceptions.*;
import com.units.internal.*;
import com.units.internal.Multiplyers;


public class Dunams extends NumericValue implements Area{

	public static final double _scale =
		Multiplyers.kilo * SquareMeters._scale;
	
	public Dunams(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "dunams";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Dunams zero() {
		return new Dunams(0);
	}
	
	public static Dunams one() {
		return new Dunams(1);
	}
	
	public Dunams plus(Dunams other) {
		return new Dunams(value() + other.value());
	}
	
	public Dunams minus(Dunams other) {
		return new Dunams(value() - other.value());
	}
	
	public Dunams opposite() {
		return new Dunams(-value());
	}

	public Dunams multiplyByScalar(double scalar) {
		return new Dunams(scalar * value());
	}
	
	public Dunams divideByScalar(double scalar) {
		return new Dunams(value() / scalar);
	}
	
	public boolean equals(Dunams other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Dunams castFrom(Area other) {
		return castFromWithoutValidate(other);
	}

	public static Dunams castFrom(AnonymousUnit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Dunams castFromWithoutValidate(Unit other) {
		return new Dunams(other.value() * other.scale() / _scale);
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

	public static Dunams divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static Dunams multiply(Unit... units) {
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