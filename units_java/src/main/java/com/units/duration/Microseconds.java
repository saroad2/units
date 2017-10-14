/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.duration;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.internal.Multiplyers;


public class Microseconds extends NumericValue implements Duration{

	public static final double _scale =
		Multiplyers.micro * Seconds._scale;
	
	public Microseconds(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "microseconds";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Microseconds zero() {
		return new Microseconds(0);
	}
	
	public static Microseconds one() {
		return new Microseconds(1);
	}
	
	public Microseconds plus(Microseconds other) {
		return new Microseconds(value() + other.value());
	}
	
	public Microseconds minus(Microseconds other) {
		return new Microseconds(value() - other.value());
	}
	
	public Microseconds opposite() {
		return new Microseconds(-value());
	}

	public Microseconds multiplyByScalar(double scalar) {
		return new Microseconds(scalar * value());
	}
	
	public Microseconds divideByScalar(double scalar) {
		return new Microseconds(value() / scalar);
	}
	
	public boolean equals(Microseconds other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Microseconds castFromScale(double value, double scale) {
		return new Microseconds(value * scale / _scale);
	}

	public static Microseconds castFrom(Duration other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Microseconds divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Microseconds multiply(Unit... units) {
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