/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_TEMPERATURE_UNITS_H_
#define INCLUDE_TEMPERATURE_UNITS_H_

#include <units/internal/numeric_value.h>
#include <units/internal/utils.h>

#include <units/tags/temperature_tags.h>

namespace units {
namespace temperature
{

using Kelvins = NumericValue<tags::kelvins_tag>;
using Rankines = NumericValue<tags::rankines_tag>;


USER_DEFINED_LITERALS(Kelvins, kelvins);
USER_DEFINED_LITERALS(Rankines, rankines);


}
}

#endif /* INCLUDE_TEMPERATURE_UNITS_H_ */