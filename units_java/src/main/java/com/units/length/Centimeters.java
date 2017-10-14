/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.length;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsCasting;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.internal.Multiplyers;


public class Centimeters extends NumericValue implements Length{

	public static final double _scale =
		Multiplyers.centi * Meters._scale;
	
	public Centimeters(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "centimeters";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Centimeters zero() {
		return new Centimeters(0);
	}
	
	public static Centimeters one() {
		return new Centimeters(1);
	}
	
	public Centimeters plus(Centimeters other) {
		return new Centimeters(value() + other.value());
	}
	
	public Centimeters minus(Centimeters other) {
		return new Centimeters(value() - other.value());
	}
	
	public Centimeters opposite() {
		return new Centimeters(-value());
	}

	public Centimeters multiplyByScalar(double scalar) {
		return new Centimeters(scalar * value());
	}
	
	public Centimeters divideByScalar(double scalar) {
		return new Centimeters(value() / scalar);
	}
	
	public boolean equals(Centimeters other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Centimeters castFrom(Length other) {
		return castFromWithoutValidate(other);
	}

	public static Centimeters castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Centimeters castFromWithoutValidate(Unit other) {
		return castFromScale(other.value(), other.scale());
	}

	private static Centimeters castFromScale(double value, double scale) {
		return new Centimeters(value * scale / _scale);
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

	public static Centimeters divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Centimeters multiply(Unit... units) {
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