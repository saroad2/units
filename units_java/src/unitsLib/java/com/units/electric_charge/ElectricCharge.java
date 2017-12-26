/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.electric_charge;

import com.units.exceptions.IllegalUnitsCasting;
import com.units.internal.AbstractUnit;
import com.units.internal.Ratio;
import com.units.duration.Duration;
import com.units.electric_current.ElectricCurrent;


public abstract class ElectricCharge extends AbstractUnit {

	public static final Ratio _typeCode =
		ElectricCurrent._typeCode
		.multiply(Duration._typeCode);
	
	public ElectricCharge(double value) {
		super(value);
	}

	public <E extends ElectricCharge> E castTo(Class<E> toClass) {
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