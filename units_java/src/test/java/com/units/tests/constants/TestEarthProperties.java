package com.units.tests.constants;

import static com.units.constants.PhysicalConstants.gravitationalConstant;
import static com.units.constants.Wgs84.semiMajorAxis;
import static com.units.constants.EarthProperties.*;

import org.junit.Test;

import com.units.acceleration.MetersPerSquareSecond;
import com.units.mass.Kilograms;
import com.units.speed.MetersPerSecond;

public class TestEarthProperties extends PlanetaryConstantsTestSuite {
	
	public TestEarthProperties() {
		super(0.35); // %
	}
	
	@Test
	public void testSurfaceGravity() {
		MetersPerSquareSecond calculatedAcceleration =
				gravitationalConstant
				.multiply(earthMass)
				.divide(semiMajorAxis)
				.divide(semiMajorAxis)
				.castTo(MetersPerSquareSecond.class);
		checkAcceleration(earthSurfaceGravity, calculatedAcceleration);	
	}
	
	@Test
	public void testMass() {
		Kilograms calculatedMass =
				earthMeanDensity
				.multiply(semiMajorAxis.pow(3))
				.castTo(Kilograms.class)
				.multiplyByScalar(Math.PI * 4 / 3);
		checkMass(earthMass, calculatedMass);
	}
	
	@Test
	public void testEscapeVelocity() {
		MetersPerSecond calculatedEscapeVelocity =
				gravitationalConstant
				.multiply(earthMass)
				.divide(semiMajorAxis)
				.sqrt()
				.castTo(MetersPerSecond.class)
				.multiplyByScalar(Math.sqrt(2));
		checkVelocity(earthEscapeVelocity, calculatedEscapeVelocity);
	}

}
