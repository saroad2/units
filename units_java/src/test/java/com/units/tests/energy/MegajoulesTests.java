/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.tests.energy;

import org.junit.Test;

import com.units.energy.Megajoules;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class MegajoulesTests {

	public void assertSameValue(double value1, double value2) {
		assertTrue("unit value is " + value1 + " instead of " + value2, value1 == value2);
	}

	@Test
	public void testConstructor() {
		double actualValue = 3.1;
		assertSameValue(new Megajoules(actualValue).value(), actualValue);
	}

	@Test
	public void testZero() {
		Megajoules zero = Megajoules.zero();
		assertSameValue(zero.value(), 0);
	}

	@Test
	public void testOne() {
		Megajoules one = Megajoules.one();
		assertSameValue(one.value(), 1);
	}

	@Test
	public void testEqualsSuccess() {
		double actualValue = 3.1;
		assertTrue("two units are not equal, even though thet have the same value",
				new Megajoules(actualValue).equals(new Megajoules(actualValue)));
	}

	@Test
	public void testEqualsNullFails() {
		double actualValue = 3.1;
		assertFalse("two units are equal, even though one of the is null", new Megajoules(actualValue).equals(null));
	}

	@Test
	public void testEqualsOtherWithDifferemtValueFail() {
		double value1 = 3.1;
		double value2 = 3.0;
		assertFalse("two units are equal, even though thet have the different values",
				new Megajoules(value1).equals(new Megajoules(value2)));
	}

	@Test
	public void testPlus() {
		double value1 = 3.1;
		double value2 = 2.6;
		double resultValue = 5.7;

		Megajoules unit1 = new Megajoules(value1);
		Megajoules unit2 = new Megajoules(value2);
		Megajoules result = unit1.plus(unit2);

		assertSameValue(unit1.value(), value1);
		assertSameValue(unit2.value(), value2);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testMinus() {
		double value1 = 3.1;
		double value2 = 2.6;
		double resultValue = 0.5;

		Megajoules unit1 = new Megajoules(value1);
		Megajoules unit2 = new Megajoules(value2);
		Megajoules result = unit1.minus(unit2);

		assertSameValue(unit1.value(), value1);
		assertSameValue(unit2.value(), value2);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testopposite() {
		double value = 3.1;

		Megajoules unit = new Megajoules(value);
		Megajoules result = unit.opposite();

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), -value);
	}

	@Test
	public void testMultiplyByScalar() {
		double value = 3.1;
		double scalar = 5;
		double resultValue = 15.5;

		Megajoules unit = new Megajoules(value);
		Megajoules result = unit.multiplyByScalar(scalar);

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testDivideByScalar() {
		double value = 3.1;
		double scalar = 5;
		double resultValue = 0.62;

		Megajoules unit = new Megajoules(value);
		Megajoules result = unit.divideByScalar(scalar);

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testToString() {
		double value = 3.1;
		String stringValue = "3.1 megajoules";

		Megajoules unit = new Megajoules(value);
		assertTrue("string value is \"" + unit.toString() + "\" instead of \"" + stringValue + "\"",
				unit.toString().equals(stringValue));
	}
}