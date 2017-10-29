/*
 * duration_units.h
 *
 *  Created on: Jun 29, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_DURATION_UNITS_H_
#define INCLUDE_DURATION_UNITS_H_

#include <units/internal/duration.h>
#include <units/internal/multiplier_scales.h>
#include <units/internal/utils.h>
#include <units/tags/duration_tags.h>

#include <chrono>
#include <ratio>

namespace units {
namespace duration
{

using Microseconds = Duration<std::chrono::microseconds, tags::microseconds_tag>;
using Milliseconds = Duration<std::chrono::milliseconds, tags::milliseconds_tag>;
using Seconds = Duration<std::chrono::seconds, tags::seconds_tag>;
using Minutes = Duration<std::chrono::minutes, tags::minutes_tag>;
using Hours = Duration<std::chrono::hours, tags::hours_tag>;
using Days = NumericValue<tags::days_tag>;
using Years = NumericValue<tags::years_tag>;

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
