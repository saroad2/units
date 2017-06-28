/*
 * multiplyer_scales.h
 *
 *  Created on: Jun 28, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_MULTIPLYER_SCALES_H_
#define INCLUDE_MULTIPLYER_SCALES_H_

#include "units/include/numeric_value.h"

namespace units
{

#define DEFINE_MULTIPLYER_SCALE(name, value) \
template<class ScaleTag> \
class name##_scale_tag \
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
class Name : public NumericValue<name##_scale_tag<typename Unit::_scale>> \
{ \
public: \
	constexpr Name() : NumericValue<name##_scale_tag<typename Unit::_scale>>{} {} \
	explicit constexpr Name(double value) : NumericValue<name##_scale_tag<typename Unit::_scale>>{value} {} \
	constexpr Name(const Name& other) : NumericValue<name##_scale_tag<typename Unit::_scale>>{other} {} \
	constexpr Name(Name&& other) : NumericValue<name##_scale_tag<typename Unit::_scale>>{other} {} \
	constexpr Name& operator=(const Name& other) = default; \
};

#define DEFINE_MULTIPLYER(Name, name, value) \
		DEFINE_MULTIPLYER_SCALE(name, value); \
		DEFINE_MULTIPLYER_CLASS(Name, name);

DEFINE_MULTIPLYER(Micro, micro, 1e-6);
DEFINE_MULTIPLYER(Milli, milli, 1e-3);
DEFINE_MULTIPLYER(Centi, centi, 1e-2);
DEFINE_MULTIPLYER(Kilo, kilo, 1e+3);

}

#endif /* INCLUDE_MULTIPLYER_SCALES_H_ */
