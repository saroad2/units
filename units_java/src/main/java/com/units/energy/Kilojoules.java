/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.energy;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.internal.Multiplyers;


public class Kilojoules extends NumericValue implements Energy{

	public static final double _scale =
		Multiplyers.kilo * Joules._scale;
	
	public Kilojoules(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilojoules";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Kilojoules zero() {
		return new Kilojoules(0);
	}
	
	public static Kilojoules one() {
		return new Kilojoules(1);
	}
	
	public Kilojoules plus(Kilojoules other) {
		return new Kilojoules(value() + other.value());
	}
	
	public Kilojoules minus(Kilojoules other) {
		return new Kilojoules(value() - other.value());
	}
	
	public Kilojoules opposite() {
		return new Kilojoules(-value());
	}

	public Kilojoules multiplyByScalar(double scalar) {
		return new Kilojoules(scalar * value());
	}
	
	public Kilojoules divideByScalar(double scalar) {
		return new Kilojoules(value() / scalar);
	}
	
	public boolean equals(Kilojoules other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Kilojoules castFromScale(double value, double scale) {
		return new Kilojoules(value * scale / _scale);
	}

	public static Kilojoules castFrom(Energy other) {
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

	public static Kilojoules divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Kilojoules multiply(Unit... units) {
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