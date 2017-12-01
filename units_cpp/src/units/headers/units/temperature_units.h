/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_TEMPERATURE_UNITS_H_
#define INCLUDE_TEMPERATURE_UNITS_H_

#include <units/internal/numeric_value.h>

#include <units/tags/temperature_tags.h>

namespace units {
namespace temperature
{

using Kelvins = NumericValue<tags::kelvins_tag>;
using Rankines = NumericValue<tags::rankines_tag>;


constexpr auto operator"" _kelvins(unsigned long long int value)
{
	return Kelvins{(double)value};
}
constexpr auto operator"" _kelvins(long double value)
{
	return Kelvins{(double)value};
}
constexpr auto operator"" _rankines(unsigned long long int value)
{
	return Rankines{(double)value};
}
constexpr auto operator"" _rankines(long double value)
{
	return Rankines{(double)value};
}


}
}

#endif /* INCLUDE_TEMPERATURE_UNITS_H_ */