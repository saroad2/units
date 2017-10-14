/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.volume;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.length.Kilometers;


public class CubicKilometers extends NumericValue implements Volume{

	public static final double _scale =
		Kilometers._scale * Kilometers._scale * Kilometers._scale;
	
	public CubicKilometers(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilometers^3";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static CubicKilometers zero() {
		return new CubicKilometers(0);
	}
	
	public static CubicKilometers one() {
		return new CubicKilometers(1);
	}
	
	public CubicKilometers plus(CubicKilometers other) {
		return new CubicKilometers(value() + other.value());
	}
	
	public CubicKilometers minus(CubicKilometers other) {
		return new CubicKilometers(value() - other.value());
	}
	
	public CubicKilometers opposite() {
		return new CubicKilometers(-value());
	}

	public CubicKilometers multiplyByScalar(double scalar) {
		return new CubicKilometers(scalar * value());
	}
	
	public CubicKilometers divideByScalar(double scalar) {
		return new CubicKilometers(value() / scalar);
	}
	
	public boolean equals(CubicKilometers other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static CubicKilometers castFromScale(double value, double scale) {
		return new CubicKilometers(value * scale / _scale);
	}

	public static CubicKilometers castFrom(Volume other) {
		return castFromScale(other.value(), other.scale());
	}

	public static CubicKilometers divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static CubicKilometers multiply(Unit... units) {
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