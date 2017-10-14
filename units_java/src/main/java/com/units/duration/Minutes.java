/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.duration;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Minutes extends NumericValue implements Duration{

	public static final double _scale =
		60.0 * Seconds._scale;
	
	public Minutes(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "minutes";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Minutes zero() {
		return new Minutes(0);
	}
	
	public static Minutes one() {
		return new Minutes(1);
	}
	
	public Minutes plus(Minutes other) {
		return new Minutes(value() + other.value());
	}
	
	public Minutes minus(Minutes other) {
		return new Minutes(value() - other.value());
	}
	
	public Minutes opposite() {
		return new Minutes(-value());
	}

	public Minutes multiplyByScalar(double scalar) {
		return new Minutes(scalar * value());
	}
	
	public Minutes divideByScalar(double scalar) {
		return new Minutes(value() / scalar);
	}
	
	public boolean equals(Minutes other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Minutes castFromScale(double value, double scale) {
		return new Minutes(value * scale / _scale);
	}

	public static Minutes castFrom(Duration other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Minutes divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Minutes multiply(Unit... units) {
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