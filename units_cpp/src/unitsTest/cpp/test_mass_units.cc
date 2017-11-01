/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#include <units/cases.h>
#include <units/mass_units.h>

#include <gtest/gtest.h>

using namespace testing;
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
TEST_F(TestMassUnitsPrintings, print_solar_masses)
{
	check_print<SolarMasses>("solar masses");
}


// ============================================================

#define TEST_MASS_USER_DEFINE_LITERALS(Name, name) \
		TEST_USER_DEFINES_LITERALS(Mass, Name, name);

TEST_MASS_USER_DEFINE_LITERALS(Grams, grams);
TEST_MASS_USER_DEFINE_LITERALS(Pounds, pounds);
TEST_MASS_USER_DEFINE_LITERALS(Milligrams, milligrams);
TEST_MASS_USER_DEFINE_LITERALS(Kilograms, kilograms);
TEST_MASS_USER_DEFINE_LITERALS(Tonnes, tonnes);
TEST_MASS_USER_DEFINE_LITERALS(SolarMasses, solar_masses);
