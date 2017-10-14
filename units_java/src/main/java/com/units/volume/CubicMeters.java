/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.volume;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsCasting;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.length.Meters;


public class CubicMeters extends NumericValue implements Volume{

	public static final double _scale =
		Meters._scale * Meters._scale * Meters._scale;
	
	public CubicMeters(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "meters^3";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static CubicMeters zero() {
		return new CubicMeters(0);
	}
	
	public static CubicMeters one() {
		return new CubicMeters(1);
	}
	
	public CubicMeters plus(CubicMeters other) {
		return new CubicMeters(value() + other.value());
	}
	
	public CubicMeters minus(CubicMeters other) {
		return new CubicMeters(value() - other.value());
	}
	
	public CubicMeters opposite() {
		return new CubicMeters(-value());
	}

	public CubicMeters multiplyByScalar(double scalar) {
		return new CubicMeters(scalar * value());
	}
	
	public CubicMeters divideByScalar(double scalar) {
		return new CubicMeters(value() / scalar);
	}
	
	public boolean equals(CubicMeters other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static CubicMeters castFrom(Volume other) {
		return castFromWithoutValidate(other);
	}

	public static CubicMeters castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static CubicMeters castFromWithoutValidate(Unit other) {
		return castFromScale(other.value(), other.scale());
	}

	private static CubicMeters castFromScale(double value, double scale) {
		return new CubicMeters(value * scale / _scale);
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

	public static CubicMeters divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static CubicMeters multiply(Unit... units) {
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