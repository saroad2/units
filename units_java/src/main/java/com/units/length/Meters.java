/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.length;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsCasting;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NoneScale;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Meters extends NumericValue implements Length{

	public static final double _scale =
		1;
	
	public Meters(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "meters";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Meters zero() {
		return new Meters(0);
	}
	
	public static Meters one() {
		return new Meters(1);
	}
	
	public Meters plus(Meters other) {
		return new Meters(value() + other.value());
	}
	
	public Meters minus(Meters other) {
		return new Meters(value() - other.value());
	}
	
	public Meters opposite() {
		return new Meters(-value());
	}

	public Meters multiplyByScalar(double scalar) {
		return new Meters(scalar * value());
	}
	
	public Meters divideByScalar(double scalar) {
		return new Meters(value() / scalar);
	}
	
	public boolean equals(Meters other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Meters castFrom(Length other) {
		return castFromWithoutValidate(other);
	}

	public static Meters castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Meters castFromWithoutValidate(Unit other) {
		return new Meters(other.value() * other.scale() / _scale);
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

	public static Meters divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static Meters multiply(Unit... units) {
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