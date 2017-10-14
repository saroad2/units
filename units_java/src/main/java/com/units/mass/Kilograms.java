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
import com.units.internal.Multiplyers;


public class Kilograms extends NumericValue implements Mass{

	public static final double _scale =
		Multiplyers.kilo * Grams._scale;
	
	public Kilograms(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilograms";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Kilograms zero() {
		return new Kilograms(0);
	}
	
	public static Kilograms one() {
		return new Kilograms(1);
	}
	
	public Kilograms plus(Kilograms other) {
		return new Kilograms(value() + other.value());
	}
	
	public Kilograms minus(Kilograms other) {
		return new Kilograms(value() - other.value());
	}
	
	public Kilograms opposite() {
		return new Kilograms(-value());
	}

	public Kilograms multiplyByScalar(double scalar) {
		return new Kilograms(scalar * value());
	}
	
	public Kilograms divideByScalar(double scalar) {
		return new Kilograms(value() / scalar);
	}
	
	public boolean equals(Kilograms other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Kilograms castFrom(Mass other) {
		return castFromWithoutValidate(other);
	}

	public static Kilograms castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Kilograms castFromWithoutValidate(Unit other) {
		return castFromScale(other.value(), other.scale());
	}

	private static Kilograms castFromScale(double value, double scale) {
		return new Kilograms(value * scale / _scale);
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

	public static Kilograms divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Kilograms multiply(Unit... units) {
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