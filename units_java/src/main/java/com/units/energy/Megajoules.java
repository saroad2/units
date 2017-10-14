/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.energy;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsCasting;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.internal.Multiplyers;


public class Megajoules extends NumericValue implements Energy{

	public static final double _scale =
		Multiplyers.mega * Joules._scale;
	
	public Megajoules(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "megajoules";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Megajoules zero() {
		return new Megajoules(0);
	}
	
	public static Megajoules one() {
		return new Megajoules(1);
	}
	
	public Megajoules plus(Megajoules other) {
		return new Megajoules(value() + other.value());
	}
	
	public Megajoules minus(Megajoules other) {
		return new Megajoules(value() - other.value());
	}
	
	public Megajoules opposite() {
		return new Megajoules(-value());
	}

	public Megajoules multiplyByScalar(double scalar) {
		return new Megajoules(scalar * value());
	}
	
	public Megajoules divideByScalar(double scalar) {
		return new Megajoules(value() / scalar);
	}
	
	public boolean equals(Megajoules other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Megajoules castFrom(Energy other) {
		return castFromWithoutValidate(other);
	}

	public static Megajoules castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Megajoules castFromWithoutValidate(Unit other) {
		return castFromScale(other.value(), other.scale());
	}

	private static Megajoules castFromScale(double value, double scale) {
		return new Megajoules(value * scale / _scale);
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

	public static Megajoules divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Megajoules multiply(Unit... units) {
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