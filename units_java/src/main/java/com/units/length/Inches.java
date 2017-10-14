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

public class Inches extends NumericValue implements Length{

	public static final double _scale =
		0.0254 * Meters._scale;
	
	public Inches(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "inches";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Inches zero() {
		return new Inches(0);
	}
	
	public static Inches one() {
		return new Inches(1);
	}
	
	public Inches plus(Inches other) {
		return new Inches(value() + other.value());
	}
	
	public Inches minus(Inches other) {
		return new Inches(value() - other.value());
	}
	
	public Inches opposite() {
		return new Inches(-value());
	}

	public Inches multiplyByScalar(double scalar) {
		return new Inches(scalar * value());
	}
	
	public Inches divideByScalar(double scalar) {
		return new Inches(value() / scalar);
	}
	
	public boolean equals(Inches other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Inches castFromScale(double value, double scale) {
		return new Inches(value * scale / _scale);
	}

	public static Inches castFrom(Length other) {
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

	public static Inches divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Inches multiply(Unit... units) {
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