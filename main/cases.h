/*
 * cases.h
 *
 *  Created on: Jun 30, 2017
 *      Author: sagis
 */

#ifndef MAIN_CASES_H_
#define MAIN_CASES_H_

#include "units/include/units_cast.h"

#include <gtest/gtest.h>
#include <sstream>
#include <string>

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




#endif /* MAIN_CASES_H_ */
