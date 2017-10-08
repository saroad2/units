/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.angular_speed;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.angle.Radians;
import com.units.duration.Seconds;


public class RadiansPerSecond extends NumericValue implements AngularSpeed{

	public static final double _scale = Radians._scale / Seconds._scale;
	
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
	
	private static RadiansPerSecond castFromScale(double value, double scale) {
		return new RadiansPerSecond(value * scale / _scale);
	}

	public static RadiansPerSecond castFrom(AngularSpeed other) {
		return castFromScale(other.value(), other.scale());
	}

	public static RadiansPerSecond divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}
}