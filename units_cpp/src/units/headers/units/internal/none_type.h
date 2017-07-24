/*
 * none_type.h
 *
 *  Created on: Jul 1, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_INTERNAL_NONE_TYPE_H_
#define INCLUDE_INTERNAL_NONE_TYPE_H_

#include <units/internal/numeric_value.h>

#include <ratio>

namespace units
{

using none_type_code = std::ratio<1, 1>;

struct none_scale_tag
{
	using typeCode = none_type_code;
	static constexpr double scale =  1;
	static std::string singularName();
	static std::string pluralName();
};

using NoneType = NumericValue<none_scale_tag>;

}

#endif /* INCLUDE_INTERNAL_NONE_TYPE_H_ */
