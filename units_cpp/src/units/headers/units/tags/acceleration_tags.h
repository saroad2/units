/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_ACCELERATION_TAGS_H_
#define INCLUDE_ACCELERATION_TAGS_H_

#include <ratio>
#include <string>
#include <units/internal/units_ratio_type.h>
#include <units/internal/units_multiply_type.h>
#include <units/tags/length_tags.h>
#include <units/tags/duration_tags.h>


namespace units {
namespace acceleration {
namespace tags
{

using acceleration_code  = typename ratio_type_code<
	length::tags::length_code, 
	multiply_type_code<duration::tags::duration_code, duration::tags::duration_code>::code>::code;

struct meters_per_square_seconds_tag
{
	using typeCode = acceleration_code;
	static constexpr double scale = ratio_scale_tag<
		length::tags::meters_tag, 
		multiply_scale_tag<duration::tags::seconds_tag, duration::tags::seconds_tag>>::scale;
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_ACCELERATION_TAGS_H_ */