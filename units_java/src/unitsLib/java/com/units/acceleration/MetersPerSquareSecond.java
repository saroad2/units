/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.acceleration;

import com.units.duration.Seconds;
import com.units.length.Meters;


public class MetersPerSquareSecond extends Acceleration {

	public static final double _scale =
		Meters._scale
		 / (Seconds._scale * Seconds._scale);
	
	public MetersPerSquareSecond(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "meters/second^2";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static MetersPerSquareSecond zero() {
		return new MetersPerSquareSecond(0);
	}
	
	public static MetersPerSquareSecond one() {
		return new MetersPerSquareSecond(1);
	}
	
	public MetersPerSquareSecond plus(MetersPerSquareSecond other) {
		return new MetersPerSquareSecond(value() + other.value());
	}
	
	public MetersPerSquareSecond minus(MetersPerSquareSecond other) {
		return new MetersPerSquareSecond(value() - other.value());
	}
	
	public MetersPerSquareSecond opposite() {
		return new MetersPerSquareSecond(-value());
	}

	public MetersPerSquareSecond multiplyByScalar(double scalar) {
		return new MetersPerSquareSecond(scalar * value());
	}
	
	public MetersPerSquareSecond divideByScalar(double scalar) {
		return new MetersPerSquareSecond(value() / scalar);
	}
	
	public double scalarRatio(MetersPerSquareSecond other) {
		return value() / other.value();
	}
	
	public boolean equals(MetersPerSquareSecond other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(MetersPerSquareSecond other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(MetersPerSquareSecond other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(MetersPerSquareSecond other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(MetersPerSquareSecond other) {
		return !lessThan(other);
	}
}