/*
 * test_helpers.h
 *
 *  Created on: Jun 28, 2017
 *      Author: sagis
 */

#ifndef MAIN_HELPERS_H_
#define MAIN_HELPERS_H_

#include "units/include/length_units.h"
#include "units/include/angle_units.h"
#include "units/include/duration_units.h"

#include "units/include/units_cast.h"

#include <gtest/gtest.h>
#include <sstream>
#include <string>

#define LENGTH_UNITS() \
		units::length::Inches, \
		units::length::Feet, \
		units::length::Yards, \
		units::length::Meters, \
		units::length::Micrometers, \
		units::length::Millimeters, \
		units::length::Centimeters, \
		units::length::Kilometers

#define ANGLE_UNITS() \
		units::angle::Mils, \
		units::angle::Degrees, \
		units::angle::Radians

#define DURATION_UNITS() \
		units::duration::Microseconds, \
		units::duration::Milliseconds, \
		units::duration::Seconds, \
		units::duration::Minutes, \
		units::duration::Hours, \
		units::duration::Days, \
		units::duration::Years \

#define ALL_UNITS() \
		LENGTH_UNITS(), \
		ANGLE_UNITS(), \
		DURATION_UNITS()

class TestUnitsConversions : public ::testing::Test
{
protected:
	template<class Unit1, class Unit2>
	void check_conversions(double unit1InUnit2, double unit2InUnit1) const
	{
		check_conversion<Unit1, Unit2>(unit1InUnit2);
		check_conversion<Unit2, Unit1>(unit2InUnit1);
	}

	double maxError;

private:
	template<class Unit1, class Unit2>
	void check_conversion(double unit1InUnit2) const
	{
		auto expected = Unit2{unit1InUnit2};
		auto actual = units::units_cast<Unit2>(Unit1{1});
		EXPECT_NEAR(expected.value(), actual.value(), maxError);
	}
};

class TestUnitsPrintings : public ::testing::Test
{
protected:

	template<class Unit>
	void check_print(const std::string& expectedUnitName) const
	{
		double value{5.123};
		std::string printedValue{"5.123"};
		std::stringstream stream;
		stream << Unit{value};
		EXPECT_EQ(printedValue + " " + expectedUnitName, stream.str());
	}
};

#endif /* MAIN_HELPERS_H_ */
