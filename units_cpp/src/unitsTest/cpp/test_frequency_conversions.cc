/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#include <units/cases.h>
#include <gtest/gtest.h>
#include <units/frequency_units.h>

using namespace testing;
using namespace units::frequency;


class TestFrequencyConversions : public TestUnitsConversions
{
};

TEST_F(TestFrequencyConversions, Hertz_to_Kilohertz)
{
	check_conversion<Hertz, Kilohertz>(0.001);
}
TEST_F(TestFrequencyConversions, Hertz_to_Megahertz)
{
	check_conversion<Hertz, Megahertz>(1.0E-6);
}
TEST_F(TestFrequencyConversions, Kilohertz_to_Hertz)
{
	check_conversion<Kilohertz, Hertz>(1000.0);
}
TEST_F(TestFrequencyConversions, Kilohertz_to_Megahertz)
{
	check_conversion<Kilohertz, Megahertz>(0.001);
}
TEST_F(TestFrequencyConversions, Megahertz_to_Hertz)
{
	check_conversion<Megahertz, Hertz>(1000000.0);
}
TEST_F(TestFrequencyConversions, Megahertz_to_Kilohertz)
{
	check_conversion<Megahertz, Kilohertz>(1000.0);
}

