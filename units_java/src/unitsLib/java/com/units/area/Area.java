/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.area;

import com.units.exceptions.IllegalUnitsCasting;
import com.units.internal.AbstractUnit;
import com.units.internal.Ratio;
import com.units.length.Length;


public abstract class Area extends AbstractUnit {

	public static final Ratio _typeCode =
		Length._typeCode
		.multiply(Length._typeCode);
	
	public Area(double value) {
		super(value);
	}

	public <E extends Area> E castTo(Class<E> toClass) {
		try {
			double toScale = (double)toClass.getField("_scale").get(null);
			double newValue = value() * scale() / toScale;
			return toClass.getDeclaredConstructor(double.class).newInstance(newValue);
		}
		catch (ReflectiveOperationException e) {
			throw new IllegalUnitsCasting();
		}
	}

	@Override
	public Ratio typeCode() {
		return _typeCode;
	};
}