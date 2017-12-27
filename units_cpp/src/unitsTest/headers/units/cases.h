/*
 * cases.h
 *
 *  Created on: Jun 30, 2017
 *      Author: sagis
 */

#ifndef UNIT_TESTS_CASES_H_
#define UNIT_TESTS_CASES_H_

#include <units/units_cast.h>

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

	template<class Unit1, class Unit2>
	void check_conversion(double unit1InUnit2) const
	{
		auto expected = Unit2{unit1InUnit2};
		auto actual= units::units_cast<Unit2>(Unit1{1});
		auto error = (actual.scalarRatio(expected) - 1) * 100;
		EXPECT_NEAR(error, 0, maxErrorPercent)
			<< std::setprecision(30)
			<< expected << " != " << actual.value()
			<< "(" << error << "% error)"
			<< std::fixed;
	}

	static constexpr double maxErrorPercent = 1e-8;
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

#endif /* UNIT_TESTS_CASES_H_ */
