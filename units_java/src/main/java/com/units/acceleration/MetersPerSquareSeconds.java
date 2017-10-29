/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.acceleration;

import com.units.internal.*;
import com.units.duration.Seconds;
import com.units.length.Meters;


public class MetersPerSquareSeconds extends NumericValue implements Acceleration{

	public static final double _scale =
		Meters._scale
		 / (Seconds._scale * Seconds._scale);
	
	public MetersPerSquareSeconds(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "meters per square seconds";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static MetersPerSquareSeconds zero() {
		return new MetersPerSquareSeconds(0);
	}
	
	public static MetersPerSquareSeconds one() {
		return new MetersPerSquareSeconds(1);
	}
	
	public MetersPerSquareSeconds plus(MetersPerSquareSeconds other) {
		return new MetersPerSquareSeconds(value() + other.value());
	}
	
	public MetersPerSquareSeconds minus(MetersPerSquareSeconds other) {
		return new MetersPerSquareSeconds(value() - other.value());
	}
	
	public MetersPerSquareSeconds opposite() {
		return new MetersPerSquareSeconds(-value());
	}

	public MetersPerSquareSeconds multiplyByScalar(double scalar) {
		return new MetersPerSquareSeconds(scalar * value());
	}
	
	public MetersPerSquareSeconds divideByScalar(double scalar) {
		return new MetersPerSquareSeconds(value() / scalar);
	}
	
	public boolean equals(MetersPerSquareSeconds other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}