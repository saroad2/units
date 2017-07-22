/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_LENGTH_TAGS_H_
#define INCLUDE_LENGTH_TAGS_H_

#include <ratio>
#include <string>
#include "internal/multiplyer_scales.h"


namespace units {
namespace length {
namespace tags
{

struct length_tag { using code = std::ratio<2, 1>; };

struct meters_tag
{
	static constexpr double scale = 1;
	static std::string singularName();
	static std::string pluralName();
};
struct inches_tag
{
	static constexpr double scale = 0.0254 * meters_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct feet_tag
{
	static constexpr double scale = 12.0 * inches_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct yards_tag
{
	static constexpr double scale = 3.0 * feet_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct micrometers_tag
{
	static constexpr double scale = micro * meters_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct millimeters_tag
{
	static constexpr double scale = milli * meters_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct centimeters_tag
{
	static constexpr double scale = centi * meters_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct kilometers_tag
{
	static constexpr double scale = kilo * meters_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_LENGTH_TAGS_H_ */
