/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.frequency.*;

public class FrequencyCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromHertzToKilohertz() {
		checkCastedValue(Hertz.one().castTo(Kilohertz.class), new Kilohertz(0.001));
	}

	@Test
	public void testCastFromHertzToMegahertz() {
		checkCastedValue(Hertz.one().castTo(Megahertz.class), new Megahertz(1.0E-6));
	}

	@Test
	public void testCastFromKilohertzToHertz() {
		checkCastedValue(Kilohertz.one().castTo(Hertz.class), new Hertz(1000.0));
	}

	@Test
	public void testCastFromKilohertzToMegahertz() {
		checkCastedValue(Kilohertz.one().castTo(Megahertz.class), new Megahertz(0.001));
	}

	@Test
	public void testCastFromMegahertzToHertz() {
		checkCastedValue(Megahertz.one().castTo(Hertz.class), new Hertz(1000000.0));
	}

	@Test
	public void testCastFromMegahertzToKilohertz() {
		checkCastedValue(Megahertz.one().castTo(Kilohertz.class), new Kilohertz(1000.0));
	}


}