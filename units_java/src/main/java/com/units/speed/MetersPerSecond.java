/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.speed;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.duration.Seconds;
import com.units.length.Meters;


public class MetersPerSecond extends NumericValue implements Speed{

	public static final double _scale =
		Meters._scale / Seconds._scale;
	
	public MetersPerSecond(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "meters/second";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static MetersPerSecond zero() {
		return new MetersPerSecond(0);
	}
	
	public static MetersPerSecond one() {
		return new MetersPerSecond(1);
	}
	
	public MetersPerSecond plus(MetersPerSecond other) {
		return new MetersPerSecond(value() + other.value());
	}
	
	public MetersPerSecond minus(MetersPerSecond other) {
		return new MetersPerSecond(value() - other.value());
	}
	
	public MetersPerSecond opposite() {
		return new MetersPerSecond(-value());
	}

	public MetersPerSecond multiplyByScalar(double scalar) {
		return new MetersPerSecond(scalar * value());
	}
	
	public MetersPerSecond divideByScalar(double scalar) {
		return new MetersPerSecond(value() / scalar);
	}
	
	public boolean equals(MetersPerSecond other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static MetersPerSecond castFromScale(double value, double scale) {
		return new MetersPerSecond(value * scale / _scale);
	}

	public static MetersPerSecond castFrom(Speed other) {
		return castFromScale(other.value(), other.scale());
	}

	public static MetersPerSecond divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static MetersPerSecond multiply(Unit... units) {
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