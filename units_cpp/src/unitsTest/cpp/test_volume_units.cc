/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#include <units/cases.h>
#include <units/volume_units.h>

#include <gtest/gtest.h>

using namespace testing;
using namespace units::volume;

class TestVolumeUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestVolumeUnitsPrintings, print_cubic_feet)
{
	check_print<CubicFeet>("feet^3");
}
TEST_F(TestVolumeUnitsPrintings, print_cubic_yards)
{
	check_print<CubicYards>("yards^3");
}
TEST_F(TestVolumeUnitsPrintings, print_cubic_meters)
{
	check_print<CubicMeters>("meters^3");
}
TEST_F(TestVolumeUnitsPrintings, print_cubic_kilometers)
{
	check_print<CubicKilometers>("kilometers^3");
}
TEST_F(TestVolumeUnitsPrintings, print_liters)
{
	check_print<Liters>("liters");
}
TEST_F(TestVolumeUnitsPrintings, print_milliliters)
{
	check_print<Milliliters>("milliliters");
}


// ============================================================

#define TEST_VOLUME_USER_DEFINE_LITERALS(Name, name) \
		TEST_USER_DEFINES_LITERALS(Volume, Name, name);

TEST_VOLUME_USER_DEFINE_LITERALS(CubicFeet, cubic_feet);
TEST_VOLUME_USER_DEFINE_LITERALS(CubicYards, cubic_yards);
TEST_VOLUME_USER_DEFINE_LITERALS(CubicMeters, cubic_meters);
TEST_VOLUME_USER_DEFINE_LITERALS(CubicKilometers, cubic_kilometers);
TEST_VOLUME_USER_DEFINE_LITERALS(Liters, liters);
TEST_VOLUME_USER_DEFINE_LITERALS(Milliliters, milliliters);
