/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.frequency;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.internal.Multiplyers;


public class Megahertz extends NumericValue implements Frequency{

	public static final double _scale =
		Multiplyers.mega * Hertz._scale;
	
	public Megahertz(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "megahertz";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Megahertz zero() {
		return new Megahertz(0);
	}
	
	public static Megahertz one() {
		return new Megahertz(1);
	}
	
	public Megahertz plus(Megahertz other) {
		return new Megahertz(value() + other.value());
	}
	
	public Megahertz minus(Megahertz other) {
		return new Megahertz(value() - other.value());
	}
	
	public Megahertz opposite() {
		return new Megahertz(-value());
	}

	public Megahertz multiplyByScalar(double scalar) {
		return new Megahertz(scalar * value());
	}
	
	public Megahertz divideByScalar(double scalar) {
		return new Megahertz(value() / scalar);
	}
	
	public boolean equals(Megahertz other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Megahertz castFromScale(double value, double scale) {
		return new Megahertz(value * scale / _scale);
	}

	public static Megahertz castFrom(Frequency other) {
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

	public static Megahertz divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Megahertz multiply(Unit... units) {
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