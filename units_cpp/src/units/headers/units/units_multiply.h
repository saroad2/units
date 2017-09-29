/*
 * units_multiply.h
 *
 *  Created on: Jul 1, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_UNITS_MULTIPLY_H_
#define INCLUDE_UNITS_MULTIPLY_H_

#include "internal/units_multiply_type.h"
#include "units_cast.h"

namespace units
{

template<class Unit1, class... Units>
struct ValuesMultiplyer
{
	ValuesMultiplyer(const Unit1& unit1, const Units&... units)
	: value{unit1.value() * ValuesMultiplyer<Units...>{units...}.value}
	{
	}
	double value;
};

template<class Unit1>
struct ValuesMultiplyer<Unit1>
{
	ValuesMultiplyer(const Unit1& unit1)
	: value{unit1.value()}
	{
	}
	double value;
};

template<class... Units>
constexpr auto auto_units_multiply(const Units&... units)
{
	return Multiply<Units...>{ValuesMultiplyer<Units...>{units...}.value};
}

template<class ResultUnit, class... Units>
constexpr auto units_multiply(const Units&... units)
{
	return units_cast<ResultUnit>(auto_units_multiply(units...));
}

}

#endif /* INCLUDE_UNITS_MULTIPLY_H_ */
