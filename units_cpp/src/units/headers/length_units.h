/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_LENGTH_UNITS_H_
#define INCLUDE_LENGTH_UNITS_H_

#include "internal/numeric_value.h"
#include "internal/utils.h"

#include "tags/length_tags.h"

namespace units {
namespace length
{

using Meters = NumericValue<tags::meters_tag, tags::length_tag>;
using Inches = NumericValue<tags::inches_tag, tags::length_tag>;
using Feet = NumericValue<tags::feet_tag, tags::length_tag>;
using Yards = NumericValue<tags::yards_tag, tags::length_tag>;
using Micrometers = NumericValue<tags::micrometers_tag, tags::length_tag>;
using Millimeters = NumericValue<tags::millimeters_tag, tags::length_tag>;
using Centimeters = NumericValue<tags::centimeters_tag, tags::length_tag>;
using Kilometers = NumericValue<tags::kilometers_tag, tags::length_tag>;


USER_DEFINED_LITERALS(Meters, meters);
USER_DEFINED_LITERALS(Inches, inches);
USER_DEFINED_LITERALS(Feet, feet);
USER_DEFINED_LITERALS(Yards, yards);
USER_DEFINED_LITERALS(Micrometers, micrometers);
USER_DEFINED_LITERALS(Millimeters, millimeters);
USER_DEFINED_LITERALS(Centimeters, centimeters);
USER_DEFINED_LITERALS(Kilometers, kilometers);


}
}

#endif /* INCLUDE_LENGTH_UNITS_H_ */
