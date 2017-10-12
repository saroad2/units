/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.volume;

import com.units.Unit;
import com.units.internal.Ratio;
import com.units.length.Length;


public interface Volume extends Unit {

	public static final Ratio _typeCode =
		Length._typeCode
		.multiply(Length._typeCode)
		.multiply(Length._typeCode);

	@Override
	default public Ratio typeCode() {
		return _typeCode;
	};
}