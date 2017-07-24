/*
 * test_power_units.cc
 *
 *  Created on: Jul 4, 2017
 *      Author: sagis
 */

#include "cases.h"
#include <units/force_units.h>

using namespace units::force;

class TestForceUnitsConversions : public TestUnitsConversions
{
};

TEST_F(TestForceUnitsConversions, newtons_to_dynes)
{
	maxError = 1e-10;
	check_conversions<Newtons, Dynes>(1e+5, 1e-5);
}

// ============================================================

class TestForceUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestForceUnitsPrintings, print_newtons)
{
	check_print<Newtons>("newtons");
}

TEST_F(TestForceUnitsPrintings, print_dynes)
{
	check_print<Dynes>("dynes");
}

// ============================================================

#define TEST_FORCE_USER_DEFINE_LITERALS(Name, name) \
		TEST_USER_DEFINES_LITERALS(Force, Name, name);

TEST_FORCE_USER_DEFINE_LITERALS(Newtons, newtons);
TEST_FORCE_USER_DEFINE_LITERALS(Dynes, dynes);
