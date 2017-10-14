/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.duration;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.internal.Multiplyers;


public class Milliseconds extends NumericValue implements Duration{

	public static final double _scale =
		Multiplyers.milli * Seconds._scale;
	
	public Milliseconds(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "milliseconds";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Milliseconds zero() {
		return new Milliseconds(0);
	}
	
	public static Milliseconds one() {
		return new Milliseconds(1);
	}
	
	public Milliseconds plus(Milliseconds other) {
		return new Milliseconds(value() + other.value());
	}
	
	public Milliseconds minus(Milliseconds other) {
		return new Milliseconds(value() - other.value());
	}
	
	public Milliseconds opposite() {
		return new Milliseconds(-value());
	}

	public Milliseconds multiplyByScalar(double scalar) {
		return new Milliseconds(scalar * value());
	}
	
	public Milliseconds divideByScalar(double scalar) {
		return new Milliseconds(value() / scalar);
	}
	
	public boolean equals(Milliseconds other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Milliseconds castFromScale(double value, double scale) {
		return new Milliseconds(value * scale / _scale);
	}

	public static Milliseconds castFrom(Duration other) {
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

	public static Milliseconds divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Milliseconds multiply(Unit... units) {
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