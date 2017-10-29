/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_DURATION_TAGS_H_
#define INCLUDE_DURATION_TAGS_H_

#include <ratio>
#include <string>
#include <units/internal/multiplier_scales.h>


namespace units {
namespace duration {
namespace tags
{

using duration_code  = std::ratio<7, 1>;

struct seconds_tag
{
	using typeCode = duration_code;
	static constexpr double scale = 1;
	static std::string singularName();
	static std::string pluralName();
};
struct minutes_tag
{
	using typeCode = duration_code;
	static constexpr double scale = 60.0 * seconds_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct hours_tag
{
	using typeCode = duration_code;
	static constexpr double scale = 60.0 * minutes_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct days_tag
{
	using typeCode = duration_code;
	static constexpr double scale = 24.0 * hours_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct years_tag
{
	using typeCode = duration_code;
	static constexpr double scale = 365.0 * days_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct microseconds_tag
{
	using typeCode = duration_code;
	static constexpr double scale = multiplyBy<std::micro>(seconds_tag::scale);
	static std::string singularName();
	static std::string pluralName();
};
struct milliseconds_tag
{
	using typeCode = duration_code;
	static constexpr double scale = multiplyBy<std::milli>(seconds_tag::scale);
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_DURATION_TAGS_H_ */