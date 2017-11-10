/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.area.*;

public class AreaCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromDunamsToSquarefeet() {
		checkCastedValue(Dunams.one().castTo(SquareFeet.class), new SquareFeet(10763.910416709725));
	}

	@Test
	public void testCastFromDunamsToSquarekilometers() {
		checkCastedValue(Dunams.one().castTo(SquareKilometers.class), new SquareKilometers(0.001));
	}

	@Test
	public void testCastFromDunamsToSquaremeters() {
		checkCastedValue(Dunams.one().castTo(SquareMeters.class), new SquareMeters(1000.0));
	}

	@Test
	public void testCastFromDunamsToSquareyards() {
		checkCastedValue(Dunams.one().castTo(SquareYards.class), new SquareYards(1195.9900463010806));
	}

	@Test
	public void testCastFromSquarefeetToDunams() {
		checkCastedValue(SquareFeet.one().castTo(Dunams.class), new Dunams(9.290304E-5));
	}

	@Test
	public void testCastFromSquarefeetToSquarekilometers() {
		checkCastedValue(SquareFeet.one().castTo(SquareKilometers.class), new SquareKilometers(9.290304E-8));
	}

	@Test
	public void testCastFromSquarefeetToSquaremeters() {
		checkCastedValue(SquareFeet.one().castTo(SquareMeters.class), new SquareMeters(0.09290304));
	}

	@Test
	public void testCastFromSquarefeetToSquareyards() {
		checkCastedValue(SquareFeet.one().castTo(SquareYards.class), new SquareYards(0.11111111111));
	}

	@Test
	public void testCastFromSquarekilometersToDunams() {
		checkCastedValue(SquareKilometers.one().castTo(Dunams.class), new Dunams(1000.0));
	}

	@Test
	public void testCastFromSquarekilometersToSquarefeet() {
		checkCastedValue(SquareKilometers.one().castTo(SquareFeet.class), new SquareFeet(1.0763910416709725E7));
	}

	@Test
	public void testCastFromSquarekilometersToSquaremeters() {
		checkCastedValue(SquareKilometers.one().castTo(SquareMeters.class), new SquareMeters(1000000.0));
	}

	@Test
	public void testCastFromSquarekilometersToSquareyards() {
		checkCastedValue(SquareKilometers.one().castTo(SquareYards.class), new SquareYards(1195990.0463010806));
	}

	@Test
	public void testCastFromSquaremetersToDunams() {
		checkCastedValue(SquareMeters.one().castTo(Dunams.class), new Dunams(0.001));
	}

	@Test
	public void testCastFromSquaremetersToSquarefeet() {
		checkCastedValue(SquareMeters.one().castTo(SquareFeet.class), new SquareFeet(10.763910416709725));
	}

	@Test
	public void testCastFromSquaremetersToSquarekilometers() {
		checkCastedValue(SquareMeters.one().castTo(SquareKilometers.class), new SquareKilometers(1.0E-6));
	}

	@Test
	public void testCastFromSquaremetersToSquareyards() {
		checkCastedValue(SquareMeters.one().castTo(SquareYards.class), new SquareYards(1.1959900463010806));
	}

	@Test
	public void testCastFromSquareyardsToDunams() {
		checkCastedValue(SquareYards.one().castTo(Dunams.class), new Dunams(8.3612736E-4));
	}

	@Test
	public void testCastFromSquareyardsToSquarefeet() {
		checkCastedValue(SquareYards.one().castTo(SquareFeet.class), new SquareFeet(9.0));
	}

	@Test
	public void testCastFromSquareyardsToSquarekilometers() {
		checkCastedValue(SquareYards.one().castTo(SquareKilometers.class), new SquareKilometers(8.3612736E-7));
	}

	@Test
	public void testCastFromSquareyardsToSquaremeters() {
		checkCastedValue(SquareYards.one().castTo(SquareMeters.class), new SquareMeters(0.83612736));
	}


}