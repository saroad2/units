/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.mass;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsCasting;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Pounds extends NumericValue implements Mass{

	public static final double _scale =
		453.592333346094 * Grams._scale;
	
	public Pounds(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "pounds";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Pounds zero() {
		return new Pounds(0);
	}
	
	public static Pounds one() {
		return new Pounds(1);
	}
	
	public Pounds plus(Pounds other) {
		return new Pounds(value() + other.value());
	}
	
	public Pounds minus(Pounds other) {
		return new Pounds(value() - other.value());
	}
	
	public Pounds opposite() {
		return new Pounds(-value());
	}

	public Pounds multiplyByScalar(double scalar) {
		return new Pounds(scalar * value());
	}
	
	public Pounds divideByScalar(double scalar) {
		return new Pounds(value() / scalar);
	}
	
	public boolean equals(Pounds other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Pounds castFrom(Mass other) {
		return castFromWithoutValidate(other);
	}

	public static Pounds castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Pounds castFromWithoutValidate(Unit other) {
		return castFromScale(other.value(), other.scale());
	}

	private static Pounds castFromScale(double value, double scale) {
		return new Pounds(value * scale / _scale);
	}

	private static <E extends IllegalArgumentException> void
		validateTypeCode(Ratio typeCode, Class<E> exceptionClass) {
		try {
			if (!typeCode.equals(_typeCode))
				throw exceptionClass.newInstance();
		}
		catch(ReflectiveOperationException e) {
		}
	}

	public static Pounds divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Pounds multiply(Unit... units) {
		List<Unit> unitsAsList = Arrays.asList(units);
		validateTypeCode(
				unitsAsList.stream()
				.map((unit) -> unit.typeCode())
				.reduce(Ratio.one(), (a, b) -> a.multiply(b)),
				IllegalUnitsMultiplication.class);
		double newValue = unitsAsList.stream()
				.mapToDouble((unit) -> unit.value())
				.reduce(1, (a, b) -> a * b);
		double newScale = unitsAsList.stream()
				.mapToDouble((unit) -> unit.scale())
				.reduce(1, (a, b) -> a * b);
		return castFromScale(newValue, newScale);
	}
}