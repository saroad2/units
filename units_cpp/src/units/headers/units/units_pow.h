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

#include <cmath>

namespace units
{

template<int power, class Unit>
constexpr auto units_pow(const Unit& unit)
{
	return Pow<Unit, power>{std::pow(unit.value(), power)};
}

template<class Unit>
constexpr auto auto_units_sqr(const Unit& unit)
{
	return units_pow<2>(unit);
}

template<class ResultUnit, class Unit>
constexpr auto units_sqr(const Unit& unit)
{
	return units_cast<ResultUnit>(auto_units_sqr(unit));
}

template<class Unit>
constexpr auto auto_units_cube(const Unit& unit)
{
	return units_pow<3>(unit);
}

template<class ResultUnit, class Unit>
constexpr auto units_cube(const Unit& unit)
{
	return units_cast<ResultUnit>(auto_units_cube(unit));
}

}

#endif /* INCLUDE_UNITS_POW_H_ */
