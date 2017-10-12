/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.speed;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.duration.Seconds;
import com.units.length.Feet;


public class FeetPerSecond extends NumericValue implements Speed{

	public static final double _scale =
		Feet._scale / Seconds._scale;
	
	public FeetPerSecond(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "feet/second";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static FeetPerSecond zero() {
		return new FeetPerSecond(0);
	}
	
	public static FeetPerSecond one() {
		return new FeetPerSecond(1);
	}
	
	public FeetPerSecond plus(FeetPerSecond other) {
		return new FeetPerSecond(value() + other.value());
	}
	
	public FeetPerSecond minus(FeetPerSecond other) {
		return new FeetPerSecond(value() - other.value());
	}
	
	public FeetPerSecond opposite() {
		return new FeetPerSecond(-value());
	}

	public FeetPerSecond multiplyByScalar(double scalar) {
		return new FeetPerSecond(scalar * value());
	}
	
	public FeetPerSecond divideByScalar(double scalar) {
		return new FeetPerSecond(value() / scalar);
	}
	
	public boolean equals(FeetPerSecond other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static FeetPerSecond castFromScale(double value, double scale) {
		return new FeetPerSecond(value * scale / _scale);
	}

	public static FeetPerSecond castFrom(Speed other) {
		return castFromScale(other.value(), other.scale());
	}

	public static FeetPerSecond divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static FeetPerSecond multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}