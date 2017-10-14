/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.length;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsCasting;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NoneScale;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class StatuteMiles extends NumericValue implements Length{

	public static final double _scale =
		621.371192237 * Meters._scale;
	
	public StatuteMiles(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "statute miles";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static StatuteMiles zero() {
		return new StatuteMiles(0);
	}
	
	public static StatuteMiles one() {
		return new StatuteMiles(1);
	}
	
	public StatuteMiles plus(StatuteMiles other) {
		return new StatuteMiles(value() + other.value());
	}
	
	public StatuteMiles minus(StatuteMiles other) {
		return new StatuteMiles(value() - other.value());
	}
	
	public StatuteMiles opposite() {
		return new StatuteMiles(-value());
	}

	public StatuteMiles multiplyByScalar(double scalar) {
		return new StatuteMiles(scalar * value());
	}
	
	public StatuteMiles divideByScalar(double scalar) {
		return new StatuteMiles(value() / scalar);
	}
	
	public boolean equals(StatuteMiles other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static StatuteMiles castFrom(Length other) {
		return castFromWithoutValidate(other);
	}

	public static StatuteMiles castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static StatuteMiles castFromWithoutValidate(Unit other) {
		return new StatuteMiles(other.value() * other.scale() / _scale);
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

	public static StatuteMiles divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static StatuteMiles multiply(Unit... units) {
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