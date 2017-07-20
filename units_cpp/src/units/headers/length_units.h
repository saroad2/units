/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_LENGTH_UNITS_H_
#define INCLUDE_LENGTH_UNITS_H_

#include "internal/numeric_value.h"
#include "internal/utils.h"
#include "internal/multiplyer_scales.h"

#include "tags/length_tags.h"

namespace units {
namespace length
{

using Inches = NumericValue<tags::inches_tag, tags::length_tag>;

using Feet = NumericValue<tags::feet_tag, tags::length_tag>;

using Yards = NumericValue<tags::yards_tag, tags::length_tag>;

using Meters = NumericValue<tags::meters_tag, tags::length_tag>;

using Micrometers = Micro<Meters>;
using Millimeters = Milli<Meters>;
using Centimeters = Centi<Meters>;
using Kilometers = Kilo<Meters>;


USER_DEFINED_LITERALS(Inches, inches);

USER_DEFINED_LITERALS(Feet, feet);

USER_DEFINED_LITERALS(Yards, yards);

USER_DEFINED_LITERALS(Meters, meters);

USER_DEFINED_LITERALS(Micrometers, micrometers);
USER_DEFINED_LITERALS(Millimeters, millimeters);
USER_DEFINED_LITERALS(Centimeters, centimeters);
USER_DEFINED_LITERALS(Kilometers, kilometers);


}
}

#endif /* INCLUDE_LENGTH_UNITS_H_ */
