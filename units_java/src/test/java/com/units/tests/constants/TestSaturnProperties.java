package com.units.tests.constants;

import static com.units.constants.PhysicalConstants.gravitationalConstant;
import static com.units.constants.SaturnProperties.*;

import org.junit.Test;

import com.units.acceleration.MetersPerSquareSecond;
import com.units.mass.Kilograms;
import com.units.speed.MetersPerSecond;

public class TestSaturnProperties extends PlanetaryConstantsTestSuite {
	
	public TestSaturnProperties() {
		super(10.9); // %
	}
	@Test
	public void testSurfaceGravity() {
		MetersPerSquareSecond calculatedAcceleration =
				gravitationalConstant
				.multiply(saturnMass)
				.divide(saturnEquatorialRadius)
				.divide(saturnEquatorialRadius)
				.castTo(MetersPerSquareSecond.class);
		checkAcceleration(saturnSurfaceGravity, calculatedAcceleration);	
	}
	
	@Test
	public void testMass() {
		Kilograms calculatedMass =
				saturnMeanDensity
				.multiply(saturnEquatorialRadius.pow(3))
				.castTo(Kilograms.class)
				.multiplyByScalar(Math.PI * 4 / 3);
		checkMass(saturnMass, calculatedMass);
	}
	
	@Test
	public void testEscapeVelocity() {
		MetersPerSecond calculatedEscapeVelocity =
				gravitationalConstant
				.multiply(saturnMass)
				.divide(saturnEquatorialRadius)
				.sqrt()
				.castTo(MetersPerSecond.class)
				.multiplyByScalar(Math.sqrt(2));
		checkVelocity(saturnEscapeVelocity, calculatedEscapeVelocity);
	}

}
