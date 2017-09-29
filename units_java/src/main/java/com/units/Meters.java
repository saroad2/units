package com.units;

public class Meters {

	private final double _value;
	private static double error = 1e-10;
	
	public Meters(double value) {
		this._value = value;
	}
	
	public double value() {
		return _value;
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
		return Math.abs(value() - other.value()) < error;
	}
	
	@Override
	public String toString() {
		return value() + " meters";
	}
}
