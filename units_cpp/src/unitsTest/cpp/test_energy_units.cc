/*
 * test_energy_units.cc
 *
 *  Created on: Jul 5, 2017
 *      Author: sagis
 */

#include "energy_units.h"
#include "cases.h"

using namespace units::energy;

class TestEnergyUnitsConversions : public TestUnitsConversions
{
};

TEST_F(TestEnergyUnitsConversions, joules_to_kilojoules)
{
	maxError = 1e-10;
	check_conversions<Joules, Kilojoules>(1e-3, 1e+3);
}

TEST_F(TestEnergyUnitsConversions, joules_to_megajoules)
{
	maxError = 1e-10;
	check_conversions<Joules, Megajoules>(1e-6, 1e+6);
}

TEST_F(TestEnergyUnitsConversions, kilojoules_to_kilojoules)
{
	maxError = 1e-10;
	check_conversions<Kilojoules, Megajoules>(1e-3, 1e+3);
}

// ============================================================

class TestEnergyUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestEnergyUnitsPrintings, print_joules)
{
	check_print<Joules>("joules");
}

TEST_F(TestEnergyUnitsPrintings, print_kilojoules)
{
	check_print<Kilojoules>("kilojoules");
}

TEST_F(TestEnergyUnitsPrintings, print_megajoules)
{
	check_print<Megajoules>("megajoules");
}
// ============================================================

#define TEST_ENERGY_USER_DEFINE_LITERALS(Name, name) \
		TEST_USER_DEFINES_LITERALS(Energy, Name, name);

TEST_ENERGY_USER_DEFINE_LITERALS(Joules, joules);
TEST_ENERGY_USER_DEFINE_LITERALS(Kilojoules, kilojoules);
TEST_ENERGY_USER_DEFINE_LITERALS(Megajoules, megajoules);
