/*
 * area_units.h
 *
 *  Created on: Jun 30, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_AREA_UNITS_H_
#define INCLUDE_AREA_UNITS_H_

#include "units/include/length_units.h"
#include "units/include/multiply_units.h"
#include "units/include/utils.h"

namespace units {
namespace area
{

struct area_type_tag
{
	static constexpr int code =
		length::length_tag::code * length::length_tag::code;
};


using FeetSquared = Multiply<length::Feet, length::Feet>;
using YardsSquared = Multiply<length::Yards, length::Yards>;
using MetersSquared = Multiply<length::Meters, length::Meters>;
using KilometersSquared = Multiply<length::Kilometers, length::Kilometers>;

struct dunam_scale_tag
{
	static constexpr double scale = 1000 * MetersSquared::scale();
	static std::string singularName();
	static std::string pluralName();
};

using Dunams = NumericValue<dunam_scale_tag, area_type_tag>;

USER_DEFINED_LITERALS(FeetSquared, feet_squared);
USER_DEFINED_LITERALS(YardsSquared, yards_squared);
USER_DEFINED_LITERALS(MetersSquared, meters_squared);
USER_DEFINED_LITERALS(KilometersSquared, kilometers_squared);
USER_DEFINED_LITERALS(Dunams, dunams);
}
}

#endif /* INCLUDE_AREA_UNITS_H_ */
