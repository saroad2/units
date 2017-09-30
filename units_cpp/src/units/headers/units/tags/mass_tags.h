/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_MASS_TAGS_H_
#define INCLUDE_MASS_TAGS_H_

#include <ratio>
#include <string>
#include <units/internal/multiplyer_scales.h>


namespace units {
namespace mass {
namespace tags
{

using mass_code  = std::ratio<5, 1>;

struct grams_tag
{
	using typeCode = mass_code;
	static constexpr double scale = 1;
	static std::string singularName();
	static std::string pluralName();
};
struct pounds_tag
{
	using typeCode = mass_code;
	static constexpr double scale = 453.592333346094 * grams_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct milligrams_tag
{
	using typeCode = mass_code;
	static constexpr double scale = multiplyBy<std::milli>(grams_tag::scale);
	static std::string singularName();
	static std::string pluralName();
};
struct kilograms_tag
{
	using typeCode = mass_code;
	static constexpr double scale = multiplyBy<std::kilo>(grams_tag::scale);
	static std::string singularName();
	static std::string pluralName();
};
struct tonnes_tag
{
	using typeCode = mass_code;
	static constexpr double scale = multiplyBy<std::mega>(grams_tag::scale);
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_MASS_TAGS_H_ */