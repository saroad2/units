package com.units.tests.constants;

import static com.units.constants.PhysicalConstants.gravitationalConstant;
import static com.units.constants.JupiterProperties.*;

import org.junit.Test;

import com.units.acceleration.MetersPerSquareSecond;
import com.units.mass.Kilograms;
import com.units.speed.MetersPerSecond;

public class TestJupiterProperties extends PlanetaryConstantsTestSuite {
	
	public TestJupiterProperties() {
		super(7.0); // %
	}
	
	@Test
	public void testSurfaceGravity() {
		MetersPerSquareSecond calculatedAcceleration =
				gravitationalConstant
				.multiply(jupiterMass)
				.divide(jupiterEquatorialRadius)
				.divide(jupiterEquatorialRadius)
				.castTo(MetersPerSquareSecond.class);
		checkAcceleration(jupiterSurfaceGravity, calculatedAcceleration);	
	}
	
	@Test
	public void testMass() {
		Kilograms calculatedMass =
				jupiterMeanDensity
				.multiply(jupiterEquatorialRadius.pow(3))
				.castTo(Kilograms.class)
				.multiplyByScalar(Math.PI * 4 / 3);
		checkMass(jupiterMass, calculatedMass);
	}
	
	@Test
	public void testEscapeVelocity() {
		MetersPerSecond calculatedEscapeVelocity =
				gravitationalConstant
				.multiply(jupiterMass)
				.divide(jupiterEquatorialRadius)
				.sqrt()
				.castTo(MetersPerSecond.class)
				.multiplyByScalar(Math.sqrt(2));
		checkVelocity(jupiterEscapeVelocity, calculatedEscapeVelocity);
	}

}
