package com.units.internal;

public abstract class NumericValue {

	private final double _value;
	private static double error = 1e-10;

	public NumericValue(double value) {
		this._value = value;
	}

	public double value() {
		return _value;
	}

	public boolean almostEqualsValue(double otherValue) {
		return Math.abs(value() - otherValue) < error;
	}

	public abstract String pluralName();

	@Override
	public String toString() {
		return value() + " " + pluralName();
	}
}
