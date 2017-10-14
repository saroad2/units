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
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Feet extends NumericValue implements Length{

	public static final double _scale =
		12.0 * Inches._scale;
	
	public Feet(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "feet";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Feet zero() {
		return new Feet(0);
	}
	
	public static Feet one() {
		return new Feet(1);
	}
	
	public Feet plus(Feet other) {
		return new Feet(value() + other.value());
	}
	
	public Feet minus(Feet other) {
		return new Feet(value() - other.value());
	}
	
	public Feet opposite() {
		return new Feet(-value());
	}

	public Feet multiplyByScalar(double scalar) {
		return new Feet(scalar * value());
	}
	
	public Feet divideByScalar(double scalar) {
		return new Feet(value() / scalar);
	}
	
	public boolean equals(Feet other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Feet castFrom(Length other) {
		return castFromWithoutValidate(other);
	}

	public static Feet castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Feet castFromWithoutValidate(Unit other) {
		return castFromScale(other.value(), other.scale());
	}

	private static Feet castFromScale(double value, double scale) {
		return new Feet(value * scale / _scale);
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

	public static Feet divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Feet multiply(Unit... units) {
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