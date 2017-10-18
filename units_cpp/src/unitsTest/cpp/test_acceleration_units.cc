/*
 * test_acceleration_units.cc
 *
 *  Created on: Oct 18, 2017
 *      Author: oriash93
 */

#include <units/cases.h>
#include <units/acceleration_units.h>

#include <gtest/gtest.h>

using namespace testing;
using namespace units::acceleration;

class TestAccelerationUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestAccelerationUnitsPrintings, print_meters_per_square_seconds)
{
	check_print<MetersPerSquareSeconds>("meters per square seconds");
}

// ============================================================

#define TEST_ACCELERATION_USER_DEFINE_LITERALS(Name, name) \
		TEST_USER_DEFINES_LITERALS(Acceleration, Name, name);

TEST_ACCELERATION_USER_DEFINE_LITERALS(MetersPerSquareSeconds, meters_per_square_seconds);
