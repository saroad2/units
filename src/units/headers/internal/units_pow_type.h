/*
 * power_units.h
 *
 *  Created on: Jun 30, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_UNITS_POW_TYPE_H_
#define INCLUDE_UNITS_POW_TYPE_H_

#include "internal/numeric_value.h"
#include "internal/none_type.h"

#include <string>
#include <ratio>

namespace units
{

extern const std::string powSymbol;

template<class Unit, int power>
struct pow_type_tag
{
	using code = std::ratio_multiply<
			typename Unit::code,
			typename pow_type_tag<Unit, power - 1>::code>;
};

template<class Unit>
struct pow_type_tag<Unit, 0>
{
	using code = NoneType::code;
};

template<class Unit>
constexpr double powerScaleCalculator(int power)
{
	return Unit::scale * (power == 1 ? 1 : powerScaleCalculator<Unit>(power - 1));
}

template<class Unit, int power>
struct pow_scale_tag
{
	static constexpr double scale = powerScaleCalculator<Unit>(power);
	static std::string singularName()
	{
		return Unit::singularName() + powSymbol + std::to_string(power);
	}
	static std::string pluralName()
	{
		return Unit::pluralName() + powSymbol + std::to_string(power);
	}
};

template<class Unit, int power>
using Pow = NumericValue<
		pow_scale_tag<Unit, power>,
		pow_type_tag<Unit, power>,
		typename Unit::_tags>;

template<class Unit>
using Square = Pow<Unit, 2>;

template<class Unit>
using Cubic = Pow<Unit, 3>;

}



#endif /* INCLUDE_UNITS_POW_TYPE_H_ */
