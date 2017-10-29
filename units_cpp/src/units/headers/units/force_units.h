/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_FORCE_UNITS_H_
#define INCLUDE_FORCE_UNITS_H_

#include <units/internal/numeric_value.h>
#include <units/internal/utils.h>
#include <units/mass_units.h>
#include <units/length_units.h>
#include <units/duration_units.h>

#include <units/tags/force_tags.h>

namespace units {
namespace force
{

using Newtons = NumericValue<tags::newtons_tag>;
using Dynes = NumericValue<tags::dynes_tag>;


USER_DEFINED_LITERALS(Newtons, newtons);
USER_DEFINED_LITERALS(Dynes, dynes);


}
}

#endif /* INCLUDE_FORCE_UNITS_H_ */