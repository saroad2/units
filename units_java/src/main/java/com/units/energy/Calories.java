/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.energy;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsCasting;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NoneScale;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Calories extends NumericValue implements Energy{

	public static final double _scale =
		4.184 * Joules._scale;
	
	public Calories(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "calories";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Calories zero() {
		return new Calories(0);
	}
	
	public static Calories one() {
		return new Calories(1);
	}
	
	public Calories plus(Calories other) {
		return new Calories(value() + other.value());
	}
	
	public Calories minus(Calories other) {
		return new Calories(value() - other.value());
	}
	
	public Calories opposite() {
		return new Calories(-value());
	}

	public Calories multiplyByScalar(double scalar) {
		return new Calories(scalar * value());
	}
	
	public Calories divideByScalar(double scalar) {
		return new Calories(value() / scalar);
	}
	
	public boolean equals(Calories other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Calories castFrom(Energy other) {
		return castFromWithoutValidate(other);
	}

	public static Calories castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Calories castFromWithoutValidate(Unit other) {
		return new Calories(other.value() * other.scale() / _scale);
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

	public static Calories divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static Calories multiply(Unit... units) {
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