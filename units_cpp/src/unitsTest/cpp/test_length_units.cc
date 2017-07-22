/*
 * test_length_units.cc
 *
 *  Created on: Jun 28, 2017
 *      Author: sagis
 */

#include "cases.h"
#include "length_units.h"

using namespace units::length;

class TestLengthUnitsConversions : public TestUnitsConversions
{
};

TEST_F(TestLengthUnitsConversions, inches_to_meters)
{
	maxError = 1e-10;
	check_conversions<Inches, Meters>(0.0254, 39.370078740157481);
}

TEST_F(TestLengthUnitsConversions, feet_to_meters)
{
	maxError = 1e-10;
	check_conversions<Feet, Meters>(0.3048, 3.2808398950131239);
}

TEST_F(TestLengthUnitsConversions, yards_to_meters)
{
	maxError = 1e-10;
	check_conversions<Yards, Meters>(0.9144, 1.093613298337708);
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
	maxError = 1e-7;
	check_conversions<Feet, Inches>(12, 1.0 / 12);
}

TEST_F(TestLengthUnitsConversions, yards_to_inches)
{
	maxError = 1e-6;
	check_conversions<Yards, Inches>(36, 1.0 /36);
}


TEST_F(TestLengthUnitsConversions, micrometer_to_inches)
{
	maxError = 1e-10;
	check_conversions<Micrometers, Inches>(3.93700788e-05, 25400);
}

TEST_F(TestLengthUnitsConversions, millimeter_to_inches)
{
	maxError = 1e-10;
	check_conversions<Millimeters, Inches>(0.03937007874015748, 25.4);
}

TEST_F(TestLengthUnitsConversions, centimeter_to_inches)
{
	maxError = 1e-10;
	check_conversions<Centimeters, Inches>(0.3937007874015748, 2.54);
}

TEST_F(TestLengthUnitsConversions, kilometer_to_inches)
{
	maxError = 1e-10;
	check_conversions<Kilometers, Inches>(39370.07874015748, 2.54e-5);
}

TEST_F(TestLengthUnitsConversions, yards_to_feet)
{
	maxError = 1e-10;
	check_conversions<Yards, Feet>(3, 1.0 /3);
}

TEST_F(TestLengthUnitsConversions, micrometer_to_feet)
{
	maxError = 1e-10;
	check_conversions<Micrometers, Feet>(3.28084e-6, 304800);
}

TEST_F(TestLengthUnitsConversions, millimeter_to_feet)
{
	maxError = 1e-10;
	check_conversions<Millimeters, Feet>(0.0032808398950131237, 304.8);
}

TEST_F(TestLengthUnitsConversions, centimeter_to_feet)
{
	maxError = 1e-10;
	check_conversions<Centimeters, Feet>(0.032808398950131237, 30.48);
}

TEST_F(TestLengthUnitsConversions, kilometer_to_feet)
{
	maxError = 1e-10;
	check_conversions<Kilometers, Feet>(3280.8398950131237, 3.048e-4);
}

TEST_F(TestLengthUnitsConversions, micrometer_to_yards)
{
	maxError = 1e-9;
	check_conversions<Micrometers, Yards>(1.0936133e-6, 914400);
}

TEST_F(TestLengthUnitsConversions, millimeter_to_yards)
{
	maxError = 1e-10;
	check_conversions<Millimeters, Yards>(1.0936133e-3, 914.4);
}

TEST_F(TestLengthUnitsConversions, centimeter_to_yards)
{
	maxError = 1e-10;
	check_conversions<Centimeters, Yards>(1.0936133e-2, 91.44);
}

TEST_F(TestLengthUnitsConversions, kilometer_to_yards)
{
	maxError = 1e-10;
	check_conversions<Kilometers, Yards>(1093.6132983377079, 9.144e-4);
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

// ============================================================

#define TEST_LENGTH_USER_DEFINE_LITERALS(Name, name) \
		TEST_USER_DEFINES_LITERALS(Length, Name, name);

TEST_LENGTH_USER_DEFINE_LITERALS(Inches, inches);
TEST_LENGTH_USER_DEFINE_LITERALS(Feet, feet);
TEST_LENGTH_USER_DEFINE_LITERALS(Yards, yards);
TEST_LENGTH_USER_DEFINE_LITERALS(Meters, meters);
TEST_LENGTH_USER_DEFINE_LITERALS(Micrometers, micrometers);
TEST_LENGTH_USER_DEFINE_LITERALS(Millimeters, millimeters);
TEST_LENGTH_USER_DEFINE_LITERALS(Centimeters, centimeters);
TEST_LENGTH_USER_DEFINE_LITERALS(Kilometers, kilometers);
