/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.tests.speed;

import org.junit.Test;

import com.units.speed.Knots;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class KnotsTests {

	public void assertSameValue(double value1, double value2) {
		assertTrue("unit value is " + value1 + " instead of " + value2, value1 == value2);
	}

	@Test
	public void testConstructor() {
		double actualValue = 3.1;
		assertSameValue(new Knots(actualValue).value(), actualValue);
	}

	@Test
	public void testZero() {
		Knots zero = Knots.zero();
		assertSameValue(zero.value(), 0);
	}

	@Test
	public void testOne() {
		Knots one = Knots.one();
		assertSameValue(one.value(), 1);
	}

	@Test
	public void testEqualsSuccess() {
		double actualValue = 3.1;
		assertTrue("two units are not equal, even though thet have the same value",
				new Knots(actualValue).equals(new Knots(actualValue)));
	}

	@Test
	public void testEqualsNullFails() {
		double actualValue = 3.1;
		assertFalse("two units are equal, even though one of the is null", new Knots(actualValue).equals(null));
	}

	@Test
	public void testEqualsOtherWithDifferemtValueFail() {
		double value1 = 3.1;
		double value2 = 3.0;
		assertFalse("two units are equal, even though thet have the different values",
				new Knots(value1).equals(new Knots(value2)));
	}

	@Test
	public void testPlus() {
		double value1 = 3.1;
		double value2 = 2.6;
		double resultValue = 5.7;

		Knots unit1 = new Knots(value1);
		Knots unit2 = new Knots(value2);
		Knots result = unit1.plus(unit2);

		assertSameValue(unit1.value(), value1);
		assertSameValue(unit2.value(), value2);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testMinus() {
		double value1 = 3.1;
		double value2 = 2.6;
		double resultValue = 0.5;

		Knots unit1 = new Knots(value1);
		Knots unit2 = new Knots(value2);
		Knots result = unit1.minus(unit2);

		assertSameValue(unit1.value(), value1);
		assertSameValue(unit2.value(), value2);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testopposite() {
		double value = 3.1;

		Knots unit = new Knots(value);
		Knots result = unit.opposite();

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), -value);
	}

	@Test
	public void testMultiplyByScalar() {
		double value = 3.1;
		double scalar = 5;
		double resultValue = 15.5;

		Knots unit = new Knots(value);
		Knots result = unit.multiplyByScalar(scalar);

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testDivideByScalar() {
		double value = 3.1;
		double scalar = 5;
		double resultValue = 0.62;

		Knots unit = new Knots(value);
		Knots result = unit.divideByScalar(scalar);

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testToString() {
		double value = 3.1;
		String stringValue = "3.1 knots";

		Knots unit = new Knots(value);
		assertTrue("string value is \"" + unit.toString() + "\" instead of \"" + stringValue + "\"",
				unit.toString().equals(stringValue));
	}
}