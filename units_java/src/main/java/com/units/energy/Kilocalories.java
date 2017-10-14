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
import com.units.internal.NoneScale;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.internal.Multiplyers;


public class Kilocalories extends NumericValue implements Energy{

	public static final double _scale =
		Multiplyers.kilo * Calories._scale;
	
	public Kilocalories(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilocalories";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Kilocalories zero() {
		return new Kilocalories(0);
	}
	
	public static Kilocalories one() {
		return new Kilocalories(1);
	}
	
	public Kilocalories plus(Kilocalories other) {
		return new Kilocalories(value() + other.value());
	}
	
	public Kilocalories minus(Kilocalories other) {
		return new Kilocalories(value() - other.value());
	}
	
	public Kilocalories opposite() {
		return new Kilocalories(-value());
	}

	public Kilocalories multiplyByScalar(double scalar) {
		return new Kilocalories(scalar * value());
	}
	
	public Kilocalories divideByScalar(double scalar) {
		return new Kilocalories(value() / scalar);
	}
	
	public boolean equals(Kilocalories other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Kilocalories castFrom(Energy other) {
		return castFromWithoutValidate(other);
	}

	public static Kilocalories castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Kilocalories castFromWithoutValidate(Unit other) {
		return new Kilocalories(other.value() * other.scale() / _scale);
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

	public static Kilocalories divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static Kilocalories multiply(Unit... units) {
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