/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#include <units/length_units.h>
#include <units/angle_units.h>
#include <units/mass_units.h>
#include <units/duration_units.h>
#include <units/electric_current_units.h>
#include <units/electric_charge_units.h>
#include <units/speed_units.h>
#include <units/angular_speed_units.h>
#include <units/area_units.h>
#include <units/volume_units.h>
#include <units/force_units.h>
#include <units/energy_units.h>
#include <units/frequency_units.h>
#include <units/acceleration_units.h>


#ifndef UNIT_TESTS_ALL_UNITS_H_
#define UNIT_TESTS_ALL_UNITS_H_


#define LENGTH_UNITS() \
	units::length::Meters, \
	units::length::Inches, \
	units::length::Feet, \
	units::length::Yards, \
	units::length::StatuteMiles, \
	units::length::NauticalMiles, \
	units::length::GeographicalMiles, \
	units::length::DegreesOfLatitude, \
	units::length::Micrometers, \
	units::length::Millimeters, \
	units::length::Centimeters, \
	units::length::Kilometers


#define ANGLE_UNITS() \
	units::angle::Degrees, \
	units::angle::Mils, \
	units::angle::Radians


#define MASS_UNITS() \
	units::mass::Grams, \
	units::mass::Pounds, \
	units::mass::Milligrams, \
	units::mass::Kilograms, \
	units::mass::Tonnes


#define DURATION_UNITS() \
	units::duration::Seconds, \
	units::duration::Minutes, \
	units::duration::Hours, \
	units::duration::Days, \
	units::duration::Years, \
	units::duration::Microseconds, \
	units::duration::Milliseconds


#define ELECTRIC_CURRENT_UNITS() \
	units::electric_current::Amperes


#define ELECTRIC_CHARGE_UNITS() \
	units::electric_charge::Coulombs


#define SPEED_UNITS() \
	units::speed::FeetPerSecond, \
	units::speed::YardsPerSecond, \
	units::speed::MetersPerSecond, \
	units::speed::KilometersPerHour, \
	units::speed::Knots


#define ANGULAR_SPEED_UNITS() \
	units::angular_speed::DegreesPerSecond, \
	units::angular_speed::RadiansPerSecond, \
	units::angular_speed::MilsPerSecond


#define AREA_UNITS() \
	units::area::SquareFeet, \
	units::area::SquareYards, \
	units::area::SquareMeters, \
	units::area::SquareKilometers, \
	units::area::Dunams


#define VOLUME_UNITS() \
	units::volume::CubicFeet, \
	units::volume::CubicYards, \
	units::volume::CubicMeters, \
	units::volume::CubicKilometers, \
	units::volume::Liters, \
	units::volume::Milliliters


#define FORCE_UNITS() \
	units::force::Newtons, \
	units::force::Dynes


#define ENERGY_UNITS() \
	units::energy::Joules, \
	units::energy::Calories, \
	units::energy::Kilocalories, \
	units::energy::Kilojoules, \
	units::energy::Megajoules


#define FREQUENCY_UNITS() \
	units::frequency::Hertz, \
	units::frequency::Kilohertz, \
	units::frequency::Megahertz


#define ACCELERATION_UNITS() \
	units::acceleration::MetersPerSquareSeconds



#define ALL_UNITS() \
	LENGTH_UNITS(), \
	ANGLE_UNITS(), \
	MASS_UNITS(), \
	DURATION_UNITS(), \
	ELECTRIC_CURRENT_UNITS(), \
	ELECTRIC_CHARGE_UNITS(), \
	SPEED_UNITS(), \
	ANGULAR_SPEED_UNITS(), \
	AREA_UNITS(), \
	VOLUME_UNITS(), \
	FORCE_UNITS(), \
	ENERGY_UNITS(), \
	FREQUENCY_UNITS(), \
	ACCELERATION_UNITS()

#endif /* UNIT_TESTS_ALL_UNITS_H_ */