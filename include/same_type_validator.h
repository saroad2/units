/*
 * same_type_validator.h
 *
 *  Created on: Jun 28, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_SAME_TYPE_VALIDATOR_H_
#define INCLUDE_SAME_TYPE_VALIDATOR_H_

#include <type_traits>

namespace units
{

template<class Type1, class Type2>
class is_same_type : public std::is_same<Type1, Type2>
{
};

}

#define VALIDATE_SAME_UNIT_TYPE(Unit1, Unit2) \
	static_assert(units::is_same_type<typename Unit1::_type, typename Unit2::_type>::value, \
				  "Cannot use this operation on units from different types");

#endif /* INCLUDE_SAME_TYPE_VALIDATOR_H_ */
