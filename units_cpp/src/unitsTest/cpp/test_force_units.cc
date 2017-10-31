/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#include <units/cases.h>
#include <units/force_units.h>

#include <gtest/gtest.h>

using namespace testing;
using namespace units::force;

class TestForceUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestForceUnitsPrintings, print_newtons)
{
	check_print<Newtons>("newtons");
}
TEST_F(TestForceUnitsPrintings, print_dynes)
{
	check_print<Dynes>("dynes");
}


// ============================================================

#define TEST_FORCE_USER_DEFINE_LITERALS(Name, name) \
		TEST_USER_DEFINES_LITERALS(Force, Name, name);

TEST_FORCE_USER_DEFINE_LITERALS(Newtons, newtons);
TEST_FORCE_USER_DEFINE_LITERALS(Dynes, dynes);
