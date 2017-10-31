/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.tests.area;

import org.junit.Test;

import com.units.area.SquareYards;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SquareYardsTests {

	public void assertSameValue(double value1, double value2) {
		assertTrue("unit value is " + value1 + " instead of " + value2, value1 == value2);
	}

	@Test
	public void testConstructor() {
		double actualValue = 3.1;
		assertSameValue(new SquareYards(actualValue).value(), actualValue);
	}

	@Test
	public void testZero() {
		SquareYards zero = SquareYards.zero();
		assertSameValue(zero.value(), 0);
	}

	@Test
	public void testOne() {
		SquareYards one = SquareYards.one();
		assertSameValue(one.value(), 1);
	}

	@Test
	public void testComparisonToSmallerValue() {
		SquareYards unit = new SquareYards(3.1);
		SquareYards comparedUnit = new SquareYards(3.0);
		assertFalse(unit.lessThan(comparedUnit));
		assertFalse(unit.lessThanOrEquals(comparedUnit));
		assertFalse(unit.equals(comparedUnit));
		assertTrue(unit.greaterThan(comparedUnit));
		assertTrue(unit.greaterThanOrEquals(comparedUnit));
	}
	
	@Test
	public void testComparisonToEqualValue() {
		SquareYards unit = new SquareYards(3.1);
		SquareYards comparedUnit = new SquareYards(3.1);
		assertFalse(unit.lessThan(comparedUnit));
		assertTrue(unit.lessThanOrEquals(comparedUnit));
		assertTrue(unit.equals(comparedUnit));
		assertFalse(unit.greaterThan(comparedUnit));
		assertTrue(unit.greaterThanOrEquals(comparedUnit));
	}
	
	@Test
	public void testComparisonToBiggerValue() {
		SquareYards unit = new SquareYards(3.1);
		SquareYards comparedUnit = new SquareYards(3.2);
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
					new SquareYards(actualValue).equals(null));
	}

	@Test
	public void testPlus() {
		double value1 = 3.1;
		double value2 = 2.6;
		double resultValue = 5.7;

		SquareYards unit1 = new SquareYards(value1);
		SquareYards unit2 = new SquareYards(value2);
		SquareYards result = unit1.plus(unit2);

		assertSameValue(unit1.value(), value1);
		assertSameValue(unit2.value(), value2);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testMinus() {
		double value1 = 3.1;
		double value2 = 2.6;
		double resultValue = 0.5;

		SquareYards unit1 = new SquareYards(value1);
		SquareYards unit2 = new SquareYards(value2);
		SquareYards result = unit1.minus(unit2);

		assertSameValue(unit1.value(), value1);
		assertSameValue(unit2.value(), value2);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testOpposite() {
		double value = 3.1;

		SquareYards unit = new SquareYards(value);
		SquareYards result = unit.opposite();

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), -value);
	}

	@Test
	public void testMultiplyByScalar() {
		double value = 3.1;
		double scalar = 5;
		double resultValue = 15.5;

		SquareYards unit = new SquareYards(value);
		SquareYards result = unit.multiplyByScalar(scalar);

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testDivideByScalar() {
		double value = 3.1;
		double scalar = 5;
		double resultValue = 0.62;

		SquareYards unit = new SquareYards(value);
		SquareYards result = unit.divideByScalar(scalar);

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testToString() {
		double value = 3.1;
		String stringValue = "3.1 yards^2";

		SquareYards unit = new SquareYards(value);
		assertTrue("string value is \"" + unit.toString() + "\" instead of \"" + stringValue + "\"",
				unit.toString().equals(stringValue));
	}
}