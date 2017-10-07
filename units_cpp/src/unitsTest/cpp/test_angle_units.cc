/*
 * test_angle_units.cc
 *
 *  Created on: Jun 28, 2017
 *      Author: sagis
 */

#include "cases.h"
#include <units/angle_units.h>

#include <gtest/gtest.h>

using namespace testing;
using namespace units::angle;

class TestAngleUnitsConversions : public TestUnitsConversions
{
};

TEST_F(TestAngleUnitsConversions, mils_to_degrees)
{
	check_conversions<Mils, Degrees>(0.05625, 17.7777777777777);
}

TEST_F(TestAngleUnitsConversions, radians_to_degrees)
{
	check_conversions<Radians, Degrees>(57.2957795131, 0.017453292519937);
}

TEST_F(TestAngleUnitsConversions, radians_to_mils)
{
	maxError = 1e-9;
	check_conversions<Radians, Mils>(1018.59163578844, 9.8174770424e-4);
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
