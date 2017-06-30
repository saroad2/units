/*
 * area_units.h
 *
 *  Created on: Jun 30, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_AREA_UNITS_H_
#define INCLUDE_AREA_UNITS_H_

#include "units/include/internal/power_units.h"
#include "units/include/internal/utils.h"
#include "units/include/length_units.h"

#include <ratio>

namespace units {
namespace area
{

struct area_type_tag
{
	using code = std::ratio_multiply<
		typename length::length_tag::code,
		typename length::length_tag::code>;
};

using SquareFeet = Squared<length::Feet>;
using SquareYards = Squared<length::Yards>;
using SquareMeters = Squared<length::Meters>;
using SquareKilometers = Squared<length::Kilometers>;

struct dunam_scale_tag
{
	static constexpr double scale = 1000 * SquareMeters::scale();
	static std::string singularName();
	static std::string pluralName();
};

using Dunams = NumericValue<dunam_scale_tag, area_type_tag>;

USER_DEFINED_LITERALS(SquareFeet, square_feet);
USER_DEFINED_LITERALS(SquareYards, square_yards);
USER_DEFINED_LITERALS(SquareMeters, square_meters);
USER_DEFINED_LITERALS(SquareKilometers, square_kilometers);
USER_DEFINED_LITERALS(Dunams, dunams);
}
}

#endif /* INCLUDE_AREA_UNITS_H_ */
