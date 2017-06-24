/*
 * units_cast.h
 *
 *  Created on: Jun 24, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_UNITS_CAST_H_
#define INCLUDE_UNITS_CAST_H_

#include "units/include/numeric_value.h"

namespace units
{

template<class To, class... Tags>
To units_cast(const NumericValue<Tags...>& unit)
{
	using From = NumericValue<Tags...>;
	return To{unit.value() * From::scale() / To::scale()};
}

}

#endif /* INCLUDE_UNITS_CAST_H_ */
