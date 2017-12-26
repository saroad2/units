/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.area;

import com.units.internal.*;
import com.units.internal.Multipliers;


public class Dunams extends NumericValue implements Area{

	public static final double _scale =
		Multipliers.kilo * SquareMeters._scale;
	
	public Dunams(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "dunams";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Dunams zero() {
		return new Dunams(0);
	}
	
	public static Dunams one() {
		return new Dunams(1);
	}
	
	public Dunams plus(Dunams other) {
		return new Dunams(value() + other.value());
	}
	
	public Dunams minus(Dunams other) {
		return new Dunams(value() - other.value());
	}
	
	public Dunams opposite() {
		return new Dunams(-value());
	}

	public Dunams multiplyByScalar(double scalar) {
		return new Dunams(scalar * value());
	}
	
	public Dunams divideByScalar(double scalar) {
		return new Dunams(value() / scalar);
	}
	
	public double scalarRatio(Dunams other) {
		return value() / other.value();
	}
	
	public boolean equals(Dunams other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Dunams other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Dunams other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Dunams other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Dunams other) {
		return !lessThan(other);
	}
}