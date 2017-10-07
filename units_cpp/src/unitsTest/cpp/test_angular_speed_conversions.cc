/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#include <units/cases.h>
#include <gtest/gtest.h>
#include <units/angular_speed_units.h>

using namespace testing;
using namespace units::angular_speed;


class TestAngularSpeedConversions : public TestUnitsConversions
{
};

TEST_F(TestAngularSpeedConversions, DegreesPerSecond_to_RadiansPerSecond)
{
	check_conversion<DegreesPerSecond, RadiansPerSecond>(0.017453292519937);
}
TEST_F(TestAngularSpeedConversions, RadiansPerSecond_to_DegreesPerSecond)
{
	check_conversion<RadiansPerSecond, DegreesPerSecond>(57.2957795131);
}

