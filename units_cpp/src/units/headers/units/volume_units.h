/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_VOLUME_UNITS_H_
#define INCLUDE_VOLUME_UNITS_H_

#include <units/internal/numeric_value.h>
#include <units/length_units.h>

#include <units/tags/volume_tags.h>

namespace units {
namespace volume
{

using CubicFeet = NumericValue<tags::cubic_feet_tag>;
using CubicYards = NumericValue<tags::cubic_yards_tag>;
using CubicMeters = NumericValue<tags::cubic_meters_tag>;
using CubicKilometers = NumericValue<tags::cubic_kilometers_tag>;
using Liters = NumericValue<tags::liters_tag>;
using Milliliters = NumericValue<tags::milliliters_tag>;


constexpr auto operator"" _cubic_feet(unsigned long long int value)
{
	return CubicFeet{(double)value};
}
constexpr auto operator"" _cubic_feet(long double value)
{
	return CubicFeet{(double)value};
}
constexpr auto operator"" _cubic_yards(unsigned long long int value)
{
	return CubicYards{(double)value};
}
constexpr auto operator"" _cubic_yards(long double value)
{
	return CubicYards{(double)value};
}
constexpr auto operator"" _cubic_meters(unsigned long long int value)
{
	return CubicMeters{(double)value};
}
constexpr auto operator"" _cubic_meters(long double value)
{
	return CubicMeters{(double)value};
}
constexpr auto operator"" _cubic_kilometers(unsigned long long int value)
{
	return CubicKilometers{(double)value};
}
constexpr auto operator"" _cubic_kilometers(long double value)
{
	return CubicKilometers{(double)value};
}
constexpr auto operator"" _liters(unsigned long long int value)
{
	return Liters{(double)value};
}
constexpr auto operator"" _liters(long double value)
{
	return Liters{(double)value};
}
constexpr auto operator"" _milliliters(unsigned long long int value)
{
	return Milliliters{(double)value};
}
constexpr auto operator"" _milliliters(long double value)
{
	return Milliliters{(double)value};
}


}
}

#endif /* INCLUDE_VOLUME_UNITS_H_ */