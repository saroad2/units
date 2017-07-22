/*
 * area_units.h
 *
 *  Created on: Jun 30, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_AREA_UNITS_H_
#define INCLUDE_AREA_UNITS_H_

#include "internal/units_pow_type.h"
#include "internal/utils.h"
#include "internal/multiplyer_scales.h"
#include "length_units.h"

#include <ratio>

namespace units {
namespace area
{

struct area_tag
{
	using code = pow_type_tag<length::tags::length_tag, 2>::code;
};

using SquareFeet = Square<length::Feet>;
using SquareYards = Square<length::Yards>;
using SquareMeters = Square<length::Meters>;
using SquareKilometers = Square<length::Kilometers>;

struct dunam_scale_tag
{
	static constexpr double scale = kilo * SquareMeters::scale;
	static std::string singularName();
	static std::string pluralName();
};

using Dunams = NumericValue<dunam_scale_tag, area_tag>;

USER_DEFINED_LITERALS(SquareFeet, square_feet);
USER_DEFINED_LITERALS(SquareYards, square_yards);
USER_DEFINED_LITERALS(SquareMeters, square_meters);
USER_DEFINED_LITERALS(SquareKilometers, square_kilometers);
USER_DEFINED_LITERALS(Dunams, dunams);
}
}

#endif /* INCLUDE_AREA_UNITS_H_ */
