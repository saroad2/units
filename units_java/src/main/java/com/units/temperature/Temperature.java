/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.temperature;

import com.units.Unit;
import com.units.exceptions.IllegalUnitsCasting;
import com.units.internal.Ratio;

public interface Temperature extends Unit {

	public static final Ratio _typeCode =
		new Ratio(11);

	default public <E extends Temperature> E castTo(Class<E> toClass) {
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
	default public Ratio typeCode() {
		return _typeCode;
	};
}