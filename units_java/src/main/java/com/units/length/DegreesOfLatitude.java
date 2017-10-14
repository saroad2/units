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
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class DegreesOfLatitude extends NumericValue implements Length{

	public static final double _scale =
		60.0 * GeographicalMiles._scale;
	
	public DegreesOfLatitude(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "degrees of latitude";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static DegreesOfLatitude zero() {
		return new DegreesOfLatitude(0);
	}
	
	public static DegreesOfLatitude one() {
		return new DegreesOfLatitude(1);
	}
	
	public DegreesOfLatitude plus(DegreesOfLatitude other) {
		return new DegreesOfLatitude(value() + other.value());
	}
	
	public DegreesOfLatitude minus(DegreesOfLatitude other) {
		return new DegreesOfLatitude(value() - other.value());
	}
	
	public DegreesOfLatitude opposite() {
		return new DegreesOfLatitude(-value());
	}

	public DegreesOfLatitude multiplyByScalar(double scalar) {
		return new DegreesOfLatitude(scalar * value());
	}
	
	public DegreesOfLatitude divideByScalar(double scalar) {
		return new DegreesOfLatitude(value() / scalar);
	}
	
	public boolean equals(DegreesOfLatitude other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static DegreesOfLatitude castFrom(Length other) {
		return castFromWithoutValidate(other);
	}

	public static DegreesOfLatitude castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static DegreesOfLatitude castFromWithoutValidate(Unit other) {
		return castFromScale(other.value(), other.scale());
	}

	private static DegreesOfLatitude castFromScale(double value, double scale) {
		return new DegreesOfLatitude(value * scale / _scale);
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

	public static DegreesOfLatitude divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static DegreesOfLatitude multiply(Unit... units) {
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