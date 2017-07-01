/*
 * test_angular_speed.cc
 *
 *  Created on: Jul 1, 2017
 *      Author: sagis
 */

#include "units/include/angular_speed_units.h"
#include "units/unit_tests/cases.h"

#include <math.h>

using namespace units::angular_speed;

class TestAngularSpeedUnitsConversions : public TestUnitsConversions
{
};

TEST_F(TestAngularSpeedUnitsConversions, degrees_per_second_to_radians_per_second)
{
	maxError = 1e-10;
	check_conversions<DegreesPerSecond, RadiansPerSecond>(M_PI / 180, 180 / M_PI);
}

// ============================================================

class TestAngularSpeedUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestAngularSpeedUnitsPrintings, print_radians_per_second)
{
	check_print<RadiansPerSecond>("radians/second");
}

TEST_F(TestAngularSpeedUnitsPrintings, print_degrees_per_second)
{
	check_print<DegreesPerSecond>("degrees/second");
}

// ============================================================

#define TEST_ANGULAR_SPEED_USER_DEFINE_LITERALS(Name, name) \
		TEST_USER_DEFINES_LITERALS(Area, Name, name);

TEST_ANGULAR_SPEED_USER_DEFINE_LITERALS(DegreesPerSecond, degrees_per_second);
TEST_ANGULAR_SPEED_USER_DEFINE_LITERALS(RadiansPerSecond, radians_per_second);
