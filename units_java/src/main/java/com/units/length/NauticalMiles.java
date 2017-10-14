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

public class NauticalMiles extends NumericValue implements Length{

	public static final double _scale =
		1852.0 * Meters._scale;
	
	public NauticalMiles(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "nautical miles";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static NauticalMiles zero() {
		return new NauticalMiles(0);
	}
	
	public static NauticalMiles one() {
		return new NauticalMiles(1);
	}
	
	public NauticalMiles plus(NauticalMiles other) {
		return new NauticalMiles(value() + other.value());
	}
	
	public NauticalMiles minus(NauticalMiles other) {
		return new NauticalMiles(value() - other.value());
	}
	
	public NauticalMiles opposite() {
		return new NauticalMiles(-value());
	}

	public NauticalMiles multiplyByScalar(double scalar) {
		return new NauticalMiles(scalar * value());
	}
	
	public NauticalMiles divideByScalar(double scalar) {
		return new NauticalMiles(value() / scalar);
	}
	
	public boolean equals(NauticalMiles other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static NauticalMiles castFrom(Length other) {
		return castFromWithoutValidate(other);
	}

	public static NauticalMiles castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static NauticalMiles castFromWithoutValidate(Unit other) {
		return castFromScale(other.value(), other.scale());
	}

	private static NauticalMiles castFromScale(double value, double scale) {
		return new NauticalMiles(value * scale / _scale);
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

	public static NauticalMiles divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static NauticalMiles multiply(Unit... units) {
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