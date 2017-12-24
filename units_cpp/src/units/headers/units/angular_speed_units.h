/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_ANGULAR_SPEED_UNITS_H_
#define INCLUDE_ANGULAR_SPEED_UNITS_H_

#include <units/angle_units.h>
#include <units/duration_units.h>
#include <units/internal/numeric_value.h>

#include <units/tags/angular_speed_tags.h>

namespace units {
namespace angular_speed
{

using DegreesPerSecond = NumericValue<tags::degrees_per_second_tag>;
using RadiansPerSecond = NumericValue<tags::radians_per_second_tag>;
using MilsPerSecond = NumericValue<tags::mils_per_second_tag>;


constexpr auto operator"" _degrees_per_second(unsigned long long int value)
{
	return DegreesPerSecond{(double)value};
}
constexpr auto operator"" _degrees_per_second(long double value)
{
	return DegreesPerSecond{(double)value};
}
constexpr auto operator"" _radians_per_second(unsigned long long int value)
{
	return RadiansPerSecond{(double)value};
}
constexpr auto operator"" _radians_per_second(long double value)
{
	return RadiansPerSecond{(double)value};
}
constexpr auto operator"" _mils_per_second(unsigned long long int value)
{
	return MilsPerSecond{(double)value};
}
constexpr auto operator"" _mils_per_second(long double value)
{
	return MilsPerSecond{(double)value};
}


}
}

#endif /* INCLUDE_ANGULAR_SPEED_UNITS_H_ */