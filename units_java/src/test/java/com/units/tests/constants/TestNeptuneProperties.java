package com.units.tests.constants;

import static com.units.constants.PhysicalConstants.gravitationalConstant;
import static com.units.constants.NeptuneProperties.*;

import org.junit.Test;

import com.units.acceleration.MetersPerSquareSecond;
import com.units.mass.Kilograms;
import com.units.speed.MetersPerSecond;

public class TestNeptuneProperties extends PlanetaryConstantsTestSuite {

	public TestNeptuneProperties() {
		super(1.75); // %
	}
	
	@Test
	public void testSurfaceGravity() {
		MetersPerSquareSecond calculatedAcceleration =
				gravitationalConstant
				.multiply(neptuneMass)
				.divide(neptuneEquatorialRadius)
				.divide(neptuneEquatorialRadius)
				.castTo(MetersPerSquareSecond.class);
		checkAcceleration(neptuneSurfaceGravity, calculatedAcceleration);	
	}
	
	@Test
	public void testMass() {
		Kilograms calculatedMass =
				neptuneMeanDensity
				.multiply(neptuneEquatorialRadius.pow(3))
				.castTo(Kilograms.class)
				.multiplyByScalar(Math.PI * 4 / 3);
		checkMass(neptuneMass, calculatedMass);
	}
	
	@Test
	public void testEscapeVelocity() {
		MetersPerSecond calculatedEscapeVelocity =
				gravitationalConstant
				.multiply(neptuneMass)
				.divide(neptuneEquatorialRadius)
				.sqrt()
				.castTo(MetersPerSecond.class)
				.multiplyByScalar(Math.sqrt(2));
		checkVelocity(neptuneEscapeVelocity, calculatedEscapeVelocity);
	}

}
