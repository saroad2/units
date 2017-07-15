/*
 * ratio_units.h
 *
 *  Created on: Jul 1, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_INTERNAL_UNITS_RATIO_TYPE_H_
#define INCLUDE_INTERNAL_UNITS_RATIO_TYPE_H_


#include "internal/numeric_value.h"

#include <string>
#include <ratio>

namespace units
{

extern const std::string ratioSymbol;

template<class Unit1, class Unit2>
struct ratio_type_tag
{
	using code = std::ratio_divide<typename Unit1::code, typename Unit2::code>;
};

template<class Unit1, class Unit2>
struct ratio_scale_tag
{
	static constexpr double scale = Unit1::scale / Unit2::scale;
	static std::string singularName()
	{
		return Unit1::singularName() + ratioSymbol + Unit2::singularName();
	}
	static std::string pluralName()
	{
		return Unit1::pluralName() + ratioSymbol + Unit2::singularName();
	}
};

template<class Unit1, class Unit2>
using Ratio = NumericValue<ratio_scale_tag<Unit1, Unit2>, ratio_type_tag<Unit1, Unit2>>;

}

#endif /* INCLUDE_INTERNAL_UNITS_RATIO_TYPE_H_ */
