/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.speed;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.length.Kilometers;
import com.units.duration.Hours;


public class KilometersPerHour extends NumericValue implements Speed{

	public static final double _scale = Kilometers._scale / Hours._scale;
	
	public KilometersPerHour(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilometers/hour";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static KilometersPerHour zero() {
		return new KilometersPerHour(0);
	}
	
	public static KilometersPerHour one() {
		return new KilometersPerHour(1);
	}
	
	public KilometersPerHour plus(KilometersPerHour other) {
		return new KilometersPerHour(value() + other.value());
	}
	
	public KilometersPerHour minus(KilometersPerHour other) {
		return new KilometersPerHour(value() - other.value());
	}
	
	public KilometersPerHour opposite() {
		return new KilometersPerHour(-value());
	}

	public KilometersPerHour multiplyByScalar(double scalar) {
		return new KilometersPerHour(scalar * value());
	}
	
	public KilometersPerHour divideByScalar(double scalar) {
		return new KilometersPerHour(value() / scalar);
	}
	
	public boolean equals(KilometersPerHour other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static KilometersPerHour castFromScale(double value, double scale) {
		return new KilometersPerHour(value * scale / _scale);
	}

	public static KilometersPerHour castFrom(Speed other) {
		return castFromScale(other.value(), other.scale());
	}

	public static KilometersPerHour divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}
}