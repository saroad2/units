package com.units.tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

import org.junit.Test;

import com.units.Trigo;
import com.units.angle.Angle;
import com.units.angle.Degrees;
import com.units.angle.Mils;
import com.units.angle.Radians;

public class TestTrigo {
	
	private List<Degrees> degreesValues;
	private List<Radians> radiansValues;
	private List<Mils> milsValues;
	private List<Double> doubleValues;
	private boolean runOverDegrees = true;
	private boolean runOverRadians = true;
	private boolean runOverMils = true;
	private BiFunction<Angle, Double, Double> testedFunction;
	
	private static final double epsilon = 1e-9;
	
	private void checkFunc(Angle input, double expectedResult) {
		double error = testedFunction.apply(input, expectedResult);
		assertTrue(
				"failed on input " + input + "." +
				"error is " + error,
				error < epsilon);
	}
	
	private void run() {
		long size = doubleValues.size();
		for (int i=0; i < size; ++i) {
			double expectedResult = doubleValues.get(i);
			if (runOverDegrees)
				checkFunc(degreesValues.get(i), expectedResult);
			if (runOverRadians)
				checkFunc(radiansValues.get(i), expectedResult);
			if (runOverMils)
				checkFunc(milsValues.get(i), expectedResult);
		}
	}
	
	@Test
	public void testSin() {
		degreesValues = Arrays.asList(
							new Degrees(0),
							new Degrees(30),
							new Degrees(45),
							new Degrees(60),
							new Degrees(90));
		radiansValues = Arrays.asList(
							new Radians(0),
							new Radians(Math.PI / 6),
							new Radians(Math.PI / 4),
							new Radians(Math.PI / 3),
							new Radians(Math.PI / 2));
		milsValues = Arrays.asList(
							new Mils(0),
							new Mils(6400.0 / 12),
							new Mils(6400.0 / 8),
							new Mils(6400.0 / 6),
							new Mils(6400.0 / 4));
		doubleValues = Arrays.asList(
							0.0,
							0.5,
							Math.sqrt(0.5),
							Math.sqrt(0.75),
							1.0);
		testedFunction = (angle, expectedValue) ->
			Math.abs(Trigo.sin(angle) - expectedValue);
		run();
	}
	
	@Test
	public void testCos() {
		degreesValues = Arrays.asList(
							new Degrees(0),
							new Degrees(30),
							new Degrees(45),
							new Degrees(60),
							new Degrees(90));
		radiansValues = Arrays.asList(
							new Radians(0),
							new Radians(Math.PI / 6),
							new Radians(Math.PI / 4),
							new Radians(Math.PI / 3),
							new Radians(Math.PI / 2));
		milsValues = Arrays.asList(
							new Mils(0),
							new Mils(6400.0 / 12),
							new Mils(6400.0 / 8),
							new Mils(6400.0 / 6),
							new Mils(6400.0 / 4));
		doubleValues = Arrays.asList(
							1.0,
							Math.sqrt(0.75),
							Math.sqrt(0.5),
							0.5,
							0.0);
		testedFunction = (angle, expectedValue) ->
			Math.abs(Trigo.cos(angle) - expectedValue);
		run();
	}


	
	@Test
	public void testTan() {
		degreesValues = Arrays.asList(
							new Degrees(0),
							new Degrees(30),
							new Degrees(45),
							new Degrees(60));
		radiansValues = Arrays.asList(
							new Radians(0),
							new Radians(Math.PI / 6),
							new Radians(Math.PI / 4),
							new Radians(Math.PI / 3));
		milsValues = Arrays.asList(
							new Mils(0),
							new Mils(6400.0 / 12),
							new Mils(6400.0 / 8),
							new Mils(6400.0 / 6));
		doubleValues = Arrays.asList(
							0.0,
							Math.sqrt(1.0 / 3),
							1.0,
							Math.sqrt(3));
		testedFunction = (angle, expectedValue) ->
			Math.abs(Trigo.tan(angle) - expectedValue);
		run();
	}
	
	@Test
	public void testDegreesAsin() {
		degreesValues = Arrays.asList(
				new Degrees(0),
				new Degrees(30),
				new Degrees(45),
				new Degrees(60),
				new Degrees(90));
		doubleValues = Arrays.asList(
				0.0,
				0.5,
				Math.sqrt(0.5),
				Math.sqrt(0.75),
				1.0);
		runOverMils = false;
		runOverRadians = false;
		testedFunction = (angle, expectedValue) ->
		Math.abs(Trigo.asin(Degrees.class, expectedValue)
					.minus((Degrees)angle)
					.value());
		run();
	}
	
	@Test
	public void testRadiansAsin() {
		radiansValues = Arrays.asList(
				new Radians(0),
				new Radians(Math.PI / 6),
				new Radians(Math.PI / 4),
				new Radians(Math.PI / 3),
				new Radians(Math.PI / 2));
		doubleValues = Arrays.asList(
				0.0,
				0.5,
				Math.sqrt(0.5),
				Math.sqrt(0.75),
				1.0);
		runOverDegrees = false;
		runOverMils = false;
		testedFunction = (angle, expectedValue) ->
		Math.abs(Trigo.asin(Radians.class, expectedValue)
				.minus((Radians)angle)
				.value());
		run();
	}
	
	@Test
	public void testMilsAsin() {
		milsValues = Arrays.asList(
				new Mils(0),
				new Mils(6400.0 / 12),
				new Mils(6400.0 / 8),
				new Mils(6400.0 / 6),
				new Mils(6400.0 / 4));
		doubleValues = Arrays.asList(
				0.0,
				0.5,
				Math.sqrt(0.5),
				Math.sqrt(0.75),
				1.0);
		runOverDegrees = false;
		runOverRadians = false;
		testedFunction = (angle, expectedValue) ->
		Math.abs(Trigo.asin(Mils.class, expectedValue)
					.minus((Mils)angle)
					.value());
		run();
	}
	
	@Test
	public void testDegreesAcos() {
		degreesValues = Arrays.asList(
				new Degrees(0),
				new Degrees(30),
				new Degrees(45),
				new Degrees(60),
				new Degrees(90));
		doubleValues = Arrays.asList(
				1.0,
				Math.sqrt(0.75),
				Math.sqrt(0.5),
				0.5,
				0.0);
		runOverMils = false;
		runOverRadians = false;
		testedFunction = (angle, expectedValue) ->
		Math.abs(Trigo.acos(Degrees.class, expectedValue)
					.minus((Degrees)angle)
					.value());
		run();
	}
	
	@Test
	public void testRadiansAcos() {
		radiansValues = Arrays.asList(
				new Radians(0),
				new Radians(Math.PI / 6),
				new Radians(Math.PI / 4),
				new Radians(Math.PI / 3),
				new Radians(Math.PI / 2));
		doubleValues = Arrays.asList(
				1.0,
				Math.sqrt(0.75),
				Math.sqrt(0.5),
				0.5,
				0.0);
		runOverDegrees = false;
		runOverMils = false;
		testedFunction = (angle, expectedValue) ->
		Math.abs(Trigo.acos(Radians.class, expectedValue)
				.minus((Radians)angle)
				.value());
		run();
	}
	
	@Test
	public void testMilsAcos() {
		milsValues = Arrays.asList(
				new Mils(0),
				new Mils(6400.0 / 12),
				new Mils(6400.0 / 8),
				new Mils(6400.0 / 6),
				new Mils(6400.0 / 4));
		doubleValues = Arrays.asList(
				1.0,
				Math.sqrt(0.75),
				Math.sqrt(0.5),
				0.5,
				0.0);
		runOverDegrees = false;
		runOverRadians = false;
		testedFunction = (angle, expectedValue) ->
		Math.abs(Trigo.acos(Mils.class, expectedValue)
					.minus((Mils)angle)
					.value());
		run();
	}
	
	@Test
	public void testDegreesAtan() {
		degreesValues = Arrays.asList(
				new Degrees(0),
				new Degrees(30),
				new Degrees(45),
				new Degrees(60));
		doubleValues = Arrays.asList(
				0.0,
				Math.sqrt(1.0 / 3),
				1.0,
				Math.sqrt(3));
		runOverMils = false;
		runOverRadians = false;
		testedFunction = (angle, expectedValue) ->
		Math.abs(Trigo.atan(Degrees.class, expectedValue)
					.minus((Degrees)angle)
					.value());
		run();
	}
	
	@Test
	public void testRadiansAtan() {
		radiansValues = Arrays.asList(
				new Radians(0),
				new Radians(Math.PI / 6),
				new Radians(Math.PI / 4),
				new Radians(Math.PI / 3));
		doubleValues = Arrays.asList(
				0.0,
				Math.sqrt(1.0 / 3),
				1.0,
				Math.sqrt(3));
		runOverDegrees = false;
		runOverMils = false;
		testedFunction = (angle, expectedValue) ->
		Math.abs(Trigo.atan(Radians.class, expectedValue)
				.minus((Radians)angle)
				.value());
		run();
	}
	
	@Test
	public void testMilsAtan() {
		milsValues = Arrays.asList(
				new Mils(0),
				new Mils(6400.0 / 12),
				new Mils(6400.0 / 8),
				new Mils(6400.0 / 6));
		doubleValues = Arrays.asList(
				0.0,
				Math.sqrt(1.0 / 3),
				1.0,
				Math.sqrt(3));
		runOverDegrees = false;
		runOverRadians = false;
		testedFunction = (angle, expectedValue) ->
		Math.abs(Trigo.atan(Mils.class, expectedValue)
					.minus((Mils)angle)
					.value());
		run();
	}
	
	@Test
	public void testDegreesAtan2() {
		assertTrue(Trigo.atan2(
							Degrees.class,
							0,
							8)
					.equals(new Degrees(0)));
		assertTrue(Trigo.atan2(
							Degrees.class,
							1,
							Math.sqrt(3))
					.equals(new Degrees(30)));
		assertTrue(Trigo.atan2(
							Degrees.class,
							2,
							2)
					.equals(new Degrees(45)));
		assertTrue(Trigo.atan2(
							Degrees.class,
							Math.sqrt(3),
							1)
					.equals(new Degrees(60)));
		assertTrue(Trigo.atan2(
							Degrees.class,
							8,
							0)
					.equals(new Degrees(90)));
	}
	
	@Test
	public void testRadiansAtan2() {
		assertTrue(Trigo.atan2(
							Radians.class,
							0,
							8)
					.equals(new Radians(0)));
		assertTrue(Trigo.atan2(
							Radians.class,
							1,
							Math.sqrt(3))
					.equals(new Radians(Math.PI / 6)));
		assertTrue(Trigo.atan2(
							Radians.class,
							2,
							2)
					.equals(new Radians(Math.PI / 4)));
		assertTrue(Trigo.atan2(
							Radians.class,
							Math.sqrt(3),
							1)
					.equals(new Radians(Math.PI / 3)));
		assertTrue(Trigo.atan2(
							Radians.class,
							8,
							0)
					.equals(new Radians(Math.PI / 2)));
	}
	
	@Test
	public void testMilsAtan2() {
		assertTrue(Trigo.atan2(
							Mils.class,
							0,
							8)
					.equals(new Mils(0)));
		assertTrue(Trigo.atan2(
							Mils.class,
							1,
							Math.sqrt(3))
					.equals(new Mils(6400.0 / 12)));
		assertTrue(Trigo.atan2(
							Mils.class,
							2,
							2)
					.equals(new Mils(6400.0 / 8)));
		assertTrue(Trigo.atan2(
							Mils.class,
							Math.sqrt(3),
							1)
					.equals(new Mils(6400.0 / 6)));
		assertTrue(Trigo.atan2(
							Mils.class,
							8,
							0)
					.equals(new Mils(6400.0 / 4)));
	}
}
