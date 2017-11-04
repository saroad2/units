/*
 * multiply_units.h
 *
 *  Created on: Jun 30, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_MULTIPLY_UNITS_H_
#define INCLUDE_MULTIPLY_UNITS_H_

#include <units/internal/numeric_value.h>
#include <units/internal/none_type.h>

#include <string>
#include <ratio>
#include <sstream>

namespace units
{

template<typename code1 = none_type_code, typename... codes>
struct multiply_type_code
{
	using code = std::ratio_multiply<code1, typename multiply_type_code<codes...>::code>;
};

template<>
struct multiply_type_code<none_type_code>
{
	using code = none_type_code;
};

template<typename scale1 = none_scale_tag, typename... scales>
constexpr double multiplyScaleCalculator()
{
	return scale1::scale * (sizeof...(scales) == 0 ? 1 : multiplyScaleCalculator<scales...>());
}

template<typename scale1 = none_scale_tag, typename... scales>
std::string singularNameStringCombiner(
		const std::string& delimeter)
{
	std::stringstream stream;
	stream << scale1::singularName();
	if (sizeof...(scales) != 0)
		stream << delimeter << singularNameStringCombiner<scales...>(delimeter);
	return stream.str();
}

template<typename scale1 = none_scale_tag, typename... scales>
std::string pluralNameStringCombiner(
		const std::string& delimeter)
{
	std::stringstream stream;
	stream << scale1::pluralName();
	if (sizeof...(scales) != 0)
		stream << delimeter << pluralNameStringCombiner<scales...>(delimeter);
	return stream.str();
}

template<typename scale1 = none_scale_tag, typename... scales>
struct multiply_scale_tag
{
	using typeCode = typename multiply_type_code<
			typename scale1::typeCode,
			typename scales::typeCode...>::code;
	static constexpr double scale = multiplyScaleCalculator<scale1, scales...>();
	static std::string singularName()
	{
		return singularNameStringCombiner<scale1, scales...>("*");
	}
	static std::string pluralName()
	{
		return pluralNameStringCombiner<scale1, scales...>("*");
	}
};

template<class... Units>
struct multiply_builder
{
	using result = NumericValue<multiply_scale_tag<typename Units::_scale...>>;
};

template<class... Units>
using Multiply = typename multiply_builder<Units...>::result;

}

#endif /* INCLUDE_MULTIPLY_UNITS_H_ */
