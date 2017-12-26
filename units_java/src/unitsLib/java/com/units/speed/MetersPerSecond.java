/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.speed;

import com.units.duration.Seconds;
import com.units.length.Meters;


public class MetersPerSecond extends Speed {

	public static final double _scale =
		Meters._scale / Seconds._scale;
	
	public MetersPerSecond(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "meters/second";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static MetersPerSecond zero() {
		return new MetersPerSecond(0);
	}
	
	public static MetersPerSecond one() {
		return new MetersPerSecond(1);
	}
	
	public MetersPerSecond plus(MetersPerSecond other) {
		return new MetersPerSecond(value() + other.value());
	}
	
	public MetersPerSecond minus(MetersPerSecond other) {
		return new MetersPerSecond(value() - other.value());
	}
	
	public MetersPerSecond opposite() {
		return new MetersPerSecond(-value());
	}

	public MetersPerSecond multiplyByScalar(double scalar) {
		return new MetersPerSecond(scalar * value());
	}
	
	public MetersPerSecond divideByScalar(double scalar) {
		return new MetersPerSecond(value() / scalar);
	}
	
	public double scalarRatio(MetersPerSecond other) {
		return value() / other.value();
	}
	
	public boolean equals(MetersPerSecond other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(MetersPerSecond other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(MetersPerSecond other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(MetersPerSecond other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(MetersPerSecond other) {
		return !lessThan(other);
	}
}