/*
 * ratio_units.h
 *
 *  Created on: Jul 1, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_INTERNAL_UNITS_RATIO_TYPE_H_
#define INCLUDE_INTERNAL_UNITS_RATIO_TYPE_H_


#include <units/internal/numeric_value.h>

#include <string>
#include <ratio>

namespace units
{

template<typename code1, typename code2>
struct ratio_type_code
{
	using code = std::ratio_divide<code1, code2>;
};

template<typename scale1, typename scale2>
struct ratio_scale_tag
{
	using typeCode = typename ratio_type_code<
			typename scale1::typeCode,
			typename scale2::typeCode>::code;
	static constexpr double scale = scale1::scale / scale2::scale;
};

template<class Unit1, class Unit2>
using Ratio = NumericValue<
		ratio_scale_tag<typename Unit1::_scale, typename Unit2::_scale>>;

}

#endif /* INCLUDE_INTERNAL_UNITS_RATIO_TYPE_H_ */
