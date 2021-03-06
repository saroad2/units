/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.speed;

import com.units.duration.Seconds;
import com.units.length.Feet;


public class FeetPerSecond extends Speed {

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
	
	public double scalarRatio(FeetPerSecond other) {
		return value() / other.value();
	}
	
	public boolean equals(FeetPerSecond other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(FeetPerSecond other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(FeetPerSecond other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(FeetPerSecond other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(FeetPerSecond other) {
		return !lessThan(other);
	}
}