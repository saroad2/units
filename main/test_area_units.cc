/*
 * test_area_units.cc
 *
 *  Created on: Jun 30, 2017
 *      Author: sagis
 */

#include "units/main/cases.h"
#include "units/include/area_units.h"

using namespace units::area;

class TestAreaUnitsConversions : public TestUnitsConversions
{
};

TEST_F(TestAreaUnitsConversions, feet_squared_to_meters_squared)
{
	maxError = 1e-10;
	check_conversions<FeetSquared, MetersSquared>(0.092903039717574756, 10.763910449432011);
}

TEST_F(TestAreaUnitsConversions, yards_squared_to_meters_squared)
{
	maxError = 1e-10;
	check_conversions<YardsSquared, MetersSquared>(0.83612735745817279, 1.1959900499368901);
}

TEST_F(TestAreaUnitsConversions, dunams_to_meters_squared)
{
	maxError = 1e-10;
	check_conversions<Dunams, MetersSquared>(1e+3, 1e-3);
}

TEST_F(TestAreaUnitsConversions, kilometers_squared_to_meters_squared)
{
	maxError = 1e-10;
	check_conversions<KilometersSquared, MetersSquared>(1e+6, 1e-6);
}

TEST_F(TestAreaUnitsConversions, yards_squared_to_feet_squared)
{
	maxError = 1e-10;
	check_conversions<YardsSquared, FeetSquared>(9, 1.0 / 9);
}

TEST_F(TestAreaUnitsConversions, dunams_to_feet_squared)
{
	maxError = 1e-10;
	check_conversions<Dunams, FeetSquared>(10763.910449432011, 9.2903039717574756e-5);
}

TEST_F(TestAreaUnitsConversions, kilometers_squared_to_feet_squared)
{
	maxError = 1e-8;
	check_conversions<KilometersSquared, FeetSquared>(10763910.449432011, 9.2903039717574756e-8);
}

TEST_F(TestAreaUnitsConversions, dunams_to_yards_squared)
{
	maxError = 1e-10;
	check_conversions<Dunams, YardsSquared>(1195.9900499368901, 8.3612735745817279e-4);
}

TEST_F(TestAreaUnitsConversions, kilometers_squared_to_yards_squared)
{
	maxError = 1e-10;
	check_conversions<KilometersSquared, YardsSquared>(1195990.0499368901, 8.3612735745817279e-7);
}

TEST_F(TestAreaUnitsConversions, kilometers_squared_to_dunams)
{
	maxError = 1e-10;
	check_conversions<KilometersSquared, Dunams>(1e+3, 1e-3);
}

// ============================================================

class TestAreaUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestAreaUnitsPrintings, print_feet_squared)
{
	check_print<FeetSquared>("feet*feet");
}

TEST_F(TestAreaUnitsPrintings, print_yards_squared)
{
	check_print<YardsSquared>("yards*yards");
}

TEST_F(TestAreaUnitsPrintings, print_meters_squared)
{
	check_print<MetersSquared>("meters*meters");
}

TEST_F(TestAreaUnitsPrintings, print_kilometers_squared)
{
	check_print<KilometersSquared>("kilometers*kilometers");
}

TEST_F(TestAreaUnitsPrintings, print_dunams)
{
	check_print<Dunams>("dunams");
}

// ============================================================

#define TEST_AREA_USER_DEFINE_LITERALS(Name, name) \
		TEST_USER_DEFINES_LITERALS(Area, Name, name);

TEST_AREA_USER_DEFINE_LITERALS(FeetSquared, feet_squared);
TEST_AREA_USER_DEFINE_LITERALS(YardsSquared, yards_squared);
TEST_AREA_USER_DEFINE_LITERALS(MetersSquared, meters_squared);
TEST_AREA_USER_DEFINE_LITERALS(KilometersSquared, kilometers_squared);
TEST_AREA_USER_DEFINE_LITERALS(Dunams, dunams);
