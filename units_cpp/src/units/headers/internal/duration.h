/*
 * duration.h
 *
 *  Created on: Jul 20, 2017
 *      Author: sagis
 */

#ifndef SRC_UNITS_HEADERS_INTERNAL_DURATION_H_
#define SRC_UNITS_HEADERS_INTERNAL_DURATION_H_

#include "numeric_value.h"

namespace units {
namespace duration {

template<class ChronoClass, class... Tags>
class Duration : public NumericValue<Tags...>
{
private:
	using _selfType = Duration<ChronoClass, Tags...>;
public:
	constexpr Duration() : NumericValue<Tags...>{} {};
	explicit constexpr Duration(double value) : NumericValue<Tags...>{value} {};
	constexpr Duration(const ChronoClass& value)
	: NumericValue<Tags...>{(double)value.count()}
	{
	}
	constexpr Duration(const _selfType& other) = default;
	constexpr Duration(_selfType&& other) = default;
	constexpr _selfType& operator=(const _selfType& other) = default;
};

}
}

#endif /* SRC_UNITS_HEADERS_INTERNAL_DURATION_H_ */
