package com.units;

import com.units.internal.AnonymousUnit;
import com.units.internal.Ratio;

public interface Unit {
	
	public double value();
	public double scale();
	public Ratio typeCode();
	
	default public Unit divide(Unit other) {
		Ratio newCode = typeCode().divide(other.typeCode());
		double newScale = scale() / other.scale();
		double newValue = value() / other.value();
		return new AnonymousUnit(newCode, newScale, newValue);
	}
	
	default public Unit multiply(Unit other) {
		Ratio newCode = typeCode().multiply(other.typeCode());
		double newScale = scale() * other.scale();
		double newValue = value() * other.value();
		return new AnonymousUnit(newCode, newScale, newValue);
	}
}
