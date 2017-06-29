/*
 * multiply_units.h
 *
 *  Created on: Jun 30, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_MULTIPLY_UNITS_H_
#define INCLUDE_MULTIPLY_UNITS_H_

#include "units/include/numeric_value.h"
#include <string>

namespace units
{

extern std::string multiplySymbol;

struct none_type_tag { static constexpr int code = 1; };

struct none_scale_tag
{
	static constexpr double scale =  1;
	static std::string singularName();
	static std::string pluralName();
};

using NoneType = NumericValue<none_scale_tag, none_type_tag>;

template<class Unit1 = NoneType, class... Units>
constexpr double multiplyCodeCalculator()
{
	return Unit1::typeCode() *
		(sizeof...(Units) == 0 ? 1 : multiplyCodeCalculator<Units...>());
}

template<class Unit1, class... Units>
struct multiply_type_tag
{
	static constexpr int code = multiplyCodeCalculator<Unit1, Units...>();
};

template<class Unit1 = NoneType, class... Units>
constexpr double multiplyScaleCalculator()
{
	return Unit1::scale() *
		(sizeof...(Units) == 0 ?
		1 :
		multiplyScaleCalculator<Units...>());
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
