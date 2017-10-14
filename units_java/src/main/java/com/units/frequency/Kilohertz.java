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


public class Kilohertz extends NumericValue implements Frequency{

	public static final double _scale =
		Multiplyers.kilo * Hertz._scale;
	
	public Kilohertz(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilohertz";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Kilohertz zero() {
		return new Kilohertz(0);
	}
	
	public static Kilohertz one() {
		return new Kilohertz(1);
	}
	
	public Kilohertz plus(Kilohertz other) {
		return new Kilohertz(value() + other.value());
	}
	
	public Kilohertz minus(Kilohertz other) {
		return new Kilohertz(value() - other.value());
	}
	
	public Kilohertz opposite() {
		return new Kilohertz(-value());
	}

	public Kilohertz multiplyByScalar(double scalar) {
		return new Kilohertz(scalar * value());
	}
	
	public Kilohertz divideByScalar(double scalar) {
		return new Kilohertz(value() / scalar);
	}
	
	public boolean equals(Kilohertz other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Kilohertz castFromScale(double value, double scale) {
		return new Kilohertz(value * scale / _scale);
	}

	public static Kilohertz castFrom(Frequency other) {
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

	public static Kilohertz divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Kilohertz multiply(Unit... units) {
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