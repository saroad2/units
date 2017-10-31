/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#include <units/cases.h>
#include <units/duration_units.h>

#include <gtest/gtest.h>

using namespace testing;
using namespace units::duration;

class TestDurationUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestDurationUnitsPrintings, print_seconds)
{
	check_print<Seconds>("seconds");
}
TEST_F(TestDurationUnitsPrintings, print_minutes)
{
	check_print<Minutes>("minutes");
}
TEST_F(TestDurationUnitsPrintings, print_hours)
{
	check_print<Hours>("hours");
}
TEST_F(TestDurationUnitsPrintings, print_days)
{
	check_print<Days>("days");
}
TEST_F(TestDurationUnitsPrintings, print_years)
{
	check_print<Years>("years");
}
TEST_F(TestDurationUnitsPrintings, print_microseconds)
{
	check_print<Microseconds>("microseconds");
}
TEST_F(TestDurationUnitsPrintings, print_milliseconds)
{
	check_print<Milliseconds>("milliseconds");
}


// ============================================================

#define TEST_DURATION_USER_DEFINE_LITERALS(Name, name) \
		TEST_USER_DEFINES_LITERALS(Duration, Name, name);

TEST_DURATION_USER_DEFINE_LITERALS(Seconds, seconds);
TEST_DURATION_USER_DEFINE_LITERALS(Minutes, minutes);
TEST_DURATION_USER_DEFINE_LITERALS(Hours, hours);
TEST_DURATION_USER_DEFINE_LITERALS(Days, days);
TEST_DURATION_USER_DEFINE_LITERALS(Years, years);
TEST_DURATION_USER_DEFINE_LITERALS(Microseconds, microseconds);
TEST_DURATION_USER_DEFINE_LITERALS(Milliseconds, milliseconds);
