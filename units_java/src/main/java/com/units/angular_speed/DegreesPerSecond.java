/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.angular_speed;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.angle.Degrees;
import com.units.duration.Seconds;


public class DegreesPerSecond extends NumericValue implements AngularSpeed{

	public static final double _scale = Degrees._scale / Seconds._scale;
	
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
	
	private static DegreesPerSecond castFromScale(double value, double scale) {
		return new DegreesPerSecond(value * scale / _scale);
	}

	public static DegreesPerSecond castFrom(AngularSpeed other) {
		return castFromScale(other.value(), other.scale());
	}

	public static DegreesPerSecond divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}
}