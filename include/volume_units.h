/*
 * volume_units.h
 *
 *  Created on: Jun 30, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_VOLUME_UNITS_H_
#define INCLUDE_VOLUME_UNITS_H_

#include "units/include/internal/units_pow_type.h"
#include "units/include/internal/utils.h"
#include "units/include/length_units.h"

#include <ratio>
namespace units {
namespace volume
{

struct volume_type_tag
{
	using code = std::ratio_multiply<
		std::ratio_multiply<
		typename length::length_tag::code,
		typename length::length_tag::code>,
		typename length::length_tag::code>;
};

using CubicFeet = Cubic<length::Feet>;
using CubicYards = Cubic<length::Yards>;
using CubicMeters = Cubic<length::Meters>;
using CubicKilometers = Cubic<length::Kilometers>;

struct liters_scale_tag
{
	static constexpr double scale = 1e-3 * CubicMeters::scale();
	static std::string singularName();
	static std::string pluralName();
};

using Liters = NumericValue<liters_scale_tag, volume_type_tag>;
using Milliliters = Milli<Liters>;

USER_DEFINED_LITERALS(CubicFeet, cubic_feet);
USER_DEFINED_LITERALS(CubicYards, cubic_yards);
USER_DEFINED_LITERALS(CubicMeters, cubic_meters);
USER_DEFINED_LITERALS(CubicKilometers, cubic_kilometers);
USER_DEFINED_LITERALS(Liters, liters);
USER_DEFINED_LITERALS(Milliliters, milliliters);
}
}

#endif /* INCLUDE_VOLUME_UNITS_H_ */
