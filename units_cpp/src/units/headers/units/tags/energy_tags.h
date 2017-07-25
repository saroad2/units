/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_ENERGY_TAGS_H_
#define INCLUDE_ENERGY_TAGS_H_

#include <ratio>
#include <string>
#include <units/internal/units_ratio_type.h>
#include <units/internal/units_multiply_type.h>
#include <units/tags/mass_tags.h>
#include <units/tags/length_tags.h>
#include <units/tags/duration_tags.h>
#include <units/internal/multiplyer_scales.h>


namespace units {
namespace energy {
namespace tags
{

using energy_code  = typename ratio_type_code<
	multiply_type_code<mass::tags::mass_code, length::tags::length_code, length::tags::length_code>::code, 
	multiply_type_code<duration::tags::duration_code, duration::tags::duration_code>::code>::code;

struct joules_tag
{
	using typeCode = energy_code;
	static constexpr double scale = ratio_scale_tag<
		multiply_scale_tag<mass::tags::kilograms_tag, length::tags::meters_tag, length::tags::meters_tag>, 
		multiply_scale_tag<duration::tags::seconds_tag, duration::tags::seconds_tag>>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct calories_tag
{
	using typeCode = energy_code;
	static constexpr double scale = 4.184 * joules_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct kilocalories_tag
{
	using typeCode = energy_code;
	static constexpr double scale = kilo * calories_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct kilojoules_tag
{
	using typeCode = energy_code;
	static constexpr double scale = kilo * joules_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct megajoules_tag
{
	using typeCode = energy_code;
	static constexpr double scale = mega * joules_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_ENERGY_TAGS_H_ */
