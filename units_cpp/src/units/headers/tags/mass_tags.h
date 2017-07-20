/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_MASS_TAGS_H_
#define INCLUDE_MASS_TAGS_H_

#include <ratio>
#include <string>

namespace units {
namespace mass {
namespace tags
{

struct mass_tag { using code = std::ratio<5, 1>; };

struct grams_tag
{
	static constexpr double scale = 1.0;
	static std::string singularName();
	static std::string pluralName();
};
struct pounds_tag
{
	static constexpr double scale = 453.592333346094;
	static std::string singularName();
	static std::string pluralName();
};
struct tonnes_tag
{
	static constexpr double scale = 1000000.0;
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_MASS_TAGS_H_ */
