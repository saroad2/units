/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.angle;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Mils extends NumericValue implements Angle{

	public static final double _scale =
		0.05625 * Degrees._scale;
	
	public Mils(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "mils";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Mils zero() {
		return new Mils(0);
	}
	
	public static Mils one() {
		return new Mils(1);
	}
	
	public Mils plus(Mils other) {
		return new Mils(value() + other.value());
	}
	
	public Mils minus(Mils other) {
		return new Mils(value() - other.value());
	}
	
	public Mils opposite() {
		return new Mils(-value());
	}

	public Mils multiplyByScalar(double scalar) {
		return new Mils(scalar * value());
	}
	
	public Mils divideByScalar(double scalar) {
		return new Mils(value() / scalar);
	}
	
	public boolean equals(Mils other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Mils castFromScale(double value, double scale) {
		return new Mils(value * scale / _scale);
	}

	public static Mils castFrom(Angle other) {
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

	public static Mils divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Mils multiply(Unit... units) {
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