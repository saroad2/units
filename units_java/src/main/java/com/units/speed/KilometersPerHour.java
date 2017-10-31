/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.speed;

import com.units.internal.*;
import com.units.duration.Hours;
import com.units.length.Kilometers;


public class KilometersPerHour extends NumericValue implements Speed{

	public static final double _scale =
		Kilometers._scale / Hours._scale;
	
	public KilometersPerHour(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilometers/hour";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static KilometersPerHour zero() {
		return new KilometersPerHour(0);
	}
	
	public static KilometersPerHour one() {
		return new KilometersPerHour(1);
	}
	
	public KilometersPerHour plus(KilometersPerHour other) {
		return new KilometersPerHour(value() + other.value());
	}
	
	public KilometersPerHour minus(KilometersPerHour other) {
		return new KilometersPerHour(value() - other.value());
	}
	
	public KilometersPerHour opposite() {
		return new KilometersPerHour(-value());
	}

	public KilometersPerHour multiplyByScalar(double scalar) {
		return new KilometersPerHour(scalar * value());
	}
	
	public KilometersPerHour divideByScalar(double scalar) {
		return new KilometersPerHour(value() / scalar);
	}
	
	public boolean equals(KilometersPerHour other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(KilometersPerHour other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(KilometersPerHour other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(KilometersPerHour other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(KilometersPerHour other) {
		return !lessThan(other);
	}
}