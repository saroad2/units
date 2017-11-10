/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.density.*;

public class DensityCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromKilogramsperliterToKilogramspercubicmeter() {
		checkCastedValue(KilogramsPerLiter.one().castTo(KilogramsPerCubicMeter.class), new KilogramsPerCubicMeter(1000.0));
	}

	@Test
	public void testCastFromKilogramspercubicmeterToKilogramsperliter() {
		checkCastedValue(KilogramsPerCubicMeter.one().castTo(KilogramsPerLiter.class), new KilogramsPerLiter(0.001));
	}


}