/*
 * same_type_validator.h
 *
 *  Created on: Jun 28, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_SAME_TYPE_VALIDATOR_H_
#define INCLUDE_SAME_TYPE_VALIDATOR_H_

#include <type_traits>
#include <ratio>

namespace units
{

template<class Unit1, class Unit2>
struct is_from_the_same_type
{
	constexpr static bool value =
			std::ratio_equal<
				typename Unit1::_scale::typeCode,
				typename Unit2::_scale::typeCode>::value;
};

template<class Unit1, class Unit2>
struct is_same_unit
{
	constexpr static bool value =
			is_from_the_same_type<Unit1, Unit2>::value &&
			Unit1::_scale::scale == Unit2::_scale::scale;
};

#define VALIDATE_SAME_UNIT_TYPE(Unit1, Unit2) \
	static_assert(units::is_from_the_same_type<Unit1, Unit2>::value, \
				  "Cannot use this operation on units from different types");

#define VALIDATE_SAME_UNIT(Unit1, Unit2) \
	static_assert(is_same_unit<Unit1, Unit2>::value, \
				  "Cannot use this operation on different units");
}

#endif /* INCLUDE_SAME_TYPE_VALIDATOR_H_ */
