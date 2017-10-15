/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.area.*;

public class AreaCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromDunamsToSquarefeet() {
		checkCastedValue(Dunams.one().castTo(SquareFeet.class).value(), 10763.910416709725);
	}

	@Test
	public void testCastFromDunamsToSquarekilometers() {
		checkCastedValue(Dunams.one().castTo(SquareKilometers.class).value(), 0.001);
	}

	@Test
	public void testCastFromDunamsToSquaremeters() {
		checkCastedValue(Dunams.one().castTo(SquareMeters.class).value(), 1000.0);
	}

	@Test
	public void testCastFromDunamsToSquareyards() {
		checkCastedValue(Dunams.one().castTo(SquareYards.class).value(), 1195.9900463010806);
	}

	@Test
	public void testCastFromSquarefeetToDunams() {
		checkCastedValue(SquareFeet.one().castTo(Dunams.class).value(), 9.290304E-5);
	}

	@Test
	public void testCastFromSquarefeetToSquarekilometers() {
		checkCastedValue(SquareFeet.one().castTo(SquareKilometers.class).value(), 9.290304E-8);
	}

	@Test
	public void testCastFromSquarefeetToSquaremeters() {
		checkCastedValue(SquareFeet.one().castTo(SquareMeters.class).value(), 0.09290304);
	}

	@Test
	public void testCastFromSquarefeetToSquareyards() {
		checkCastedValue(SquareFeet.one().castTo(SquareYards.class).value(), 0.11111111111);
	}

	@Test
	public void testCastFromSquarekilometersToDunams() {
		checkCastedValue(SquareKilometers.one().castTo(Dunams.class).value(), 1000.0);
	}

	@Test
	public void testCastFromSquarekilometersToSquarefeet() {
		checkCastedValue(SquareKilometers.one().castTo(SquareFeet.class).value(), 1.0763910416709725E7);
	}

	@Test
	public void testCastFromSquarekilometersToSquaremeters() {
		checkCastedValue(SquareKilometers.one().castTo(SquareMeters.class).value(), 1000000.0);
	}

	@Test
	public void testCastFromSquarekilometersToSquareyards() {
		checkCastedValue(SquareKilometers.one().castTo(SquareYards.class).value(), 1195990.0463010806);
	}

	@Test
	public void testCastFromSquaremetersToDunams() {
		checkCastedValue(SquareMeters.one().castTo(Dunams.class).value(), 0.001);
	}

	@Test
	public void testCastFromSquaremetersToSquarefeet() {
		checkCastedValue(SquareMeters.one().castTo(SquareFeet.class).value(), 10.763910416709725);
	}

	@Test
	public void testCastFromSquaremetersToSquarekilometers() {
		checkCastedValue(SquareMeters.one().castTo(SquareKilometers.class).value(), 1.0E-6);
	}

	@Test
	public void testCastFromSquaremetersToSquareyards() {
		checkCastedValue(SquareMeters.one().castTo(SquareYards.class).value(), 1.1959900463010806);
	}

	@Test
	public void testCastFromSquareyardsToDunams() {
		checkCastedValue(SquareYards.one().castTo(Dunams.class).value(), 8.3612736E-4);
	}

	@Test
	public void testCastFromSquareyardsToSquarefeet() {
		checkCastedValue(SquareYards.one().castTo(SquareFeet.class).value(), 9.0);
	}

	@Test
	public void testCastFromSquareyardsToSquarekilometers() {
		checkCastedValue(SquareYards.one().castTo(SquareKilometers.class).value(), 8.3612736E-7);
	}

	@Test
	public void testCastFromSquareyardsToSquaremeters() {
		checkCastedValue(SquareYards.one().castTo(SquareMeters.class).value(), 0.83612736);
	}


}