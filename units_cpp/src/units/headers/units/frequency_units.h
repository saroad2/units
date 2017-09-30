/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_FREQUENCY_UNITS_H_
#define INCLUDE_FREQUENCY_UNITS_H_

#include <units/internal/numeric_value.h>
#include <units/internal/utils.h>
#include <units/duration_units.h>

#include <units/tags/frequency_tags.h>

namespace units {
namespace frequency
{

using Hertz = NumericValue<tags::hertz_tag>;
using Kilohertz = NumericValue<tags::kilohertz_tag>;
using Megahertz = NumericValue<tags::megahertz_tag>;


USER_DEFINED_LITERALS(Hertz, hertz);
USER_DEFINED_LITERALS(Kilohertz, kilohertz);
USER_DEFINED_LITERALS(Megahertz, megahertz);


}
}

#endif /* INCLUDE_FREQUENCY_UNITS_H_ */