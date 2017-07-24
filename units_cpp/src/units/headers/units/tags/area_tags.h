/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_AREA_TAGS_H_
#define INCLUDE_AREA_TAGS_H_

#include <ratio>
#include <string>
#include <units/internal/units_multiply_type.h>
#include <units/tags/length_tags.h>
#include <units/internal/multiplyer_scales.h>


namespace units {
namespace area {
namespace tags
{

struct area_tag { using code = multiply_type_tag<length::tags::length_tag, length::tags::length_tag>::code; };

struct square_feet_tag
{
	static constexpr double scale = multiply_scale_tag<length::tags::feet_tag, length::tags::feet_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct square_yards_tag
{
	static constexpr double scale = multiply_scale_tag<length::tags::yards_tag, length::tags::yards_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct square_meters_tag
{
	static constexpr double scale = multiply_scale_tag<length::tags::meters_tag, length::tags::meters_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct square_kilometers_tag
{
	static constexpr double scale = multiply_scale_tag<length::tags::kilometers_tag, length::tags::kilometers_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct dunams_tag
{
	static constexpr double scale = kilo * square_meters_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_AREA_TAGS_H_ */
