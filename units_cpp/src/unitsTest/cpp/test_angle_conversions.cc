/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#include <units/cases.h>
#include <gtest/gtest.h>
#include <units/angle_units.h>

using namespace testing;
using namespace units::angle;


class TestAngleConversions : public TestUnitsConversions
{
};

TEST_F(TestAngleConversions, Degrees_to_Mils)
{
	check_conversion<Degrees, Mils>(17.7777777777777);
}
TEST_F(TestAngleConversions, Degrees_to_Radians)
{
	check_conversion<Degrees, Radians>(0.017453292519937);
}
TEST_F(TestAngleConversions, Mils_to_Degrees)
{
	check_conversion<Mils, Degrees>(0.05625);
}
TEST_F(TestAngleConversions, Mils_to_Radians)
{
	check_conversion<Mils, Radians>(9.8174770424E-4);
}
TEST_F(TestAngleConversions, Radians_to_Degrees)
{
	check_conversion<Radians, Degrees>(57.2957795131);
}
TEST_F(TestAngleConversions, Radians_to_Mils)
{
	check_conversion<Radians, Mils>(1018.59163578844);
}

