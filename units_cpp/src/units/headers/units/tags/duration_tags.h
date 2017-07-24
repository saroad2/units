/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_DURATION_TAGS_H_
#define INCLUDE_DURATION_TAGS_H_

#include <ratio>
#include <string>
#include <units/internal/multiplyer_scales.h>


namespace units {
namespace duration {
namespace tags
{

struct duration_tag { using code = std::ratio<7, 1>; };

struct seconds_tag
{
	static constexpr double scale = 1;
	static std::string singularName();
	static std::string pluralName();
};
struct minutes_tag
{
	static constexpr double scale = 60.0 * seconds_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct hours_tag
{
	static constexpr double scale = 60.0 * minutes_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct days_tag
{
	static constexpr double scale = 24.0 * hours_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct years_tag
{
	static constexpr double scale = 365.0 * days_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct microseconds_tag
{
	static constexpr double scale = micro * seconds_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct milliseconds_tag
{
	static constexpr double scale = milli * seconds_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_DURATION_TAGS_H_ */
