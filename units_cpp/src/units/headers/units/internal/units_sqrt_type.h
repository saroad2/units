/*
 * units_sqrt_type.h
 *
 *  Created on: Dec 26, 2017
 *      Author: sagis
 */

#ifndef SRC_UNITS_HEADERS_UNITS_INTERNAL_UNITS_SQRT_TYPE_H_
#define SRC_UNITS_HEADERS_UNITS_INTERNAL_UNITS_SQRT_TYPE_H_

#include <units/internal/numeric_value.h>

#include <ratio>
#include <cmath>

namespace units
{

template<int numerator, int denominator>
struct sqrt_type_code
{
	using code = std::ratio<(int)std::sqrt(numerator), (int)std::sqrt(denominator)>;
};

template<typename unitScale>
struct sqrt_scale_tag
{
	using squareTypeCode = typename unitScale::typeCode;
	using typeCode = typename sqrt_type_code<squareTypeCode::num, squareTypeCode::den>::code;
	static constexpr double scale = std::sqrt(unitScale::scale);
};

template <class Unit>
struct sqrt_builder
{
	using result = NumericValue<sqrt_scale_tag<typename Unit::_scale>, typename Unit::_tags>;
};

template <class Unit>
using Sqrt = typename sqrt_builder<Unit>::result;

}

#endif /* SRC_UNITS_HEADERS_UNITS_INTERNAL_UNITS_SQRT_TYPE_H_ */
