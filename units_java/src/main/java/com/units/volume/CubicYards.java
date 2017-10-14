/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.volume;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.length.Yards;


public class CubicYards extends NumericValue implements Volume{

	public static final double _scale =
		Yards._scale * Yards._scale * Yards._scale;
	
	public CubicYards(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "yards^3";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static CubicYards zero() {
		return new CubicYards(0);
	}
	
	public static CubicYards one() {
		return new CubicYards(1);
	}
	
	public CubicYards plus(CubicYards other) {
		return new CubicYards(value() + other.value());
	}
	
	public CubicYards minus(CubicYards other) {
		return new CubicYards(value() - other.value());
	}
	
	public CubicYards opposite() {
		return new CubicYards(-value());
	}

	public CubicYards multiplyByScalar(double scalar) {
		return new CubicYards(scalar * value());
	}
	
	public CubicYards divideByScalar(double scalar) {
		return new CubicYards(value() / scalar);
	}
	
	public boolean equals(CubicYards other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static CubicYards castFromScale(double value, double scale) {
		return new CubicYards(value * scale / _scale);
	}

	public static CubicYards castFrom(Volume other) {
		return castFromScale(other.value(), other.scale());
	}

	public static CubicYards divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static CubicYards multiply(Unit... units) {
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