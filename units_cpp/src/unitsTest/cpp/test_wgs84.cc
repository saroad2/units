/*
 * test_wgs84.cc
 *
 *  Created on: Nov 1, 2017
 *      Author: sagis
 */

#include <gtest/gtest.h>
#include <units/constants/wgs84.h>

using namespace testing;
using namespace units::wgs84;

TEST(TestWGS84, testFlatenningIsCurrect)
{
	ASSERT_EQ(semiMajorAxis, (1 + flattening) * semiMinorAxis);
}
