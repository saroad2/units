/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_LENGTH_TAGS_H_
#define INCLUDE_LENGTH_TAGS_H_

#include <ratio>
#include <string>


namespace units {
namespace length {
namespace tags
{

struct length_tag { using code = std::ratio<2, 1>; };

struct inches_tag
{
	static constexpr double scale = 0.02539999983236;
	static std::string singularName();
	static std::string pluralName();
};
struct feet_tag
{
	static constexpr double scale = 0.304799999536704;
	static std::string singularName();
	static std::string pluralName();
};
struct yards_tag
{
	static constexpr double scale = 0.914399998610112;
	static std::string singularName();
	static std::string pluralName();
};
struct meters_tag
{
	static constexpr double scale = 1.0;
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_LENGTH_TAGS_H_ */
