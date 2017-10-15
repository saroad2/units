/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.area;

import com.units.internal.*;
import com.units.length.Yards;


public class SquareYards extends NumericValue implements Area{

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
	
	public boolean equals(SquareYards other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}