/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.force;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsCasting;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Dynes extends NumericValue implements Force{

	public static final double _scale =
		1.0E-5 * Newtons._scale;
	
	public Dynes(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "dynes";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Dynes zero() {
		return new Dynes(0);
	}
	
	public static Dynes one() {
		return new Dynes(1);
	}
	
	public Dynes plus(Dynes other) {
		return new Dynes(value() + other.value());
	}
	
	public Dynes minus(Dynes other) {
		return new Dynes(value() - other.value());
	}
	
	public Dynes opposite() {
		return new Dynes(-value());
	}

	public Dynes multiplyByScalar(double scalar) {
		return new Dynes(scalar * value());
	}
	
	public Dynes divideByScalar(double scalar) {
		return new Dynes(value() / scalar);
	}
	
	public boolean equals(Dynes other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Dynes castFrom(Force other) {
		return castFromWithoutValidate(other);
	}

	public static Dynes castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Dynes castFromWithoutValidate(Unit other) {
		return castFromScale(other.value(), other.scale());
	}

	private static Dynes castFromScale(double value, double scale) {
		return new Dynes(value * scale / _scale);
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

	public static Dynes divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Dynes multiply(Unit... units) {
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