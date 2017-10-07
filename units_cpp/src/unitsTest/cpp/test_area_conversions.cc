/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#include <units/cases.h>
#include <gtest/gtest.h>
#include <units/area_units.h>

using namespace testing;
using namespace units::area;


class TestAreaConversions : public TestUnitsConversions
{
};

TEST_F(TestAreaConversions, Dunams_to_SquareFeet)
{
	check_conversion<Dunams, SquareFeet>(10763.910416709725);
}
TEST_F(TestAreaConversions, Dunams_to_SquareKilometers)
{
	check_conversion<Dunams, SquareKilometers>(0.001);
}
TEST_F(TestAreaConversions, Dunams_to_SquareMeters)
{
	check_conversion<Dunams, SquareMeters>(1000.0);
}
TEST_F(TestAreaConversions, Dunams_to_SquareYards)
{
	check_conversion<Dunams, SquareYards>(1195.9900463010806);
}
TEST_F(TestAreaConversions, SquareFeet_to_Dunams)
{
	check_conversion<SquareFeet, Dunams>(9.290304E-5);
}
TEST_F(TestAreaConversions, SquareFeet_to_SquareKilometers)
{
	check_conversion<SquareFeet, SquareKilometers>(9.290304E-8);
}
TEST_F(TestAreaConversions, SquareFeet_to_SquareMeters)
{
	check_conversion<SquareFeet, SquareMeters>(0.09290304);
}
TEST_F(TestAreaConversions, SquareFeet_to_SquareYards)
{
	check_conversion<SquareFeet, SquareYards>(0.11111111111);
}
TEST_F(TestAreaConversions, SquareKilometers_to_Dunams)
{
	check_conversion<SquareKilometers, Dunams>(1000.0);
}
TEST_F(TestAreaConversions, SquareKilometers_to_SquareFeet)
{
	check_conversion<SquareKilometers, SquareFeet>(1.0763910416709725E7);
}
TEST_F(TestAreaConversions, SquareKilometers_to_SquareMeters)
{
	check_conversion<SquareKilometers, SquareMeters>(1000000.0);
}
TEST_F(TestAreaConversions, SquareKilometers_to_SquareYards)
{
	check_conversion<SquareKilometers, SquareYards>(1195990.0463010806);
}
TEST_F(TestAreaConversions, SquareMeters_to_Dunams)
{
	check_conversion<SquareMeters, Dunams>(0.001);
}
TEST_F(TestAreaConversions, SquareMeters_to_SquareFeet)
{
	check_conversion<SquareMeters, SquareFeet>(10.763910416709725);
}
TEST_F(TestAreaConversions, SquareMeters_to_SquareKilometers)
{
	check_conversion<SquareMeters, SquareKilometers>(1.0E-6);
}
TEST_F(TestAreaConversions, SquareMeters_to_SquareYards)
{
	check_conversion<SquareMeters, SquareYards>(1.1959900463010806);
}
TEST_F(TestAreaConversions, SquareYards_to_Dunams)
{
	check_conversion<SquareYards, Dunams>(8.3612736E-4);
}
TEST_F(TestAreaConversions, SquareYards_to_SquareFeet)
{
	check_conversion<SquareYards, SquareFeet>(9.0);
}
TEST_F(TestAreaConversions, SquareYards_to_SquareKilometers)
{
	check_conversion<SquareYards, SquareKilometers>(8.3612736E-7);
}
TEST_F(TestAreaConversions, SquareYards_to_SquareMeters)
{
	check_conversion<SquareYards, SquareMeters>(0.83612736);
}

