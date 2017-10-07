/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#include <units/cases.h>
#include <gtest/gtest.h>
#include <units/mass_units.h>

using namespace testing;
using namespace units::mass;


class TestMassConversions : public TestUnitsConversions
{
};

TEST_F(TestMassConversions, Grams_to_Kilograms)
{
	check_conversion<Grams, Kilograms>(0.001);
}
TEST_F(TestMassConversions, Grams_to_Milligrams)
{
	check_conversion<Grams, Milligrams>(1000.0);
}
TEST_F(TestMassConversions, Grams_to_Pounds)
{
	check_conversion<Grams, Pounds>(0.002204622800000002);
}
TEST_F(TestMassConversions, Grams_to_Tonnes)
{
	check_conversion<Grams, Tonnes>(1.0E-6);
}
TEST_F(TestMassConversions, Kilograms_to_Grams)
{
	check_conversion<Kilograms, Grams>(1000.0);
}
TEST_F(TestMassConversions, Kilograms_to_Milligrams)
{
	check_conversion<Kilograms, Milligrams>(1000000.0);
}
TEST_F(TestMassConversions, Kilograms_to_Pounds)
{
	check_conversion<Kilograms, Pounds>(2.204622800000002);
}
TEST_F(TestMassConversions, Kilograms_to_Tonnes)
{
	check_conversion<Kilograms, Tonnes>(0.001);
}
TEST_F(TestMassConversions, Milligrams_to_Grams)
{
	check_conversion<Milligrams, Grams>(0.001);
}
TEST_F(TestMassConversions, Milligrams_to_Kilograms)
{
	check_conversion<Milligrams, Kilograms>(1.0E-6);
}
TEST_F(TestMassConversions, Milligrams_to_Pounds)
{
	check_conversion<Milligrams, Pounds>(2.204622800000002E-6);
}
TEST_F(TestMassConversions, Milligrams_to_Tonnes)
{
	check_conversion<Milligrams, Tonnes>(1.0E-9);
}
TEST_F(TestMassConversions, Pounds_to_Grams)
{
	check_conversion<Pounds, Grams>(453.592333346094);
}
TEST_F(TestMassConversions, Pounds_to_Kilograms)
{
	check_conversion<Pounds, Kilograms>(0.453592333346094);
}
TEST_F(TestMassConversions, Pounds_to_Milligrams)
{
	check_conversion<Pounds, Milligrams>(453592.333346094);
}
TEST_F(TestMassConversions, Pounds_to_Tonnes)
{
	check_conversion<Pounds, Tonnes>(4.53592333346094E-4);
}
TEST_F(TestMassConversions, Tonnes_to_Grams)
{
	check_conversion<Tonnes, Grams>(1000000.0);
}
TEST_F(TestMassConversions, Tonnes_to_Kilograms)
{
	check_conversion<Tonnes, Kilograms>(1000.0);
}
TEST_F(TestMassConversions, Tonnes_to_Milligrams)
{
	check_conversion<Tonnes, Milligrams>(1.0E9);
}
TEST_F(TestMassConversions, Tonnes_to_Pounds)
{
	check_conversion<Tonnes, Pounds>(2204.622800000002);
}

