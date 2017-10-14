/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.duration;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsCasting;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Hours extends NumericValue implements Duration{

	public static final double _scale =
		60.0 * Minutes._scale;
	
	public Hours(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "hours";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Hours zero() {
		return new Hours(0);
	}
	
	public static Hours one() {
		return new Hours(1);
	}
	
	public Hours plus(Hours other) {
		return new Hours(value() + other.value());
	}
	
	public Hours minus(Hours other) {
		return new Hours(value() - other.value());
	}
	
	public Hours opposite() {
		return new Hours(-value());
	}

	public Hours multiplyByScalar(double scalar) {
		return new Hours(scalar * value());
	}
	
	public Hours divideByScalar(double scalar) {
		return new Hours(value() / scalar);
	}
	
	public boolean equals(Hours other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Hours castFrom(Duration other) {
		return castFromWithoutValidate(other);
	}

	public static Hours castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Hours castFromWithoutValidate(Unit other) {
		return castFromScale(other.value(), other.scale());
	}

	private static Hours castFromScale(double value, double scale) {
		return new Hours(value * scale / _scale);
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

	public static Hours divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Hours multiply(Unit... units) {
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