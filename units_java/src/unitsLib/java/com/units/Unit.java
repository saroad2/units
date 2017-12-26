package com.units;

import com.units.internal.AnonymousUnit;
import com.units.internal.Ratio;

public interface Unit {
	
	public double value();
	public abstract double scale();
	public abstract Ratio typeCode();
	
	public AnonymousUnit divide(Unit other);
	public AnonymousUnit multiply(Unit other);
	public AnonymousUnit pow(int power);
	public AnonymousUnit sqr();
	public AnonymousUnit cube();
}
