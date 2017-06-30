/*
 * none_type.h
 *
 *  Created on: Jul 1, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_INTERNAL_NONE_TYPE_H_
#define INCLUDE_INTERNAL_NONE_TYPE_H_

#include "units/include/internal/numeric_value.h"

#include <ratio>

namespace units
{

struct none_type_tag { using code = std::ratio<1, 1>; };

struct none_scale_tag
{
	static constexpr double scale =  1;
	static std::string singularName();
	static std::string pluralName();
};

using NoneType = NumericValue<none_scale_tag, none_type_tag>;

}

#endif /* INCLUDE_INTERNAL_NONE_TYPE_H_ */
