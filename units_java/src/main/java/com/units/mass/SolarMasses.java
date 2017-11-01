/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.mass;

import com.units.internal.*;

public class SolarMasses extends NumericValue implements Mass{

	public static final double _scale =
		1.98855E30 * Kilograms._scale;
	
	public SolarMasses(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "solar masses";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static SolarMasses zero() {
		return new SolarMasses(0);
	}
	
	public static SolarMasses one() {
		return new SolarMasses(1);
	}
	
	public SolarMasses plus(SolarMasses other) {
		return new SolarMasses(value() + other.value());
	}
	
	public SolarMasses minus(SolarMasses other) {
		return new SolarMasses(value() - other.value());
	}
	
	public SolarMasses opposite() {
		return new SolarMasses(-value());
	}

	public SolarMasses multiplyByScalar(double scalar) {
		return new SolarMasses(scalar * value());
	}
	
	public SolarMasses divideByScalar(double scalar) {
		return new SolarMasses(value() / scalar);
	}
	
	public boolean equals(SolarMasses other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(SolarMasses other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(SolarMasses other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(SolarMasses other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(SolarMasses other) {
		return !lessThan(other);
	}
}