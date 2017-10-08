package com.units.tests.internal;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import com.units.internal.Ratio;

public class RatioTests {

	public void checkRatio(Ratio r, int expectedNumerator, int expectedDenumerator) {
		assertTrue("numerator is " + r.getNumerator() + " instead of " + expectedNumerator,
				r.getNumerator() == expectedNumerator);
		assertTrue("denumerator is " + r.getDenumerator() + " instead of " + expectedDenumerator,
				r.getDenumerator() == expectedDenumerator);
	}
	@Test
	public void testRatioConstructorWithoutCommonDivisor() {
		int numerator = 3;
		int denumerator = 5;
		Ratio r = new Ratio(numerator, denumerator);
		checkRatio(r, numerator, denumerator);
	}
	
	@Test
	public void testRatioConstructorWithCommonDivisor() {
		int numerator = 6;
		int denumerator = 10;
		int coprimeNumerator = 3;
		int coprimeDenumerator = 5;
		Ratio r = new Ratio(numerator, denumerator);
		checkRatio(r, coprimeNumerator, coprimeDenumerator);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testRatioCantDivideByZero() {
		int numerator = 8;
		new Ratio(numerator, 0);
	}
	
	@Test()
	public void testRatioCanDivideZero() {
		int denumerator = 8;
		Ratio r = new Ratio(0, denumerator);
		checkRatio(r, 0, 1);
	}
	
	@Test()
	public void testRatioIntegerConstructor() {
		int numerator = 8;
		Ratio r = new Ratio(numerator);
		checkRatio(r, numerator, 1);
	}
	
	@Test()
	public void testEqualsIsTrue() {
		int numerator = 3;
		int denumerator = 7;
		Ratio r1 = new Ratio(numerator, denumerator);
		Ratio r2 = new Ratio(numerator, denumerator);
		assertTrue("ratios were suppose to be equal, but they are not",
				r1.equals(r2));
	}
	
	@Test()
	public void testEqualsIsFalseBecauseOfDifferentNumerators() {
		int numerator1 = 3;
		int numerator2 = 2;
		int denumerator = 7;
		Ratio r1 = new Ratio(numerator1, denumerator);
		Ratio r2 = new Ratio(numerator2, denumerator);
		assertFalse("ratios were suppose not to be equal, but they are",
				r1.equals(r2));
	}

	@Test()
	public void testEqualsIsFalseBecauseOfDifferentDenumerators() {
		int numerator = 3;
		int denumerator1 = 7;
		int denumerator2 = 8;
		Ratio r1 = new Ratio(numerator, denumerator1);
		Ratio r2 = new Ratio(numerator, denumerator2);
		assertFalse("ratios were suppose not to be equal, but they are",
				r1.equals(r2));
	}
	
	@Test()
	public void testMultiplyWithoutCommonDivisor() {
		Ratio r1 = new Ratio(3, 5);
		Ratio r2 = new Ratio(2, 7);
		checkRatio(r1.multiply(r2), 6, 35);
	}
	
	@Test()
	public void testMultiplyWithCommonDivisor() {
		Ratio r1 = new Ratio(3, 5);
		Ratio r2 = new Ratio(2, 9);
		checkRatio(r1.multiply(r2), 2, 15);
	}
	

	@Test()
	public void testDivideWithoutCommonDivisor() {
		Ratio r1 = new Ratio(3, 5);
		Ratio r2 = new Ratio(2, 7);
		checkRatio(r1.divide(r2), 21, 10);
	}
	
	@Test()
	public void testDivideWithCommonDivisor() {
		Ratio r1 = new Ratio(3, 5);
		Ratio r2 = new Ratio(6, 7);
		checkRatio(r1.divide(r2), 7, 10);
	}

}
