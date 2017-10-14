/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.speed;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsCasting;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.duration.Seconds;
import com.units.length.Meters;


public class MetersPerSecond extends NumericValue implements Speed{

	public static final double _scale =
		Meters._scale / Seconds._scale;
	
	public MetersPerSecond(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "meters/second";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static MetersPerSecond zero() {
		return new MetersPerSecond(0);
	}
	
	public static MetersPerSecond one() {
		return new MetersPerSecond(1);
	}
	
	public MetersPerSecond plus(MetersPerSecond other) {
		return new MetersPerSecond(value() + other.value());
	}
	
	public MetersPerSecond minus(MetersPerSecond other) {
		return new MetersPerSecond(value() - other.value());
	}
	
	public MetersPerSecond opposite() {
		return new MetersPerSecond(-value());
	}

	public MetersPerSecond multiplyByScalar(double scalar) {
		return new MetersPerSecond(scalar * value());
	}
	
	public MetersPerSecond divideByScalar(double scalar) {
		return new MetersPerSecond(value() / scalar);
	}
	
	public boolean equals(MetersPerSecond other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static MetersPerSecond castFrom(Speed other) {
		return castFromWithoutValidate(other);
	}

	public static MetersPerSecond castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static MetersPerSecond castFromWithoutValidate(Unit other) {
		return castFromScale(other.value(), other.scale());
	}

	private static MetersPerSecond castFromScale(double value, double scale) {
		return new MetersPerSecond(value * scale / _scale);
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

	public static MetersPerSecond divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static MetersPerSecond multiply(Unit... units) {
		List<Unit> unitsAsList = Arrays.asList(units);
		validateTypeCode(
				unitsAsList.stream()
				.map((unit) -> unit.typeCode())
				.reduce(Ratio.one(), (a, b) -> a.multiply(b)),
				IllegalUnitsMultiplication.class);
		double newValue = unitsAsList.stream()
				.mapToDouble((unit) -> unit.value())
				.reduce(1, (a, b) -> a * b);
		double newScale = unitsAsList.stream()
				.mapToDouble((unit) -> unit.scale())
				.reduce(1, (a, b) -> a * b);
		return castFromScale(newValue, newScale);
	}
}