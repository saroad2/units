/*
 * duration_units.h
 *
 *  Created on: Jun 29, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_DURATION_UNITS_H_
#define INCLUDE_DURATION_UNITS_H_

#include "internal/duration.h"
#include "internal/multiplyer_scales.h"
#include "internal/utils.h"
#include "tags/duration_tags.h"

#include <chrono>
#include <ratio>

namespace units {
namespace duration
{

using Microseconds = Duration<std::chrono::microseconds, tags::microseconds_tag, tags::duration_tag>;
using Milliseconds = Duration<std::chrono::milliseconds, tags::milliseconds_tag, tags::duration_tag>;
using Seconds = Duration<std::chrono::seconds, tags::seconds_tag, tags::duration_tag>;
using Minutes = Duration<std::chrono::minutes, tags::minutes_tag, tags::duration_tag>;
using Hours = Duration<std::chrono::hours, tags::hours_tag, tags::duration_tag>;
using Days = NumericValue<tags::days_tag, tags::duration_tag>;
using Years = NumericValue<tags::years_tag, tags::duration_tag>;

USER_DEFINED_LITERALS(Microseconds, microseconds);
USER_DEFINED_LITERALS(Milliseconds, milliseconds);
USER_DEFINED_LITERALS(Seconds, seconds);
USER_DEFINED_LITERALS(Minutes, minutes);
USER_DEFINED_LITERALS(Hours, hours);
USER_DEFINED_LITERALS(Days, days);
USER_DEFINED_LITERALS(Years, years);
}
}

#endif /* INCLUDE_DURATION_UNITS_H_ */
