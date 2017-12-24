/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_PRESSURE_UNITS_H_
#define INCLUDE_PRESSURE_UNITS_H_

#include <units/duration_units.h>
#include <units/internal/numeric_value.h>
#include <units/length_units.h>
#include <units/mass_units.h>

#include <units/tags/pressure_tags.h>

namespace units {
namespace pressure
{

using Pascals = NumericValue<tags::pascals_tag>;


constexpr auto operator"" _pascals(unsigned long long int value)
{
	return Pascals{(double)value};
}
constexpr auto operator"" _pascals(long double value)
{
	return Pascals{(double)value};
}


}
}

#endif /* INCLUDE_PRESSURE_UNITS_H_ */