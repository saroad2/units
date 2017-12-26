/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#include <gtest/gtest.h>
#include <units/angular_speed_units.h>
#include <units/cases.h>

using namespace testing;
using namespace units::angular_speed;


class TestAngularSpeedConversions : public TestUnitsConversions
{
};

TEST_F(TestAngularSpeedConversions, DegreesPerSecond_to_MilsPerSecond)
{
	check_conversion<DegreesPerSecond, MilsPerSecond>(17.7777777777777);
}
TEST_F(TestAngularSpeedConversions, DegreesPerSecond_to_RadiansPerSecond)
{
	check_conversion<DegreesPerSecond, RadiansPerSecond>(0.017453292519937);
}
TEST_F(TestAngularSpeedConversions, MilsPerSecond_to_DegreesPerSecond)
{
	check_conversion<MilsPerSecond, DegreesPerSecond>(0.05625);
}
TEST_F(TestAngularSpeedConversions, MilsPerSecond_to_RadiansPerSecond)
{
	check_conversion<MilsPerSecond, RadiansPerSecond>(9.8174770424E-4);
}
TEST_F(TestAngularSpeedConversions, RadiansPerSecond_to_DegreesPerSecond)
{
	check_conversion<RadiansPerSecond, DegreesPerSecond>(57.2957795131);
}
TEST_F(TestAngularSpeedConversions, RadiansPerSecond_to_MilsPerSecond)
{
	check_conversion<RadiansPerSecond, MilsPerSecond>(1018.59163578844);
}

