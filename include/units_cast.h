/*
 * units_cast.h
 *
 *  Created on: Jun 24, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_UNITS_CAST_H_
#define INCLUDE_UNITS_CAST_H_

#include "units/include/internal/numeric_value.h"
#include "units/include/internal/same_type_validator.h"

namespace units
{

template<class To, class... Tags>
constexpr To units_cast(const NumericValue<Tags...>& unit)
{
	using From = NumericValue<Tags...>;
	VALIDATE_SAME_UNIT_TYPE(From, To);
	return To{unit.value() * From::scale() / To::scale()};
}

template<class To>
constexpr To units_cast(const To& unit)
{
	return unit;
}

}

#endif /* INCLUDE_UNITS_CAST_H_ */
