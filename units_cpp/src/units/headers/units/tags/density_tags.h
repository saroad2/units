/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_DENSITY_TAGS_H_
#define INCLUDE_DENSITY_TAGS_H_

#include <ratio>
#include <string>
#include <units/internal/units_ratio_type.h>
#include <units/tags/mass_tags.h>
#include <units/tags/volume_tags.h>
#include <units/internal/multiplier_scales.h>


namespace units {
namespace density {
namespace tags
{

using density_code  = typename ratio_type_code<mass::tags::mass_code, volume::tags::volume_code>::code;

struct kilograms_per_cubic_meter_tag
{
	using typeCode = density_code;
	static constexpr double scale = ratio_scale_tag<mass::tags::kilograms_tag, volume::tags::cubic_meters_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct kilograms_per_liter_tag
{
	using typeCode = density_code;
	static constexpr double scale = multiplyBy<std::kilo>(kilograms_per_cubic_meter_tag::scale);
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_DENSITY_TAGS_H_ */