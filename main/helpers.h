/*
 * test_helpers.h
 *
 *  Created on: Jun 28, 2017
 *      Author: sagis
 */

#ifndef MAIN_HELPERS_H_
#define MAIN_HELPERS_H_

#include "units/include/length_units.h"

#define LENGTH_UNITS() \
		units::length::Inches, \
		units::length::Feet, \
		units::length::Yards, \
		units::length::Meters, \
		units::length::Micrometers, \
		units::length::Millimeters, \
		units::length::Centimeters, \
		units::length::Kilometers

#endif /* MAIN_HELPERS_H_ */
