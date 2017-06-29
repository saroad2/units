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

namespace units {
namespace area
{

struct area_type_tag
{
	static constexpr int code =
		units::length::length_tag::code * units::length::length_tag::code;
};


using FeetSquared = Multiply<units::length::Feet, units::length::Feet>;
using YardsSquared = Multiply<units::length::Yards, units::length::Yards>;
using MetersSquared = Multiply<units::length::Meters, units::length::Meters>;
using KilometersSquared = Multiply<units::length::Kilometers, units::length::Kilometers>;

struct dunam_scale_tag
{
	static constexpr double scale = 1000 * MetersSquared::scale();
	static std::string singularName();
	static std::string pluralName();
};

using Dunams = NumericValue<dunam_scale_tag, area_type_tag>;

}
}

#endif /* INCLUDE_AREA_UNITS_H_ */
