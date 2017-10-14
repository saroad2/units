/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.force;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.duration.Seconds;
import com.units.length.Meters;
import com.units.mass.Kilograms;


public class Newtons extends NumericValue implements Force{

	public static final double _scale =
		(Kilograms._scale * Meters._scale)
		 / (Seconds._scale * Seconds._scale);
	
	public Newtons(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "newtons";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Newtons zero() {
		return new Newtons(0);
	}
	
	public static Newtons one() {
		return new Newtons(1);
	}
	
	public Newtons plus(Newtons other) {
		return new Newtons(value() + other.value());
	}
	
	public Newtons minus(Newtons other) {
		return new Newtons(value() - other.value());
	}
	
	public Newtons opposite() {
		return new Newtons(-value());
	}

	public Newtons multiplyByScalar(double scalar) {
		return new Newtons(scalar * value());
	}
	
	public Newtons divideByScalar(double scalar) {
		return new Newtons(value() / scalar);
	}
	
	public boolean equals(Newtons other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Newtons castFromScale(double value, double scale) {
		return new Newtons(value * scale / _scale);
	}

	public static Newtons castFrom(Force other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Newtons divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Newtons multiply(Unit... units) {
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