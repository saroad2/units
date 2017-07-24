/*
 * test_units_multiply.cc
 *
 *  Created on: Jul 1, 2017
 *      Author: sagis
 */

#include <units/units_multiply.h>
#include <units/length_units.h>
#include <units/area_units.h>
#include <units/volume_units.h>
#include <units/duration_units.h>
#include <units/speed_units.h>
#include <units/angle_units.h>
#include <units/angular_speed_units.h>

#include <gtest/gtest.h>

using units::units_multiply;
using namespace units::length;
using namespace units::area;
using namespace units::volume;
using namespace units::duration;
using namespace units::speed;
using namespace units::angle;
using namespace units::angular_speed;

using namespace testing;

class TestUnitsMultiply : public Test
{
protected:
	void SetUp()
	{
		maxError = 1e-10;
	}

	template<class ResultUnit, class... Units>
	void checkMultiplication(const ResultUnit& expectedResult, const Units&... units)
	{
		auto actualResult = units_multiply<ResultUnit>(units...);
		auto error = actualResult - expectedResult;
		EXPECT_NEAR(0, error.value(), maxError)
				<< expectedResult << " != " << actualResult;
	}
	double maxError;
};

TEST_F(TestUnitsMultiply, multiply_two_meters_values_when_result_type_is_square_meters)
{
	checkMultiplication(15_square_meters, 3_meters, 5_meters);
}

TEST_F(TestUnitsMultiply, multiply_two_meters_values_when_result_type_is_square_yards)
{
	checkMultiplication(17.93985069451621_square_yards, 3_meters, 5_meters);
}

TEST_F(TestUnitsMultiply, multiply_meters_and_yards_values_when_result_type_is_square_meters)
{
	checkMultiplication(0.9144_square_meters, 1_meters, 1_yards);
}

TEST_F(TestUnitsMultiply, multiply_three_meters_values_when_result_type_is_cubic_meters)
{
	checkMultiplication(30_cubic_meters, 3_meters, 5_meters, 2_meters);
}

TEST_F(TestUnitsMultiply, multiply_meters_feet_and_yards_values_when_result_type_is_cubic_meters)
{
	checkMultiplication(3.34450944_cubic_meters, 1_meters, 2_feet, 6_yards);
}

TEST_F(TestUnitsMultiply, multiply_three_meters_values_when_result_type_is_liters)
{
	checkMultiplication(30000_liters, 3_meters, 5_meters, 2_meters);
}

TEST_F(TestUnitsMultiply, multiply_meters_per_second_with_second_when_return_type_is_meters)
{
	checkMultiplication(15_meters, 5_meters_per_second, 3_seconds);
}

TEST_F(TestUnitsMultiply, multiply_knots_with_minutes_when_return_type_is_yards)
{
	checkMultiplication(168.78109372998691_yards, 5_minutes, 1_knots);
}

TEST_F(TestUnitsMultiply, multiply_degrees_per_second_with_second_when_return_type_is_degrees)
{
	checkMultiplication(15_degrees, 5_degrees_per_second, 3_seconds);
}

TEST_F(TestUnitsMultiply, multiply_radians_per_second_with_minutes_when_return_type_is_degrees)
{
	checkMultiplication(171.88733853924697_degrees, 0.01_radians_per_second, 5_minutes);
}
