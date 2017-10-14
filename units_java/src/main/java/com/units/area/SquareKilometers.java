/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.area;

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


public class SquareKilometers extends NumericValue implements Area{

	public static final double _scale =
		Kilometers._scale * Kilometers._scale;
	
	public SquareKilometers(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilometers^2";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static SquareKilometers zero() {
		return new SquareKilometers(0);
	}
	
	public static SquareKilometers one() {
		return new SquareKilometers(1);
	}
	
	public SquareKilometers plus(SquareKilometers other) {
		return new SquareKilometers(value() + other.value());
	}
	
	public SquareKilometers minus(SquareKilometers other) {
		return new SquareKilometers(value() - other.value());
	}
	
	public SquareKilometers opposite() {
		return new SquareKilometers(-value());
	}

	public SquareKilometers multiplyByScalar(double scalar) {
		return new SquareKilometers(scalar * value());
	}
	
	public SquareKilometers divideByScalar(double scalar) {
		return new SquareKilometers(value() / scalar);
	}
	
	public boolean equals(SquareKilometers other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static SquareKilometers castFrom(Area other) {
		return castFromWithoutValidate(other);
	}

	public static SquareKilometers castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static SquareKilometers castFromWithoutValidate(Unit other) {
		return new SquareKilometers(other.value() * other.scale() / _scale);
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

	public static SquareKilometers divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static SquareKilometers multiply(Unit... units) {
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