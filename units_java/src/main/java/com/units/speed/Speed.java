package com.units.speed;

import com.units.Unit;
import com.units.duration.Duration;
import com.units.internal.Ratio;
import com.units.length.Length;

public interface Speed extends Unit{

	public static final Ratio _typeCode = Length._typeCode.divide(Duration._typeCode);
	
	@Override
	default public Ratio typeCode() {
		return _typeCode;
	}
}
