/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_SPEED_UNITS_H_
#define INCLUDE_SPEED_UNITS_H_

#include <units/duration_units.h>
#include <units/internal/numeric_value.h>
#include <units/length_units.h>

#include <units/tags/speed_tags.h>

namespace units {
namespace speed
{

using FeetPerSecond = NumericValue<tags::feet_per_second_tag>;
using YardsPerSecond = NumericValue<tags::yards_per_second_tag>;
using MetersPerSecond = NumericValue<tags::meters_per_second_tag>;
using KilometersPerHour = NumericValue<tags::kilometers_per_hour_tag>;
using Knots = NumericValue<tags::knots_tag>;


constexpr auto operator"" _feet_per_second(unsigned long long int value)
{
	return FeetPerSecond{(double)value};
}
constexpr auto operator"" _feet_per_second(long double value)
{
	return FeetPerSecond{(double)value};
}
constexpr auto operator"" _yards_per_second(unsigned long long int value)
{
	return YardsPerSecond{(double)value};
}
constexpr auto operator"" _yards_per_second(long double value)
{
	return YardsPerSecond{(double)value};
}
constexpr auto operator"" _meters_per_second(unsigned long long int value)
{
	return MetersPerSecond{(double)value};
}
constexpr auto operator"" _meters_per_second(long double value)
{
	return MetersPerSecond{(double)value};
}
constexpr auto operator"" _kilometers_per_hour(unsigned long long int value)
{
	return KilometersPerHour{(double)value};
}
constexpr auto operator"" _kilometers_per_hour(long double value)
{
	return KilometersPerHour{(double)value};
}
constexpr auto operator"" _knots(unsigned long long int value)
{
	return Knots{(double)value};
}
constexpr auto operator"" _knots(long double value)
{
	return Knots{(double)value};
}


}
}

#endif /* INCLUDE_SPEED_UNITS_H_ */