/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.speed;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsCasting;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NoneScale;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Knots extends NumericValue implements Speed{

	public static final double _scale =
		0.514444773689 * MetersPerSecond._scale;
	
	public Knots(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "knots";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Knots zero() {
		return new Knots(0);
	}
	
	public static Knots one() {
		return new Knots(1);
	}
	
	public Knots plus(Knots other) {
		return new Knots(value() + other.value());
	}
	
	public Knots minus(Knots other) {
		return new Knots(value() - other.value());
	}
	
	public Knots opposite() {
		return new Knots(-value());
	}

	public Knots multiplyByScalar(double scalar) {
		return new Knots(scalar * value());
	}
	
	public Knots divideByScalar(double scalar) {
		return new Knots(value() / scalar);
	}
	
	public boolean equals(Knots other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Knots castFrom(Speed other) {
		return castFromWithoutValidate(other);
	}

	public static Knots castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Knots castFromWithoutValidate(Unit other) {
		return new Knots(other.value() * other.scale() / _scale);
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

	public static Knots divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static Knots multiply(Unit... units) {
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