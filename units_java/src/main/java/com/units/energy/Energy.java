/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.energy;

import com.units.Unit;
import com.units.internal.Ratio;
import com.units.duration.Duration;
import com.units.length.Length;
import com.units.mass.Mass;


public interface Energy extends Unit {

	public static final Ratio _typeCode =
		Mass._typeCode
		.multiply(Length._typeCode)
		.multiply(Length._typeCode)
		.divide(Duration._typeCode)
		.divide(Duration._typeCode);

	@Override
	default public Ratio typeCode() {
		return _typeCode;
	};
}