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

public class Seconds extends NumericValue implements Duration{

	public static final double _scale =
		1;
	
	public Seconds(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "seconds";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Seconds zero() {
		return new Seconds(0);
	}
	
	public static Seconds one() {
		return new Seconds(1);
	}
	
	public Seconds plus(Seconds other) {
		return new Seconds(value() + other.value());
	}
	
	public Seconds minus(Seconds other) {
		return new Seconds(value() - other.value());
	}
	
	public Seconds opposite() {
		return new Seconds(-value());
	}

	public Seconds multiplyByScalar(double scalar) {
		return new Seconds(scalar * value());
	}
	
	public Seconds divideByScalar(double scalar) {
		return new Seconds(value() / scalar);
	}
	
	public boolean equals(Seconds other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Seconds castFrom(Duration other) {
		return castFromWithoutValidate(other);
	}

	public static Seconds castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Seconds castFromWithoutValidate(Unit other) {
		return new Seconds(other.value() * other.scale() / _scale);
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

	public static Seconds divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static Seconds multiply(Unit... units) {
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