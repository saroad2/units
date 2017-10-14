/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.duration;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsCasting;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NoneScale;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.internal.Multiplyers;


public class Microseconds extends NumericValue implements Duration{

	public static final double _scale =
		Multiplyers.micro * Seconds._scale;
	
	public Microseconds(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "microseconds";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Microseconds zero() {
		return new Microseconds(0);
	}
	
	public static Microseconds one() {
		return new Microseconds(1);
	}
	
	public Microseconds plus(Microseconds other) {
		return new Microseconds(value() + other.value());
	}
	
	public Microseconds minus(Microseconds other) {
		return new Microseconds(value() - other.value());
	}
	
	public Microseconds opposite() {
		return new Microseconds(-value());
	}

	public Microseconds multiplyByScalar(double scalar) {
		return new Microseconds(scalar * value());
	}
	
	public Microseconds divideByScalar(double scalar) {
		return new Microseconds(value() / scalar);
	}
	
	public boolean equals(Microseconds other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Microseconds castFrom(Duration other) {
		return castFromWithoutValidate(other);
	}

	public static Microseconds castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Microseconds castFromWithoutValidate(Unit other) {
		return new Microseconds(other.value() * other.scale() / _scale);
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

	public static Microseconds divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static Microseconds multiply(Unit... units) {
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