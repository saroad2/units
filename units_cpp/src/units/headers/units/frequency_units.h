/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_FREQUENCY_UNITS_H_
#define INCLUDE_FREQUENCY_UNITS_H_

#include <units/duration_units.h>
#include <units/internal/numeric_value.h>

#include <units/tags/frequency_tags.h>

namespace units {
namespace frequency
{

using Hertz = NumericValue<tags::hertz_tag>;
using Kilohertz = NumericValue<tags::kilohertz_tag>;
using Megahertz = NumericValue<tags::megahertz_tag>;


constexpr auto operator"" _hertz(unsigned long long int value)
{
	return Hertz{(double)value};
}
constexpr auto operator"" _hertz(long double value)
{
	return Hertz{(double)value};
}
constexpr auto operator"" _kilohertz(unsigned long long int value)
{
	return Kilohertz{(double)value};
}
constexpr auto operator"" _kilohertz(long double value)
{
	return Kilohertz{(double)value};
}
constexpr auto operator"" _megahertz(unsigned long long int value)
{
	return Megahertz{(double)value};
}
constexpr auto operator"" _megahertz(long double value)
{
	return Megahertz{(double)value};
}


}
}

#endif /* INCLUDE_FREQUENCY_UNITS_H_ */