/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_DURATION_UNITS_H_
#define INCLUDE_DURATION_UNITS_H_

#include <units/internal/numeric_value.h>
#include <units/internal/utils.h>

#include <units/tags/duration_tags.h>

namespace units {
namespace duration
{

using Seconds = NumericValue<tags::seconds_tag>;
using Minutes = NumericValue<tags::minutes_tag>;
using Hours = NumericValue<tags::hours_tag>;
using Days = NumericValue<tags::days_tag>;
using Years = NumericValue<tags::years_tag>;
using Microseconds = NumericValue<tags::microseconds_tag>;
using Milliseconds = NumericValue<tags::milliseconds_tag>;


USER_DEFINED_LITERALS(Seconds, seconds);
USER_DEFINED_LITERALS(Minutes, minutes);
USER_DEFINED_LITERALS(Hours, hours);
USER_DEFINED_LITERALS(Days, days);
USER_DEFINED_LITERALS(Years, years);
USER_DEFINED_LITERALS(Microseconds, microseconds);
USER_DEFINED_LITERALS(Milliseconds, milliseconds);


}
}

#endif /* INCLUDE_DURATION_UNITS_H_ */