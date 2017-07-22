/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_ANGLE_UNITS_H_
#define INCLUDE_ANGLE_UNITS_H_

#include "internal/numeric_value.h"
#include "internal/utils.h"

#include "tags/angle_tags.h"

namespace units {
namespace angle
{

using Degrees = NumericValue<tags::degrees_tag, tags::angle_tag>;
using Mils = NumericValue<tags::mils_tag, tags::angle_tag>;
using Radians = NumericValue<tags::radians_tag, tags::angle_tag>;


USER_DEFINED_LITERALS(Degrees, degrees);
USER_DEFINED_LITERALS(Mils, mils);
USER_DEFINED_LITERALS(Radians, radians);


}
}

#endif /* INCLUDE_ANGLE_UNITS_H_ */
