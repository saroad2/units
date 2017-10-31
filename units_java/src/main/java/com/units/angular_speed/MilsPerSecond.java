/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.angular_speed;

import com.units.internal.*;
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
	
	public boolean lessThan(MilsPerSecond other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(MilsPerSecond other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(MilsPerSecond other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(MilsPerSecond other) {
		return !lessThan(other);
	}
}