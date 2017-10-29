/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.length;

import com.units.internal.*;

public class GeographicalMiles extends NumericValue implements Length{

	public static final double _scale =
		1855.3248 * Meters._scale;
	
	public GeographicalMiles(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "geographical miles";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static GeographicalMiles zero() {
		return new GeographicalMiles(0);
	}
	
	public static GeographicalMiles one() {
		return new GeographicalMiles(1);
	}
	
	public GeographicalMiles plus(GeographicalMiles other) {
		return new GeographicalMiles(value() + other.value());
	}
	
	public GeographicalMiles minus(GeographicalMiles other) {
		return new GeographicalMiles(value() - other.value());
	}
	
	public GeographicalMiles opposite() {
		return new GeographicalMiles(-value());
	}

	public GeographicalMiles multiplyByScalar(double scalar) {
		return new GeographicalMiles(scalar * value());
	}
	
	public GeographicalMiles divideByScalar(double scalar) {
		return new GeographicalMiles(value() / scalar);
	}
	
	public boolean equals(GeographicalMiles other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}