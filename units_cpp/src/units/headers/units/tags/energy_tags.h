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
#include <units/tags/duration_tags.h>
#include <units/internal/multiplyer_scales.h>


namespace units {
namespace energy {
namespace tags
{

struct energy_tag { using code = ratio_type_tag<mass::tags::mass_tag, multiply_type_tag<duration::tags::duration_tag, duration::tags::duration_tag>>::code; };

struct joules_tag
{
	static constexpr double scale = ratio_scale_tag<mass::tags::kilograms_tag, multiply_scale_tag<duration::tags::seconds_tag, duration::tags::seconds_tag>>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct kilojoules_tag
{
	static constexpr double scale = kilo * joules_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct megajoules_tag
{
	static constexpr double scale = mega * joules_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_ENERGY_TAGS_H_ */
