/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#include <units/cases.h>
#include <units/length_units.h>

#include <gtest/gtest.h>

using namespace testing;
using namespace units::length;

class TestLengthUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestLengthUnitsPrintings, print_meters)
{
	check_print<Meters>("meters");
}
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
TEST_F(TestLengthUnitsPrintings, print_statute_miles)
{
	check_print<StatuteMiles>("statute miles");
}
TEST_F(TestLengthUnitsPrintings, print_nautical_miles)
{
	check_print<NauticalMiles>("nautical miles");
}
TEST_F(TestLengthUnitsPrintings, print_geographical_miles)
{
	check_print<GeographicalMiles>("geographical miles");
}
TEST_F(TestLengthUnitsPrintings, print_degrees_of_latitude)
{
	check_print<DegreesOfLatitude>("degrees of latitude");
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

TEST_LENGTH_USER_DEFINE_LITERALS(Meters, meters);
TEST_LENGTH_USER_DEFINE_LITERALS(Inches, inches);
TEST_LENGTH_USER_DEFINE_LITERALS(Feet, feet);
TEST_LENGTH_USER_DEFINE_LITERALS(Yards, yards);
TEST_LENGTH_USER_DEFINE_LITERALS(StatuteMiles, statute_miles);
TEST_LENGTH_USER_DEFINE_LITERALS(NauticalMiles, nautical_miles);
TEST_LENGTH_USER_DEFINE_LITERALS(GeographicalMiles, geographical_miles);
TEST_LENGTH_USER_DEFINE_LITERALS(DegreesOfLatitude, degrees_of_latitude);
TEST_LENGTH_USER_DEFINE_LITERALS(Micrometers, micrometers);
TEST_LENGTH_USER_DEFINE_LITERALS(Millimeters, millimeters);
TEST_LENGTH_USER_DEFINE_LITERALS(Centimeters, centimeters);
TEST_LENGTH_USER_DEFINE_LITERALS(Kilometers, kilometers);
