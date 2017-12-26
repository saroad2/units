/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.length;

import com.units.internal.*;

public class DegreesOfLatitude extends NumericValue implements Length{

	public static final double _scale =
		60.0 * GeographicalMiles._scale;
	
	public DegreesOfLatitude(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "degrees of latitude";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static DegreesOfLatitude zero() {
		return new DegreesOfLatitude(0);
	}
	
	public static DegreesOfLatitude one() {
		return new DegreesOfLatitude(1);
	}
	
	public DegreesOfLatitude plus(DegreesOfLatitude other) {
		return new DegreesOfLatitude(value() + other.value());
	}
	
	public DegreesOfLatitude minus(DegreesOfLatitude other) {
		return new DegreesOfLatitude(value() - other.value());
	}
	
	public DegreesOfLatitude opposite() {
		return new DegreesOfLatitude(-value());
	}

	public DegreesOfLatitude multiplyByScalar(double scalar) {
		return new DegreesOfLatitude(scalar * value());
	}
	
	public DegreesOfLatitude divideByScalar(double scalar) {
		return new DegreesOfLatitude(value() / scalar);
	}
	
	public double scalarRatio(DegreesOfLatitude other) {
		return value() / other.value();
	}
	
	public boolean equals(DegreesOfLatitude other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(DegreesOfLatitude other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(DegreesOfLatitude other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(DegreesOfLatitude other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(DegreesOfLatitude other) {
		return !lessThan(other);
	}
}