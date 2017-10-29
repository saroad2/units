/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_AREA_TAGS_H_
#define INCLUDE_AREA_TAGS_H_

#include <ratio>
#include <string>
#include <units/internal/units_multiply_type.h>
#include <units/tags/length_tags.h>
#include <units/internal/multiplier_scales.h>


namespace units {
namespace area {
namespace tags
{

using area_code  = multiply_type_code<length::tags::length_code, length::tags::length_code>::code;

struct square_feet_tag
{
	using typeCode = area_code;
	static constexpr double scale = multiply_scale_tag<length::tags::feet_tag, length::tags::feet_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct square_yards_tag
{
	using typeCode = area_code;
	static constexpr double scale = multiply_scale_tag<length::tags::yards_tag, length::tags::yards_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct square_meters_tag
{
	using typeCode = area_code;
	static constexpr double scale = multiply_scale_tag<length::tags::meters_tag, length::tags::meters_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct square_kilometers_tag
{
	using typeCode = area_code;
	static constexpr double scale = multiply_scale_tag<length::tags::kilometers_tag, length::tags::kilometers_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct dunams_tag
{
	using typeCode = area_code;
	static constexpr double scale = multiplyBy<std::kilo>(square_meters_tag::scale);
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_AREA_TAGS_H_ */