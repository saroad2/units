package com.units;

import com.units.angle.Angle;
import com.units.angle.Radians;

public class Trigo {

	public static double sin(Angle angle) {
		return Math.sin(Radians.castFrom(angle).value());
	}

	public static double cos(Angle angle) {
		return Math.cos(Radians.castFrom(angle).value());
	}

	public static double tan(Angle angle) {
		return Math.tan(Radians.castFrom(angle).value());
	}

	public static <E extends Angle> E asin(Class<E> angleClass, double value) {
		return convertToClass(angleClass, new Radians(Math.asin(value)));
	}

	public static <E extends Angle> E acos(Class<E> angleClass, double value) {
		return convertToClass(angleClass, new Radians(Math.acos(value)));
	}

	public static <E extends Angle> E atan(Class<E> angleClass, double value) {
		return convertToClass(angleClass, new Radians(Math.atan(value)));
	}

	public static <E extends Angle> E atan2(
			Class<E> angleClass,
			double y,
			double x) {
		return convertToClass(angleClass, new Radians(Math.atan2(y, x)));
	}
	
	@SuppressWarnings("unchecked")
	private static <E extends Angle> E convertToClass(
			Class<E> angleClass,
			Radians radiansValue) {
		try {
			return (E)angleClass
						.getMethod("castFrom", Angle.class)
						.invoke(null, radiansValue);
		}
		catch (ReflectiveOperationException e) {
			return null;
		}
	}
}
