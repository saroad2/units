/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_DENSITY_UNITS_H_
#define INCLUDE_DENSITY_UNITS_H_

#include <units/internal/numeric_value.h>
#include <units/mass_units.h>
#include <units/volume_units.h>

#include <units/tags/density_tags.h>

namespace units {
namespace density
{

using KilogramsPerCubicMeter = NumericValue<tags::kilograms_per_cubic_meter_tag>;
using KilogramsPerLiter = NumericValue<tags::kilograms_per_liter_tag>;


constexpr auto operator"" _kilograms_per_cubic_meter(unsigned long long int value)
{
	return KilogramsPerCubicMeter{(double)value};
}
constexpr auto operator"" _kilograms_per_cubic_meter(long double value)
{
	return KilogramsPerCubicMeter{(double)value};
}
constexpr auto operator"" _kilograms_per_liter(unsigned long long int value)
{
	return KilogramsPerLiter{(double)value};
}
constexpr auto operator"" _kilograms_per_liter(long double value)
{
	return KilogramsPerLiter{(double)value};
}


}
}

#endif /* INCLUDE_DENSITY_UNITS_H_ */