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
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Years extends NumericValue implements Duration{

	public static final double _scale =
		365.0 * Days._scale;
	
	public Years(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "years";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Years zero() {
		return new Years(0);
	}
	
	public static Years one() {
		return new Years(1);
	}
	
	public Years plus(Years other) {
		return new Years(value() + other.value());
	}
	
	public Years minus(Years other) {
		return new Years(value() - other.value());
	}
	
	public Years opposite() {
		return new Years(-value());
	}

	public Years multiplyByScalar(double scalar) {
		return new Years(scalar * value());
	}
	
	public Years divideByScalar(double scalar) {
		return new Years(value() / scalar);
	}
	
	public boolean equals(Years other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Years castFrom(Duration other) {
		return castFromWithoutValidate(other);
	}

	public static Years castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Years castFromWithoutValidate(Unit other) {
		return castFromScale(other.value(), other.scale());
	}

	private static Years castFromScale(double value, double scale) {
		return new Years(value * scale / _scale);
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

	public static Years divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Years multiply(Unit... units) {
		List<Unit> unitsAsList = Arrays.asList(units);
		validateTypeCode(
				unitsAsList.stream()
				.map((unit) -> unit.typeCode())
				.reduce(Ratio.one(), (a, b) -> a.multiply(b)),
				IllegalUnitsMultiplication.class);
		double newValue = unitsAsList.stream()
				.mapToDouble((unit) -> unit.value())
				.reduce(1, (a, b) -> a * b);
		double newScale = unitsAsList.stream()
				.mapToDouble((unit) -> unit.scale())
				.reduce(1, (a, b) -> a * b);
		return castFromScale(newValue, newScale);
	}
}