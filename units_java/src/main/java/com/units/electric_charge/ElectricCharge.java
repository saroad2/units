/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.electric_charge;

import com.units.Unit;
import com.units.exceptions.IllegalUnitsCasting;
import com.units.internal.Ratio;
import com.units.duration.Duration;
import com.units.electric_current.ElectricCurrent;


public interface ElectricCharge extends Unit {

	public static final Ratio _typeCode =
		ElectricCurrent._typeCode
		.multiply(Duration._typeCode);

	default public <E extends ElectricCharge> E castTo(Class<E> toClass) {
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