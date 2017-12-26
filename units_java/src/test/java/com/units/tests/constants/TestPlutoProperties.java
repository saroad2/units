package com.units.tests.constants;

import static com.units.constants.PhysicalConstants.gravitationalConstant;
import static com.units.constants.PlutoProperties.*;

import org.junit.Test;

import com.units.acceleration.MetersPerSquareSecond;
import com.units.mass.Kilograms;
import com.units.speed.MetersPerSecond;

public class TestPlutoProperties extends PlanetaryConstantsTestSuite {

	public TestPlutoProperties() {
		super(0.45); // %
	}
	
	@Test
	public void testSurfaceGravity() {
		MetersPerSquareSecond calculatedAcceleration =
				gravitationalConstant
				.multiply(plutoMass)
				.divide(plutoEquatorialRadius)
				.divide(plutoEquatorialRadius)
				.castTo(MetersPerSquareSecond.class);
		checkAcceleration(plutoSurfaceGravity, calculatedAcceleration);	
	}
	
	@Test
	public void testMass() {
		Kilograms calculatedMass =
				plutoMeanDensity
				.multiply(plutoEquatorialRadius.pow(3))
				.castTo(Kilograms.class)
				.multiplyByScalar(Math.PI * 4 / 3);
		checkMass(plutoMass, calculatedMass);
	}
	
	@Test
	public void testEscapeVelocity() {
		MetersPerSecond calculatedEscapeVelocity =
				gravitationalConstant
				.multiply(plutoMass)
				.divide(plutoEquatorialRadius)
				.sqrt()
				.castTo(MetersPerSecond.class)
				.multiplyByScalar(Math.sqrt(2));
		checkVelocity(plutoEscapeVelocity, calculatedEscapeVelocity);
	}

}
