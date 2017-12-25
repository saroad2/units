package com.units;

import com.units.angle.Angle;
import com.units.angle.Radians;

public class Trigo {

	public static double sin(Angle angle) {
		return Math.sin(angle.castTo(Radians.class).value());
	}

	public static double cos(Angle angle) {
		return Math.cos(angle.castTo(Radians.class).value());
	}

	public static double tan(Angle angle) {
		return Math.tan(angle.castTo(Radians.class).value());
	}

	public static <E extends Angle> E asin(Class<E> angleClass, double value) {
		return new Radians(Math.asin(value)).castTo(angleClass);
	}

	public static <E extends Angle> E acos(Class<E> angleClass, double value) {
		return new Radians(Math.acos(value)).castTo(angleClass);
	}

	public static <E extends Angle> E atan(Class<E> angleClass, double value) {
		return new Radians(Math.atan(value)).castTo(angleClass);
	}

	public static <E extends Angle> E atan2(
			Class<E> angleClass,
			double y,
			double x) {
		return new Radians(Math.atan2(y, x)).castTo(angleClass);
	}

}
