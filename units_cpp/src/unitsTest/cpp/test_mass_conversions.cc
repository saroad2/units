/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#include <gtest/gtest.h>
#include <units/cases.h>
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
TEST_F(TestMassConversions, Grams_to_SolarMasses)
{
	check_conversion<Grams, SolarMasses>(5.028789821729402E-34);
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
TEST_F(TestMassConversions, Kilograms_to_SolarMasses)
{
	check_conversion<Kilograms, SolarMasses>(5.028789821729402E-31);
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
TEST_F(TestMassConversions, Milligrams_to_SolarMasses)
{
	check_conversion<Milligrams, SolarMasses>(5.028789821729401E-37);
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
TEST_F(TestMassConversions, Pounds_to_SolarMasses)
{
	check_conversion<Pounds, SolarMasses>(2.2810205091453275E-31);
}
TEST_F(TestMassConversions, Pounds_to_Tonnes)
{
	check_conversion<Pounds, Tonnes>(4.53592333346094E-4);
}
TEST_F(TestMassConversions, SolarMasses_to_Grams)
{
	check_conversion<SolarMasses, Grams>(1.98855E33);
}
TEST_F(TestMassConversions, SolarMasses_to_Kilograms)
{
	check_conversion<SolarMasses, Kilograms>(1.98855E30);
}
TEST_F(TestMassConversions, SolarMasses_to_Milligrams)
{
	check_conversion<SolarMasses, Milligrams>(1.9885499999999998E36);
}
TEST_F(TestMassConversions, SolarMasses_to_Pounds)
{
	check_conversion<SolarMasses, Pounds>(4.3840026689400034E30);
}
TEST_F(TestMassConversions, SolarMasses_to_Tonnes)
{
	check_conversion<SolarMasses, Tonnes>(1.98855E27);
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
TEST_F(TestMassConversions, Tonnes_to_SolarMasses)
{
	check_conversion<Tonnes, SolarMasses>(5.028789821729402E-28);
}

