package com.units.tests.constants;

import static com.units.constants.PhysicalConstants.gravitationalConstant;
import static com.units.constants.MarsProperties.*;

import org.junit.Test;

import com.units.acceleration.MetersPerSquareSecond;
import com.units.mass.Kilograms;
import com.units.speed.MetersPerSecond;

public class TestMarsProperties extends PlanetaryConstantsTestSuite {
	
	public TestMarsProperties() {
		super(0.6); // %
	}
	
	@Test
	public void testSurfaceGravity() {
		MetersPerSquareSecond calculatedAcceleration =
				gravitationalConstant
				.multiply(marsMass)
				.divide(marsEquatorialRadius)
				.divide(marsEquatorialRadius)
				.castTo(MetersPerSquareSecond.class);
		checkAcceleration(marsSurfaceGravity, calculatedAcceleration);	
	}
	
	@Test
	public void testMass() {
		Kilograms calculatedMass =
				marsMeanDensity
				.multiply(marsEquatorialRadius.pow(3))
				.castTo(Kilograms.class)
				.multiplyByScalar(Math.PI * 4 / 3);
		checkMass(marsMass, calculatedMass);
	}
	
	@Test
	public void testEscapeVelocity() {
		MetersPerSecond calculatedEscapeVelocity =
				gravitationalConstant
				.multiply(marsMass)
				.divide(marsEquatorialRadius)
				.sqrt()
				.castTo(MetersPerSecond.class)
				.multiplyByScalar(Math.sqrt(2));
		checkVelocity(marsEscapeVelocity, calculatedEscapeVelocity);
	}

}
