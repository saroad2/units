/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.volume;

import com.units.internal.*;
import com.units.length.Yards;


public class CubicYards extends NumericValue implements Volume{

	public static final double _scale =
		Yards._scale * Yards._scale * Yards._scale;
	
	public CubicYards(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "yards^3";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static CubicYards zero() {
		return new CubicYards(0);
	}
	
	public static CubicYards one() {
		return new CubicYards(1);
	}
	
	public CubicYards plus(CubicYards other) {
		return new CubicYards(value() + other.value());
	}
	
	public CubicYards minus(CubicYards other) {
		return new CubicYards(value() - other.value());
	}
	
	public CubicYards opposite() {
		return new CubicYards(-value());
	}

	public CubicYards multiplyByScalar(double scalar) {
		return new CubicYards(scalar * value());
	}
	
	public CubicYards divideByScalar(double scalar) {
		return new CubicYards(value() / scalar);
	}
	
	public double scalarRatio(CubicYards other) {
		return value() / other.value();
	}
	
	public boolean equals(CubicYards other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(CubicYards other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(CubicYards other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(CubicYards other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(CubicYards other) {
		return !lessThan(other);
	}
}