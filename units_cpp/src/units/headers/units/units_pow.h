/*
 * units_pow.h
 *
 *  Created on: Jul 1, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_UNITS_POW_H_
#define INCLUDE_UNITS_POW_H_

#include "internal/units_pow_type.h"
#include "units_cast.h"

#include <math.h>

namespace units
{

template<int power, class Unit>
constexpr auto units_pow(const Unit& unit)
{
	return Pow<Unit, power>{pow(unit.value(), power)};
}

template<class ResultUnit, class Unit>
constexpr auto units_sqr(const Unit& unit)
{
	return units_cast<ResultUnit>(units_pow<2>(unit));
}

template<class ResultUnit, class Unit>
constexpr auto units_cube(const Unit& unit)
{
	return units_cast<ResultUnit>(units_pow<3>(unit));
}

}

#endif /* INCLUDE_UNITS_POW_H_ */
