/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.mass;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.internal.Multiplyers;


public class Milligrams extends NumericValue implements Mass{

	public static final double _scale =
		Multiplyers.milli * Grams._scale;
	
	public Milligrams(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "milligrams";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Milligrams zero() {
		return new Milligrams(0);
	}
	
	public static Milligrams one() {
		return new Milligrams(1);
	}
	
	public Milligrams plus(Milligrams other) {
		return new Milligrams(value() + other.value());
	}
	
	public Milligrams minus(Milligrams other) {
		return new Milligrams(value() - other.value());
	}
	
	public Milligrams opposite() {
		return new Milligrams(-value());
	}

	public Milligrams multiplyByScalar(double scalar) {
		return new Milligrams(scalar * value());
	}
	
	public Milligrams divideByScalar(double scalar) {
		return new Milligrams(value() / scalar);
	}
	
	public boolean equals(Milligrams other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Milligrams castFromScale(double value, double scale) {
		return new Milligrams(value * scale / _scale);
	}

	public static Milligrams castFrom(Mass other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Milligrams divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Milligrams multiply(Unit... units) {
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