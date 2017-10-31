/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#include <units/cases.h>
#include <units/angular_speed_units.h>

#include <gtest/gtest.h>

using namespace testing;
using namespace units::angular_speed;

class TestAngularSpeedUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestAngularSpeedUnitsPrintings, print_degrees_per_second)
{
	check_print<DegreesPerSecond>("degrees/second");
}
TEST_F(TestAngularSpeedUnitsPrintings, print_radians_per_second)
{
	check_print<RadiansPerSecond>("radians/second");
}
TEST_F(TestAngularSpeedUnitsPrintings, print_mils_per_second)
{
	check_print<MilsPerSecond>("mils/second");
}


// ============================================================

#define TEST_ANGULAR_SPEED_USER_DEFINE_LITERALS(Name, name) \
		TEST_USER_DEFINES_LITERALS(AngularSpeed, Name, name);

TEST_ANGULAR_SPEED_USER_DEFINE_LITERALS(DegreesPerSecond, degrees_per_second);
TEST_ANGULAR_SPEED_USER_DEFINE_LITERALS(RadiansPerSecond, radians_per_second);
TEST_ANGULAR_SPEED_USER_DEFINE_LITERALS(MilsPerSecond, mils_per_second);
