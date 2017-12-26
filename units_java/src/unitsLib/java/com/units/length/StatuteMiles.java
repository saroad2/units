/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.length;


public class StatuteMiles extends Length {

	public static final double _scale =
		621.371192237 * Meters._scale;
	
	public StatuteMiles(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "statute miles";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static StatuteMiles zero() {
		return new StatuteMiles(0);
	}
	
	public static StatuteMiles one() {
		return new StatuteMiles(1);
	}
	
	public StatuteMiles plus(StatuteMiles other) {
		return new StatuteMiles(value() + other.value());
	}
	
	public StatuteMiles minus(StatuteMiles other) {
		return new StatuteMiles(value() - other.value());
	}
	
	public StatuteMiles opposite() {
		return new StatuteMiles(-value());
	}

	public StatuteMiles multiplyByScalar(double scalar) {
		return new StatuteMiles(scalar * value());
	}
	
	public StatuteMiles divideByScalar(double scalar) {
		return new StatuteMiles(value() / scalar);
	}
	
	public double scalarRatio(StatuteMiles other) {
		return value() / other.value();
	}
	
	public boolean equals(StatuteMiles other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(StatuteMiles other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(StatuteMiles other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(StatuteMiles other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(StatuteMiles other) {
		return !lessThan(other);
	}
}