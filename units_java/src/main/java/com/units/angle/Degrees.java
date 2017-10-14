/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.angle;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Degrees extends NumericValue implements Angle{

	public static final double _scale =
		1;
	
	public Degrees(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "degrees";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Degrees zero() {
		return new Degrees(0);
	}
	
	public static Degrees one() {
		return new Degrees(1);
	}
	
	public Degrees plus(Degrees other) {
		return new Degrees(value() + other.value());
	}
	
	public Degrees minus(Degrees other) {
		return new Degrees(value() - other.value());
	}
	
	public Degrees opposite() {
		return new Degrees(-value());
	}

	public Degrees multiplyByScalar(double scalar) {
		return new Degrees(scalar * value());
	}
	
	public Degrees divideByScalar(double scalar) {
		return new Degrees(value() / scalar);
	}
	
	public boolean equals(Degrees other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Degrees castFromScale(double value, double scale) {
		return new Degrees(value * scale / _scale);
	}

	public static Degrees castFrom(Angle other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Degrees divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Degrees multiply(Unit... units) {
		List<Unit> unitsAsList = Arrays.asList(units);
		Ratio resultTypeCode = unitsAsList.stream()
				.map((unit) -> unit.typeCode())
				.reduce(Ratio.one(), (a, b) -> a.multiply(b));
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		double newValue = unitsAsList.stream()
				.mapToDouble((unit) -> unit.value())
				.reduce(1, (a, b) -> a * b);
		double newScale = unitsAsList.stream()
				.mapToDouble((unit) -> unit.scale())
				.reduce(1, (a, b) -> a * b);
		return castFromScale(newValue, newScale);
	}
}