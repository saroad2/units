/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#include <units/cases.h>
#include <units/temperature_units.h>

#include <gtest/gtest.h>

using namespace testing;
using namespace units::temperature;

class TestTemperatureUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestTemperatureUnitsPrintings, print_kelvins)
{
	check_print<Kelvins>("kelvins");
}
TEST_F(TestTemperatureUnitsPrintings, print_rankines)
{
	check_print<Rankines>("rankines");
}


// ============================================================

#define TEST_TEMPERATURE_USER_DEFINE_LITERALS(Name, name) \
		TEST_USER_DEFINES_LITERALS(Temperature, Name, name);

TEST_TEMPERATURE_USER_DEFINE_LITERALS(Kelvins, kelvins);
TEST_TEMPERATURE_USER_DEFINE_LITERALS(Rankines, rankines);
