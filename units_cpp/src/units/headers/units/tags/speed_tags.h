/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_SPEED_TAGS_H_
#define INCLUDE_SPEED_TAGS_H_

#include <ratio>
#include <string>
#include <units/internal/units_ratio_type.h>
#include <units/tags/length_tags.h>
#include <units/tags/duration_tags.h>


namespace units {
namespace speed {
namespace tags
{

using speed_code  = typename ratio_type_code<length::tags::length_code, duration::tags::duration_code>::code;

struct feet_per_second_tag
{
	using typeCode = speed_code;
	static constexpr double scale = ratio_scale_tag<length::tags::feet_tag, duration::tags::seconds_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct yards_per_second_tag
{
	using typeCode = speed_code;
	static constexpr double scale = ratio_scale_tag<length::tags::yards_tag, duration::tags::seconds_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct meters_per_second_tag
{
	using typeCode = speed_code;
	static constexpr double scale = ratio_scale_tag<length::tags::meters_tag, duration::tags::seconds_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct kilometers_per_hour_tag
{
	using typeCode = speed_code;
	static constexpr double scale = ratio_scale_tag<length::tags::kilometers_tag, duration::tags::hours_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct knots_tag
{
	using typeCode = speed_code;
	static constexpr double scale = 0.514444773689 * meters_per_second_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_SPEED_TAGS_H_ */