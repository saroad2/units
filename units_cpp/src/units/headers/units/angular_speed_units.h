/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_ANGULAR_SPEED_UNITS_H_
#define INCLUDE_ANGULAR_SPEED_UNITS_H_

#include <units/internal/numeric_value.h>
#include <units/internal/utils.h>
#include <units/angle_units.h>
#include <units/duration_units.h>

#include <units/tags/angular_speed_tags.h>

namespace units {
namespace angular_speed
{

using DegreesPerSecond = NumericValue<tags::degrees_per_second_tag>;
using RadiansPerSecond = NumericValue<tags::radians_per_second_tag>;
using MilsPerSecond = NumericValue<tags::mils_per_second_tag>;


USER_DEFINED_LITERALS(DegreesPerSecond, degrees_per_second);
USER_DEFINED_LITERALS(RadiansPerSecond, radians_per_second);
USER_DEFINED_LITERALS(MilsPerSecond, mils_per_second);


}
}

#endif /* INCLUDE_ANGULAR_SPEED_UNITS_H_ */
