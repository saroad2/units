/*
 * test_units_ratio.cc
 *
 *  Created on: Jul 1, 2017
 *      Author: sagis
 */

#include "units/include/units_ratio.h"
#include "units/include/length_units.h"
#include "units/include/area_units.h"
#include "units/include/volume_units.h"
#include "units/include/duration_units.h"
#include "units/include/speed_units.h"
#include "units/include/angle_units.h"
#include "units/include/angular_speed_units.h"

#include <gtest/gtest.h>

using units::units_ratio;
using namespace units::length;
using namespace units::area;
using namespace units::volume;
using namespace units::duration;
using namespace units::speed;
using namespace units::angle;
using namespace units::angular_speed;

using namespace testing;

class TestUnitsRatio : public Test
{
protected:
	void SetUp()
	{
		maxError = 1e-10;
	}

	template<class ResultUnit, class Unit1, class Unit2>
	void checkRatio(const ResultUnit& expectedResult, const Unit1& unit1, const Unit2 unit2)
	{
		auto actualResult = units_ratio<ResultUnit>(unit1, unit2);
		auto error = actualResult - expectedResult;
		EXPECT_NEAR(0, error.value(), maxError)
				<< expectedResult << " != " << actualResult;
	}
	double maxError;
};

TEST_F(TestUnitsRatio, ratio_square_meters_from_meters_when_result_type_is_meters)
{
	checkRatio(3_meters, 15_square_meters, 5_meters);
}

TEST_F(TestUnitsRatio, ratio_square_yards_from_meters_when_result_type_is_meters)
{
	checkRatio(3_meters, 17.939850749053353_square_yards, 5_meters);
}

TEST_F(TestUnitsRatio, ratio_square_meters_from_meters_when_result_type_is_yards)
{
	checkRatio(1_yards, 0.914399998610112_square_meters, 1_meters);
}

TEST_F(TestUnitsRatio, ratio_cubic_meters_from_square_meters_when_result_type_is_meters)
{
	checkRatio(5_meters, 15_cubic_meters, 3_square_meters);
}

TEST_F(TestUnitsRatio, ratio_cubic_meters_from_meters_when_result_type_is_square_meters)
{
	checkRatio(3_square_meters, 15_cubic_meters, 5_meters);
}

TEST_F(TestUnitsRatio, ratio_cubic_yards_from_square_meters_when_result_type_is_feet)
{
	checkRatio(19.619259379179709_feet, 15_cubic_meters, 3_square_yards);
}

TEST_F(TestUnitsRatio, ratio_meters_from_second_when_result_type_is_meters_per_second)
{
	checkRatio(5_meters_per_second, 15_meters, 3_seconds);
}

TEST_F(TestUnitsRatio, ratio_meters_from_meters_per_second_when_result_type_is_seconds)
{
	checkRatio(3_seconds, 15_meters, 5_meters_per_second);
}

TEST_F(TestUnitsRatio, ratio_yards_from_minutes_when_result_type_is_knots)
{
	checkRatio(0.017774502636174101_knots, 3_yards, 5_minutes);
}

TEST_F(TestUnitsRatio, ratio_degrees_from_second_when_result_type_is_degrees_per_second)
{
	checkRatio(5_degrees_per_second, 15_degrees, 3_seconds);
}

TEST_F(TestUnitsRatio, ratio_degrees_from_degrees_per_second_when_result_type_is_seconds)
{
	checkRatio(3_seconds, 15_degrees, 5_degrees_per_second);
}

TEST_F(TestUnitsRatio, ratio_radians_from_minutes_when_result_type_is_degrees_per_second)
{
	checkRatio(0.57295779513082323_degrees_per_second, 3_radians, 5_minutes);
}
