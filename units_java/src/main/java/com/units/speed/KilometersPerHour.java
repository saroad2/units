/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.speed;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.*;
import com.units.duration.Hours;
import com.units.length.Kilometers;


public class KilometersPerHour extends NumericValue implements Speed{

	public static final double _scale =
		Kilometers._scale / Hours._scale;
	
	public KilometersPerHour(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilometers/hour";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static KilometersPerHour zero() {
		return new KilometersPerHour(0);
	}
	
	public static KilometersPerHour one() {
		return new KilometersPerHour(1);
	}
	
	public KilometersPerHour plus(KilometersPerHour other) {
		return new KilometersPerHour(value() + other.value());
	}
	
	public KilometersPerHour minus(KilometersPerHour other) {
		return new KilometersPerHour(value() - other.value());
	}
	
	public KilometersPerHour opposite() {
		return new KilometersPerHour(-value());
	}

	public KilometersPerHour multiplyByScalar(double scalar) {
		return new KilometersPerHour(scalar * value());
	}
	
	public KilometersPerHour divideByScalar(double scalar) {
		return new KilometersPerHour(value() / scalar);
	}
	
	public boolean equals(KilometersPerHour other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static KilometersPerHour castFrom(Speed other) {
		return castFromWithoutValidate(other);
	}

	public static KilometersPerHour castFrom(AnonymousUnit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static KilometersPerHour castFromWithoutValidate(Unit other) {
		return new KilometersPerHour(other.value() * other.scale() / _scale);
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

	public static KilometersPerHour divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static KilometersPerHour multiply(Unit... units) {
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