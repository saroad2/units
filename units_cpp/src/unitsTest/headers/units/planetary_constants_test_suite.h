/*
 * planeray_constants_test_suite.h
 *
 *  Created on: Dec 27, 2017
 *      Author: sagis
 */

#ifndef SRC_UNITSTEST_CPP_CONSTANTS_PLANERAY_CONSTANTS_TEST_SUITE_H_
#define SRC_UNITSTEST_CPP_CONSTANTS_PLANERAY_CONSTANTS_TEST_SUITE_H_

#include <gtest/gtest.h>
#include <cmath>

using namespace testing;

class PlanetaryConstantsTestSuite : public Test

{
protected:

	PlanetaryConstantsTestSuite(double maxErrorPercentage_)
	: maxErrorPercentage{maxErrorPercentage_}
	{
	}

	template<class UnitClass>
	void checkEqualValue(const UnitClass& expected, const UnitClass& actual)
	{
		auto errorPercentage = std::fabs((expected.scalarRatio(actual) - 1) * 100);
		EXPECT_LT(errorPercentage, maxErrorPercentage);
	}

private:
	double maxErrorPercentage;
};



#endif /* SRC_UNITSTEST_CPP_CONSTANTS_PLANERAY_CONSTANTS_TEST_SUITE_H_ */
