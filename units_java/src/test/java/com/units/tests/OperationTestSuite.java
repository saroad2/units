package com.units.tests;

import static org.junit.Assert.assertTrue;

import com.units.internal.NumericValue;

public class OperationTestSuite {
	
	protected <E extends NumericValue> void checkResult(E actual, E expected) {
		assertTrue(
			actual + " != " + expected,
			actual.almostEqualsValue(expected.value()));
	}
}
