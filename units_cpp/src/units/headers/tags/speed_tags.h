/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_SPEED_TAGS_H_
#define INCLUDE_SPEED_TAGS_H_

#include <ratio>
#include <string>
#include "internal/units_ratio_type.h"
#include "length_tags.h"
#include "duration_tags.h"


namespace units {
namespace speed {
namespace tags
{

struct speed_tag { using code = ratio_type_tag<length::tags::length_tag, duration::tags::duration_tag>::code; };

struct knots_tag
{
	static constexpr double scale = 0.514444773689;
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_SPEED_TAGS_H_ */
