/*
 * physical_constants.h
 *
 *  Created on: Nov 3, 2017
 *      Author: sagis
 */

#ifndef SRC_UNITS_HEADERS_UNITS_CONSTANTS_PHYSICAL_CONSTANTS_H_
#define SRC_UNITS_HEADERS_UNITS_CONSTANTS_PHYSICAL_CONSTANTS_H_

#include <units/length_units.h>
#include <units/speed_units.h>
#include <units/force_units.h>
#include <units/energy_units.h>
#include <units/electric_charge_units.h>
#include <units/duration_units.h>
#include <units/internal/units_multiply_type.h>
#include <units/internal/units_ratio_type.h>

namespace units {
namespace physical_constants
{

constexpr speed::MetersPerSecond speedOfLight{299792458};
constexpr Multiply<energy::Joules, duration::Seconds> plankConstant{6.626070040e-34};
constexpr Multiply<energy::Joules, duration::Seconds> reducedPlankConstant{1.054571800e-34};
constexpr Ratio<
	Multiply<force::Newtons, length::Meters, length::Meters>,
	Multiply<duration::Seconds, duration::Seconds>> gravitationalConstant{6.67408};
constexpr electric_charge::Coulombs elementaryCharge{1.6021766208e-19};

}
}

#endif /* SRC_UNITS_HEADERS_UNITS_CONSTANTS_PHYSICAL_CONSTANTS_H_ */
