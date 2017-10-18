/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_ELECTRIC_CHARGE_TAGS_H_
#define INCLUDE_ELECTRIC_CHARGE_TAGS_H_

#include <ratio>
#include <string>
#include <units/internal/units_multiply_type.h>
#include <units/tags/duration_tags.h>
#include <units/tags/electric_current_tags.h>


namespace units {
namespace electric_charge {
namespace tags
{

using electric_charge_code  = multiply_type_code<electric_current::tags::electric_current_code, duration::tags::duration_code>::code;

struct coulombs_tag
{
	using typeCode = electric_charge_code;
	static constexpr double scale = multiply_scale_tag<electric_current::tags::amperes_tag, duration::tags::seconds_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_ELECTRIC_CHARGE_TAGS_H_ */