/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.volume;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.*;
import com.units.length.Yards;


public class CubicYards extends NumericValue implements Volume{

	public static final double _scale =
		Yards._scale * Yards._scale * Yards._scale;
	
	public CubicYards(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "yards^3";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static CubicYards zero() {
		return new CubicYards(0);
	}
	
	public static CubicYards one() {
		return new CubicYards(1);
	}
	
	public CubicYards plus(CubicYards other) {
		return new CubicYards(value() + other.value());
	}
	
	public CubicYards minus(CubicYards other) {
		return new CubicYards(value() - other.value());
	}
	
	public CubicYards opposite() {
		return new CubicYards(-value());
	}

	public CubicYards multiplyByScalar(double scalar) {
		return new CubicYards(scalar * value());
	}
	
	public CubicYards divideByScalar(double scalar) {
		return new CubicYards(value() / scalar);
	}
	
	public boolean equals(CubicYards other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static CubicYards castFrom(Volume other) {
		return castFromWithoutValidate(other);
	}

	public static CubicYards castFrom(AnonymousUnit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static CubicYards castFromWithoutValidate(Unit other) {
		return new CubicYards(other.value() * other.scale() / _scale);
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

	public static CubicYards divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static CubicYards multiply(Unit... units) {
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