/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.frequency;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsCasting;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NoneScale;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.duration.Seconds;


public class Hertz extends NumericValue implements Frequency{

	public static final double _scale =
		1.0 / Seconds._scale;
	
	public Hertz(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "hertz";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Hertz zero() {
		return new Hertz(0);
	}
	
	public static Hertz one() {
		return new Hertz(1);
	}
	
	public Hertz plus(Hertz other) {
		return new Hertz(value() + other.value());
	}
	
	public Hertz minus(Hertz other) {
		return new Hertz(value() - other.value());
	}
	
	public Hertz opposite() {
		return new Hertz(-value());
	}

	public Hertz multiplyByScalar(double scalar) {
		return new Hertz(scalar * value());
	}
	
	public Hertz divideByScalar(double scalar) {
		return new Hertz(value() / scalar);
	}
	
	public boolean equals(Hertz other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Hertz castFrom(Frequency other) {
		return castFromWithoutValidate(other);
	}

	public static Hertz castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Hertz castFromWithoutValidate(Unit other) {
		return new Hertz(other.value() * other.scale() / _scale);
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

	public static Hertz divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static Hertz multiply(Unit... units) {
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