/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#include <gtest/gtest.h>
#include <units/cases.h>
#include <units/speed_units.h>

using namespace testing;
using namespace units::speed;


class TestSpeedConversions : public TestUnitsConversions
{
};

TEST_F(TestSpeedConversions, FeetPerSecond_to_KilometersPerHour)
{
	check_conversion<FeetPerSecond, KilometersPerHour>(1.09728);
}
TEST_F(TestSpeedConversions, FeetPerSecond_to_Knots)
{
	check_conversion<FeetPerSecond, Knots>(0.5924834221063782);
}
TEST_F(TestSpeedConversions, FeetPerSecond_to_MetersPerSecond)
{
	check_conversion<FeetPerSecond, MetersPerSecond>(0.3048);
}
TEST_F(TestSpeedConversions, FeetPerSecond_to_YardsPerSecond)
{
	check_conversion<FeetPerSecond, YardsPerSecond>(0.3333333333333);
}
TEST_F(TestSpeedConversions, KilometersPerHour_to_FeetPerSecond)
{
	check_conversion<KilometersPerHour, FeetPerSecond>(0.9113444152814233);
}
TEST_F(TestSpeedConversions, KilometersPerHour_to_Knots)
{
	check_conversion<KilometersPerHour, Knots>(0.5399564578834739);
}
TEST_F(TestSpeedConversions, KilometersPerHour_to_MetersPerSecond)
{
	check_conversion<KilometersPerHour, MetersPerSecond>(0.27777777777);
}
TEST_F(TestSpeedConversions, KilometersPerHour_to_YardsPerSecond)
{
	check_conversion<KilometersPerHour, YardsPerSecond>(0.30378147176047443);
}
TEST_F(TestSpeedConversions, Knots_to_FeetPerSecond)
{
	check_conversion<Knots, FeetPerSecond>(1.6878109372998689);
}
TEST_F(TestSpeedConversions, Knots_to_KilometersPerHour)
{
	check_conversion<Knots, KilometersPerHour>(1.8520011852804);
}
TEST_F(TestSpeedConversions, Knots_to_MetersPerSecond)
{
	check_conversion<Knots, MetersPerSecond>(0.514444773689);
}
TEST_F(TestSpeedConversions, Knots_to_YardsPerSecond)
{
	check_conversion<Knots, YardsPerSecond>(0.562603645766623);
}
TEST_F(TestSpeedConversions, MetersPerSecond_to_FeetPerSecond)
{
	check_conversion<MetersPerSecond, FeetPerSecond>(3.280839895013124);
}
TEST_F(TestSpeedConversions, MetersPerSecond_to_KilometersPerHour)
{
	check_conversion<MetersPerSecond, KilometersPerHour>(3.6);
}
TEST_F(TestSpeedConversions, MetersPerSecond_to_Knots)
{
	check_conversion<MetersPerSecond, Knots>(1.943843248380506);
}
TEST_F(TestSpeedConversions, MetersPerSecond_to_YardsPerSecond)
{
	check_conversion<MetersPerSecond, YardsPerSecond>(1.093613298337708);
}
TEST_F(TestSpeedConversions, YardsPerSecond_to_FeetPerSecond)
{
	check_conversion<YardsPerSecond, FeetPerSecond>(3.0);
}
TEST_F(TestSpeedConversions, YardsPerSecond_to_KilometersPerHour)
{
	check_conversion<YardsPerSecond, KilometersPerHour>(3.29184);
}
TEST_F(TestSpeedConversions, YardsPerSecond_to_Knots)
{
	check_conversion<YardsPerSecond, Knots>(1.7774502663191345);
}
TEST_F(TestSpeedConversions, YardsPerSecond_to_MetersPerSecond)
{
	check_conversion<YardsPerSecond, MetersPerSecond>(0.9144);
}

