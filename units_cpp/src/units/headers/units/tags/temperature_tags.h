/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_TEMPERATURE_TAGS_H_
#define INCLUDE_TEMPERATURE_TAGS_H_

#include <ratio>
#include <string>


namespace units {
namespace temperature {
namespace tags
{

using temperature_code  = std::ratio<11, 1>;

struct kelvins_tag
{
	using typeCode = temperature_code;
	static constexpr double scale = 1;
	static std::string singularName();
	static std::string pluralName();
};
struct rankines_tag
{
	using typeCode = temperature_code;
	static constexpr double scale = 0.5555555555 * kelvins_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_TEMPERATURE_TAGS_H_ */