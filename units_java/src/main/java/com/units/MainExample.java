package com.units;

import com.units.angle.Radians;
import com.units.angular_speed.DegreesPerSecond;
import com.units.area.SquareMeters;
import com.units.duration.Seconds;
import com.units.length.Centimeters;
import com.units.length.Feet;
import com.units.length.Inches;
import com.units.length.Length;
import com.units.length.Meters;
import com.units.length.Yards;
import com.units.speed.MetersPerSecond;

public class MainExample {
	
	public static void main(String[] args) {
		
		/* All units are printed with their values and unit names
		 * */
		Meters m = new Meters(3);
		Meters m2 = new Meters(5.12);
		System.out.println(m);

		/* ... and all units has a unit type interface they inherit from
		 * */
		Length m3 = new Meters(3.56); // This is from Meters type
		System.out.println(m3);
		System.out.println();

		/* You can sum and subtract units from one another
		 * only if they're from the same unit.
		 * */

		System.out.println(m.plus(m2));
		System.out.println(m.plus(new Meters(1.2)));
		System.out.println(m2.minus(m));
		
		/* System.out.println(m.minus(new Feet(2));
		 * 
		 * This will not compile since you cannot subtract Meters from Feet
		 * without casting.
		 * */
		System.out.println();

		/* You can cast between units.
		 * When casting units, it is validated the both units,
		 * the converted and the result unit, are from the same type.
		 * */
		System.out.println(m2.castTo(Yards.class));
		System.out.println(m2.castTo(Feet.class));
		System.out.println(m2.castTo(Inches.class));
		System.out.println(m2.castTo(Centimeters.class));
		
		/*System.out.println(m2.castTo(Knots.class));
		 *
		 * This will not compile since Meters is a length unit and
		 * Knots is a speed unit.
		 * */
		System.out.println();

		/* You can divide units by one another.
		 * In this case the result unit will be from a ratio type
		 * of the given units and its value will be the ratio of them.
		 * The result unit is validated to be from the right type.
		 * */
		Seconds s = new Seconds(2);
		System.out.println(m2.divide(s).castTo(MetersPerSecond.class));
		System.out.println(new Radians(Math.PI / 2).divide(s).castTo(DegreesPerSecond.class));
		
		/* System.out.println(new Inches(50).divide(new Hours(2)).castTo(Radians.class));
		 * 
		 * This will not compile since Radians is an angle unit and not a speed unit
		 * */
		System.out.println();
		
		TraingleAreaCalculator<?> calculator = new TraingleAreaCalculator<>(SquareMeters.class);
		Yards y = new Yards(2);
		System.out.println(calculator.calculate(m2, m));
		System.out.println(calculator.calculate(m, m3));
		System.out.println(calculator.calculate(m, y));
		
		/* System.out.println(calculator.calculate(m, new Knots(3)));
		 *
		 * This will not compile since the calculate function expects only
		 * length units.
		 * */
		
		System.out.println();
	}

}
