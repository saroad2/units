/*
 * test_mass_units.cc
 *
 *  Created on: Jul 1, 2017
 *      Author: sagis
 */

#include <units/cases.h>
#include <units/mass_units.h>

using namespace units::mass;

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
