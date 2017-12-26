/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.tests.length;

import org.junit.Test;

import com.units.length.StatuteMiles;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class StatuteMilesTests {

	public void assertSameValue(double value1, double value2) {
		assertTrue("unit value is " + value1 + " instead of " + value2, value1 == value2);
	}

	@Test
	public void testConstructor() {
		double actualValue = 3.1;
		assertSameValue(new StatuteMiles(actualValue).value(), actualValue);
	}

	@Test
	public void testZero() {
		StatuteMiles zero = StatuteMiles.zero();
		assertSameValue(zero.value(), 0);
	}

	@Test
	public void testOne() {
		StatuteMiles one = StatuteMiles.one();
		assertSameValue(one.value(), 1);
	}

	@Test
	public void testComparisonToSmallerValue() {
		StatuteMiles unit = new StatuteMiles(3.1);
		StatuteMiles comparedUnit = new StatuteMiles(3.0);
		assertFalse(unit.lessThan(comparedUnit));
		assertFalse(unit.lessThanOrEquals(comparedUnit));
		assertFalse(unit.equals(comparedUnit));
		assertTrue(unit.greaterThan(comparedUnit));
		assertTrue(unit.greaterThanOrEquals(comparedUnit));
	}
	
	@Test
	public void testComparisonToEqualValue() {
		StatuteMiles unit = new StatuteMiles(3.1);
		StatuteMiles comparedUnit = new StatuteMiles(3.1);
		assertFalse(unit.lessThan(comparedUnit));
		assertTrue(unit.lessThanOrEquals(comparedUnit));
		assertTrue(unit.equals(comparedUnit));
		assertFalse(unit.greaterThan(comparedUnit));
		assertTrue(unit.greaterThanOrEquals(comparedUnit));
	}
	
	@Test
	public void testComparisonToBiggerValue() {
		StatuteMiles unit = new StatuteMiles(3.1);
		StatuteMiles comparedUnit = new StatuteMiles(3.2);
		assertTrue(unit.lessThan(comparedUnit));
		assertTrue(unit.lessThanOrEquals(comparedUnit));
		assertFalse(unit.equals(comparedUnit));
		assertFalse(unit.greaterThan(comparedUnit));
		assertFalse(unit.greaterThanOrEquals(comparedUnit));
	}

	@Test
	public void testEqualsNullFails() {
		double actualValue = 3.1;
		assertFalse("two units are equal, even though one of the is null",
					new StatuteMiles(actualValue).equals(null));
	}

	@Test
	public void testPlus() {
		double value1 = 3.1;
		double value2 = 2.6;
		double resultValue = 5.7;

		StatuteMiles unit1 = new StatuteMiles(value1);
		StatuteMiles unit2 = new StatuteMiles(value2);
		StatuteMiles result = unit1.plus(unit2);

		assertSameValue(unit1.value(), value1);
		assertSameValue(unit2.value(), value2);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testMinus() {
		double value1 = 3.1;
		double value2 = 2.6;
		double resultValue = 0.5;

		StatuteMiles unit1 = new StatuteMiles(value1);
		StatuteMiles unit2 = new StatuteMiles(value2);
		StatuteMiles result = unit1.minus(unit2);

		assertSameValue(unit1.value(), value1);
		assertSameValue(unit2.value(), value2);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testOpposite() {
		double value = 3.1;

		StatuteMiles unit = new StatuteMiles(value);
		StatuteMiles result = unit.opposite();

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), -value);
	}

	@Test
	public void testMultiplyByScalar() {
		double value = 3.1;
		double scalar = 5;
		double resultValue = 15.5;

		StatuteMiles unit = new StatuteMiles(value);
		StatuteMiles result = unit.multiplyByScalar(scalar);

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testDivideByScalar() {
		double value = 3.1;
		double scalar = 5;
		double resultValue = 0.62;

		StatuteMiles unit = new StatuteMiles(value);
		StatuteMiles result = unit.divideByScalar(scalar);

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testScalarRatio() {
		double value1 = 3.1;
		double value2 = 0.62;
		double scalar = 5;

		StatuteMiles unit1 = new StatuteMiles(value1);
		StatuteMiles unit2 = new StatuteMiles(value2);

		assertSameValue(unit1.scalarRatio(unit2), scalar);
	}

	@Test
	public void testToString() {
		double value = 3.1;
		String stringValue = "3.1 statute miles";

		StatuteMiles unit = new StatuteMiles(value);
		assertTrue("string value is \"" + unit.toString() + "\" instead of \"" + stringValue + "\"",
				unit.toString().equals(stringValue));
	}
}