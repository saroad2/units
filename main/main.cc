/*
 * main.cc
 *
 *  Created on: Jun 26, 2017
 *      Author: sagis
 */

#include "units/include/length_units.h"
#include <gtest/gtest.h>
#include <iostream>

using std::cout;
using std::endl;
using units::length::Meters;
using namespace testing;

int main(int argc, char** argv)
{
	InitGoogleTest(&argc, argv);
	return RUN_ALL_TESTS();
}
