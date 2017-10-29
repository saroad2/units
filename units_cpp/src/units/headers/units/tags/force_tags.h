/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_FORCE_TAGS_H_
#define INCLUDE_FORCE_TAGS_H_

#include <ratio>
#include <string>
#include <units/internal/units_ratio_type.h>
#include <units/internal/units_multiply_type.h>
#include <units/tags/mass_tags.h>
#include <units/tags/length_tags.h>
#include <units/tags/duration_tags.h>


namespace units {
namespace force {
namespace tags
{

using force_code  = typename ratio_type_code<
	multiply_type_code<mass::tags::mass_code, length::tags::length_code>::code, 
	multiply_type_code<duration::tags::duration_code, duration::tags::duration_code>::code>::code;

struct newtons_tag
{
	using typeCode = force_code;
	static constexpr double scale = ratio_scale_tag<
		multiply_scale_tag<mass::tags::kilograms_tag, length::tags::meters_tag>, 
		multiply_scale_tag<duration::tags::seconds_tag, duration::tags::seconds_tag>>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct dynes_tag
{
	using typeCode = force_code;
	static constexpr double scale = 1.0E-5 * newtons_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_FORCE_TAGS_H_ */