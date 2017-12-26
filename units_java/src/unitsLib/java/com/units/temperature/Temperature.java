/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.temperature;

import com.units.exceptions.IllegalUnitsCasting;
import com.units.internal.AbstractUnit;
import com.units.internal.Ratio;

public abstract class Temperature extends AbstractUnit {

	public static final Ratio _typeCode =
		new Ratio(11);
	
	public Temperature(double value) {
		super(value);
	}

	public <E extends Temperature> E castTo(Class<E> toClass) {
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