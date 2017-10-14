/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.length;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Yards extends NumericValue implements Length{

	public static final double _scale =
		3.0 * Feet._scale;
	
	public Yards(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "yards";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Yards zero() {
		return new Yards(0);
	}
	
	public static Yards one() {
		return new Yards(1);
	}
	
	public Yards plus(Yards other) {
		return new Yards(value() + other.value());
	}
	
	public Yards minus(Yards other) {
		return new Yards(value() - other.value());
	}
	
	public Yards opposite() {
		return new Yards(-value());
	}

	public Yards multiplyByScalar(double scalar) {
		return new Yards(scalar * value());
	}
	
	public Yards divideByScalar(double scalar) {
		return new Yards(value() / scalar);
	}
	
	public boolean equals(Yards other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Yards castFromScale(double value, double scale) {
		return new Yards(value * scale / _scale);
	}

	public static Yards castFrom(Length other) {
		return castFromScale(other.value(), other.scale());
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

	public static Yards divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Yards multiply(Unit... units) {
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