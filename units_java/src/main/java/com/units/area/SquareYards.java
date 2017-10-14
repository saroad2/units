/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.area;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.*;
import com.units.length.Yards;


public class SquareYards extends NumericValue implements Area{

	public static final double _scale =
		Yards._scale * Yards._scale;
	
	public SquareYards(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "yards^2";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static SquareYards zero() {
		return new SquareYards(0);
	}
	
	public static SquareYards one() {
		return new SquareYards(1);
	}
	
	public SquareYards plus(SquareYards other) {
		return new SquareYards(value() + other.value());
	}
	
	public SquareYards minus(SquareYards other) {
		return new SquareYards(value() - other.value());
	}
	
	public SquareYards opposite() {
		return new SquareYards(-value());
	}

	public SquareYards multiplyByScalar(double scalar) {
		return new SquareYards(scalar * value());
	}
	
	public SquareYards divideByScalar(double scalar) {
		return new SquareYards(value() / scalar);
	}
	
	public boolean equals(SquareYards other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static SquareYards castFrom(Area other) {
		return castFromWithoutValidate(other);
	}

	public static SquareYards castFrom(AnonymousUnit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static SquareYards castFromWithoutValidate(Unit other) {
		return new SquareYards(other.value() * other.scale() / _scale);
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

	public static SquareYards divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static SquareYards multiply(Unit... units) {
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