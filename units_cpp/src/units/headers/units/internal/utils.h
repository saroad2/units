/*
 * utils.h
 *
 *  Created on: Jun 30, 2017
 *      Author: sagis
 */

#include <ostream>
#include <units/internal/numeric_value.h>

#ifndef INCLUDE_UTILS_H_
#define INCLUDE_UTILS_H_

namespace units {

#define USER_DEFINED_LITERALS(Name, name) \
	constexpr auto operator"" _##name(unsigned long long int value) \
	{ \
		return Name{(double)value}; \
	} \
	constexpr auto operator"" _##name(long double value) \
	{ \
		return Name{(double)value}; \
	}

}
#endif /* INCLUDE_UTILS_H_ */
