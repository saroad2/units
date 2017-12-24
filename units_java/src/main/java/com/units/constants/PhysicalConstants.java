/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.constants;

import com.units.duration.Seconds;
import com.units.electric_charge.Coulombs;
import com.units.energy.Joules;
import com.units.force.Newtons;
import com.units.internal.AnonymousUnit;
import com.units.length.Meters;
import com.units.speed.MetersPerSecond;


public class PhysicalConstants {
	// the speed of light in vacuum.
	static public final MetersPerSecond speedOfLight = new MetersPerSecond(2.99792458E8);

	// the quantum of action.
	static public final AnonymousUnit planckConstant = new Joules(6.62607004E-34)
			.multiply(Seconds.one());

	// planck constant divided by 2 pi.
	static public final AnonymousUnit reducedPlanckConstant = new Joules(1.0545718E-34)
			.multiply(Seconds.one());

	// a constant regarding the force between two objects, depending on their masses and distance
	static public final AnonymousUnit gravitationalConstant = new Newtons(6.67408E-11)
			.multiply(Meters.one()).multiply(Meters.one())
			.divide(Seconds.one()).divide(Seconds.one());

	// the electric charge of a single proton
	static public final Coulombs elementaryCharge = new Coulombs(1.6021766208E-19);


}
