/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_LENGTH_UNITS_H_
#define INCLUDE_LENGTH_UNITS_H_

#include <units/internal/numeric_value.h>

#include <units/tags/length_tags.h>

namespace units {
namespace length
{

using Meters = NumericValue<tags::meters_tag>;
using Inches = NumericValue<tags::inches_tag>;
using Feet = NumericValue<tags::feet_tag>;
using Yards = NumericValue<tags::yards_tag>;
using StatuteMiles = NumericValue<tags::statute_miles_tag>;
using NauticalMiles = NumericValue<tags::nautical_miles_tag>;
using GeographicalMiles = NumericValue<tags::geographical_miles_tag>;
using DegreesOfLatitude = NumericValue<tags::degrees_of_latitude_tag>;
using Micrometers = NumericValue<tags::micrometers_tag>;
using Millimeters = NumericValue<tags::millimeters_tag>;
using Centimeters = NumericValue<tags::centimeters_tag>;
using Kilometers = NumericValue<tags::kilometers_tag>;


constexpr auto operator"" _meters(unsigned long long int value)
{
	return Meters{(double)value};
}
constexpr auto operator"" _meters(long double value)
{
	return Meters{(double)value};
}
constexpr auto operator"" _inches(unsigned long long int value)
{
	return Inches{(double)value};
}
constexpr auto operator"" _inches(long double value)
{
	return Inches{(double)value};
}
constexpr auto operator"" _feet(unsigned long long int value)
{
	return Feet{(double)value};
}
constexpr auto operator"" _feet(long double value)
{
	return Feet{(double)value};
}
constexpr auto operator"" _yards(unsigned long long int value)
{
	return Yards{(double)value};
}
constexpr auto operator"" _yards(long double value)
{
	return Yards{(double)value};
}
constexpr auto operator"" _statute_miles(unsigned long long int value)
{
	return StatuteMiles{(double)value};
}
constexpr auto operator"" _statute_miles(long double value)
{
	return StatuteMiles{(double)value};
}
constexpr auto operator"" _nautical_miles(unsigned long long int value)
{
	return NauticalMiles{(double)value};
}
constexpr auto operator"" _nautical_miles(long double value)
{
	return NauticalMiles{(double)value};
}
constexpr auto operator"" _geographical_miles(unsigned long long int value)
{
	return GeographicalMiles{(double)value};
}
constexpr auto operator"" _geographical_miles(long double value)
{
	return GeographicalMiles{(double)value};
}
constexpr auto operator"" _degrees_of_latitude(unsigned long long int value)
{
	return DegreesOfLatitude{(double)value};
}
constexpr auto operator"" _degrees_of_latitude(long double value)
{
	return DegreesOfLatitude{(double)value};
}
constexpr auto operator"" _micrometers(unsigned long long int value)
{
	return Micrometers{(double)value};
}
constexpr auto operator"" _micrometers(long double value)
{
	return Micrometers{(double)value};
}
constexpr auto operator"" _millimeters(unsigned long long int value)
{
	return Millimeters{(double)value};
}
constexpr auto operator"" _millimeters(long double value)
{
	return Millimeters{(double)value};
}
constexpr auto operator"" _centimeters(unsigned long long int value)
{
	return Centimeters{(double)value};
}
constexpr auto operator"" _centimeters(long double value)
{
	return Centimeters{(double)value};
}
constexpr auto operator"" _kilometers(unsigned long long int value)
{
	return Kilometers{(double)value};
}
constexpr auto operator"" _kilometers(long double value)
{
	return Kilometers{(double)value};
}


}
}

#endif /* INCLUDE_LENGTH_UNITS_H_ */