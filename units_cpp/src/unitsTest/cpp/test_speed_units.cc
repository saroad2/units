/*
 * test_speed_units.cc
 *
 *  Created on: Jul 1, 2017
 *      Author: sagis
 */

#include <units/cases.h>
#include <units/speed_units.h>

using namespace units::speed;

class TestSpeedUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestSpeedUnitsPrintings, print_feet_per_second)
{
	check_print<FeetPerSecond>("feet/second");
}

TEST_F(TestSpeedUnitsPrintings, print_yards_per_second)
{
	check_print<YardsPerSecond>("yards/second");
}

TEST_F(TestSpeedUnitsPrintings, print_meters_per_second)
{
	check_print<MetersPerSecond>("meters/second");
}

TEST_F(TestSpeedUnitsPrintings, print_kilometers_per_hour)
{
	check_print<KilometersPerHour>("kilometers/hour");
}

TEST_F(TestSpeedUnitsPrintings, print_knots)
{
	check_print<Knots>("knots");
}
// ============================================================

#define TEST_SPEED_USER_DEFINE_LITERALS(Name, name) \
		TEST_USER_DEFINES_LITERALS(Speed, Name, name);

TEST_SPEED_USER_DEFINE_LITERALS(FeetPerSecond, feet_per_second);
TEST_SPEED_USER_DEFINE_LITERALS(YardsPerSecond, yards_per_second);
TEST_SPEED_USER_DEFINE_LITERALS(MetersPerSecond, meters_per_second);
TEST_SPEED_USER_DEFINE_LITERALS(KilometersPerHour, kilometers_per_hour);
TEST_SPEED_USER_DEFINE_LITERALS(Knots, knots);
