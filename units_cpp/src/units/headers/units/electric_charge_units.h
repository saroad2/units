/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_ELECTRIC_CHARGE_UNITS_H_
#define INCLUDE_ELECTRIC_CHARGE_UNITS_H_

#include <units/duration_units.h>
#include <units/electric_current_units.h>
#include <units/internal/numeric_value.h>

#include <units/tags/electric_charge_tags.h>

namespace units {
namespace electric_charge
{

using Coulombs = NumericValue<tags::coulombs_tag>;


constexpr auto operator"" _coulombs(unsigned long long int value)
{
	return Coulombs{(double)value};
}
constexpr auto operator"" _coulombs(long double value)
{
	return Coulombs{(double)value};
}


}
}

#endif /* INCLUDE_ELECTRIC_CHARGE_UNITS_H_ */