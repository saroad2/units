/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.angle;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsCasting;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NoneScale;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Radians extends NumericValue implements Angle{

	public static final double _scale =
		57.2957795131 * Degrees._scale;
	
	public Radians(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "radians";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Radians zero() {
		return new Radians(0);
	}
	
	public static Radians one() {
		return new Radians(1);
	}
	
	public Radians plus(Radians other) {
		return new Radians(value() + other.value());
	}
	
	public Radians minus(Radians other) {
		return new Radians(value() - other.value());
	}
	
	public Radians opposite() {
		return new Radians(-value());
	}

	public Radians multiplyByScalar(double scalar) {
		return new Radians(scalar * value());
	}
	
	public Radians divideByScalar(double scalar) {
		return new Radians(value() / scalar);
	}
	
	public boolean equals(Radians other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Radians castFrom(Angle other) {
		return castFromWithoutValidate(other);
	}

	public static Radians castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Radians castFromWithoutValidate(Unit other) {
		return new Radians(other.value() * other.scale() / _scale);
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

	public static Radians divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static Radians multiply(Unit... units) {
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