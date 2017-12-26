/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.density;

import com.units.exceptions.IllegalUnitsCasting;
import com.units.internal.AbstractUnit;
import com.units.internal.Ratio;
import com.units.mass.Mass;
import com.units.volume.Volume;


public abstract class Density extends AbstractUnit {

	public static final Ratio _typeCode =
		Mass._typeCode
		.divide(Volume._typeCode);
	
	public Density(double value) {
		super(value);
	}

	public <E extends Density> E castTo(Class<E> toClass) {
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