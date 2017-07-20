/*
 * speed_units.h
 *
 *  Created on: Jul 1, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_SPEED_UNITS_H_
#define INCLUDE_SPEED_UNITS_H_

#include "internal/units_ratio_type.h"
#include "internal/utils.h"
#include "length_units.h"
#include "duration_units.h"

namespace units{
namespace speed
{

struct speed_tag
{
	using code = ratio_type_tag<length::tags::length_tag, duration::tags::duration_tag>::code;
};

using FeetPerSecond = Ratio<length::Feet, duration::Seconds>;
using YardsPerSecond = Ratio<length::Yards, duration::Seconds>;
using MetersPerSecond = Ratio<length::Meters, duration::Seconds>;
using KilometersPerHour = Ratio<length::Kilometers, duration::Hours>;

struct knots_tag
{
	static constexpr double scale = 0.514444773689 * MetersPerSecond::scale;
	static std::string singularName();
	static std::string pluralName();
};

using Knots = NumericValue<knots_tag, speed_tag>;

USER_DEFINED_LITERALS(FeetPerSecond, feet_per_second);
USER_DEFINED_LITERALS(YardsPerSecond, yards_per_second);
USER_DEFINED_LITERALS(MetersPerSecond, meters_per_second);
USER_DEFINED_LITERALS(KilometersPerHour, kilometers_per_hour);
USER_DEFINED_LITERALS(Knots, knots);

}
}

#endif /* INCLUDE_SPEED_UNITS_H_ */
