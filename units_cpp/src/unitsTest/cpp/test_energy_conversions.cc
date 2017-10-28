/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#include <units/cases.h>
#include <gtest/gtest.h>
#include <units/energy_units.h>

using namespace testing;
using namespace units::energy;


class TestEnergyConversions : public TestUnitsConversions
{
};

TEST_F(TestEnergyConversions, Calories_to_Joules)
{
	check_conversion<Calories, Joules>(4.184);
}
TEST_F(TestEnergyConversions, Calories_to_Kilocalories)
{
	check_conversion<Calories, Kilocalories>(0.001);
}
TEST_F(TestEnergyConversions, Calories_to_Kilojoules)
{
	check_conversion<Calories, Kilojoules>(0.004184);
}
TEST_F(TestEnergyConversions, Calories_to_Megajoules)
{
	check_conversion<Calories, Megajoules>(4.184E-6);
}
TEST_F(TestEnergyConversions, Joules_to_Calories)
{
	check_conversion<Joules, Calories>(0.2390057361376673);
}
TEST_F(TestEnergyConversions, Joules_to_Kilocalories)
{
	check_conversion<Joules, Kilocalories>(2.390057361376673E-4);
}
TEST_F(TestEnergyConversions, Joules_to_Kilojoules)
{
	check_conversion<Joules, Kilojoules>(0.001);
}
TEST_F(TestEnergyConversions, Joules_to_Megajoules)
{
	check_conversion<Joules, Megajoules>(1.0E-6);
}
TEST_F(TestEnergyConversions, Kilocalories_to_Calories)
{
	check_conversion<Kilocalories, Calories>(1000.0);
}
TEST_F(TestEnergyConversions, Kilocalories_to_Joules)
{
	check_conversion<Kilocalories, Joules>(4184.0);
}
TEST_F(TestEnergyConversions, Kilocalories_to_Kilojoules)
{
	check_conversion<Kilocalories, Kilojoules>(4.184);
}
TEST_F(TestEnergyConversions, Kilocalories_to_Megajoules)
{
	check_conversion<Kilocalories, Megajoules>(0.004184);
}
TEST_F(TestEnergyConversions, Kilojoules_to_Calories)
{
	check_conversion<Kilojoules, Calories>(239.0057361376673);
}
TEST_F(TestEnergyConversions, Kilojoules_to_Joules)
{
	check_conversion<Kilojoules, Joules>(1000.0);
}
TEST_F(TestEnergyConversions, Kilojoules_to_Kilocalories)
{
	check_conversion<Kilojoules, Kilocalories>(0.2390057361376673);
}
TEST_F(TestEnergyConversions, Kilojoules_to_Megajoules)
{
	check_conversion<Kilojoules, Megajoules>(0.001);
}
TEST_F(TestEnergyConversions, Megajoules_to_Calories)
{
	check_conversion<Megajoules, Calories>(239005.7361376673);
}
TEST_F(TestEnergyConversions, Megajoules_to_Joules)
{
	check_conversion<Megajoules, Joules>(1000000.0);
}
TEST_F(TestEnergyConversions, Megajoules_to_Kilocalories)
{
	check_conversion<Megajoules, Kilocalories>(239.0057361376673);
}
TEST_F(TestEnergyConversions, Megajoules_to_Kilojoules)
{
	check_conversion<Megajoules, Kilojoules>(1000.0);
}

