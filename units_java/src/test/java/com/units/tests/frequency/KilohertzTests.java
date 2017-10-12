/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.tests.frequency;

import org.junit.Test;

import com.units.frequency.Kilohertz;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class KilohertzTests {

	public void assertSameValue(double value1, double value2) {
		assertTrue("unit value is " + value1 + " instead of " + value2, value1 == value2);
	}

	@Test
	public void testConstructor() {
		double actualValue = 3.1;
		assertSameValue(new Kilohertz(actualValue).value(), actualValue);
	}

	@Test
	public void testZero() {
		Kilohertz zero = Kilohertz.zero();
		assertSameValue(zero.value(), 0);
	}

	@Test
	public void testOne() {
		Kilohertz one = Kilohertz.one();
		assertSameValue(one.value(), 1);
	}

	@Test
	public void testEqualsSuccess() {
		double actualValue = 3.1;
		assertTrue("two units are not equal, even though thet have the same value",
				new Kilohertz(actualValue).equals(new Kilohertz(actualValue)));
	}

	@Test
	public void testEqualsNullFails() {
		double actualValue = 3.1;
		assertFalse("two units are equal, even though one of the is null", new Kilohertz(actualValue).equals(null));
	}

	@Test
	public void testEqualsOtherWithDifferemtValueFail() {
		double value1 = 3.1;
		double value2 = 3.0;
		assertFalse("two units are equal, even though thet have the different values",
				new Kilohertz(value1).equals(new Kilohertz(value2)));
	}

	@Test
	public void testPlus() {
		double value1 = 3.1;
		double value2 = 2.6;
		double resultValue = 5.7;

		Kilohertz unit1 = new Kilohertz(value1);
		Kilohertz unit2 = new Kilohertz(value2);
		Kilohertz result = unit1.plus(unit2);

		assertSameValue(unit1.value(), value1);
		assertSameValue(unit2.value(), value2);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testMinus() {
		double value1 = 3.1;
		double value2 = 2.6;
		double resultValue = 0.5;

		Kilohertz unit1 = new Kilohertz(value1);
		Kilohertz unit2 = new Kilohertz(value2);
		Kilohertz result = unit1.minus(unit2);

		assertSameValue(unit1.value(), value1);
		assertSameValue(unit2.value(), value2);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testopposite() {
		double value = 3.1;

		Kilohertz unit = new Kilohertz(value);
		Kilohertz result = unit.opposite();

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), -value);
	}

	@Test
	public void testMultiplyByScalar() {
		double value = 3.1;
		double scalar = 5;
		double resultValue = 15.5;

		Kilohertz unit = new Kilohertz(value);
		Kilohertz result = unit.multiplyByScalar(scalar);

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testDivideByScalar() {
		double value = 3.1;
		double scalar = 5;
		double resultValue = 0.62;

		Kilohertz unit = new Kilohertz(value);
		Kilohertz result = unit.divideByScalar(scalar);

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testToString() {
		double value = 3.1;
		String stringValue = "3.1 kilohertz";

		Kilohertz unit = new Kilohertz(value);
		assertTrue("string value is \"" + unit.toString() + "\" instead of \"" + stringValue + "\"",
				unit.toString().equals(stringValue));
	}
}