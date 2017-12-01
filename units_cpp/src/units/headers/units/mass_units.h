/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_MASS_UNITS_H_
#define INCLUDE_MASS_UNITS_H_

#include <units/internal/numeric_value.h>

#include <units/tags/mass_tags.h>

namespace units {
namespace mass
{

using Grams = NumericValue<tags::grams_tag>;
using Pounds = NumericValue<tags::pounds_tag>;
using Milligrams = NumericValue<tags::milligrams_tag>;
using Kilograms = NumericValue<tags::kilograms_tag>;
using Tonnes = NumericValue<tags::tonnes_tag>;
using SolarMasses = NumericValue<tags::solar_masses_tag>;


constexpr auto operator"" _grams(unsigned long long int value)
{
	return Grams{(double)value};
}
constexpr auto operator"" _grams(long double value)
{
	return Grams{(double)value};
}
constexpr auto operator"" _pounds(unsigned long long int value)
{
	return Pounds{(double)value};
}
constexpr auto operator"" _pounds(long double value)
{
	return Pounds{(double)value};
}
constexpr auto operator"" _milligrams(unsigned long long int value)
{
	return Milligrams{(double)value};
}
constexpr auto operator"" _milligrams(long double value)
{
	return Milligrams{(double)value};
}
constexpr auto operator"" _kilograms(unsigned long long int value)
{
	return Kilograms{(double)value};
}
constexpr auto operator"" _kilograms(long double value)
{
	return Kilograms{(double)value};
}
constexpr auto operator"" _tonnes(unsigned long long int value)
{
	return Tonnes{(double)value};
}
constexpr auto operator"" _tonnes(long double value)
{
	return Tonnes{(double)value};
}
constexpr auto operator"" _solar_masses(unsigned long long int value)
{
	return SolarMasses{(double)value};
}
constexpr auto operator"" _solar_masses(long double value)
{
	return SolarMasses{(double)value};
}


}
}

#endif /* INCLUDE_MASS_UNITS_H_ */