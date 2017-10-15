/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.angular_speed;

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
}