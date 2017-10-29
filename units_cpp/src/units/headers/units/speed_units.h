/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_SPEED_UNITS_H_
#define INCLUDE_SPEED_UNITS_H_

#include <units/internal/numeric_value.h>
#include <units/internal/utils.h>
#include <units/length_units.h>
#include <units/duration_units.h>

#include <units/tags/speed_tags.h>

namespace units {
namespace speed
{

using FeetPerSecond = NumericValue<tags::feet_per_second_tag>;
using YardsPerSecond = NumericValue<tags::yards_per_second_tag>;
using MetersPerSecond = NumericValue<tags::meters_per_second_tag>;
using KilometersPerHour = NumericValue<tags::kilometers_per_hour_tag>;
using Knots = NumericValue<tags::knots_tag>;


USER_DEFINED_LITERALS(FeetPerSecond, feet_per_second);
USER_DEFINED_LITERALS(YardsPerSecond, yards_per_second);
USER_DEFINED_LITERALS(MetersPerSecond, meters_per_second);
USER_DEFINED_LITERALS(KilometersPerHour, kilometers_per_hour);
USER_DEFINED_LITERALS(Knots, knots);


}
}

#endif /* INCLUDE_SPEED_UNITS_H_ */