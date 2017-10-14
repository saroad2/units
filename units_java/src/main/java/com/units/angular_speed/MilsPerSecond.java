/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.angular_speed;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.angle.Mils;
import com.units.duration.Seconds;


public class MilsPerSecond extends NumericValue implements AngularSpeed{

	public static final double _scale =
		Mils._scale / Seconds._scale;
	
	public MilsPerSecond(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "mils/second";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static MilsPerSecond zero() {
		return new MilsPerSecond(0);
	}
	
	public static MilsPerSecond one() {
		return new MilsPerSecond(1);
	}
	
	public MilsPerSecond plus(MilsPerSecond other) {
		return new MilsPerSecond(value() + other.value());
	}
	
	public MilsPerSecond minus(MilsPerSecond other) {
		return new MilsPerSecond(value() - other.value());
	}
	
	public MilsPerSecond opposite() {
		return new MilsPerSecond(-value());
	}

	public MilsPerSecond multiplyByScalar(double scalar) {
		return new MilsPerSecond(scalar * value());
	}
	
	public MilsPerSecond divideByScalar(double scalar) {
		return new MilsPerSecond(value() / scalar);
	}
	
	public boolean equals(MilsPerSecond other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static MilsPerSecond castFromScale(double value, double scale) {
		return new MilsPerSecond(value * scale / _scale);
	}

	public static MilsPerSecond castFrom(AngularSpeed other) {
		return castFromScale(other.value(), other.scale());
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

	public static MilsPerSecond divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static MilsPerSecond multiply(Unit... units) {
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