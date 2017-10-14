/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.speed;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.exceptions.*;
import com.units.internal.*;
import com.units.duration.Seconds;
import com.units.length.Yards;


public class YardsPerSecond extends NumericValue implements Speed{

	public static final double _scale =
		Yards._scale / Seconds._scale;
	
	public YardsPerSecond(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "yards/second";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static YardsPerSecond zero() {
		return new YardsPerSecond(0);
	}
	
	public static YardsPerSecond one() {
		return new YardsPerSecond(1);
	}
	
	public YardsPerSecond plus(YardsPerSecond other) {
		return new YardsPerSecond(value() + other.value());
	}
	
	public YardsPerSecond minus(YardsPerSecond other) {
		return new YardsPerSecond(value() - other.value());
	}
	
	public YardsPerSecond opposite() {
		return new YardsPerSecond(-value());
	}

	public YardsPerSecond multiplyByScalar(double scalar) {
		return new YardsPerSecond(scalar * value());
	}
	
	public YardsPerSecond divideByScalar(double scalar) {
		return new YardsPerSecond(value() / scalar);
	}
	
	public boolean equals(YardsPerSecond other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static YardsPerSecond castFrom(Speed other) {
		return castFromWithoutValidate(other);
	}

	public static YardsPerSecond castFrom(AnonymousUnit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static YardsPerSecond castFromWithoutValidate(Unit other) {
		return new YardsPerSecond(other.value() * other.scale() / _scale);
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

	public static YardsPerSecond divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static YardsPerSecond multiply(Unit... units) {
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