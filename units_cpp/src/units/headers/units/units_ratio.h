/*
 * units_ratio.h
 *
 *  Created on: Jul 1, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_UNITS_RATIO_H_
#define INCLUDE_UNITS_RATIO_H_

#include "internal/units_ratio_type.h"
#include "units_cast.h"

namespace units
{

template<class Unit1, class Unit2>
constexpr auto auto_units_ratio(const Unit1& unit1, const Unit2& unit2)
{
	return Ratio<Unit1, Unit2>{unit1.value() / unit2.value()};
}

template<class ResultUnit, class Unit1, class Unit2>
constexpr auto units_ratio(const Unit1& unit1, const Unit2& unit2)
{
	return units_cast<ResultUnit>(auto_units_ratio(unit1, unit2));
}

}


#endif /* INCLUDE_UNITS_RATIO_H_ */
