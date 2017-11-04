/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef _PHYSICAL_CONSTANTS_
#define _PHYSICAL_CONSTANTS_

#include <units/electric_charge_units.h>
#include <units/internal/units_ratio_type.h>
#include <units/energy_units.h>
#include <units/force_units.h>
#include <units/duration_units.h>
#include <units/length_units.h>
#include <units/internal/units_multiply_type.h>
#include <units/speed_units.h>


namespace units {
namespace physical_constants
{

constexpr speed::MetersPerSecond speedOfLight{2.99792458E8};
constexpr Multiply<energy::Joules, duration::Seconds> planckConstant{6.62607004E-34};
constexpr Multiply<energy::Joules, duration::Seconds> reducedPlanckConstant{1.0545718E-34};
constexpr Ratio<
	Multiply<force::Newtons, length::Meters, length::Meters>,
	Multiply<duration::Seconds, duration::Seconds>> gravitationalConstant{6.67408E-11};
constexpr electric_charge::Coulombs elementaryCharge{1.6021766208E-19};


}
}

#endif /* _PHYSICAL_CONSTANTS_ */