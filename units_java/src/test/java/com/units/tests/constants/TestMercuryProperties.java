package com.units.tests.constants;

import static com.units.constants.PhysicalConstants.gravitationalConstant;
import static com.units.constants.MercuryProperties.*;

import org.junit.Test;

import com.units.acceleration.MetersPerSquareSecond;
import com.units.mass.Kilograms;
import com.units.speed.MetersPerSecond;

public class TestMercuryProperties extends PlanetaryConstantsTestSuite {

	public TestMercuryProperties() {
		super(1.2); // %
	}
	
	@Test
	public void testSurfaceGravity() {
		MetersPerSquareSecond calculatedAcceleration =
				gravitationalConstant
				.multiply(mercuryMass)
				.divide(mercuryEquatorialRadius)
				.divide(mercuryEquatorialRadius)
				.castTo(MetersPerSquareSecond.class);
		checkAcceleration(mercurySurfaceGravity, calculatedAcceleration);	
	}
	
	@Test
	public void testMass() {
		Kilograms calculatedMass =
				mercuryMeanDensity
				.multiply(mercuryEquatorialRadius.pow(3))
				.castTo(Kilograms.class)
				.multiplyByScalar(Math.PI * 4 / 3);
		checkMass(mercuryMass, calculatedMass);
	}
	
	@Test
	public void testEscapeVelocity() {
		MetersPerSecond calculatedEscapeVelocity =
				gravitationalConstant
				.multiply(mercuryMass)
				.divide(mercuryEquatorialRadius)
				.sqrt()
				.castTo(MetersPerSecond.class)
				.multiplyByScalar(Math.sqrt(2));
		checkVelocity(mercuryEscapeVelocity, calculatedEscapeVelocity);
	}

}
