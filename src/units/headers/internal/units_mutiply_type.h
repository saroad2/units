/*
 * multiply_units.h
 *
 *  Created on: Jun 30, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_MULTIPLY_UNITS_H_
#define INCLUDE_MULTIPLY_UNITS_H_

#include "internal/numeric_value.h"
#include "internal/none_type.h"

#include <string>
#include <ratio>

namespace units
{

extern const std::string multiplySymbol;

template<class Unit1 = NoneType, class... Units>
struct multiply_type_tag
{
	using code = std::ratio_multiply<typename Unit1::code, typename multiply_type_tag<Units...>::code>;
};

template<>
struct multiply_type_tag<NoneType>
{
	using code = NoneType::code;
};

template<class Unit1 = NoneType, class... Units>
constexpr double multiplyScaleCalculator()
{
	return Unit1::scale * (sizeof...(Units) == 0 ? 1 : multiplyScaleCalculator<Units...>());
}

template<class Unit1 = NoneType, class... Units>
struct multiply_scale_tag
{
	static constexpr double scale = multiplyScaleCalculator<Unit1, Units...>();
	static std::string singularName()
	{
		return sizeof...(Units) == 0 ?
				Unit1::singularName() :
				Unit1::singularName() + multiplySymbol + multiply_scale_tag<Units...>::singularName();
	}
	static std::string pluralName()
	{
		return sizeof...(Units) == 0 ?
				Unit1::pluralName() :
				Unit1::pluralName() + multiplySymbol + multiply_scale_tag<Units...>::pluralName();
	}
};

template<class... MultiplyedUnits>
using Multiply = NumericValue<multiply_scale_tag<MultiplyedUnits...>, multiply_type_tag<MultiplyedUnits...>>;

}

#endif /* INCLUDE_MULTIPLY_UNITS_H_ */
