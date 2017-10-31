/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#include <units/cases.h>
#include <units/angle_units.h>

#include <gtest/gtest.h>

using namespace testing;
using namespace units::angle;

class TestAngleUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestAngleUnitsPrintings, print_degrees)
{
	check_print<Degrees>("degrees");
}
TEST_F(TestAngleUnitsPrintings, print_mils)
{
	check_print<Mils>("mils");
}
TEST_F(TestAngleUnitsPrintings, print_radians)
{
	check_print<Radians>("radians");
}


// ============================================================

#define TEST_ANGLE_USER_DEFINE_LITERALS(Name, name) \
		TEST_USER_DEFINES_LITERALS(Angle, Name, name);

TEST_ANGLE_USER_DEFINE_LITERALS(Degrees, degrees);
TEST_ANGLE_USER_DEFINE_LITERALS(Mils, mils);
TEST_ANGLE_USER_DEFINE_LITERALS(Radians, radians);
