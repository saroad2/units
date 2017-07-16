/*
 * test_speed_units.cc
 *
 *  Created on: Jul 1, 2017
 *      Author: sagis
 */

#include "cases.h"
#include "speed_units.h"

using namespace units::speed;

class TestSpeedUnitsConversions : public TestUnitsConversions
{
};

TEST_F(TestSpeedUnitsConversions, feet_per_second_to_meters_per_second)
{
	maxError = 1e-10;
	check_conversions<FeetPerSecond, MetersPerSecond>(0.304799999536704, 3.2808399);
}

TEST_F(TestSpeedUnitsConversions, yards_per_second_to_meters_per_second)
{
	maxError = 1e-10;
	check_conversions<YardsPerSecond, MetersPerSecond>(0.91439999861011201, 1.0936133);
}

TEST_F(TestSpeedUnitsConversions, kilometers_per_hour_to_meters_per_second)
{
	maxError = 1e-10;
	check_conversions<KilometersPerHour, MetersPerSecond>(0.2777777777, 3.6);
}


TEST_F(TestSpeedUnitsConversions, knots_to_meters_per_second)
{
	maxError = 1e-10;
	check_conversions<Knots, MetersPerSecond>(0.514444773689, 1.9438432483805059);
}

TEST_F(TestSpeedUnitsConversions, yards_per_second_to_feet_per_second)
{
	maxError = 1e-10;
	check_conversions<YardsPerSecond, FeetPerSecond>(3, 1.0 / 3);
}

TEST_F(TestSpeedUnitsConversions, kilometers_per_hour_to_feet_per_second)
{
	maxError = 1e-10;
	check_conversions<KilometersPerHour, FeetPerSecond>(0.91134441666666666, 1.0972799983321344);
}

TEST_F(TestSpeedUnitsConversions, knots_to_feet_per_second)
{
	maxError = 1e-10;
	check_conversions<Knots, FeetPerSecond>(1.6878109398653414, 0.59248342120580344);
}

TEST_F(TestSpeedUnitsConversions, kilometers_per_hour_to_yards_per_second)
{
	maxError = 1e-10;
	check_conversions<KilometersPerHour, YardsPerSecond>(0.30378147222222224, 3.291839994996403);
}

TEST_F(TestSpeedUnitsConversions, knots_to_yards_per_second)
{
	maxError = 1e-10;
	check_conversions<Knots, YardsPerSecond>(0.56260364662178042, 1.7774502636174103);
}

TEST_F(TestSpeedUnitsConversions, knots_to_kilometers_per_hour)
{
	maxError = 1e-10;
	check_conversions<Knots, KilometersPerHour>(1.8520011852803999, 0.53995645788347391);
}

// ============================================================

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
