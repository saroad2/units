package com.units;

import com.units.internal.Ratio;

public interface Unit {
	
	public double value();
	public double scale();
	public Ratio typeCode();
}
