/*
 * test_units_pow.cc
 *
 *  Created on: Jul 1, 2017
 *      Author: sagis
 */

#include <units/units_pow.h>
#include <units/units_cast.h>
#include <units/length_units.h>
#include <units/area_units.h>
#include <units/volume_units.h>

#include <gtest/gtest.h>
#include <cmath>

using units::units_pow;
using units::auto_units_sqr;
using units::units_sqr;
using units::auto_units_cube;
using units::units_cube;
using units::units_cast;
using namespace units::length;
using namespace units::area;
using namespace units::volume;

using namespace testing;

static constexpr double maxPercentageError{1e-10};

class TestUnitsPow : public Test
{
protected:

	template<class Unit>
	void checkValue(const Unit& expected, const Unit& actual)
	{
		auto errorPercentage = std::fabs(expected.scalarRatio(actual) - 1) * 100;
		EXPECT_LT(errorPercentage, maxPercentageError)
				<< expected << " != " << actual;
	}

	template<int power, class ResultUnit, class Unit>
	void checkPow(const ResultUnit& expectedResult, const Unit& unit)
	{
		checkValue(expectedResult, units_cast<ResultUnit>(units_pow<power>(unit)));
	}

	template<class ResultUnit, class Unit>
	void checkSqr(const ResultUnit& squareUnit, const Unit& unit)
	{
		checkValue(squareUnit, units_cast<ResultUnit>(auto_units_sqr(unit)));
		checkValue(squareUnit, units_sqr<ResultUnit>(unit));
	}

	template<class ResultUnit, class Unit>
	void checkCube(const ResultUnit& expectedResult, const Unit& unit)
	{
		checkValue(expectedResult, units_cast<ResultUnit>(auto_units_cube(unit)));
		checkValue(expectedResult, units_cube<ResultUnit>(unit));
	}
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
