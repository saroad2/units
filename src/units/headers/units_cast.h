/*
 * units_cast.h
 *
 *  Created on: Jun 24, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_UNITS_CAST_H_
#define INCLUDE_UNITS_CAST_H_

#include "internal/numeric_value.h"
#include "internal/same_type_validator.h"

namespace units
{

template<class To, class From>
constexpr double conversionScale()
{
	return From::scale / To::scale;
}

template<class To, class... Tags>
constexpr To units_cast(const NumericValue<Tags...>& unit)
{
	using From = NumericValue<Tags...>;
	VALIDATE_SAME_UNIT_TYPE(To, From);
	return To{unit.value() * conversionScale<To, From>()};
}

template<class To>
constexpr To units_cast(const To& unit)
{
	return unit;
}

}

#endif /* INCLUDE_UNITS_CAST_H_ */
