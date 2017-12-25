/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.density;

import com.units.Unit;
import com.units.exceptions.IllegalUnitsCasting;
import com.units.internal.Ratio;
import com.units.mass.Mass;
import com.units.volume.Volume;


public interface Density extends Unit {

	public static final Ratio _typeCode =
		Mass._typeCode
		.divide(Volume._typeCode);

	default public <E extends Density> E castTo(Class<E> toClass) {
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