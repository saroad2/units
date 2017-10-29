/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_FREQUENCY_TAGS_H_
#define INCLUDE_FREQUENCY_TAGS_H_

#include <ratio>
#include <string>
#include <units/internal/units_ratio_type.h>
#include <units/tags/duration_tags.h>
#include <units/internal/multiplier_scales.h>


namespace units {
namespace frequency {
namespace tags
{

using frequency_code  = inverse_type_code<duration::tags::duration_code>::code;

struct hertz_tag
{
	using typeCode = frequency_code;
	static constexpr double scale = inverse_scale_tag<duration::tags::seconds_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct kilohertz_tag
{
	using typeCode = frequency_code;
	static constexpr double scale = multiplyBy<std::kilo>(hertz_tag::scale);
	static std::string singularName();
	static std::string pluralName();
};
struct megahertz_tag
{
	using typeCode = frequency_code;
	static constexpr double scale = multiplyBy<std::mega>(hertz_tag::scale);
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_FREQUENCY_TAGS_H_ */