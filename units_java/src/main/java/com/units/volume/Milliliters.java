/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.volume;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.internal.Multiplyers;


public class Milliliters extends NumericValue implements Volume{

	public static final double _scale =
		Multiplyers.milli * Liters._scale;
	
	public Milliliters(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "milliliters";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Milliliters zero() {
		return new Milliliters(0);
	}
	
	public static Milliliters one() {
		return new Milliliters(1);
	}
	
	public Milliliters plus(Milliliters other) {
		return new Milliliters(value() + other.value());
	}
	
	public Milliliters minus(Milliliters other) {
		return new Milliliters(value() - other.value());
	}
	
	public Milliliters opposite() {
		return new Milliliters(-value());
	}

	public Milliliters multiplyByScalar(double scalar) {
		return new Milliliters(scalar * value());
	}
	
	public Milliliters divideByScalar(double scalar) {
		return new Milliliters(value() / scalar);
	}
	
	public boolean equals(Milliliters other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Milliliters castFromScale(double value, double scale) {
		return new Milliliters(value * scale / _scale);
	}

	public static Milliliters castFrom(Volume other) {
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

	public static Milliliters divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Milliliters multiply(Unit... units) {
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