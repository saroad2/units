/*
 * test_duration_units.cc
 *
 *  Created on: Jun 29, 2017
 *      Author: sagis
 */

#include "cases.h"
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

// ============================================================

class TestDurationUnitsConversions : public TestUnitsConversions
{
};

TEST_F(TestDurationUnitsConversions, microseconds_to_seconds)
{
	check_conversions<Microseconds, Seconds>(1e-6, 1e+6);
}

TEST_F(TestDurationUnitsConversions, milliseconds_to_seconds)
{
	check_conversions<Milliseconds, Seconds>(1e-3, 1e+3);
}

TEST_F(TestDurationUnitsConversions, minutes_to_seconds)
{
	check_conversions<Minutes, Seconds>(60, 0.016666666666);
}

TEST_F(TestDurationUnitsConversions, hours_to_seconds)
{
	check_conversions<Hours, Seconds>(3600, 0.00027777777777);
}

TEST_F(TestDurationUnitsConversions, days_to_seconds)
{
	check_conversions<Days, Seconds>(86400, 0.000011574074074);
}

TEST_F(TestDurationUnitsConversions, years_to_seconds)
{
	check_conversions<Years, Seconds>(31536000, 3.1709791983e-8);
}

TEST_F(TestDurationUnitsConversions, milliseconds_to_microseconds)
{
	check_conversions<Milliseconds, Microseconds>(1e+3, 1e-3);
}

TEST_F(TestDurationUnitsConversions, minutes_to_microseconds)
{
	check_conversions<Minutes, Microseconds>(6e+7, 1.6666666666e-8);
}

TEST_F(TestDurationUnitsConversions, hours_to_microseconds)
{
	check_conversions<Hours, Microseconds>(3.6e+9, 2.7777777777e-10);
}

TEST_F(TestDurationUnitsConversions, days_to_microseconds)
{
	check_conversions<Days, Microseconds>(8.64e+10, 1.15740740740e-11);
}

TEST_F(TestDurationUnitsConversions, years_to_microseconds)
{
	check_conversions<Years, Microseconds>(3.1536e+13, 3.1709791983e-14);
}

TEST_F(TestDurationUnitsConversions, minutes_to_milliseconds)
{
	check_conversions<Minutes, Milliseconds>(6e+4, 1.6666666666e-5);
}

TEST_F(TestDurationUnitsConversions, hours_to_milliseconds)
{
	check_conversions<Hours, Milliseconds>(3.6e+6, 2.7777777777e-7);
}

TEST_F(TestDurationUnitsConversions, days_to_milliseconds)
{
	check_conversions<Days, Milliseconds>(8.64e+7, 1.1574074074e-8);
}

TEST_F(TestDurationUnitsConversions, years_to_milliseconds)
{
	check_conversions<Years, Milliseconds>(3.1536e+10, 3.1709791983e-11);
}

TEST_F(TestDurationUnitsConversions, hours_to_minutes)
{
	check_conversions<Hours, Minutes>(60, 0.016666666666);
}

TEST_F(TestDurationUnitsConversions, days_to_minutes)
{
	check_conversions<Days, Minutes>(1440, 0.00069444444444);
}

TEST_F(TestDurationUnitsConversions, years_to_minutes)
{
	check_conversions<Years, Minutes>(525600, 1.90258751902e-6);
}

TEST_F(TestDurationUnitsConversions, days_to_hours)
{
	check_conversions<Days, Hours>(24, 0.04166666666666);
}

TEST_F(TestDurationUnitsConversions, years_to_hours)
{
	check_conversions<Years, Hours>(8760, 0.000114155251141);
}

TEST_F(TestDurationUnitsConversions, years_to_days)
{
	check_conversions<Years, Days>(365, 0.00273972602739);
}

// ============================================================

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
