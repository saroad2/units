/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.length;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.internal.Multiplyers;


public class Kilometers extends NumericValue implements Length{

	public static final double _scale =
		Multiplyers.kilo * Meters._scale;
	
	public Kilometers(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilometers";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Kilometers zero() {
		return new Kilometers(0);
	}
	
	public static Kilometers one() {
		return new Kilometers(1);
	}
	
	public Kilometers plus(Kilometers other) {
		return new Kilometers(value() + other.value());
	}
	
	public Kilometers minus(Kilometers other) {
		return new Kilometers(value() - other.value());
	}
	
	public Kilometers opposite() {
		return new Kilometers(-value());
	}

	public Kilometers multiplyByScalar(double scalar) {
		return new Kilometers(scalar * value());
	}
	
	public Kilometers divideByScalar(double scalar) {
		return new Kilometers(value() / scalar);
	}
	
	public boolean equals(Kilometers other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Kilometers castFromScale(double value, double scale) {
		return new Kilometers(value * scale / _scale);
	}

	public static Kilometers castFrom(Length other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Kilometers divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Kilometers multiply(Unit... units) {
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