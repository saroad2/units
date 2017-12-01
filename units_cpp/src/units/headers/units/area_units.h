/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_AREA_UNITS_H_
#define INCLUDE_AREA_UNITS_H_

#include <units/internal/numeric_value.h>
#include <units/length_units.h>

#include <units/tags/area_tags.h>

namespace units {
namespace area
{

using SquareFeet = NumericValue<tags::square_feet_tag>;
using SquareYards = NumericValue<tags::square_yards_tag>;
using SquareMeters = NumericValue<tags::square_meters_tag>;
using SquareKilometers = NumericValue<tags::square_kilometers_tag>;
using Dunams = NumericValue<tags::dunams_tag>;


constexpr auto operator"" _square_feet(unsigned long long int value)
{
	return SquareFeet{(double)value};
}
constexpr auto operator"" _square_feet(long double value)
{
	return SquareFeet{(double)value};
}
constexpr auto operator"" _square_yards(unsigned long long int value)
{
	return SquareYards{(double)value};
}
constexpr auto operator"" _square_yards(long double value)
{
	return SquareYards{(double)value};
}
constexpr auto operator"" _square_meters(unsigned long long int value)
{
	return SquareMeters{(double)value};
}
constexpr auto operator"" _square_meters(long double value)
{
	return SquareMeters{(double)value};
}
constexpr auto operator"" _square_kilometers(unsigned long long int value)
{
	return SquareKilometers{(double)value};
}
constexpr auto operator"" _square_kilometers(long double value)
{
	return SquareKilometers{(double)value};
}
constexpr auto operator"" _dunams(unsigned long long int value)
{
	return Dunams{(double)value};
}
constexpr auto operator"" _dunams(long double value)
{
	return Dunams{(double)value};
}


}
}

#endif /* INCLUDE_AREA_UNITS_H_ */