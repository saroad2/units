/*
 * test_units_ratio.cc
 *
 *  Created on: Jul 1, 2017
 *      Author: sagis
 */

#include <units/duration_units.h>
#include <units/cast_from_chrono.h>
#include <units/units_cast.h>
#include <gtest/gtest.h>

using namespace testing;
using namespace units::duration;
using units::units_cast;

class TestCastFromChrono : public Test
{
protected:
	template<class UnitsClass, class ChronoClass>
	void checkCasting() const
	{
		ASSERT_EQ(UnitsClass{2}, cast_from_chrono(ChronoClass{2}));
	}
};

TEST_F(TestCastFromChrono, test_cast_chrono_microseconds)
{
	checkCasting<Microseconds, std::chrono::microseconds>();
}

TEST_F(TestCastFromChrono, test_cast_chrono_milliseconds)
{
	checkCasting<Milliseconds, std::chrono::milliseconds>();
}

TEST_F(TestCastFromChrono, test_cast_chrono_seconds)
{
	checkCasting<Seconds, std::chrono::seconds>();
}

TEST_F(TestCastFromChrono, test_cast_chrono_minutes)
{
	checkCasting<Minutes, std::chrono::minutes>();
}

TEST_F(TestCastFromChrono, test_cast_chrono_hours)
{
	checkCasting<Hours, std::chrono::hours>();
}

/* The following tests checks that chrono and units cast the same way.
 */

TEST_F(TestCastFromChrono, test_equal_cast_from_hours_to_minutes)
{
	std::chrono::hours h{2};
	ASSERT_EQ(
			units_cast<Minutes>(cast_from_chrono(h)),
			cast_from_chrono(std::chrono::duration_cast<std::chrono::minutes>(h)));
}

TEST_F(TestCastFromChrono, test_equal_cast_from_minutes_to_seconds)
{
	std::chrono::minutes m{2};
	ASSERT_EQ(
			units_cast<Seconds>(cast_from_chrono(m)),
			cast_from_chrono(std::chrono::duration_cast<std::chrono::seconds>(m)));
}

TEST_F(TestCastFromChrono, test_equal_cast_from_seconds_to_milliseconds)
{
	std::chrono::seconds s{2};
	ASSERT_EQ(
			units_cast<Milliseconds>(cast_from_chrono(s)),
			cast_from_chrono(std::chrono::duration_cast<std::chrono::milliseconds>(s)));
}

TEST_F(TestCastFromChrono, test_equal_cast_from_milliseconds_to_microseconds)
{
	std::chrono::milliseconds ms{2};
	ASSERT_DOUBLE_EQ(
			units_cast<Microseconds>(cast_from_chrono(ms)).value(),
			cast_from_chrono(std::chrono::duration_cast<std::chrono::microseconds>(ms)).value());
}
