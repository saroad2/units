/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.angular_speed;

import com.units.angle.Radians;
import com.units.duration.Seconds;


public class RadiansPerSecond extends AngularSpeed {

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
	
	public double scalarRatio(RadiansPerSecond other) {
		return value() / other.value();
	}
	
	public boolean equals(RadiansPerSecond other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(RadiansPerSecond other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(RadiansPerSecond other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(RadiansPerSecond other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(RadiansPerSecond other) {
		return !lessThan(other);
	}
}