/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.angular_speed;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsCasting;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.angle.Degrees;
import com.units.duration.Seconds;


public class DegreesPerSecond extends NumericValue implements AngularSpeed{

	public static final double _scale =
		Degrees._scale / Seconds._scale;
	
	public DegreesPerSecond(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "degrees/second";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static DegreesPerSecond zero() {
		return new DegreesPerSecond(0);
	}
	
	public static DegreesPerSecond one() {
		return new DegreesPerSecond(1);
	}
	
	public DegreesPerSecond plus(DegreesPerSecond other) {
		return new DegreesPerSecond(value() + other.value());
	}
	
	public DegreesPerSecond minus(DegreesPerSecond other) {
		return new DegreesPerSecond(value() - other.value());
	}
	
	public DegreesPerSecond opposite() {
		return new DegreesPerSecond(-value());
	}

	public DegreesPerSecond multiplyByScalar(double scalar) {
		return new DegreesPerSecond(scalar * value());
	}
	
	public DegreesPerSecond divideByScalar(double scalar) {
		return new DegreesPerSecond(value() / scalar);
	}
	
	public boolean equals(DegreesPerSecond other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static DegreesPerSecond castFrom(AngularSpeed other) {
		return castFromWithoutValidate(other);
	}

	public static DegreesPerSecond castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static DegreesPerSecond castFromWithoutValidate(Unit other) {
		return castFromScale(other.value(), other.scale());
	}

	private static DegreesPerSecond castFromScale(double value, double scale) {
		return new DegreesPerSecond(value * scale / _scale);
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

	public static DegreesPerSecond divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static DegreesPerSecond multiply(Unit... units) {
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