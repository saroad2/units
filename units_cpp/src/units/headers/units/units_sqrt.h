/*
 * units_sqrt.h
 *
 *  Created on: Dec 26, 2017
 *      Author: sagis
 */

#ifndef SRC_UNITS_HEADERS_UNITS_UNITS_SQRT_H_
#define SRC_UNITS_HEADERS_UNITS_UNITS_SQRT_H_

#include <units/internal/units_sqrt_type.h>
#include <units/internal/units_pow_type.h>
#include <units/units_cast.h>

#include <cmath>

namespace units
{

#define VALIDATE_HAS_SQUARE_ROOT(Unit) \
static_assert(units::is_from_the_same_type<Unit, Square<Sqrt<Unit>>>::value, \
			  "This unit does not have a square root");

template <class Unit>
auto auto_units_sqrt(const Unit& unit)
{
	VALIDATE_HAS_SQUARE_ROOT(Unit);
	return Sqrt<Unit>{std::sqrt(unit.value())};
}

template <class ResultUnit, class Unit>
ResultUnit units_sqrt(const Unit& unit)
{
	return units_cast<ResultUnit>(auto_units_sqrt(unit));
}

}

#endif /* SRC_UNITS_HEADERS_UNITS_UNITS_SQRT_H_ */
