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
import com.units.length.Meters;


public class SquareMeters extends NumericValue implements Area{

	public static final double _scale =
		Meters._scale * Meters._scale;
	
	public SquareMeters(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "meters^2";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static SquareMeters zero() {
		return new SquareMeters(0);
	}
	
	public static SquareMeters one() {
		return new SquareMeters(1);
	}
	
	public SquareMeters plus(SquareMeters other) {
		return new SquareMeters(value() + other.value());
	}
	
	public SquareMeters minus(SquareMeters other) {
		return new SquareMeters(value() - other.value());
	}
	
	public SquareMeters opposite() {
		return new SquareMeters(-value());
	}

	public SquareMeters multiplyByScalar(double scalar) {
		return new SquareMeters(scalar * value());
	}
	
	public SquareMeters divideByScalar(double scalar) {
		return new SquareMeters(value() / scalar);
	}
	
	public boolean equals(SquareMeters other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static SquareMeters castFrom(Area other) {
		return castFromWithoutValidate(other);
	}

	public static SquareMeters castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static SquareMeters castFromWithoutValidate(Unit other) {
		return new SquareMeters(other.value() * other.scale() / _scale);
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

	public static SquareMeters divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static SquareMeters multiply(Unit... units) {
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