/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.angle;


public class Radians extends Angle {

	public static final double _scale =
		57.2957795131 * Degrees._scale;
	
	public Radians(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "radians";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Radians zero() {
		return new Radians(0);
	}
	
	public static Radians one() {
		return new Radians(1);
	}
	
	public Radians plus(Radians other) {
		return new Radians(value() + other.value());
	}
	
	public Radians minus(Radians other) {
		return new Radians(value() - other.value());
	}
	
	public Radians opposite() {
		return new Radians(-value());
	}

	public Radians multiplyByScalar(double scalar) {
		return new Radians(scalar * value());
	}
	
	public Radians divideByScalar(double scalar) {
		return new Radians(value() / scalar);
	}
	
	public double scalarRatio(Radians other) {
		return value() / other.value();
	}
	
	public boolean equals(Radians other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Radians other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Radians other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Radians other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Radians other) {
		return !lessThan(other);
	}
}