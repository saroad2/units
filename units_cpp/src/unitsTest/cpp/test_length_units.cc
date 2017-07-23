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

TEST_F(TestLengthUnitsConversions, statute_miles_to_meters)
{
	maxError = 1e-10;
	check_conversions<StatuteMiles, Meters>(621.371192237, 0.001609344);
}

TEST_F(TestLengthUnitsConversions, nautical_miles_to_meters)
{
	maxError = 1e-10;
	check_conversions<NauticalMiles, Meters>(1852, 1.0 / 1852);
}

TEST_F(TestLengthUnitsConversions, geographical_miles_to_meters)
{
	maxError = 1e-10;
	check_conversions<GeographicalMiles, Meters>(1855.3248, 0.00053898918399624687);
}

TEST_F(TestLengthUnitsConversions, degrees_of_latitude_to_meters)
{
	maxError = 1e-10;
	check_conversions<DegreesOfLatitude, Meters>(111319.488,  8.9831530666041137e-06);
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

TEST_F(TestLengthUnitsConversions, statute_miles_to_inches)
{
	maxError = 1e-10;
	check_conversions<StatuteMiles, Inches>(24463.432765236219, 4.0877337600021975e-05);
}

TEST_F(TestLengthUnitsConversions, nautical_miles_to_inches)
{
	maxError = 1e-10;
	check_conversions<NauticalMiles, Inches>(72913.385826771657, 1.3714902807775378e-05);
}

TEST_F(TestLengthUnitsConversions, geographical_miles_to_inches)
{
	maxError = 1e-10;
	check_conversions<GeographicalMiles, Inches>(73044.283464566935, 1.369032527350467e-05);
}

TEST_F(TestLengthUnitsConversions, degrees_of_latitude_to_inches)
{
	maxError = 1e-10;
	check_conversions<DegreesOfLatitude, Inches>(4382657.0078740167, 2.2817208789174449e-07);
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

TEST_F(TestLengthUnitsConversions, statute_miles_to_feet)
{
	maxError = 1e-10;
	check_conversions<StatuteMiles, Feet>(2038.6193971030184, 0.0004905280512002636);
}

TEST_F(TestLengthUnitsConversions, nautical_miles_to_feet)
{
	maxError = 1e-10;
	check_conversions<NauticalMiles, Feet>(6076.1154855643053, 0.00016457883369330452);
}

TEST_F(TestLengthUnitsConversions, geographical_miles_to_feet)
{
	maxError = 1e-10;
	check_conversions<GeographicalMiles, Feet>(6087.0236220472452, 0.00016428390328205602);
}

TEST_F(TestLengthUnitsConversions, degrees_of_latitude_to_feet)
{
	maxError = 1e-10;
	check_conversions<DegreesOfLatitude, Feet>(365221.41732283472, 2.7380650547009335e-06);
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

TEST_F(TestLengthUnitsConversions, statute_miles_to_yards)
{
	maxError = 1e-10;
	check_conversions<StatuteMiles, Yards>(679.53979903433947, 0.0014715841536007909);
}

TEST_F(TestLengthUnitsConversions, nautical_miles_to_yards)
{
	maxError = 1e-10;
	check_conversions<NauticalMiles, Yards>(2025.3718285214352, 0.0004937365010799135);
}

TEST_F(TestLengthUnitsConversions, geographical_miles_to_yards)
{
	maxError = 1e-10;
	check_conversions<GeographicalMiles, Yards>(2029.0078740157485, 0.00049285170984616805);
}

TEST_F(TestLengthUnitsConversions, degrees_of_latitude_to_yards)
{
	maxError = 1e-10;
	check_conversions<DegreesOfLatitude, Yards>(121740.47244094491, 8.2141951641028009e-06);
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

TEST_F(TestLengthUnitsConversions, statute_miles_to_micrometers)
{
	maxError = 1e-10;
	check_conversions<StatuteMiles, Micrometers>(621371192.237, 1.609344e-9);
}

TEST_F(TestLengthUnitsConversions, nautical_miles_to_micrometers)
{
	maxError = 1e-10;
	check_conversions<NauticalMiles, Micrometers>(1852000000, 5.3995680345572349e-10);
}

TEST_F(TestLengthUnitsConversions, geographical_miles_to_micrometers)
{
	maxError = 1e-6;
	check_conversions<GeographicalMiles, Micrometers>(1855324800, 5.3898918399624687e-10);
}

TEST_F(TestLengthUnitsConversions, degrees_of_latitude_to_micrometers)
{
	maxError = 1e-13;
	check_conversions<DegreesOfLatitude, Micrometers>(111319488000.0000152587890625, 8.9831530666041131e-12);
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

TEST_F(TestLengthUnitsConversions, statute_miles_to_millimeters)
{
	maxError = 1e-10;
	check_conversions<StatuteMiles, Millimeters>(621371.192237, 1.609344e-6);
}

TEST_F(TestLengthUnitsConversions, nautical_miles_to_millimeters)
{
	maxError = 1e-10;
	check_conversions<NauticalMiles, Millimeters>(1852000, 5.3995680345572349e-7);
}

TEST_F(TestLengthUnitsConversions, geographical_miles_to_millimeters)
{
	maxError = 1e-10;
	check_conversions<GeographicalMiles, Millimeters>(1855324.8, 5.3898918399624687e-7);
}

TEST_F(TestLengthUnitsConversions, degrees_of_latitude_to_millimeters)
{
	maxError = 1e-7;
	check_conversions<DegreesOfLatitude, Millimeters>(111319488, 8.9831530666041131e-9);
}

TEST_F(TestLengthUnitsConversions, kilometer_to_centimeter)
{
	maxError = 1e-10;
	check_conversions<Kilometers, Centimeters>(1e+5, 1e-5);
}

TEST_F(TestLengthUnitsConversions, statute_miles_to_centimeters)
{
	maxError = 1e-10;
	check_conversions<StatuteMiles, Centimeters>(62137.1192237, 1.609344e-5);
}

TEST_F(TestLengthUnitsConversions, nautical_miles_to_centimeters)
{
	maxError = 1e-10;
	check_conversions<NauticalMiles, Centimeters>(185200, 5.3995680345572349e-6);
}

TEST_F(TestLengthUnitsConversions, geographical_miles_to_centimeters)
{
	maxError = 1e-10;
	check_conversions<GeographicalMiles, Centimeters>(185532.48, 5.3898918399624687e-6);
}

TEST_F(TestLengthUnitsConversions, degrees_of_latitude_to_centimeters)
{
	maxError = 1e-10;
	check_conversions<DegreesOfLatitude, Centimeters>(11131948.8, 8.9831530666041131e-8);
}

TEST_F(TestLengthUnitsConversions, statute_miles_to_kilometers)
{
	maxError = 1e-10;
	check_conversions<StatuteMiles, Kilometers>(0.621371192237, 1.609344);
}

TEST_F(TestLengthUnitsConversions, nautical_miles_to_kilometers)
{
	maxError = 1e-10;
	check_conversions<NauticalMiles, Kilometers>(1.852, 0.53995680345572349);
}

TEST_F(TestLengthUnitsConversions, geographical_miles_to_kilometers)
{
	maxError = 1e-10;
	check_conversions<GeographicalMiles, Kilometers>(1.8553248, 0.53898918399624687);
}

TEST_F(TestLengthUnitsConversions, degrees_of_latitude_to_kilometers)
{
	maxError = 1e-10;
	check_conversions<DegreesOfLatitude, Kilometers>(111.319488, 8.9831530666041131e-3);
}

TEST_F(TestLengthUnitsConversions, nautical_miles_to_statute_miles)
{
	maxError = 1e-10;
	check_conversions<NauticalMiles, StatuteMiles>(2.9805050880016024, 0.33551360271976238);
}

TEST_F(TestLengthUnitsConversions, geographical_miles_to_statute_miles)
{
	maxError = 1e-10;
	check_conversions<GeographicalMiles, StatuteMiles>(2.985855834932805, 0.33491235186259566);
}

TEST_F(TestLengthUnitsConversions, degrees_of_latitude_to_statute_miles)
{
	maxError = 1e-10;
	check_conversions<DegreesOfLatitude, StatuteMiles>(179.15135009596833, 0.0055818725310432605);
}

TEST_F(TestLengthUnitsConversions, geographical_miles_to_nautical_miles)
{
	maxError = 1e-10;
	check_conversions<GeographicalMiles, NauticalMiles>(1.0017952483801296, 0.99820796876104922);
}

TEST_F(TestLengthUnitsConversions, degrees_of_latitude_to_nautical_miles)
{
	maxError = 1e-10;
	check_conversions<DegreesOfLatitude, NauticalMiles>(60.107714902807778, 0.01663679947935082);
}

TEST_F(TestLengthUnitsConversions, degrees_of_latitude_to_geographical_miles)
{
	maxError = 1e-10;
	check_conversions<DegreesOfLatitude, GeographicalMiles>(60, 1.0 / 60);
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
TEST_LENGTH_USER_DEFINE_LITERALS(StatuteMiles, statute_miles);
TEST_LENGTH_USER_DEFINE_LITERALS(NauticalMiles, nautical_miles);
TEST_LENGTH_USER_DEFINE_LITERALS(GeographicalMiles, geographical_miles);
TEST_LENGTH_USER_DEFINE_LITERALS(DegreesOfLatitude, degrees_of_latitude);
