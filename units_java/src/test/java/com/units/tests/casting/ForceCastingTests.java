/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.force.*;

public class ForceCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromDynesToNewtons() {
		checkCastedValue(Dynes.one().castTo(Newtons.class), new Newtons(1.0E-5));
	}

	@Test
	public void testCastFromNewtonsToDynes() {
		checkCastedValue(Newtons.one().castTo(Dynes.class), new Dynes(100000.0));
	}


}