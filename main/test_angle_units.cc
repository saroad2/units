/*
 * test_angle_units.cc
 *
 *  Created on: Jun 28, 2017
 *      Author: sagis
 */

#include "units/main/cases.h"
#include "units/include/angle_units.h"

#include <gtest/gtest.h>

using namespace testing;
using namespace units::angle;

#include <iostream>
using std::cout;
using std::endl;

class TestAngleUnitsConversions : public TestUnitsConversions
{
};

TEST_F(TestAngleUnitsConversions, mils_to_degrees)
{
	maxError = 1e-10;
	check_conversions<Mils, Degrees>(360.0 / 6400, 6400.0 / 360);
}

TEST_F(TestAngleUnitsConversions, radians_to_degrees)
{
	maxError = 1e-10;
	check_conversions<Radians, Degrees>(180.0 / M_PI, M_PI / 180);
}

TEST_F(TestAngleUnitsConversions, radians_to_mils)
{
	maxError = 1e-10;
	check_conversions<Radians, Mils>(3200 / M_PI, M_PI / 3200);
}
// ============================================================

class TestAngleUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestAngleUnitsPrintings, print_mils)
{
	check_print<Mils>("mils");
}

TEST_F(TestAngleUnitsPrintings, print_degrees)
{
	check_print<Degrees>("degrees");
}

TEST_F(TestAngleUnitsPrintings, print_radians)
{
	check_print<Radians>("radians");
}

// ============================================================

#define TEST_ANGLE_USER_DEFINE_LITERALS(Name, name) \
		TEST_USER_DEFINES_LITERALS(Angle, Name, name);

TEST_ANGLE_USER_DEFINE_LITERALS(Mils, mils);
TEST_ANGLE_USER_DEFINE_LITERALS(Degrees, degrees);
TEST_ANGLE_USER_DEFINE_LITERALS(Radians, radians);
