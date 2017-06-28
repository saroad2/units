/*
 * test_length_units.cc
 *
 *  Created on: Jun 28, 2017
 *      Author: sagis
 */

#include "units/include/length_units.h"
#include "units/main/helpers.h"

#include <gtest/gtest.h>

using namespace testing;
using namespace units::length;
using units::units_cast;

#include <iostream>
using std::cout;
using std::endl;

class TestLengthUnitsConversions : public TestUnitsConversions
{
};

TEST_F(TestLengthUnitsConversions, inches_to_meters)
{
	maxError = 1e-10;
	check_conversions<Inches, Meters>(0.025399999922784, 39.3700788);
}

TEST_F(TestLengthUnitsConversions, feet_to_meters)
{
	maxError = 1e-10;
	check_conversions<Feet, Meters>(0.304799999536704, 3.2808399);
}

TEST_F(TestLengthUnitsConversions, yards_to_meters)
{
	maxError = 1e-10;
	check_conversions<Yards, Meters>(0.91439999861011201, 1.0936133);
}

TEST_F(TestLengthUnitsConversions, micrometer_to_meters)
{
	maxError = 1e-10;
	check_conversions<Micrometers, Meters>(1e-6, 1e+6);
}

TEST_F(TestLengthUnitsConversions, millimeter_to_meters)
{
	maxError = 1e-10;
	check_conversions<Millimeters, Meters>(1e-3, 1e+3);
}

TEST_F(TestLengthUnitsConversions, centimeter_to_meters)
{
	maxError = 1e-10;
	check_conversions<Centimeters, Meters>(1e-2, 1e+2);
}

TEST_F(TestLengthUnitsConversions, kilometer_to_meters)
{
	maxError = 1e-10;
	check_conversions<Kilometers, Meters>(1e+3, 1e-3);
}

TEST_F(TestLengthUnitsConversions, feet_to_inches)
{
	maxError = 1e-10;
	check_conversions<Feet, Inches>(12, 1.0 / 12);
}

TEST_F(TestLengthUnitsConversions, yards_to_inches)
{
	maxError = 1e-10;
	check_conversions<Yards, Inches>(36, 1.0 /36);
}


TEST_F(TestLengthUnitsConversions, micrometer_to_inches)
{
	maxError = 1e-4;
	check_conversions<Micrometers, Inches>(3.93700788e-05, 25399.999922784);
}

TEST_F(TestLengthUnitsConversions, millimeter_to_inches)
{
	maxError = 1e-7;
	check_conversions<Millimeters, Inches>(0.0393700788, 25.399999922784);
}

TEST_F(TestLengthUnitsConversions, centimeter_to_inches)
{
	maxError = 1e-8;
	check_conversions<Centimeters, Inches>(0.393700788, 2.5399999922784);
}

TEST_F(TestLengthUnitsConversions, kilometer_to_inches)
{
	maxError = 1e-10;
	check_conversions<Kilometers, Inches>(39370.0788, 2.5399999922784e-5);
}

TEST_F(TestLengthUnitsConversions, yards_to_feet)
{
	maxError = 1e-10;
	check_conversions<Yards, Feet>(3, 1.0 /3);
}

TEST_F(TestLengthUnitsConversions, micrometer_to_feet)
{
	maxError = 1e-10;
	check_conversions<Micrometers, Feet>(3.2808399e-6, 304799.999536704);
}

TEST_F(TestLengthUnitsConversions, millimeter_to_feet)
{
	maxError = 1e-10;
	check_conversions<Millimeters, Feet>(3.2808399e-3, 304.799999536704);
}

TEST_F(TestLengthUnitsConversions, centimeter_to_feet)
{
	maxError = 1e-10;
	check_conversions<Centimeters, Feet>(3.2808399e-2, 30.4799999536704);
}

TEST_F(TestLengthUnitsConversions, kilometer_to_feet)
{
	maxError = 1e-10;
	check_conversions<Kilometers, Feet>(3280.8399, 3.04799999536704e-4);
}

TEST_F(TestLengthUnitsConversions, micrometer_to_yards)
{
	maxError = 1e-10;
	check_conversions<Micrometers, Yards>(1.0936133e-6, 914399.99861011201);
}

TEST_F(TestLengthUnitsConversions, millimeter_to_yards)
{
	maxError = 1e-10;
	check_conversions<Millimeters, Yards>(1.0936133e-3, 914.39999861011201);
}

TEST_F(TestLengthUnitsConversions, centimeter_to_yards)
{
	maxError = 1e-10;
	check_conversions<Centimeters, Yards>(1.0936133e-2, 91.439999861011201);
}

TEST_F(TestLengthUnitsConversions, kilometer_to_yards)
{
	maxError = 1e-10;
	check_conversions<Kilometers, Yards>(1093.6133, 9.1439999861011201e-4);
}

TEST_F(TestLengthUnitsConversions, millimeter_to_micrometers)
{
	maxError = 1e-10;
	check_conversions<Millimeters, Micrometers>(1e+3, 1e-3);
}

TEST_F(TestLengthUnitsConversions, centimeter_to_micrometers)
{
	maxError = 1e-10;
	check_conversions<Centimeters, Micrometers>(1e+4, 1e-4);
}

TEST_F(TestLengthUnitsConversions, kilometer_to_micrometers)
{
	maxError = 1e-10;
	check_conversions<Kilometers, Micrometers>(1e+9, 1e-9);
}

TEST_F(TestLengthUnitsConversions, centimeter_to_millimeters)
{
	maxError = 1e-10;
	check_conversions<Centimeters, Millimeters>(10, 0.1);
}

TEST_F(TestLengthUnitsConversions, kilometer_to_millimeters)
{
	maxError = 1e-10;
	check_conversions<Kilometers, Millimeters>(1e+6, 1e-6);
}

TEST_F(TestLengthUnitsConversions, kilometer_to_centimeter)
{
	maxError = 1e-10;
	check_conversions<Kilometers, Centimeters>(1e+5, 1e-5);
}

// ============================================================

class TestLengthUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestLengthUnitsPrintings, print_inches)
{
	check_print<Inches>("inches");
}

TEST_F(TestLengthUnitsPrintings, print_feet)
{
	check_print<Feet>("feet");
}

TEST_F(TestLengthUnitsPrintings, print_yards)
{
	check_print<Yards>("yards");
}

TEST_F(TestLengthUnitsPrintings, print_meters)
{
	check_print<Meters>("meters");
}

TEST_F(TestLengthUnitsPrintings, print_micrometers)
{
	check_print<Micrometers>("micrometers");
}

TEST_F(TestLengthUnitsPrintings, print_millimeters)
{
	check_print<Millimeters>("millimeters");
}

TEST_F(TestLengthUnitsPrintings, print_centimeters)
{
	check_print<Centimeters>("centimeters");
}

TEST_F(TestLengthUnitsPrintings, print_kilometers)
{
	check_print<Kilometers>("kilometers");
}
