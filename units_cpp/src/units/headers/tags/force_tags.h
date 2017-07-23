/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_FORCE_TAGS_H_
#define INCLUDE_FORCE_TAGS_H_

#include <ratio>
#include <string>
#include "internal/units_ratio_type.h"
#include "internal/units_multiply_type.h"
#include "mass_tags.h"
#include "length_tags.h"
#include "duration_tags.h"


namespace units {
namespace force {
namespace tags
{

struct force_tag { using code = ratio_type_tag<multiply_type_tag<mass::tags::mass_tag, length::tags::length_tag>, multiply_type_tag<duration::tags::duration_tag, duration::tags::duration_tag>>::code; };

struct newtons_tag
{
	static constexpr double scale = ratio_scale_tag<multiply_scale_tag<mass::tags::kilograms_tag, length::tags::meters_tag>, multiply_scale_tag<duration::tags::seconds_tag, duration::tags::seconds_tag>>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct dynes_tag
{
	static constexpr double scale = 1.0E-5 * newtons_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_FORCE_TAGS_H_ */
