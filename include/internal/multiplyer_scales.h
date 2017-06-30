/*
 * multiplyer_scales.h
 *
 *  Created on: Jun 28, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_MULTIPLYER_SCALES_H_
#define INCLUDE_MULTIPLYER_SCALES_H_

#include "units/include/internal/numeric_value.h"

namespace units
{

#define DEFINE_MULTIPLYER_SCALE(name, value) \
template<class ScaleTag> \
class name \
{ \
public: \
	static constexpr double scale = value * ScaleTag::scale; \
	static std::string singularName() \
	{ \
		return #name + ScaleTag::singularName(); \
	} \
	static std::string pluralName() \
	{ \
		return #name + ScaleTag::pluralName(); \
	} \
}
#define DEFINE_MULTIPLYER_CLASS(Name, name) \
template<class Unit> \
using Name = NumericValue<name<typename Unit::_scale>, typename Unit::_type>

#define DEFINE_MULTIPLYER(Name, name, value) \
		DEFINE_MULTIPLYER_SCALE(name, value); \
		DEFINE_MULTIPLYER_CLASS(Name, name);

DEFINE_MULTIPLYER(Micro, micro, 1e-6);
DEFINE_MULTIPLYER(Milli, milli, 1e-3);
DEFINE_MULTIPLYER(Centi, centi, 1e-2);
DEFINE_MULTIPLYER(Kilo, kilo, 1e+3);

}

#endif /* INCLUDE_MULTIPLYER_SCALES_H_ */
