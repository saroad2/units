/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_ENERGY_UNITS_H_
#define INCLUDE_ENERGY_UNITS_H_

#include <units/internal/numeric_value.h>
#include <units/mass_units.h>
#include <units/length_units.h>
#include <units/duration_units.h>

#include <units/tags/energy_tags.h>

namespace units {
namespace energy
{

using Joules = NumericValue<tags::joules_tag>;
using Calories = NumericValue<tags::calories_tag>;
using Kilocalories = NumericValue<tags::kilocalories_tag>;
using Kilojoules = NumericValue<tags::kilojoules_tag>;
using Megajoules = NumericValue<tags::megajoules_tag>;


constexpr auto operator"" _joules(unsigned long long int value)
{
	return Joules{(double)value};
}
constexpr auto operator"" _joules(long double value)
{
	return Joules{(double)value};
}
constexpr auto operator"" _calories(unsigned long long int value)
{
	return Calories{(double)value};
}
constexpr auto operator"" _calories(long double value)
{
	return Calories{(double)value};
}
constexpr auto operator"" _kilocalories(unsigned long long int value)
{
	return Kilocalories{(double)value};
}
constexpr auto operator"" _kilocalories(long double value)
{
	return Kilocalories{(double)value};
}
constexpr auto operator"" _kilojoules(unsigned long long int value)
{
	return Kilojoules{(double)value};
}
constexpr auto operator"" _kilojoules(long double value)
{
	return Kilojoules{(double)value};
}
constexpr auto operator"" _megajoules(unsigned long long int value)
{
	return Megajoules{(double)value};
}
constexpr auto operator"" _megajoules(long double value)
{
	return Megajoules{(double)value};
}


}
}

#endif /* INCLUDE_ENERGY_UNITS_H_ */