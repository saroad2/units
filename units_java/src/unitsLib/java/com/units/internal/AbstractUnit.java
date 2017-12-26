package com.units.internal;

import com.units.Unit;

public abstract class AbstractUnit implements Unit {

	private final double _value;
	private static final double error = 1e-9;

	public AbstractUnit(double value) {
		this._value = value;
	}

	@Override
	public double value() {
		return _value;
	}
	
	@Override
	public AnonymousUnit divide(Unit other) {
		Ratio newCode = typeCode().divide(other.typeCode());
		double newScale = scale() / other.scale();
		double newValue = value() / other.value();
		return new AnonymousUnit(newCode, newScale, newValue);
	}
	
	@Override
	public AnonymousUnit multiply(Unit other) {
		Ratio newCode = typeCode().multiply(other.typeCode());
		double newScale = scale() * other.scale();
		double newValue = value() * other.value();
		return new AnonymousUnit(newCode, newScale, newValue);
	}
	
	@Override
	public AnonymousUnit pow(int power) {
		Ratio newCode = typeCode().pow(power);
		double newScale = Math.pow(scale(), power);
		double newValue = Math.pow(value(), power);
		return new AnonymousUnit(newCode, newScale, newValue);
	}
	
	@Override
	public AnonymousUnit sqr() {
		return pow(2);
	}
	
	@Override
	public AnonymousUnit cube() {
		return pow(3);
	}
	
	@Override
	public AnonymousUnit sqrt() {
		try {
			Ratio newCode = typeCode().sqrt();
			double newScale = Math.sqrt(scale());
			double newValue = Math.sqrt(value());
			return new AnonymousUnit(newCode, newScale, newValue);
		}
		catch(IllegalArgumentException e) {
			throw new IllegalArgumentException("This unit has no square root");
		}
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
