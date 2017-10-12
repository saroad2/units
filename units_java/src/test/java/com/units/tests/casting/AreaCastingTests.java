/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.area.*;

public class AreaCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromDunamsToSquarefeet() {
		checkCastedValue(SquareFeet.castFrom(Dunams.one()).value(), 10763.910416709725);
	}

	@Test
	public void testCastFromDunamsToSquarekilometers() {
		checkCastedValue(SquareKilometers.castFrom(Dunams.one()).value(), 0.001);
	}

	@Test
	public void testCastFromDunamsToSquaremeters() {
		checkCastedValue(SquareMeters.castFrom(Dunams.one()).value(), 1000.0);
	}

	@Test
	public void testCastFromDunamsToSquareyards() {
		checkCastedValue(SquareYards.castFrom(Dunams.one()).value(), 1195.9900463010806);
	}

	@Test
	public void testCastFromSquarefeetToDunams() {
		checkCastedValue(Dunams.castFrom(SquareFeet.one()).value(), 9.290304E-5);
	}

	@Test
	public void testCastFromSquarefeetToSquarekilometers() {
		checkCastedValue(SquareKilometers.castFrom(SquareFeet.one()).value(), 9.290304E-8);
	}

	@Test
	public void testCastFromSquarefeetToSquaremeters() {
		checkCastedValue(SquareMeters.castFrom(SquareFeet.one()).value(), 0.09290304);
	}

	@Test
	public void testCastFromSquarefeetToSquareyards() {
		checkCastedValue(SquareYards.castFrom(SquareFeet.one()).value(), 0.11111111111);
	}

	@Test
	public void testCastFromSquarekilometersToDunams() {
		checkCastedValue(Dunams.castFrom(SquareKilometers.one()).value(), 1000.0);
	}

	@Test
	public void testCastFromSquarekilometersToSquarefeet() {
		checkCastedValue(SquareFeet.castFrom(SquareKilometers.one()).value(), 1.0763910416709725E7);
	}

	@Test
	public void testCastFromSquarekilometersToSquaremeters() {
		checkCastedValue(SquareMeters.castFrom(SquareKilometers.one()).value(), 1000000.0);
	}

	@Test
	public void testCastFromSquarekilometersToSquareyards() {
		checkCastedValue(SquareYards.castFrom(SquareKilometers.one()).value(), 1195990.0463010806);
	}

	@Test
	public void testCastFromSquaremetersToDunams() {
		checkCastedValue(Dunams.castFrom(SquareMeters.one()).value(), 0.001);
	}

	@Test
	public void testCastFromSquaremetersToSquarefeet() {
		checkCastedValue(SquareFeet.castFrom(SquareMeters.one()).value(), 10.763910416709725);
	}

	@Test
	public void testCastFromSquaremetersToSquarekilometers() {
		checkCastedValue(SquareKilometers.castFrom(SquareMeters.one()).value(), 1.0E-6);
	}

	@Test
	public void testCastFromSquaremetersToSquareyards() {
		checkCastedValue(SquareYards.castFrom(SquareMeters.one()).value(), 1.1959900463010806);
	}

	@Test
	public void testCastFromSquareyardsToDunams() {
		checkCastedValue(Dunams.castFrom(SquareYards.one()).value(), 8.3612736E-4);
	}

	@Test
	public void testCastFromSquareyardsToSquarefeet() {
		checkCastedValue(SquareFeet.castFrom(SquareYards.one()).value(), 9.0);
	}

	@Test
	public void testCastFromSquareyardsToSquarekilometers() {
		checkCastedValue(SquareKilometers.castFrom(SquareYards.one()).value(), 8.3612736E-7);
	}

	@Test
	public void testCastFromSquareyardsToSquaremeters() {
		checkCastedValue(SquareMeters.castFrom(SquareYards.one()).value(), 0.83612736);
	}


}