/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_FORCE_UNITS_H_
#define INCLUDE_FORCE_UNITS_H_

#include "internal/numeric_value.h"
#include "internal/utils.h"
#include "mass_units.h"
#include "length_units.h"
#include "duration_units.h"

#include "tags/force_tags.h"

namespace units {
namespace force
{

using Newtons = NumericValue<tags::newtons_tag, tags::force_tag>;
using Dynes = NumericValue<tags::dynes_tag, tags::force_tag>;


USER_DEFINED_LITERALS(Newtons, newtons);
USER_DEFINED_LITERALS(Dynes, dynes);


}
}

#endif /* INCLUDE_FORCE_UNITS_H_ */
