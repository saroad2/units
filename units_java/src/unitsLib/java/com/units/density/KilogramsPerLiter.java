/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.density;

import com.units.internal.*;
import com.units.mass.Kilograms;
import com.units.volume.Liters;


public class KilogramsPerLiter extends NumericValue implements Density{

	public static final double _scale =
		Kilograms._scale / Liters._scale;
	
	public KilogramsPerLiter(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilograms per liter";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static KilogramsPerLiter zero() {
		return new KilogramsPerLiter(0);
	}
	
	public static KilogramsPerLiter one() {
		return new KilogramsPerLiter(1);
	}
	
	public KilogramsPerLiter plus(KilogramsPerLiter other) {
		return new KilogramsPerLiter(value() + other.value());
	}
	
	public KilogramsPerLiter minus(KilogramsPerLiter other) {
		return new KilogramsPerLiter(value() - other.value());
	}
	
	public KilogramsPerLiter opposite() {
		return new KilogramsPerLiter(-value());
	}

	public KilogramsPerLiter multiplyByScalar(double scalar) {
		return new KilogramsPerLiter(scalar * value());
	}
	
	public KilogramsPerLiter divideByScalar(double scalar) {
		return new KilogramsPerLiter(value() / scalar);
	}
	
	public double scalarRatio(KilogramsPerLiter other) {
		return value() / other.value();
	}
	
	public boolean equals(KilogramsPerLiter other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(KilogramsPerLiter other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(KilogramsPerLiter other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(KilogramsPerLiter other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(KilogramsPerLiter other) {
		return !lessThan(other);
	}
}