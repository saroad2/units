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

public class Mils extends NumericValue implements Angle{

	public static final double _scale =
		0.05625 * Degrees._scale;
	
	public Mils(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "mils";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Mils zero() {
		return new Mils(0);
	}
	
	public static Mils one() {
		return new Mils(1);
	}
	
	public Mils plus(Mils other) {
		return new Mils(value() + other.value());
	}
	
	public Mils minus(Mils other) {
		return new Mils(value() - other.value());
	}
	
	public Mils opposite() {
		return new Mils(-value());
	}

	public Mils multiplyByScalar(double scalar) {
		return new Mils(scalar * value());
	}
	
	public Mils divideByScalar(double scalar) {
		return new Mils(value() / scalar);
	}
	
	public boolean equals(Mils other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Mils castFrom(Angle other) {
		return castFromWithoutValidate(other);
	}

	public static Mils castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Mils castFromWithoutValidate(Unit other) {
		return new Mils(other.value() * other.scale() / _scale);
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

	public static Mils divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static Mils multiply(Unit... units) {
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