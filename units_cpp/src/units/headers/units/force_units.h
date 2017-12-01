/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_FORCE_UNITS_H_
#define INCLUDE_FORCE_UNITS_H_

#include <units/internal/numeric_value.h>
#include <units/mass_units.h>
#include <units/length_units.h>
#include <units/duration_units.h>

#include <units/tags/force_tags.h>

namespace units {
namespace force
{

using Newtons = NumericValue<tags::newtons_tag>;
using Dynes = NumericValue<tags::dynes_tag>;


constexpr auto operator"" _newtons(unsigned long long int value)
{
	return Newtons{(double)value};
}
constexpr auto operator"" _newtons(long double value)
{
	return Newtons{(double)value};
}
constexpr auto operator"" _dynes(unsigned long long int value)
{
	return Dynes{(double)value};
}
constexpr auto operator"" _dynes(long double value)
{
	return Dynes{(double)value};
}


}
}

#endif /* INCLUDE_FORCE_UNITS_H_ */