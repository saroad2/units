/*
 * same_type_validator.h
 *
 *  Created on: Jun 28, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_SAME_TYPE_VALIDATOR_H_
#define INCLUDE_SAME_TYPE_VALIDATOR_H_

#include "units/include/internal/multiply_units.h"

#include <type_traits>

namespace units
{

template<class Unit1, class Unit2>
class is_from_the_same_type
{
public:
	constexpr static bool value() { return Unit1::typeCode() == Unit2::typeCode(); }
};

}

#define VALIDATE_SAME_UNIT_TYPE(Unit1, Unit2) \
	static_assert(units::is_from_the_same_type<Unit1, Unit2>::value(), \
				  "Cannot use this operation on units from different types");

#endif /* INCLUDE_SAME_TYPE_VALIDATOR_H_ */
