/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_VOLUME_TAGS_H_
#define INCLUDE_VOLUME_TAGS_H_

#include <ratio>
#include <string>
#include <units/internal/units_multiply_type.h>
#include <units/tags/length_tags.h>
#include <units/internal/multiplyer_scales.h>


namespace units {
namespace volume {
namespace tags
{

struct volume_tag { using code = multiply_type_tag<length::tags::length_tag, length::tags::length_tag, length::tags::length_tag>::code; };

struct cubic_feet_tag
{
	static constexpr double scale = multiply_scale_tag<length::tags::feet_tag, length::tags::feet_tag, length::tags::feet_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct cubic_yards_tag
{
	static constexpr double scale = multiply_scale_tag<length::tags::yards_tag, length::tags::yards_tag, length::tags::yards_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct cubic_meters_tag
{
	static constexpr double scale = multiply_scale_tag<length::tags::meters_tag, length::tags::meters_tag, length::tags::meters_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct cubic_kilometers_tag
{
	static constexpr double scale = multiply_scale_tag<length::tags::kilometers_tag, length::tags::kilometers_tag, length::tags::kilometers_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct liters_tag
{
	static constexpr double scale = milli * cubic_meters_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct milliliters_tag
{
	static constexpr double scale = milli * liters_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_VOLUME_TAGS_H_ */
