/*
 * angular_speed.h
 *
 *  Created on: Jul 1, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_ANGULAR_SPEED_UNITS_H_
#define INCLUDE_ANGULAR_SPEED_UNITS_H_

#include "internal/units_ratio_type.h"
#include "internal/utils.h"
#include "angle_units.h"
#include "duration_units.h"

namespace units {
namespace angular_speed
{

using DegreesPerSecond = Ratio<angle::Degrees, duration::Seconds>;
using RadiansPerSecond = Ratio<angle::Radians, duration::Seconds>;

USER_DEFINED_LITERALS(DegreesPerSecond, degrees_per_second);
USER_DEFINED_LITERALS(RadiansPerSecond, radians_per_second);

}
}


#endif /* INCLUDE_ANGULAR_SPEED_UNITS_H_ */
