/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_PRESSURE_TAGS_H_
#define INCLUDE_PRESSURE_TAGS_H_

#include <ratio>
#include <string>
#include <units/internal/units_ratio_type.h>
#include <units/internal/units_multiply_type.h>
#include <units/tags/mass_tags.h>
#include <units/tags/duration_tags.h>
#include <units/tags/length_tags.h>


namespace units {
namespace pressure {
namespace tags
{

using pressure_code  = typename ratio_type_code<
	mass::tags::mass_code, 
	multiply_type_code<length::tags::length_code, duration::tags::duration_code, duration::tags::duration_code>::code>::code;

struct pascals_tag
{
	using typeCode = pressure_code;
	static constexpr double scale = ratio_scale_tag<
		mass::tags::kilograms_tag, 
		multiply_scale_tag<length::tags::meters_tag, duration::tags::seconds_tag, duration::tags::seconds_tag>>::scale;
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_PRESSURE_TAGS_H_ */