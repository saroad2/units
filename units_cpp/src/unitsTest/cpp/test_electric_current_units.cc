/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#include <units/cases.h>
#include <units/electric_current_units.h>

#include <gtest/gtest.h>

using namespace testing;
using namespace units::electric_current;

class TestElectricCurrentUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestElectricCurrentUnitsPrintings, print_amperes)
{
	check_print<Amperes>("amperes");
}


// ============================================================

#define TEST_ELECTRIC_CURRENT_USER_DEFINE_LITERALS(Name, name) \
		TEST_USER_DEFINES_LITERALS(ElectricCurrent, Name, name);

TEST_ELECTRIC_CURRENT_USER_DEFINE_LITERALS(Amperes, amperes);
