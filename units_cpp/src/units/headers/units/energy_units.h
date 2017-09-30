/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_ENERGY_UNITS_H_
#define INCLUDE_ENERGY_UNITS_H_

#include <units/internal/numeric_value.h>
#include <units/internal/utils.h>
#include <units/mass_units.h>
#include <units/length_units.h>
#include <units/duration_units.h>

#include <units/tags/energy_tags.h>

namespace units {
namespace energy
{

using Joules = NumericValue<tags::joules_tag>;
using Calories = NumericValue<tags::calories_tag>;
using Kilocalories = NumericValue<tags::kilocalories_tag>;
using Kilojoules = NumericValue<tags::kilojoules_tag>;
using Megajoules = NumericValue<tags::megajoules_tag>;


USER_DEFINED_LITERALS(Joules, joules);
USER_DEFINED_LITERALS(Calories, calories);
USER_DEFINED_LITERALS(Kilocalories, kilocalories);
USER_DEFINED_LITERALS(Kilojoules, kilojoules);
USER_DEFINED_LITERALS(Megajoules, megajoules);


}
}

#endif /* INCLUDE_ENERGY_UNITS_H_ */