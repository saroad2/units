/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.speed;

import com.units.internal.*;
import com.units.duration.Seconds;
import com.units.length.Meters;


public class MetersPerSecond extends NumericValue implements Speed{

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
	
	public boolean equals(MetersPerSecond other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}