/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_ENERGY_UNITS_H_
#define INCLUDE_ENERGY_UNITS_H_

#include "internal/numeric_value.h"
#include "internal/utils.h"
#include "mass_units.h"
#include "duration_units.h"

#include "tags/energy_tags.h"

namespace units {
namespace energy
{

using Joules = NumericValue<tags::joules_tag, tags::energy_tag>;
using Kilojoules = NumericValue<tags::kilojoules_tag, tags::energy_tag>;
using Megajoules = NumericValue<tags::megajoules_tag, tags::energy_tag>;


USER_DEFINED_LITERALS(Joules, joules);
USER_DEFINED_LITERALS(Kilojoules, kilojoules);
USER_DEFINED_LITERALS(Megajoules, megajoules);


}
}

#endif /* INCLUDE_ENERGY_UNITS_H_ */
