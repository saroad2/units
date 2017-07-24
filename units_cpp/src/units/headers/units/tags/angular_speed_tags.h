/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_ANGULAR_SPEED_TAGS_H_
#define INCLUDE_ANGULAR_SPEED_TAGS_H_

#include <ratio>
#include <string>
#include <units/internal/units_ratio_type.h>
#include <units/tags/angle_tags.h>
#include <units/tags/duration_tags.h>


namespace units {
namespace angular_speed {
namespace tags
{

struct angular_speed_tag { using code = ratio_type_tag<angle::tags::angle_tag, duration::tags::duration_tag>::code; };

struct degrees_per_second_tag
{
	static constexpr double scale = ratio_scale_tag<angle::tags::degrees_tag, duration::tags::seconds_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct radians_per_second_tag
{
	static constexpr double scale = ratio_scale_tag<angle::tags::radians_tag, duration::tags::seconds_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct mils_per_second_tag
{
	static constexpr double scale = ratio_scale_tag<angle::tags::mils_tag, duration::tags::seconds_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_ANGULAR_SPEED_TAGS_H_ */
