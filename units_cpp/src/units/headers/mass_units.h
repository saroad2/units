/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_MASS_UNITS_H_
#define INCLUDE_MASS_UNITS_H_

#include "internal/numeric_value.h"
#include "internal/utils.h"
#include "internal/multiplyer_scales.h"

#include "tags/mass_tags.h"

namespace units {
namespace mass
{

using Grams = NumericValue<tags::grams_tag, tags::mass_tag>;
using Milligrams = Milli<Grams>;
using Kilograms = Kilo<Grams>;
using Pounds = NumericValue<tags::pounds_tag, tags::mass_tag>;
using Tonnes = NumericValue<tags::tonnes_tag, tags::mass_tag>;


USER_DEFINED_LITERALS(Grams, grams);
USER_DEFINED_LITERALS(Milligrams, milligrams);
USER_DEFINED_LITERALS(Kilograms, kilograms);
USER_DEFINED_LITERALS(Pounds, pounds);
USER_DEFINED_LITERALS(Tonnes, tonnes);


}
}

#endif /* INCLUDE_MASS_UNITS_H_ */
