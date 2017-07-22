/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_SPEED_TAGS_H_
#define INCLUDE_SPEED_TAGS_H_

#include <ratio>
#include <string>
#include "internal/units_ratio_type.h"
#include "length_tags.h"
#include "duration_tags.h"


namespace units {
namespace speed {
namespace tags
{

struct speed_tag { using code = ratio_type_tag<length::tags::length_tag, duration::tags::duration_tag>::code; };

struct feet_per_second_tag
{
	static constexpr double scale = ratio_scale_tag<length::tags::feet_tag, duration::tags::seconds_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct yards_per_second_tag
{
	static constexpr double scale = ratio_scale_tag<length::tags::yards_tag, duration::tags::seconds_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct meters_per_second_tag
{
	static constexpr double scale = ratio_scale_tag<length::tags::meters_tag, duration::tags::seconds_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct kilometers_per_hour_tag
{
	static constexpr double scale = ratio_scale_tag<length::tags::kilometers_tag, duration::tags::hours_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct knots_tag
{
	static constexpr double scale = 0.514444773689 * meters_per_second_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_SPEED_TAGS_H_ */
