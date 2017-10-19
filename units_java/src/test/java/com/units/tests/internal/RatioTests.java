package com.units.tests.internal;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import com.units.internal.Ratio;

public class RatioTests {

	public void checkRatio(Ratio r, int expectedNumerator, int expectedDenominator) {
		assertTrue("numerator is " + r.getNumerator() + " instead of " + expectedNumerator,
				r.getNumerator() == expectedNumerator);
		assertTrue("denominator is " + r.getDenominator() + " instead of " + expectedDenominator,
				r.getDenominator() == expectedDenominator);
	}
	@Test
	public void testRatioConstructorWithoutCommonDivisor() {
		int numerator = 3;
		int denominator = 5;
		Ratio r = new Ratio(numerator, denominator);
		checkRatio(r, numerator, denominator);
	}
	
	@Test
	public void testRatioConstructorWithCommonDivisor() {
		int numerator = 6;
		int denominator = 10;
		int coprimeNumerator = 3;
		int coprimeDenominator = 5;
		Ratio r = new Ratio(numerator, denominator);
		checkRatio(r, coprimeNumerator, coprimeDenominator);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testRatioCantDivideByZero() {
		int numerator = 8;
		new Ratio(numerator, 0);
	}
	
	@Test()
	public void testRatioCanDivideZero() {
		int denominator = 8;
		Ratio r = new Ratio(0, denominator);
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
		int denominator = 7;
		Ratio r1 = new Ratio(numerator, denominator);
		Ratio r2 = new Ratio(numerator, denominator);
		assertTrue("ratios were suppose to be equal, but they are not",
				r1.equals(r2));
	}
	
	@Test()
	public void testEqualsIsFalseBecauseOfDifferentNumerators() {
		int numerator1 = 3;
		int numerator2 = 2;
		int denominator = 7;
		Ratio r1 = new Ratio(numerator1, denominator);
		Ratio r2 = new Ratio(numerator2, denominator);
		assertFalse("ratios were suppose not to be equal, but they are",
				r1.equals(r2));
	}

	@Test()
	public void testEqualsIsFalseBecauseOfDifferentDenominators() {
		int numerator = 3;
		int denominator1 = 7;
		int denominator2 = 8;
		Ratio r1 = new Ratio(numerator, denominator1);
		Ratio r2 = new Ratio(numerator, denominator2);
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
