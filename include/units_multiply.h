/*
 * units_multiply.h
 *
 *  Created on: Jul 1, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_UNITS_MULTIPLY_H_
#define INCLUDE_UNITS_MULTIPLY_H_

#include "units/include/internal/units_mutiply_type.h"
#include "units/include/units_cast.h"

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

template<class ResultUnit, class... Units>
constexpr auto units_multiply(const Units&... units)
{
	return units_cast<ResultUnit>(Multiply<Units...>{ValuesMultiplyer<Units...>{units...}.value});
}

}

#endif /* INCLUDE_UNITS_MULTIPLY_H_ */
