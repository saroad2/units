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
import com.units.internal.NoneScale;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.length.Kilometers;


public class CubicKilometers extends NumericValue implements Volume{

	public static final double _scale =
		Kilometers._scale * Kilometers._scale * Kilometers._scale;
	
	public CubicKilometers(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilometers^3";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static CubicKilometers zero() {
		return new CubicKilometers(0);
	}
	
	public static CubicKilometers one() {
		return new CubicKilometers(1);
	}
	
	public CubicKilometers plus(CubicKilometers other) {
		return new CubicKilometers(value() + other.value());
	}
	
	public CubicKilometers minus(CubicKilometers other) {
		return new CubicKilometers(value() - other.value());
	}
	
	public CubicKilometers opposite() {
		return new CubicKilometers(-value());
	}

	public CubicKilometers multiplyByScalar(double scalar) {
		return new CubicKilometers(scalar * value());
	}
	
	public CubicKilometers divideByScalar(double scalar) {
		return new CubicKilometers(value() / scalar);
	}
	
	public boolean equals(CubicKilometers other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static CubicKilometers castFrom(Volume other) {
		return castFromWithoutValidate(other);
	}

	public static CubicKilometers castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static CubicKilometers castFromWithoutValidate(Unit other) {
		return new CubicKilometers(other.value() * other.scale() / _scale);
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

	public static CubicKilometers divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static CubicKilometers multiply(Unit... units) {
		List<Unit> unitsAsList = Arrays.asList(units);
		validateTypeCode(
				unitsAsList.stream()
				.map((unit) -> unit.typeCode())
				.reduce(Ratio.one(), (a, b) -> a.multiply(b)),
				IllegalUnitsMultiplication.class);
		return castFromWithoutValidate(
				unitsAsList.stream()
				.reduce(NoneScale.one(), (a, b) -> a.multiply(b)));
	}
}