/*
 * test_duration_units.cc
 *
 *  Created on: Jun 29, 2017
 *      Author: sagis
 */

#include <units/cases.h>
#include <units/duration_units.h>

#include <gtest/gtest.h>

using namespace units::duration;
using namespace testing;

class TestDurationChronoConstructors : public Test
{
protected:
	template<class UnitClass, class ChronoClass>
	void check_chrono_constructor()
	{
		int value = 5;
		ChronoClass chrono{5};
		UnitClass unit{chrono};
		EXPECT_DOUBLE_EQ(unit.value(), (double)value);
	}
};

TEST_F(TestDurationChronoConstructors, microseconds)
{
	check_chrono_constructor<Microseconds, std::chrono::microseconds>();
}

TEST_F(TestDurationChronoConstructors, milliseconds)
{
	check_chrono_constructor<Milliseconds, std::chrono::milliseconds>();
}

TEST_F(TestDurationChronoConstructors, seconds)
{
	check_chrono_constructor<Seconds, std::chrono::seconds>();
}

TEST_F(TestDurationChronoConstructors, minutes)
{
	check_chrono_constructor<Minutes, std::chrono::minutes>();
}

TEST_F(TestDurationChronoConstructors, hours)
{
	check_chrono_constructor<Hours, std::chrono::hours>();
}

class TestDurationUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestDurationUnitsPrintings, print_microseconds)
{
	check_print<Microseconds>("microseconds");
}

TEST_F(TestDurationUnitsPrintings, print_milliseconds)
{
	check_print<Milliseconds>("milliseconds");
}

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

// ============================================================

#define TEST_DURATION_USER_DEFINE_LITERALS(Name, name) \
		TEST_USER_DEFINES_LITERALS(Duration, Name, name);

TEST_DURATION_USER_DEFINE_LITERALS(Microseconds, microseconds);
TEST_DURATION_USER_DEFINE_LITERALS(Milliseconds, milliseconds);
TEST_DURATION_USER_DEFINE_LITERALS(Seconds, seconds);
TEST_DURATION_USER_DEFINE_LITERALS(Minutes, minutes);
TEST_DURATION_USER_DEFINE_LITERALS(Hours, hours);
TEST_DURATION_USER_DEFINE_LITERALS(Days, days);
TEST_DURATION_USER_DEFINE_LITERALS(Years, years);
