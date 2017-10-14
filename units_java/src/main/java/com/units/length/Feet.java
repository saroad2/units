/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.length;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Feet extends NumericValue implements Length{

	public static final double _scale =
		12.0 * Inches._scale;
	
	public Feet(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "feet";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Feet zero() {
		return new Feet(0);
	}
	
	public static Feet one() {
		return new Feet(1);
	}
	
	public Feet plus(Feet other) {
		return new Feet(value() + other.value());
	}
	
	public Feet minus(Feet other) {
		return new Feet(value() - other.value());
	}
	
	public Feet opposite() {
		return new Feet(-value());
	}

	public Feet multiplyByScalar(double scalar) {
		return new Feet(scalar * value());
	}
	
	public Feet divideByScalar(double scalar) {
		return new Feet(value() / scalar);
	}
	
	public boolean equals(Feet other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Feet castFromScale(double value, double scale) {
		return new Feet(value * scale / _scale);
	}

	public static Feet castFrom(Length other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Feet divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Feet multiply(Unit... units) {
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