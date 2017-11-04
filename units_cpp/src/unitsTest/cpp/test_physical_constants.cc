/*
 * test_wgs84.cc
 *
 *  Created on: Nov 1, 2017
 *      Author: sagis
 */

#include <gtest/gtest.h>
#include <units/constants/physical_constants.h>

#include <cmath>
#include <iostream>

using namespace testing;
using namespace units::physical_constants;

class TestPhysicalConstants : public Test
{
protected:
	static constexpr double error = 1e-10;
};

TEST_F(TestPhysicalConstants, testPlankConstantToReducedPlankConstantRelation)
{
	ASSERT_NEAR(plankConstant.value(), 2 * M_PI * reducedPlankConstant.value(), error);
}
