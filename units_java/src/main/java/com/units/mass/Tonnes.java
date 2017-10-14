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


public class Tonnes extends NumericValue implements Mass{

	public static final double _scale =
		Multiplyers.mega * Grams._scale;
	
	public Tonnes(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "tonnes";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Tonnes zero() {
		return new Tonnes(0);
	}
	
	public static Tonnes one() {
		return new Tonnes(1);
	}
	
	public Tonnes plus(Tonnes other) {
		return new Tonnes(value() + other.value());
	}
	
	public Tonnes minus(Tonnes other) {
		return new Tonnes(value() - other.value());
	}
	
	public Tonnes opposite() {
		return new Tonnes(-value());
	}

	public Tonnes multiplyByScalar(double scalar) {
		return new Tonnes(scalar * value());
	}
	
	public Tonnes divideByScalar(double scalar) {
		return new Tonnes(value() / scalar);
	}
	
	public boolean equals(Tonnes other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Tonnes castFrom(Mass other) {
		return castFromWithoutValidate(other);
	}

	public static Tonnes castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Tonnes castFromWithoutValidate(Unit other) {
		return castFromScale(other.value(), other.scale());
	}

	private static Tonnes castFromScale(double value, double scale) {
		return new Tonnes(value * scale / _scale);
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

	public static Tonnes divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Tonnes multiply(Unit... units) {
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