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


public class Kilocalories extends NumericValue implements Energy{

	public static final double _scale =
		Multiplyers.kilo * Calories._scale;
	
	public Kilocalories(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilocalories";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Kilocalories zero() {
		return new Kilocalories(0);
	}
	
	public static Kilocalories one() {
		return new Kilocalories(1);
	}
	
	public Kilocalories plus(Kilocalories other) {
		return new Kilocalories(value() + other.value());
	}
	
	public Kilocalories minus(Kilocalories other) {
		return new Kilocalories(value() - other.value());
	}
	
	public Kilocalories opposite() {
		return new Kilocalories(-value());
	}

	public Kilocalories multiplyByScalar(double scalar) {
		return new Kilocalories(scalar * value());
	}
	
	public Kilocalories divideByScalar(double scalar) {
		return new Kilocalories(value() / scalar);
	}
	
	public boolean equals(Kilocalories other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Kilocalories castFromScale(double value, double scale) {
		return new Kilocalories(value * scale / _scale);
	}

	public static Kilocalories castFrom(Energy other) {
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

	public static Kilocalories divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Kilocalories multiply(Unit... units) {
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