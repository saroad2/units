/*
 * test_helpers.h
 *
 *  Created on: Jun 28, 2017
 *      Author: sagis
 */

#ifndef MAIN_ALL_UNITS_H_
#define MAIN_ALL_UNITS_H_

#include "units/include/length_units.h"
#include "units/include/angle_units.h"
#include "units/include/duration_units.h"
#include "units/include/area_units.h"

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

#define AREA_UNITS() \
		units::area::FeetSquared, \
		units::area::YardsSquared, \
		units::area::MetersSquared, \
		units::area::KilometersSquared, \
		units::area::Dunams

#define ALL_UNITS() \
		LENGTH_UNITS(), \
		ANGLE_UNITS(), \
		DURATION_UNITS(), \
		AREA_UNITS()

#endif /* MAIN_ALL_UNITS_H_ */