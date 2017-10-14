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
import com.units.internal.NoneScale;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Minutes extends NumericValue implements Duration{

	public static final double _scale =
		60.0 * Seconds._scale;
	
	public Minutes(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "minutes";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Minutes zero() {
		return new Minutes(0);
	}
	
	public static Minutes one() {
		return new Minutes(1);
	}
	
	public Minutes plus(Minutes other) {
		return new Minutes(value() + other.value());
	}
	
	public Minutes minus(Minutes other) {
		return new Minutes(value() - other.value());
	}
	
	public Minutes opposite() {
		return new Minutes(-value());
	}

	public Minutes multiplyByScalar(double scalar) {
		return new Minutes(scalar * value());
	}
	
	public Minutes divideByScalar(double scalar) {
		return new Minutes(value() / scalar);
	}
	
	public boolean equals(Minutes other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Minutes castFrom(Duration other) {
		return castFromWithoutValidate(other);
	}

	public static Minutes castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Minutes castFromWithoutValidate(Unit other) {
		return new Minutes(other.value() * other.scale() / _scale);
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

	public static Minutes divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static Minutes multiply(Unit... units) {
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