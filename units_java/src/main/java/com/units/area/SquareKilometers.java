/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.area;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.length.Kilometers;


public class SquareKilometers extends NumericValue implements Area{

	public static final double _scale =
		Kilometers._scale * Kilometers._scale;
	
	public SquareKilometers(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilometers^2";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static SquareKilometers zero() {
		return new SquareKilometers(0);
	}
	
	public static SquareKilometers one() {
		return new SquareKilometers(1);
	}
	
	public SquareKilometers plus(SquareKilometers other) {
		return new SquareKilometers(value() + other.value());
	}
	
	public SquareKilometers minus(SquareKilometers other) {
		return new SquareKilometers(value() - other.value());
	}
	
	public SquareKilometers opposite() {
		return new SquareKilometers(-value());
	}

	public SquareKilometers multiplyByScalar(double scalar) {
		return new SquareKilometers(scalar * value());
	}
	
	public SquareKilometers divideByScalar(double scalar) {
		return new SquareKilometers(value() / scalar);
	}
	
	public boolean equals(SquareKilometers other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static SquareKilometers castFromScale(double value, double scale) {
		return new SquareKilometers(value * scale / _scale);
	}

	public static SquareKilometers castFrom(Area other) {
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

	public static SquareKilometers divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static SquareKilometers multiply(Unit... units) {
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