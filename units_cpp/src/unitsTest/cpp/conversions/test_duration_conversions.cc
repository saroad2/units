/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#include <gtest/gtest.h>
#include <units/cases.h>
#include <units/duration_units.h>

using namespace testing;
using namespace units::duration;


class TestDurationConversions : public TestUnitsConversions
{
};

TEST_F(TestDurationConversions, Days_to_Hours)
{
	check_conversion<Days, Hours>(24.0);
}
TEST_F(TestDurationConversions, Days_to_Microseconds)
{
	check_conversion<Days, Microseconds>(8.64E10);
}
TEST_F(TestDurationConversions, Days_to_Milliseconds)
{
	check_conversion<Days, Milliseconds>(8.64E7);
}
TEST_F(TestDurationConversions, Days_to_Minutes)
{
	check_conversion<Days, Minutes>(1440.0);
}
TEST_F(TestDurationConversions, Days_to_Seconds)
{
	check_conversion<Days, Seconds>(86400.0);
}
TEST_F(TestDurationConversions, Days_to_Years)
{
	check_conversion<Days, Years>(0.00273972602739);
}
TEST_F(TestDurationConversions, Hours_to_Days)
{
	check_conversion<Hours, Days>(0.04166666666666);
}
TEST_F(TestDurationConversions, Hours_to_Microseconds)
{
	check_conversion<Hours, Microseconds>(3.6E9);
}
TEST_F(TestDurationConversions, Hours_to_Milliseconds)
{
	check_conversion<Hours, Milliseconds>(3600000.0);
}
TEST_F(TestDurationConversions, Hours_to_Minutes)
{
	check_conversion<Hours, Minutes>(60.0);
}
TEST_F(TestDurationConversions, Hours_to_Seconds)
{
	check_conversion<Hours, Seconds>(3600.0);
}
TEST_F(TestDurationConversions, Hours_to_Years)
{
	check_conversion<Hours, Years>(1.14155251141E-4);
}
TEST_F(TestDurationConversions, Microseconds_to_Days)
{
	check_conversion<Microseconds, Days>(1.1574074074E-11);
}
TEST_F(TestDurationConversions, Microseconds_to_Hours)
{
	check_conversion<Microseconds, Hours>(2.7777777777E-10);
}
TEST_F(TestDurationConversions, Microseconds_to_Milliseconds)
{
	check_conversion<Microseconds, Milliseconds>(0.001);
}
TEST_F(TestDurationConversions, Microseconds_to_Minutes)
{
	check_conversion<Microseconds, Minutes>(1.6666666666E-8);
}
TEST_F(TestDurationConversions, Microseconds_to_Seconds)
{
	check_conversion<Microseconds, Seconds>(1.0E-6);
}
TEST_F(TestDurationConversions, Microseconds_to_Years)
{
	check_conversion<Microseconds, Years>(3.1709791983E-14);
}
TEST_F(TestDurationConversions, Milliseconds_to_Days)
{
	check_conversion<Milliseconds, Days>(1.1574074074E-8);
}
TEST_F(TestDurationConversions, Milliseconds_to_Hours)
{
	check_conversion<Milliseconds, Hours>(2.7777777777E-7);
}
TEST_F(TestDurationConversions, Milliseconds_to_Microseconds)
{
	check_conversion<Milliseconds, Microseconds>(1000.0);
}
TEST_F(TestDurationConversions, Milliseconds_to_Minutes)
{
	check_conversion<Milliseconds, Minutes>(1.6666666666E-5);
}
TEST_F(TestDurationConversions, Milliseconds_to_Seconds)
{
	check_conversion<Milliseconds, Seconds>(0.001);
}
TEST_F(TestDurationConversions, Milliseconds_to_Years)
{
	check_conversion<Milliseconds, Years>(3.1709791983E-11);
}
TEST_F(TestDurationConversions, Minutes_to_Days)
{
	check_conversion<Minutes, Days>(6.9444444444E-4);
}
TEST_F(TestDurationConversions, Minutes_to_Hours)
{
	check_conversion<Minutes, Hours>(0.016666666666);
}
TEST_F(TestDurationConversions, Minutes_to_Microseconds)
{
	check_conversion<Minutes, Microseconds>(6.0E7);
}
TEST_F(TestDurationConversions, Minutes_to_Milliseconds)
{
	check_conversion<Minutes, Milliseconds>(60000.0);
}
TEST_F(TestDurationConversions, Minutes_to_Seconds)
{
	check_conversion<Minutes, Seconds>(60.0);
}
TEST_F(TestDurationConversions, Minutes_to_Years)
{
	check_conversion<Minutes, Years>(1.90258751902E-6);
}
TEST_F(TestDurationConversions, Seconds_to_Days)
{
	check_conversion<Seconds, Days>(1.1574074074E-5);
}
TEST_F(TestDurationConversions, Seconds_to_Hours)
{
	check_conversion<Seconds, Hours>(2.7777777777E-4);
}
TEST_F(TestDurationConversions, Seconds_to_Microseconds)
{
	check_conversion<Seconds, Microseconds>(1000000.0);
}
TEST_F(TestDurationConversions, Seconds_to_Milliseconds)
{
	check_conversion<Seconds, Milliseconds>(1000.0);
}
TEST_F(TestDurationConversions, Seconds_to_Minutes)
{
	check_conversion<Seconds, Minutes>(0.016666666666);
}
TEST_F(TestDurationConversions, Seconds_to_Years)
{
	check_conversion<Seconds, Years>(3.1709791983E-8);
}
TEST_F(TestDurationConversions, Years_to_Days)
{
	check_conversion<Years, Days>(365.0);
}
TEST_F(TestDurationConversions, Years_to_Hours)
{
	check_conversion<Years, Hours>(8760.0);
}
TEST_F(TestDurationConversions, Years_to_Microseconds)
{
	check_conversion<Years, Microseconds>(3.1536E13);
}
TEST_F(TestDurationConversions, Years_to_Milliseconds)
{
	check_conversion<Years, Milliseconds>(3.1536E10);
}
TEST_F(TestDurationConversions, Years_to_Minutes)
{
	check_conversion<Years, Minutes>(525600.0);
}
TEST_F(TestDurationConversions, Years_to_Seconds)
{
	check_conversion<Years, Seconds>(3.1536E7);
}

