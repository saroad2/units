/*
 * test_energy_units.cc
 *
 *  Created on: Jul 5, 2017
 *      Author: sagis
 */

#include <units/cases.h>
#include <units/energy_units.h>

using namespace units::energy;

class TestEnergyUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestEnergyUnitsPrintings, print_joules)
{
	check_print<Joules>("joules");
}

TEST_F(TestEnergyUnitsPrintings, print_calories)
{
	check_print<Calories>("calories");
}

TEST_F(TestEnergyUnitsPrintings, print_kilocalories)
{
	check_print<Kilocalories>("kilocalories");
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
TEST_ENERGY_USER_DEFINE_LITERALS(Calories, calories);
TEST_ENERGY_USER_DEFINE_LITERALS(Kilocalories, kilocalories);
TEST_ENERGY_USER_DEFINE_LITERALS(Kilojoules, kilojoules);
TEST_ENERGY_USER_DEFINE_LITERALS(Megajoules, megajoules);
