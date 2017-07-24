/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_MASS_UNITS_H_
#define INCLUDE_MASS_UNITS_H_

#include <units/internal/numeric_value.h>
#include <units/internal/utils.h>

#include <units/tags/mass_tags.h>

namespace units {
namespace mass
{

using Grams = NumericValue<tags::grams_tag>;
using Pounds = NumericValue<tags::pounds_tag>;
using Milligrams = NumericValue<tags::milligrams_tag>;
using Kilograms = NumericValue<tags::kilograms_tag>;
using Tonnes = NumericValue<tags::tonnes_tag>;


USER_DEFINED_LITERALS(Grams, grams);
USER_DEFINED_LITERALS(Pounds, pounds);
USER_DEFINED_LITERALS(Milligrams, milligrams);
USER_DEFINED_LITERALS(Kilograms, kilograms);
USER_DEFINED_LITERALS(Tonnes, tonnes);


}
}

#endif /* INCLUDE_MASS_UNITS_H_ */
