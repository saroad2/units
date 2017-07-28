/*
 * test_mass_units.cc
 *
 *  Created on: Jul 1, 2017
 *      Author: sagis
 */

#include "cases.h"
#include <units/mass_units.h>

using namespace units::mass;

class TestMassUnitsConversions : public TestUnitsConversions
{
};

TEST_F(TestMassUnitsConversions, pounds_to_grams)
{
	check_conversions<Pounds, Grams>(453.592333346094, 0.0022046228000000018);
}

TEST_F(TestMassUnitsConversions, milligrams_to_grams)
{
	check_conversions<Milligrams, Grams>(1e-3, 1e+3);
}

TEST_F(TestMassUnitsConversions, kilograms_to_grams)
{
	check_conversions<Kilograms, Grams>(1e+3, 1e-3);
}


TEST_F(TestMassUnitsConversions, tonnes_to_grams)
{
	check_conversions<Tonnes, Grams>(1e+6, 1e-6);
}

TEST_F(TestMassUnitsConversions, milligrams_to_pounds)
{
	check_conversions<Milligrams, Pounds>(2.2046228000000018e-6, 453592.333346094);
}

TEST_F(TestMassUnitsConversions, kilograms_to_pounds)
{
	check_conversions<Kilograms, Pounds>(2.2046228000000018, 0.453592333346094);
}

TEST_F(TestMassUnitsConversions, tonnes_to_pounds)
{
	check_conversions<Tonnes, Pounds>(2204.6228000000018, 4.53592333346094e-4);
}

TEST_F(TestMassUnitsConversions, kilograms_to_milligrams)
{
	check_conversions<Kilograms, Milligrams>(1e+6, 1e-6);
}

TEST_F(TestMassUnitsConversions, tonnes_to_milligrams)
{
	check_conversions<Tonnes, Milligrams>(1e+9, 1e-9);
}

TEST_F(TestMassUnitsConversions, tonnes_to_kilograms)
{
	check_conversions<Tonnes, Kilograms>(1e+3, 1e-3);
}

// ============================================================

class TestMassUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestMassUnitsPrintings, print_grams)
{
	check_print<Grams>("grams");
}

TEST_F(TestMassUnitsPrintings, print_pounds)
{
	check_print<Pounds>("pounds");
}

TEST_F(TestMassUnitsPrintings, print_milligrams)
{
	check_print<Milligrams>("milligrams");
}

TEST_F(TestMassUnitsPrintings, print_kilograms)
{
	check_print<Kilograms>("kilograms");
}

TEST_F(TestMassUnitsPrintings, print_tonnes)
{
	check_print<Tonnes>("tonnes");
}
// ============================================================

#define TEST_MASS_USER_DEFINE_LITERALS(Name, name) \
		TEST_USER_DEFINES_LITERALS(Length, Name, name);

TEST_MASS_USER_DEFINE_LITERALS(Grams, grams);
TEST_MASS_USER_DEFINE_LITERALS(Pounds, pounds);
TEST_MASS_USER_DEFINE_LITERALS(Milligrams, milligrams);
TEST_MASS_USER_DEFINE_LITERALS(Kilograms, kilograms);
TEST_MASS_USER_DEFINE_LITERALS(Tonnes, tonnes);
