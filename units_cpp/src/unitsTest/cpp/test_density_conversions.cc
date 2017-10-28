/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#include <units/cases.h>
#include <gtest/gtest.h>
#include <units/density_units.h>

using namespace testing;
using namespace units::density;


class TestDensityConversions : public TestUnitsConversions
{
};

TEST_F(TestDensityConversions, KilogramsPerLiter_to_KilogramsPerCubicMeter)
{
	check_conversion<KilogramsPerLiter, KilogramsPerCubicMeter>(1000.0);
}
TEST_F(TestDensityConversions, KilogramsPerCubicMeter_to_KilogramsPerLiter)
{
	check_conversion<KilogramsPerCubicMeter, KilogramsPerLiter>(0.001);
}

