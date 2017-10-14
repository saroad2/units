/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.angular_speed;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.exceptions.*;
import com.units.internal.*;
import com.units.angle.Radians;
import com.units.duration.Seconds;


public class RadiansPerSecond extends NumericValue implements AngularSpeed{

	public static final double _scale =
		Radians._scale / Seconds._scale;
	
	public RadiansPerSecond(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "radians/second";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static RadiansPerSecond zero() {
		return new RadiansPerSecond(0);
	}
	
	public static RadiansPerSecond one() {
		return new RadiansPerSecond(1);
	}
	
	public RadiansPerSecond plus(RadiansPerSecond other) {
		return new RadiansPerSecond(value() + other.value());
	}
	
	public RadiansPerSecond minus(RadiansPerSecond other) {
		return new RadiansPerSecond(value() - other.value());
	}
	
	public RadiansPerSecond opposite() {
		return new RadiansPerSecond(-value());
	}

	public RadiansPerSecond multiplyByScalar(double scalar) {
		return new RadiansPerSecond(scalar * value());
	}
	
	public RadiansPerSecond divideByScalar(double scalar) {
		return new RadiansPerSecond(value() / scalar);
	}
	
	public boolean equals(RadiansPerSecond other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static RadiansPerSecond castFrom(AngularSpeed other) {
		return castFromWithoutValidate(other);
	}

	public static RadiansPerSecond castFrom(AnonymousUnit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static RadiansPerSecond castFromWithoutValidate(Unit other) {
		return new RadiansPerSecond(other.value() * other.scale() / _scale);
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

	public static RadiansPerSecond divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromWithoutValidate(unit1.divide(unit2));
	}

	public static RadiansPerSecond multiply(Unit... units) {
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