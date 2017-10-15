/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.speed;

import com.units.internal.*;
import com.units.duration.Seconds;
import com.units.length.Yards;


public class YardsPerSecond extends NumericValue implements Speed{

	public static final double _scale =
		Yards._scale / Seconds._scale;
	
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
}