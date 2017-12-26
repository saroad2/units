/*
 * power_units.h
 *
 *  Created on: Jun 30, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_UNITS_POW_TYPE_H_
#define INCLUDE_UNITS_POW_TYPE_H_

#include <units/internal/numeric_value.h>
#include <units/internal/none_type.h>

#include <string>
#include <ratio>

namespace units
{

template<typename unitCode, int power>
struct pow_type_code
{
	using code = std::ratio_multiply<
			unitCode,
			typename pow_type_code<unitCode, power - 1>::code>;
};

template<typename unitCode>
struct pow_type_code<unitCode, 0>
{
	using code = none_type_code;
};

template<typename scale>
constexpr double powerScaleCalculator(int power)
{
	return scale::scale * (power == 1 ? 1 : powerScaleCalculator<scale>(power - 1));
}

template<typename unitScale, int power>
struct pow_scale_tag
{
	using typeCode = typename pow_type_code<typename unitScale::typeCode, power>::code;
	static constexpr double scale = powerScaleCalculator<unitScale>(power);
};

template <class Unit, int power>
struct pow_builder
{
	using result = NumericValue<pow_scale_tag<typename Unit::_scale, power>, typename Unit::_tags>;
};

template <class Unit, int power>
using Pow = typename pow_builder<Unit, power>::result;

template <class Unit>
using Square = Pow<Unit, 2>;

}

#endif /* INCLUDE_UNITS_POW_TYPE_H_ */
