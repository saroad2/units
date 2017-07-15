/*
 * duration_units.h
 *
 *  Created on: Jun 29, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_DURATION_UNITS_H_
#define INCLUDE_DURATION_UNITS_H_

#include "units/include/internal/numeric_value.h"
#include "units/include/internal/multiplyer_scales.h"
#include "units/include/internal/utils.h"

#include <chrono>
#include <ratio>

namespace units {
namespace duration
{

struct duration_tag {	using code = std::ratio<5, 1>; };

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


struct seconds_tag
{
	static constexpr double scale = 1;
	static std::string singularName();
	static std::string pluralName();
};

struct minutes_tag
{
	using seconds = std::chrono::seconds;
	using minutes = std::chrono::minutes;
	static constexpr double scale =
			seconds_tag::scale
			* std::chrono::duration_cast<seconds>(minutes{1}).count();
	static std::string singularName();
	static std::string pluralName();
};

struct hours_tag
{
	using minutes = std::chrono::minutes;
	using hours = std::chrono::hours;
	static constexpr double scale =
			minutes_tag::scale
			* std::chrono::duration_cast<minutes>(hours{1}).count();
	static std::string singularName();
	static std::string pluralName();
};

struct days_tag
{
	static constexpr double scale = hours_tag::scale * 24;
	static std::string singularName();
	static std::string pluralName();
};

struct years_tag
{
	static constexpr double scale = days_tag::scale * 365;
	static std::string singularName();
	static std::string pluralName();
};

using Microseconds = Duration<
		std::chrono::microseconds,
		micro<seconds_tag>,
		duration_tag>;
using Milliseconds = Duration<
		std::chrono::milliseconds,
		milli<seconds_tag>,
		duration_tag>;
using Seconds = Duration<std::chrono::seconds, seconds_tag, duration_tag>;
using Minutes = Duration<std::chrono::minutes, minutes_tag, duration_tag>;
using Hours = Duration<std::chrono::hours, hours_tag, duration_tag>;
using Days = NumericValue<days_tag, duration_tag>;
using Years = NumericValue<years_tag, duration_tag>;

USER_DEFINED_LITERALS(Microseconds, microseconds);
USER_DEFINED_LITERALS(Milliseconds, milliseconds);
USER_DEFINED_LITERALS(Seconds, seconds);
USER_DEFINED_LITERALS(Minutes, minutes);
USER_DEFINED_LITERALS(Hours, hours);
USER_DEFINED_LITERALS(Days, days);
USER_DEFINED_LITERALS(Years, years);
}
}

#endif /* INCLUDE_DURATION_UNITS_H_ */
