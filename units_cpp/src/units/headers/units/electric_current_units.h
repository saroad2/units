/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_ELECTRIC_CURRENT_UNITS_H_
#define INCLUDE_ELECTRIC_CURRENT_UNITS_H_

#include <units/internal/numeric_value.h>

#include <units/tags/electric_current_tags.h>

namespace units {
namespace electric_current
{

using Amperes = NumericValue<tags::amperes_tag>;


constexpr auto operator"" _amperes(unsigned long long int value)
{
	return Amperes{(double)value};
}
constexpr auto operator"" _amperes(long double value)
{
	return Amperes{(double)value};
}


}
}

#endif /* INCLUDE_ELECTRIC_CURRENT_UNITS_H_ */