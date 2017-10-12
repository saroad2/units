/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.force.*;

public class ForceCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromDynesToNewtons() {
		checkCastedValue(Newtons.castFrom(Dynes.one()).value(), 1.0E-5);
	}

	@Test
	public void testCastFromNewtonsToDynes() {
		checkCastedValue(Dynes.castFrom(Newtons.one()).value(), 100000.0);
	}


}