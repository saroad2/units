/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.area;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.length.Yards;


public class SquareYards extends NumericValue implements Area{

	public static final double _scale =
		Yards._scale * Yards._scale;
	
	public SquareYards(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "yards^2";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static SquareYards zero() {
		return new SquareYards(0);
	}
	
	public static SquareYards one() {
		return new SquareYards(1);
	}
	
	public SquareYards plus(SquareYards other) {
		return new SquareYards(value() + other.value());
	}
	
	public SquareYards minus(SquareYards other) {
		return new SquareYards(value() - other.value());
	}
	
	public SquareYards opposite() {
		return new SquareYards(-value());
	}

	public SquareYards multiplyByScalar(double scalar) {
		return new SquareYards(scalar * value());
	}
	
	public SquareYards divideByScalar(double scalar) {
		return new SquareYards(value() / scalar);
	}
	
	public boolean equals(SquareYards other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static SquareYards castFromScale(double value, double scale) {
		return new SquareYards(value * scale / _scale);
	}

	public static SquareYards castFrom(Area other) {
		return castFromScale(other.value(), other.scale());
	}

	public static SquareYards divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static SquareYards multiply(Unit... units) {
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