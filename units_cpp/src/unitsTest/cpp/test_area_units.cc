/*
 * test_area_units.cc
 *
 *  Created on: Jun 30, 2017
 *      Author: sagis
 */

#include "cases.h"
#include <units/area_units.h>

using namespace units::area;

class TestAreaUnitsConversions : public TestUnitsConversions
{
};

TEST_F(TestAreaUnitsConversions, square_feet_to_square_meters)
{
	check_conversions<SquareFeet, SquareMeters>(0.09290304, 10.763910416709725);
}

TEST_F(TestAreaUnitsConversions, square_yards_to_square_meters)
{
	check_conversions<SquareYards, SquareMeters>(0.83612736, 1.1959900463010806);
}

TEST_F(TestAreaUnitsConversions, dunams_to_square_meters)
{
	check_conversions<Dunams, SquareMeters>(1e+3, 1e-3);
}

TEST_F(TestAreaUnitsConversions, square_kilometers_to_square_meters)
{
	check_conversions<SquareKilometers, SquareMeters>(1e+6, 1e-6);
}

TEST_F(TestAreaUnitsConversions, square_yards_to_square_feet)
{
	check_conversions<SquareYards, SquareFeet>(9, 0.11111111111);
}

TEST_F(TestAreaUnitsConversions, dunams_to_square_feet)
{
	check_conversions<Dunams, SquareFeet>(10763.910416709725, 9.290304e-5);
}

TEST_F(TestAreaUnitsConversions, square_kilometers_to_square_feet)
{
	check_conversions<SquareKilometers, SquareFeet>(10763910.416709725, 9.290304e-8);
}

TEST_F(TestAreaUnitsConversions, dunams_to_square_yards)
{
	check_conversions<Dunams, SquareYards>(1195.9900463010806, 8.3612736e-4);
}

TEST_F(TestAreaUnitsConversions, square_kilometers_to_square_yards)
{
	check_conversions<SquareKilometers, SquareYards>(1195990.0463010806, 8.3612736e-7);
}

TEST_F(TestAreaUnitsConversions, square_kilometers_to_dunams)
{
	check_conversions<SquareKilometers, Dunams>(1e+3, 1e-3);
}

// ============================================================

class TestAreaUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestAreaUnitsPrintings, print_square_feet)
{
	check_print<SquareFeet>("feet^2");
}

TEST_F(TestAreaUnitsPrintings, print_square_yards)
{
	check_print<SquareYards>("yards^2");
}

TEST_F(TestAreaUnitsPrintings, print_square_meters)
{
	check_print<SquareMeters>("meters^2");
}

TEST_F(TestAreaUnitsPrintings, print_square_kilometers)
{
	check_print<SquareKilometers>("kilometers^2");
}

TEST_F(TestAreaUnitsPrintings, print_dunams)
{
	check_print<Dunams>("dunams");
}

// ============================================================

#define TEST_AREA_USER_DEFINE_LITERALS(Name, name) \
		TEST_USER_DEFINES_LITERALS(Area, Name, name);

TEST_AREA_USER_DEFINE_LITERALS(SquareFeet, square_feet);
TEST_AREA_USER_DEFINE_LITERALS(SquareYards, square_yards);
TEST_AREA_USER_DEFINE_LITERALS(SquareMeters, square_meters);
TEST_AREA_USER_DEFINE_LITERALS(SquareKilometers, square_kilometers);
TEST_AREA_USER_DEFINE_LITERALS(Dunams, dunams);
