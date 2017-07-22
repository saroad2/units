/*
 * test_units_pow.cc
 *
 *  Created on: Jul 1, 2017
 *      Author: sagis
 */

#include "units_pow.h"
#include "length_units.h"
#include "area_units.h"
#include "volume_units.h"

#include <gtest/gtest.h>

using units::units_pow;
using units::units_sqr;
using units::units_cube;
using namespace units::length;
using namespace units::area;
using namespace units::volume;

using namespace testing;

class TestUnitsPow : public Test
{
protected:
	void SetUp()
	{
		maxError = 1e-10;
	}

	template<int power, class ResultUnit, class Unit>
	void checkPow(const ResultUnit& expectedResult, const Unit& unit)
	{
		auto actualResult = units_pow<power>(unit);
		auto error = actualResult - expectedResult;
		EXPECT_NEAR(0, error.value(), maxError)
				<< expectedResult << " != " << actualResult;
	}

	template<class ResultUnit, class Unit>
	void checkSqr(const ResultUnit& expectedResult, const Unit& unit)
	{
		auto actualResult = units_sqr<ResultUnit>(unit);
		auto error = actualResult - expectedResult;
		EXPECT_NEAR(0, error.value(), maxError)
				<< expectedResult << " != " << actualResult;
	}

	template<class ResultUnit, class Unit>
	void checkCube(const ResultUnit& expectedResult, const Unit& unit)
	{
		auto actualResult = units_cube<ResultUnit>(unit);
		auto error = actualResult - expectedResult;
		EXPECT_NEAR(0, error.value(), maxError)
				<< expectedResult << " != " << actualResult;
	}

	double maxError;
};

TEST_F(TestUnitsPow, pow_meters_by_2_when_result_type_is_square_meters)
{
	checkPow<2>(9_square_meters, 3_meters);
}

TEST_F(TestUnitsPow, pow_yards_by_2_when_result_type_is_square_yards)
{
	checkPow<2>(9_square_yards, 3_yards);
}

TEST_F(TestUnitsPow, pow_meters_by_3_when_result_type_is_cubic_meters)
{
	checkPow<3>(27_cubic_meters, 3_meters);
}

TEST_F(TestUnitsPow, pow_yards_by_3_when_result_type_is_cubic_yards)
{
	checkPow<3>(27_cubic_yards, 3_yards);
}

TEST_F(TestUnitsPow, sqr_meters_when_result_type_is_square_meters)
{
	checkSqr(9_square_meters, 3_meters);
}

TEST_F(TestUnitsPow, sqr_yards_when_result_type_is_square_yards)
{
	checkSqr(9_square_yards, 3_yards);
}

TEST_F(TestUnitsPow, sqr_meters_when_result_type_is_square_yards)
{
	checkSqr(10.763910416709725_square_yards, 3_meters);
}

TEST_F(TestUnitsPow, cube_meters_when_result_type_is_cubic_meters)
{
	checkCube(27_cubic_meters, 3_meters);
}

TEST_F(TestUnitsPow, cube_yards_when_result_type_is_cubic_yards)
{
	checkCube(27_cubic_yards, 3_yards);
}

TEST_F(TestUnitsPow, cube_meters_when_result_type_is_cubic_yards)
{
	checkCube(35.314666721488607_cubic_yards, 3_meters);
}
