/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.force;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.*;
import com.units.duration.Seconds;
import com.units.length.Meters;
import com.units.mass.Kilograms;


public class Newtons extends NumericValue implements Force{

	public static final double _scale =
		(Kilograms._scale * Meters._scale)
		 / (Seconds._scale * Seconds._scale);
	
	public Newtons(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "newtons";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Newtons zero() {
		return new Newtons(0);
	}
	
	public static Newtons one() {
		return new Newtons(1);
	}
	
	public Newtons plus(Newtons other) {
		return new Newtons(value() + other.value());
	}
	
	public Newtons minus(Newtons other) {
		return new Newtons(value() - other.value());
	}
	
	public Newtons opposite() {
		return new Newtons(-value());
	}

	public Newtons multiplyByScalar(double scalar) {
		return new Newtons(scalar * value());
	}
	
	public Newtons divideByScalar(double scalar) {
		return new Newtons(value() / scalar);
	}
	
	public boolean equals(Newtons other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Newtons castFrom(Force other) {
		return castFromWithoutValidate(other);
	}

	public static Newtons castFrom(AnonymousUnit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Newtons castFromWithoutValidate(Unit other) {
		return new Newtons(other.value() * other.scale() / _scale);
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

	public static Newtons divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static Newtons multiply(Unit... units) {
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