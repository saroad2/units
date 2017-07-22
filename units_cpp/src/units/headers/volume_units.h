/*
 * volume_units.h
 *
 *  Created on: Jun 30, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_VOLUME_UNITS_H_
#define INCLUDE_VOLUME_UNITS_H_

#include "internal/units_pow_type.h"
#include "internal/multiplyer_scales.h"
#include "internal/utils.h"
#include "length_units.h"

#include <ratio>
namespace units {
namespace volume
{

struct volume_tag
{
	using code = pow_type_tag<length::tags::length_tag, 3>::code;
};

using CubicFeet = Cubic<length::Feet>;
using CubicYards = Cubic<length::Yards>;
using CubicMeters = Cubic<length::Meters>;
using CubicKilometers = Cubic<length::Kilometers>;

struct liters_scale_tag
{
	static constexpr double scale = milli * CubicMeters::scale;
	static std::string singularName();
	static std::string pluralName();
};

struct milliliters_scale_tag
{
	static constexpr double scale = milli * liters_scale_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};

using Liters = NumericValue<liters_scale_tag, volume_tag>;
using Milliliters = NumericValue<milliliters_scale_tag, volume_tag>;

USER_DEFINED_LITERALS(CubicFeet, cubic_feet);
USER_DEFINED_LITERALS(CubicYards, cubic_yards);
USER_DEFINED_LITERALS(CubicMeters, cubic_meters);
USER_DEFINED_LITERALS(CubicKilometers, cubic_kilometers);
USER_DEFINED_LITERALS(Liters, liters);
USER_DEFINED_LITERALS(Milliliters, milliliters);
}
}

#endif /* INCLUDE_VOLUME_UNITS_H_ */
