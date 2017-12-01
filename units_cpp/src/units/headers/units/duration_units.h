/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_DURATION_UNITS_H_
#define INCLUDE_DURATION_UNITS_H_

#include <units/internal/numeric_value.h>

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


constexpr auto operator"" _seconds(unsigned long long int value)
{
	return Seconds{(double)value};
}
constexpr auto operator"" _seconds(long double value)
{
	return Seconds{(double)value};
}
constexpr auto operator"" _minutes(unsigned long long int value)
{
	return Minutes{(double)value};
}
constexpr auto operator"" _minutes(long double value)
{
	return Minutes{(double)value};
}
constexpr auto operator"" _hours(unsigned long long int value)
{
	return Hours{(double)value};
}
constexpr auto operator"" _hours(long double value)
{
	return Hours{(double)value};
}
constexpr auto operator"" _days(unsigned long long int value)
{
	return Days{(double)value};
}
constexpr auto operator"" _days(long double value)
{
	return Days{(double)value};
}
constexpr auto operator"" _years(unsigned long long int value)
{
	return Years{(double)value};
}
constexpr auto operator"" _years(long double value)
{
	return Years{(double)value};
}
constexpr auto operator"" _microseconds(unsigned long long int value)
{
	return Microseconds{(double)value};
}
constexpr auto operator"" _microseconds(long double value)
{
	return Microseconds{(double)value};
}
constexpr auto operator"" _milliseconds(unsigned long long int value)
{
	return Milliseconds{(double)value};
}
constexpr auto operator"" _milliseconds(long double value)
{
	return Milliseconds{(double)value};
}


}
}

#endif /* INCLUDE_DURATION_UNITS_H_ */