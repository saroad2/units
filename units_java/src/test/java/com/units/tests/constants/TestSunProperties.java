package com.units.tests.constants;

import static com.units.constants.PhysicalConstants.gravitationalConstant;
import static com.units.constants.SunProperties.*;

import org.junit.Test;

import com.units.acceleration.MetersPerSquareSecond;
import com.units.mass.Kilograms;
import com.units.mass.SolarMasses;
import com.units.speed.MetersPerSecond;

public class TestSunProperties extends PlanetaryConstantsTestSuite {
	
	public TestSunProperties() {
		super(0.14); // %
	}
	@Test
	public void testSurfaceGravity() {
		MetersPerSquareSecond calculatedAcceleration =
				gravitationalConstant
				.multiply(sunMass)
				.divide(sunEquatorialRadius)
				.divide(sunEquatorialRadius)
				.castTo(MetersPerSquareSecond.class);
		checkAcceleration(sunSurfaceGravity, calculatedAcceleration);	
	}
	
	@Test
	public void testMass() {
		Kilograms calculatedMass =
				sunMeanDensity
				.multiply(sunEquatorialRadius.pow(3))
				.castTo(Kilograms.class)
				.multiplyByScalar(Math.PI * 4 / 3);
		checkMass(sunMass, calculatedMass);
	}
	
	@Test
	public void testEscapeVelocity() {
		MetersPerSecond calculatedEscapeVelocity =
				gravitationalConstant
				.multiply(sunMass)
				.divide(sunEquatorialRadius)
				.sqrt()
				.castTo(MetersPerSecond.class)
				.multiplyByScalar(Math.sqrt(2));
		checkVelocity(sunEscapeVelocity, calculatedEscapeVelocity);
	}
	
	@Test
	public void testSolarMass() {
		checkMass(sunMass, SolarMasses.one().castTo(Kilograms.class));
	}

}
