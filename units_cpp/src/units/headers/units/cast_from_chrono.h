/*
 * cast_from_chrono.h
 *
 *  Created on: Oct 31, 2017
 *      Author: sagis
 */

#ifndef SRC_UNITS_HEADERS_UNITS_CAST_FROM_CHRONO_H_
#define SRC_UNITS_HEADERS_UNITS_CAST_FROM_CHRONO_H_

#include <units/duration_units.h>
#include <chrono>

namespace units {
namespace duration
{

constexpr Microseconds cast_from_chrono(const std::chrono::microseconds& microseconds)
{
	return Microseconds{microseconds.count()};
}

constexpr Milliseconds cast_from_chrono(const std::chrono::milliseconds& milliseconds)
{
	return Milliseconds{milliseconds.count()};
}

constexpr Seconds cast_from_chrono(const std::chrono::seconds& seconds)
{
	return Seconds{seconds.count()};
}

constexpr Minutes cast_from_chrono(const std::chrono::minutes& minutes)
{
	return Minutes{minutes.count()};
}

constexpr Hours cast_from_chrono(const std::chrono::hours& hours)
{
	return Hours{hours.count()};
}

}
}

#endif /* SRC_UNITS_HEADERS_UNITS_CAST_FROM_CHRONO_H_ */
