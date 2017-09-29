package com.units;

import com.units.internal.NumericValue;

public class Meters extends NumericValue{

	public Meters(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "meters";
	}
	
	public static Meters zero() {
		return new Meters(0);
	}
	
	public static Meters one() {
		return new Meters(1);
	}
	
	public Meters plus(Meters other) {
		return new Meters(value() + other.value());
	}
	
	public Meters minus(Meters other) {
		return new Meters(value() - other.value());
	}
	
	public Meters opposite() {
		return new Meters(-value());
	}

	public Meters multiplyByScalar(double scalar) {
		return new Meters(scalar * value());
	}
	
	public Meters divideByScalar(double scalar) {
		return new Meters(value() / scalar);
	}
	
	public boolean equals(Meters other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
}
