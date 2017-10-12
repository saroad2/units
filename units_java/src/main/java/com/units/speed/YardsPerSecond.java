/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.speed;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.length.Yards;
import com.units.duration.Seconds;


public class YardsPerSecond extends NumericValue implements Speed{

	public static final double _scale = Yards._scale / Seconds._scale;
	
	public YardsPerSecond(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "yards/second";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static YardsPerSecond zero() {
		return new YardsPerSecond(0);
	}
	
	public static YardsPerSecond one() {
		return new YardsPerSecond(1);
	}
	
	public YardsPerSecond plus(YardsPerSecond other) {
		return new YardsPerSecond(value() + other.value());
	}
	
	public YardsPerSecond minus(YardsPerSecond other) {
		return new YardsPerSecond(value() - other.value());
	}
	
	public YardsPerSecond opposite() {
		return new YardsPerSecond(-value());
	}

	public YardsPerSecond multiplyByScalar(double scalar) {
		return new YardsPerSecond(scalar * value());
	}
	
	public YardsPerSecond divideByScalar(double scalar) {
		return new YardsPerSecond(value() / scalar);
	}
	
	public boolean equals(YardsPerSecond other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static YardsPerSecond castFromScale(double value, double scale) {
		return new YardsPerSecond(value * scale / _scale);
	}

	public static YardsPerSecond castFrom(Speed other) {
		return castFromScale(other.value(), other.scale());
	}

	public static YardsPerSecond divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static YardsPerSecond multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}