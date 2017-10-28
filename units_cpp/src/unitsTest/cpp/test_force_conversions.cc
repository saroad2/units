/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#include <units/cases.h>
#include <gtest/gtest.h>
#include <units/force_units.h>

using namespace testing;
using namespace units::force;


class TestForceConversions : public TestUnitsConversions
{
};

TEST_F(TestForceConversions, Dynes_to_Newtons)
{
	check_conversion<Dynes, Newtons>(1.0E-5);
}
TEST_F(TestForceConversions, Newtons_to_Dynes)
{
	check_conversion<Newtons, Dynes>(100000.0);
}

