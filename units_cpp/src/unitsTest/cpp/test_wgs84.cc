/*
 * test_wgs84.cc
 *
 *  Created on: Nov 1, 2017
 *      Author: sagis
 */

#include <gtest/gtest.h>
#include <units/constants/wgs84.h>

#include <cmath>

using namespace testing;
using namespace units::wgs84;

class TestWGS84 : public Test
{
protected:
	static constexpr double error = 1e-10;
};

TEST_F(TestWGS84, testFlatenningToAxisesRelation)
{
	ASSERT_NEAR(
		flattening,
		1 - semiMinorAxis.value() / semiMajorAxis.value(),
		error);
}

TEST_F(TestWGS84, testFirstEccenticityToAxisesRelation)
{
	ASSERT_NEAR(
		firstEccentricity,
		std::sqrt(1 - pow(semiMinorAxis.value() / semiMajorAxis.value(), 2)),
		error);
}

TEST_F(TestWGS84, testFirstEccenticityToFlatteningRelation)
{
	ASSERT_NEAR(
		firstEccentricity,
		std::sqrt(flattening * (2 - flattening)),
		error);
}

TEST_F(TestWGS84, testSecondEccenticityToAxisesRelation)
{
	ASSERT_NEAR(
		secondEccentricity,
		std::sqrt(pow(semiMajorAxis.value() / semiMinorAxis.value(), 2) - 1),
		error);
}

TEST_F(TestWGS84, testSecondEccenticityToFlatteningRelation)
{
	ASSERT_NEAR(
		secondEccentricity * (1 - flattening),
		firstEccentricity,
		error);
}
