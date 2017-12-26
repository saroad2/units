/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.electric_current;


public class Amperes extends ElectricCurrent {

	public static final double _scale =
		1;
	
	public Amperes(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "amperes";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Amperes zero() {
		return new Amperes(0);
	}
	
	public static Amperes one() {
		return new Amperes(1);
	}
	
	public Amperes plus(Amperes other) {
		return new Amperes(value() + other.value());
	}
	
	public Amperes minus(Amperes other) {
		return new Amperes(value() - other.value());
	}
	
	public Amperes opposite() {
		return new Amperes(-value());
	}

	public Amperes multiplyByScalar(double scalar) {
		return new Amperes(scalar * value());
	}
	
	public Amperes divideByScalar(double scalar) {
		return new Amperes(value() / scalar);
	}
	
	public double scalarRatio(Amperes other) {
		return value() / other.value();
	}
	
	public boolean equals(Amperes other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Amperes other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Amperes other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Amperes other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Amperes other) {
		return !lessThan(other);
	}
}