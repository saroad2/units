/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.duration;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.*;

public class Days extends NumericValue implements Duration{

	public static final double _scale =
		24.0 * Hours._scale;
	
	public Days(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "days";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Days zero() {
		return new Days(0);
	}
	
	public static Days one() {
		return new Days(1);
	}
	
	public Days plus(Days other) {
		return new Days(value() + other.value());
	}
	
	public Days minus(Days other) {
		return new Days(value() - other.value());
	}
	
	public Days opposite() {
		return new Days(-value());
	}

	public Days multiplyByScalar(double scalar) {
		return new Days(scalar * value());
	}
	
	public Days divideByScalar(double scalar) {
		return new Days(value() / scalar);
	}
	
	public boolean equals(Days other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Days castFrom(Duration other) {
		return castFromWithoutValidate(other);
	}

	public static Days castFrom(AnonymousUnit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Days castFromWithoutValidate(Unit other) {
		return new Days(other.value() * other.scale() / _scale);
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

	public static Days divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static Days multiply(Unit... units) {
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