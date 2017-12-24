/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#include <gtest/gtest.h>
#include <units/cases.h>
#include <units/temperature_units.h>

using namespace testing;
using namespace units::temperature;


class TestTemperatureConversions : public TestUnitsConversions
{
};

TEST_F(TestTemperatureConversions, Kelvins_to_Rankines)
{
	check_conversion<Kelvins, Rankines>(1.8);
}
TEST_F(TestTemperatureConversions, Rankines_to_Kelvins)
{
	check_conversion<Rankines, Kelvins>(0.5555555555);
}

