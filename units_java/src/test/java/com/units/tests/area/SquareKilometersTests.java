/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.tests.area;

import org.junit.Test;

import com.units.area.SquareKilometers;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SquareKilometersTests {

	public void assertSameValue(double value1, double value2) {
		assertTrue("unit value is " + value1 + " instead of " + value2, value1 == value2);
	}

	@Test
	public void testConstructor() {
		double actualValue = 3.1;
		assertSameValue(new SquareKilometers(actualValue).value(), actualValue);
	}

	@Test
	public void testZero() {
		SquareKilometers zero = SquareKilometers.zero();
		assertSameValue(zero.value(), 0);
	}

	@Test
	public void testOne() {
		SquareKilometers one = SquareKilometers.one();
		assertSameValue(one.value(), 1);
	}

	@Test
	public void testEqualsSuccess() {
		double actualValue = 3.1;
		assertTrue("two units are not equal, even though thet have the same value",
				new SquareKilometers(actualValue).equals(new SquareKilometers(actualValue)));
	}

	@Test
	public void testEqualsNullFails() {
		double actualValue = 3.1;
		assertFalse("two units are equal, even though one of the is null", new SquareKilometers(actualValue).equals(null));
	}

	@Test
	public void testEqualsOtherWithDifferemtValueFail() {
		double value1 = 3.1;
		double value2 = 3.0;
		assertFalse("two units are equal, even though thet have the different values",
				new SquareKilometers(value1).equals(new SquareKilometers(value2)));
	}

	@Test
	public void testPlus() {
		double value1 = 3.1;
		double value2 = 2.6;
		double resultValue = 5.7;

		SquareKilometers unit1 = new SquareKilometers(value1);
		SquareKilometers unit2 = new SquareKilometers(value2);
		SquareKilometers result = unit1.plus(unit2);

		assertSameValue(unit1.value(), value1);
		assertSameValue(unit2.value(), value2);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testMinus() {
		double value1 = 3.1;
		double value2 = 2.6;
		double resultValue = 0.5;

		SquareKilometers unit1 = new SquareKilometers(value1);
		SquareKilometers unit2 = new SquareKilometers(value2);
		SquareKilometers result = unit1.minus(unit2);

		assertSameValue(unit1.value(), value1);
		assertSameValue(unit2.value(), value2);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testopposite() {
		double value = 3.1;

		SquareKilometers unit = new SquareKilometers(value);
		SquareKilometers result = unit.opposite();

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), -value);
	}

	@Test
	public void testMultiplyByScalar() {
		double value = 3.1;
		double scalar = 5;
		double resultValue = 15.5;

		SquareKilometers unit = new SquareKilometers(value);
		SquareKilometers result = unit.multiplyByScalar(scalar);

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testDivideByScalar() {
		double value = 3.1;
		double scalar = 5;
		double resultValue = 0.62;

		SquareKilometers unit = new SquareKilometers(value);
		SquareKilometers result = unit.divideByScalar(scalar);

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testToString() {
		double value = 3.1;
		String stringValue = "3.1 kilometers^2";

		SquareKilometers unit = new SquareKilometers(value);
		assertTrue("string value is \"" + unit.toString() + "\" instead of \"" + stringValue + "\"",
				unit.toString().equals(stringValue));
	}
}