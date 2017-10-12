/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.angular_speed;

import com.units.Unit;
import com.units.internal.Ratio;
import com.units.angle.Angle;
import com.units.duration.Duration;


public interface AngularSpeed extends Unit {

	public static final Ratio _typeCode =
		Angle._typeCode
		.divide(Duration._typeCode);

	@Override
	default public Ratio typeCode() {
		return _typeCode;
	};
}