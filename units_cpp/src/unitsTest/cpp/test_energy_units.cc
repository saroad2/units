/*
 * test_energy_units.cc
 *
 *  Created on: Jul 5, 2017
 *      Author: sagis
 */

#include "cases.h"
#include <units/energy_units.h>

using namespace units::energy;

class TestEnergyUnitsConversions : public TestUnitsConversions
{
};

TEST_F(TestEnergyUnitsConversions, joules_to_calories)
{
	check_conversions<Joules, Calories>(0.23900573613766729, 4.184);
}

TEST_F(TestEnergyUnitsConversions, joules_to_kilocalories)
{
	check_conversions<Joules, Kilocalories>(2.3900573613766729e-4, 4184);
}

TEST_F(TestEnergyUnitsConversions, joules_to_kilojoules)
{
	check_conversions<Joules, Kilojoules>(1e-3, 1e+3);
}

TEST_F(TestEnergyUnitsConversions, joules_to_megajoules)
{
	check_conversions<Joules, Megajoules>(1e-6, 1e+6);
}

TEST_F(TestEnergyUnitsConversions, kilojoules_to_calories)
{
	check_conversions<Kilojoules, Calories>(239.00573613766729, 0.004184);
}

TEST_F(TestEnergyUnitsConversions, kilojoules_to_kilocalories)
{
	check_conversions<Kilojoules, Kilocalories>(0.23900573613766729, 4.184);
}

TEST_F(TestEnergyUnitsConversions, kilojoules_to_megajoules)
{
	check_conversions<Kilojoules, Megajoules>(1e-3, 1e+3);
}

TEST_F(TestEnergyUnitsConversions, calories_to_kilocalories)
{
	check_conversions<Calories, Kilocalories>(1e-3, 1e+3);
}

TEST_F(TestEnergyUnitsConversions, calories_to_megajoules)
{
	check_conversions<Calories, Megajoules>(0.000004184, 239005.73613766729);
}

TEST_F(TestEnergyUnitsConversions, kilocalories_to_megajoules)
{
	check_conversions<Kilocalories, Megajoules>(0.004184, 239.00573613766729);
}

// ============================================================

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
