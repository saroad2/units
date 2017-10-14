/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.electric_current;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsCasting;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Amperes extends NumericValue implements ElectricCurrent{

	public static final double _scale =
		1;
	
	public Amperes(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "amperes";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Amperes zero() {
		return new Amperes(0);
	}
	
	public static Amperes one() {
		return new Amperes(1);
	}
	
	public Amperes plus(Amperes other) {
		return new Amperes(value() + other.value());
	}
	
	public Amperes minus(Amperes other) {
		return new Amperes(value() - other.value());
	}
	
	public Amperes opposite() {
		return new Amperes(-value());
	}

	public Amperes multiplyByScalar(double scalar) {
		return new Amperes(scalar * value());
	}
	
	public Amperes divideByScalar(double scalar) {
		return new Amperes(value() / scalar);
	}
	
	public boolean equals(Amperes other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Amperes castFrom(ElectricCurrent other) {
		return castFromWithoutValidate(other);
	}

	public static Amperes castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Amperes castFromWithoutValidate(Unit other) {
		return castFromScale(other.value(), other.scale());
	}

	private static Amperes castFromScale(double value, double scale) {
		return new Amperes(value * scale / _scale);
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

	public static Amperes divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Amperes multiply(Unit... units) {
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