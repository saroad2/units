/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.speed;

import com.units.Unit;
import com.units.exceptions.IllegalUnitsCasting;
import com.units.internal.Ratio;
import com.units.duration.Duration;
import com.units.length.Length;


public interface Speed extends Unit {

	public static final Ratio _typeCode =
		Length._typeCode
		.divide(Duration._typeCode);

	default public <E extends Speed> E castTo(Class<E> toClass) {
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