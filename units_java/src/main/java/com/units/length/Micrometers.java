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
import com.units.internal.Multiplyers;


public class Micrometers extends NumericValue implements Length{

	public static final double _scale =
		Multiplyers.micro * Meters._scale;
	
	public Micrometers(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "micrometers";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Micrometers zero() {
		return new Micrometers(0);
	}
	
	public static Micrometers one() {
		return new Micrometers(1);
	}
	
	public Micrometers plus(Micrometers other) {
		return new Micrometers(value() + other.value());
	}
	
	public Micrometers minus(Micrometers other) {
		return new Micrometers(value() - other.value());
	}
	
	public Micrometers opposite() {
		return new Micrometers(-value());
	}

	public Micrometers multiplyByScalar(double scalar) {
		return new Micrometers(scalar * value());
	}
	
	public Micrometers divideByScalar(double scalar) {
		return new Micrometers(value() / scalar);
	}
	
	public boolean equals(Micrometers other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Micrometers castFromScale(double value, double scale) {
		return new Micrometers(value * scale / _scale);
	}

	public static Micrometers castFrom(Length other) {
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

	public static Micrometers divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Micrometers multiply(Unit... units) {
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