/*
 * test_area_units.cc
 *
 *  Created on: Jun 30, 2017
 *      Author: sagis
 */

#include <units/cases.h>
#include <units/area_units.h>

using namespace units::area;

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
