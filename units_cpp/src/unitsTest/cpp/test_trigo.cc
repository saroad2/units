/*
 * test_trigo.cc
 *
 *  Created on: Jun 29, 2017
 *      Author: sagis
 */

#include "trigo.h"
#include "angle_units.h"
#include "length_units.h"

#include <gtest/gtest.h>
#include <boost/fusion/adapted/boost_tuple.hpp>
#include <boost/fusion/algorithm/iteration/for_each.hpp>
#include <all_units.h>
#include <functional>
#include <vector>

using namespace units::angle;
using namespace units::trigo;
using namespace testing;
using boost::tuples::get;
using boost::fusion::for_each;
using std::function;
using std::vector;

class TestTrigo : public Test
{
protected:
	using ValuesTuple = boost::tuples::tuple<ANGLE_UNITS()>;
	using ValuesAndResultPair = boost::tuples::tuple<ValuesTuple, double>;

	void run(
			vector<ValuesAndResultPair> valuesAndResultPairs,
			auto function,
			auto reverseFunction)
	{
		for (auto valuesAndResultPair : valuesAndResultPairs)
		{
			auto values = get<0>(valuesAndResultPair);
			auto result = get<1>(valuesAndResultPair);
			auto forEachFunction = [&function, &result](const auto& unit) {
				function(unit, result);
			};
			auto forEachReverseFunction = [&reverseFunction, &result](const auto& unit) {
				reverseFunction(unit, result);
			};
			for_each(values, forEachFunction);
			for_each(values, forEachReverseFunction);
		}
	}
	static constexpr double maxError = 1e-9;
};

TEST_F(TestTrigo, cos_and_acos)
{
	vector<ValuesAndResultPair> data{
		{ValuesTuple{Degrees{0},	Mils{0},			Radians{0}}, 1},
		{ValuesTuple{Degrees{30},	Mils{1600.0 / 3},	Radians{M_PI / 6}}, sqrt(3) / 2},
		{ValuesTuple{Degrees{45}, 	Mils{800},			Radians{M_PI_4}}, sqrt(0.5)},
		{ValuesTuple{Degrees{60}, 	Mils{3200.0 / 3},	Radians{M_PI / 3}}, 0.5},
		{ValuesTuple{Degrees{90}, 	Mils{1600}, 		Radians{M_PI_2}}, 0}
	};

	auto function = [](const auto& unit, const auto& result) {
		EXPECT_NEAR(cos(unit), result, maxError);
	};

	auto reverseFunction = [](auto unit, const auto& result) {
		using Unit = decltype(unit);
		EXPECT_NEAR(acos<Unit>(result).value(), unit.value(), maxError);
	};

	run(data, function, reverseFunction);
}

TEST_F(TestTrigo, sin_and_asin)
{
	vector<ValuesAndResultPair> data{
		{ValuesTuple{Degrees{0},	Mils{0},			Radians{0}}, 0},
		{ValuesTuple{Degrees{30},	Mils{1600.0 / 3},	Radians{M_PI / 6}}, 0.5},
		{ValuesTuple{Degrees{45}, 	Mils{800},			Radians{M_PI_4}}, sqrt(0.5)},
		{ValuesTuple{Degrees{60}, 	Mils{3200.0 / 3},	Radians{M_PI / 3}}, sqrt(3) / 2},
		{ValuesTuple{Degrees{90}, 	Mils{1600},			Radians{M_PI_2}}, 1}
	};

	auto function = [](const auto& unit, const auto& result) {
		EXPECT_NEAR(sin(unit), result, maxError);
	};

	auto reverseFunction = [](auto unit, const auto& result) {
		using Unit = decltype(unit);
		EXPECT_NEAR(asin<Unit>(result).value(), unit.value(), maxError);
	};

	run(data, function, reverseFunction);
}

TEST_F(TestTrigo, tan_and_atan)
{
	vector<ValuesAndResultPair> data{
		{ValuesTuple{Degrees{0},	Mils{0},			Radians{0}}, 0},
		{ValuesTuple{Degrees{30},	Mils{1600.0 / 3},	Radians{M_PI / 6}}, 1 / sqrt(3)},
		{ValuesTuple{Degrees{45}, 	Mils{800},			Radians{M_PI_4}}, 1},
		{ValuesTuple{Degrees{60}, 	Mils{3200.0 / 3},	Radians{M_PI / 3}}, sqrt(3)},
	};

	auto function = [](const auto& unit, const auto& result) {
		EXPECT_NEAR(tan(unit), result, maxError);
	};

	auto reverseFunction = [](auto unit, const auto& result) {
		using Unit = decltype(unit);
		EXPECT_NEAR(atan<Unit>(result).value(), unit.value(), maxError);
	};

	run(data, function, reverseFunction);
}

TEST_F(TestTrigo, atan2)
{
	EXPECT_NEAR(
			atan2<Degrees>(
				units::length::Meters{0},
				units::length::Meters{8}).value(),
			0,
			maxError);
	EXPECT_NEAR(
			atan2<Radians>(
				units::length::Inches{2 * sqrt(3)},
				units::length::Inches{2}).value(),
			M_PI / 3,
			maxError);
	EXPECT_NEAR(
			atan2<Mils>(
				units::length::Feet{5.2},
				units::length::Feet{5.2}).value(),
			800,
			maxError);
}
