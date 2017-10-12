/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.area;

import com.units.Unit;
import com.units.internal.Ratio;
import com.units.length.Length;


public interface Area extends Unit {

	public static final Ratio _typeCode =
		Length._typeCode
		.multiply(Length._typeCode);

	@Override
	default public Ratio typeCode() {
		return _typeCode;
	};
}