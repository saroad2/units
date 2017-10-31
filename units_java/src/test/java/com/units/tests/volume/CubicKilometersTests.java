/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.tests.volume;

import org.junit.Test;

import com.units.volume.CubicKilometers;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class CubicKilometersTests {

	public void assertSameValue(double value1, double value2) {
		assertTrue("unit value is " + value1 + " instead of " + value2, value1 == value2);
	}

	@Test
	public void testConstructor() {
		double actualValue = 3.1;
		assertSameValue(new CubicKilometers(actualValue).value(), actualValue);
	}

	@Test
	public void testZero() {
		CubicKilometers zero = CubicKilometers.zero();
		assertSameValue(zero.value(), 0);
	}

	@Test
	public void testOne() {
		CubicKilometers one = CubicKilometers.one();
		assertSameValue(one.value(), 1);
	}

	@Test
	public void testComparisonToSmallerValue() {
		CubicKilometers unit = new CubicKilometers(3.1);
		CubicKilometers comparedUnit = new CubicKilometers(3.0);
		assertFalse(unit.lessThan(comparedUnit));
		assertFalse(unit.lessThanOrEquals(comparedUnit));
		assertFalse(unit.equals(comparedUnit));
		assertTrue(unit.greaterThan(comparedUnit));
		assertTrue(unit.greaterThanOrEquals(comparedUnit));
	}
	
	@Test
	public void testComparisonToEqualValue() {
		CubicKilometers unit = new CubicKilometers(3.1);
		CubicKilometers comparedUnit = new CubicKilometers(3.1);
		assertFalse(unit.lessThan(comparedUnit));
		assertTrue(unit.lessThanOrEquals(comparedUnit));
		assertTrue(unit.equals(comparedUnit));
		assertFalse(unit.greaterThan(comparedUnit));
		assertTrue(unit.greaterThanOrEquals(comparedUnit));
	}
	
	@Test
	public void testComparisonToBiggerValue() {
		CubicKilometers unit = new CubicKilometers(3.1);
		CubicKilometers comparedUnit = new CubicKilometers(3.2);
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
					new CubicKilometers(actualValue).equals(null));
	}

	@Test
	public void testPlus() {
		double value1 = 3.1;
		double value2 = 2.6;
		double resultValue = 5.7;

		CubicKilometers unit1 = new CubicKilometers(value1);
		CubicKilometers unit2 = new CubicKilometers(value2);
		CubicKilometers result = unit1.plus(unit2);

		assertSameValue(unit1.value(), value1);
		assertSameValue(unit2.value(), value2);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testMinus() {
		double value1 = 3.1;
		double value2 = 2.6;
		double resultValue = 0.5;

		CubicKilometers unit1 = new CubicKilometers(value1);
		CubicKilometers unit2 = new CubicKilometers(value2);
		CubicKilometers result = unit1.minus(unit2);

		assertSameValue(unit1.value(), value1);
		assertSameValue(unit2.value(), value2);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testOpposite() {
		double value = 3.1;

		CubicKilometers unit = new CubicKilometers(value);
		CubicKilometers result = unit.opposite();

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), -value);
	}

	@Test
	public void testMultiplyByScalar() {
		double value = 3.1;
		double scalar = 5;
		double resultValue = 15.5;

		CubicKilometers unit = new CubicKilometers(value);
		CubicKilometers result = unit.multiplyByScalar(scalar);

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testDivideByScalar() {
		double value = 3.1;
		double scalar = 5;
		double resultValue = 0.62;

		CubicKilometers unit = new CubicKilometers(value);
		CubicKilometers result = unit.divideByScalar(scalar);

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testToString() {
		double value = 3.1;
		String stringValue = "3.1 kilometers^3";

		CubicKilometers unit = new CubicKilometers(value);
		assertTrue("string value is \"" + unit.toString() + "\" instead of \"" + stringValue + "\"",
				unit.toString().equals(stringValue));
	}
}