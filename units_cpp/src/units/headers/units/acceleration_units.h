/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_ACCELERATION_UNITS_H_
#define INCLUDE_ACCELERATION_UNITS_H_

#include <units/duration_units.h>
#include <units/internal/numeric_value.h>
#include <units/length_units.h>

#include <units/tags/acceleration_tags.h>

namespace units {
namespace acceleration
{

using MetersPerSquareSecond = NumericValue<tags::meters_per_square_second_tag>;


constexpr auto operator"" _meters_per_square_second(unsigned long long int value)
{
	return MetersPerSquareSecond{(double)value};
}
constexpr auto operator"" _meters_per_square_second(long double value)
{
	return MetersPerSquareSecond{(double)value};
}


}
}

#endif /* INCLUDE_ACCELERATION_UNITS_H_ */