/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.frequency;

import com.units.Unit;
import com.units.internal.Ratio;
import com.units.duration.Duration;


public interface Frequency extends Unit {

	public static final Ratio _typeCode =
		Ratio.one()
		.divide(Duration._typeCode);

	@Override
	default public Ratio typeCode() {
		return _typeCode;
	};
}