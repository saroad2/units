/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_ANGLE_UNITS_H_
#define INCLUDE_ANGLE_UNITS_H_

#include <units/internal/numeric_value.h>

#include <units/tags/angle_tags.h>

namespace units {
namespace angle
{

using Degrees = NumericValue<tags::degrees_tag>;
using Mils = NumericValue<tags::mils_tag>;
using Radians = NumericValue<tags::radians_tag>;


constexpr auto operator"" _degrees(unsigned long long int value)
{
	return Degrees{(double)value};
}
constexpr auto operator"" _degrees(long double value)
{
	return Degrees{(double)value};
}
constexpr auto operator"" _mils(unsigned long long int value)
{
	return Mils{(double)value};
}
constexpr auto operator"" _mils(long double value)
{
	return Mils{(double)value};
}
constexpr auto operator"" _radians(unsigned long long int value)
{
	return Radians{(double)value};
}
constexpr auto operator"" _radians(long double value)
{
	return Radians{(double)value};
}


}
}

#endif /* INCLUDE_ANGLE_UNITS_H_ */