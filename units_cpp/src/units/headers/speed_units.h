/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_SPEED_UNITS_H_
#define INCLUDE_SPEED_UNITS_H_

#include "internal/numeric_value.h"
#include "internal/utils.h"
#include "length_units.h"
#include "duration_units.h"

#include "tags/speed_tags.h"

namespace units {
namespace speed
{

using FeetPerSecond = Ratio<length::Feet, duration::Seconds>;
using YardsPerSecond = Ratio<length::Yards, duration::Seconds>;
using MetersPerSecond = Ratio<length::Meters, duration::Seconds>;
using KilometersPerHour = Ratio<length::Kilometers, duration::Hours>;
using Knots = NumericValue<tags::knots_tag, tags::speed_tag>;


USER_DEFINED_LITERALS(FeetPerSecond, feet_per_second);
USER_DEFINED_LITERALS(YardsPerSecond, yards_per_second);
USER_DEFINED_LITERALS(MetersPerSecond, meters_per_second);
USER_DEFINED_LITERALS(KilometersPerHour, kilometers_per_hour);
USER_DEFINED_LITERALS(Knots, knots);


}
}

#endif /* INCLUDE_SPEED_UNITS_H_ */
