/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_LENGTH_TAGS_H_
#define INCLUDE_LENGTH_TAGS_H_

#include <ratio>
#include <string>
#include <units/internal/multiplier_scales.h>


namespace units {
namespace length {
namespace tags
{

using length_code  = std::ratio<2, 1>;

struct meters_tag
{
	using typeCode = length_code;
	static constexpr double scale = 1;
	static std::string singularName();
	static std::string pluralName();
};
struct inches_tag
{
	using typeCode = length_code;
	static constexpr double scale = 0.0254 * meters_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct feet_tag
{
	using typeCode = length_code;
	static constexpr double scale = 12.0 * inches_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct yards_tag
{
	using typeCode = length_code;
	static constexpr double scale = 3.0 * feet_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct statute_miles_tag
{
	using typeCode = length_code;
	static constexpr double scale = 621.371192237 * meters_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct nautical_miles_tag
{
	using typeCode = length_code;
	static constexpr double scale = 1852.0 * meters_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct geographical_miles_tag
{
	using typeCode = length_code;
	static constexpr double scale = 1855.3248 * meters_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct degrees_of_latitude_tag
{
	using typeCode = length_code;
	static constexpr double scale = 60.0 * geographical_miles_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct micrometers_tag
{
	using typeCode = length_code;
	static constexpr double scale = multiplyBy<std::micro>(meters_tag::scale);
	static std::string singularName();
	static std::string pluralName();
};
struct millimeters_tag
{
	using typeCode = length_code;
	static constexpr double scale = multiplyBy<std::milli>(meters_tag::scale);
	static std::string singularName();
	static std::string pluralName();
};
struct centimeters_tag
{
	using typeCode = length_code;
	static constexpr double scale = multiplyBy<std::centi>(meters_tag::scale);
	static std::string singularName();
	static std::string pluralName();
};
struct kilometers_tag
{
	using typeCode = length_code;
	static constexpr double scale = multiplyBy<std::kilo>(meters_tag::scale);
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_LENGTH_TAGS_H_ */