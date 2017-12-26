/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.area;

import com.units.length.Yards;


public class SquareYards extends Area {

	public static final double _scale =
		Yards._scale * Yards._scale;
	
	public SquareYards(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "yards^2";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static SquareYards zero() {
		return new SquareYards(0);
	}
	
	public static SquareYards one() {
		return new SquareYards(1);
	}
	
	public SquareYards plus(SquareYards other) {
		return new SquareYards(value() + other.value());
	}
	
	public SquareYards minus(SquareYards other) {
		return new SquareYards(value() - other.value());
	}
	
	public SquareYards opposite() {
		return new SquareYards(-value());
	}

	public SquareYards multiplyByScalar(double scalar) {
		return new SquareYards(scalar * value());
	}
	
	public SquareYards divideByScalar(double scalar) {
		return new SquareYards(value() / scalar);
	}
	
	public double scalarRatio(SquareYards other) {
		return value() / other.value();
	}
	
	public boolean equals(SquareYards other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(SquareYards other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(SquareYards other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(SquareYards other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(SquareYards other) {
		return !lessThan(other);
	}
}