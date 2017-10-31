/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#include <units/cases.h>
#include <units/electric_charge_units.h>

#include <gtest/gtest.h>

using namespace testing;
using namespace units::electric_charge;

class TestElectricChargeUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestElectricChargeUnitsPrintings, print_coulombs)
{
	check_print<Coulombs>("coulombs");
}


// ============================================================

#define TEST_ELECTRIC_CHARGE_USER_DEFINE_LITERALS(Name, name) \
		TEST_USER_DEFINES_LITERALS(ElectricCharge, Name, name);

TEST_ELECTRIC_CHARGE_USER_DEFINE_LITERALS(Coulombs, coulombs);
