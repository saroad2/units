/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.angular_speed;

import com.units.internal.*;
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
	
	public double scalarRatio(DegreesPerSecond other) {
		return value() / other.value();
	}
	
	public boolean equals(DegreesPerSecond other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(DegreesPerSecond other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(DegreesPerSecond other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(DegreesPerSecond other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(DegreesPerSecond other) {
		return !lessThan(other);
	}
}