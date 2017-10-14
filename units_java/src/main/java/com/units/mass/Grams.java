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
import com.units.internal.NoneScale;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Grams extends NumericValue implements Mass{

	public static final double _scale =
		1;
	
	public Grams(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "grams";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Grams zero() {
		return new Grams(0);
	}
	
	public static Grams one() {
		return new Grams(1);
	}
	
	public Grams plus(Grams other) {
		return new Grams(value() + other.value());
	}
	
	public Grams minus(Grams other) {
		return new Grams(value() - other.value());
	}
	
	public Grams opposite() {
		return new Grams(-value());
	}

	public Grams multiplyByScalar(double scalar) {
		return new Grams(scalar * value());
	}
	
	public Grams divideByScalar(double scalar) {
		return new Grams(value() / scalar);
	}
	
	public boolean equals(Grams other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Grams castFrom(Mass other) {
		return castFromWithoutValidate(other);
	}

	public static Grams castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Grams castFromWithoutValidate(Unit other) {
		return new Grams(other.value() * other.scale() / _scale);
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

	public static Grams divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static Grams multiply(Unit... units) {
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