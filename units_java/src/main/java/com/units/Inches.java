package com.units;

import com.units.internal.NumericValue;

public class Inches extends NumericValue{

	public Inches(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "inches";
	}
	
	public static Inches zero() {
		return new Inches(0);
	}
	
	public static Inches one() {
		return new Inches(1);
	}
	
	public Inches plus(Inches other) {
		return new Inches(value() + other.value());
	}
	
	public Inches minus(Inches other) {
		return new Inches(value() - other.value());
	}
	
	public Inches opposite() {
		return new Inches(-value());
	}

	public Inches multiplyByScalar(double scalar) {
		return new Inches(scalar * value());
	}
	
	public Inches divideByScalar(double scalar) {
		return new Inches(value() / scalar);
	}
	
	public boolean equals(Inches other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}
