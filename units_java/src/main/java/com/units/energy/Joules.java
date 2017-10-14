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
import com.units.duration.Seconds;
import com.units.length.Meters;
import com.units.mass.Kilograms;


public class Joules extends NumericValue implements Energy{

	public static final double _scale =
		(Kilograms._scale * Meters._scale * Meters._scale)
		 / (Seconds._scale * Seconds._scale);
	
	public Joules(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "joules";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Joules zero() {
		return new Joules(0);
	}
	
	public static Joules one() {
		return new Joules(1);
	}
	
	public Joules plus(Joules other) {
		return new Joules(value() + other.value());
	}
	
	public Joules minus(Joules other) {
		return new Joules(value() - other.value());
	}
	
	public Joules opposite() {
		return new Joules(-value());
	}

	public Joules multiplyByScalar(double scalar) {
		return new Joules(scalar * value());
	}
	
	public Joules divideByScalar(double scalar) {
		return new Joules(value() / scalar);
	}
	
	public boolean equals(Joules other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Joules castFrom(Energy other) {
		return castFromWithoutValidate(other);
	}

	public static Joules castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Joules castFromWithoutValidate(Unit other) {
		return new Joules(other.value() * other.scale() / _scale);
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

	public static Joules divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static Joules multiply(Unit... units) {
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