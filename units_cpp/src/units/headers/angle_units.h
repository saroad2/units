/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_ANGLE_UNITS_H_
#define INCLUDE_ANGLE_UNITS_H_

#include "internal/numeric_value.h"
#include "internal/utils.h"
#include <ratio>


namespace units {
namespace angle
{

struct angle_tag { using code = std::ratio<3, 1>; };

struct mils_tag
{
	static constexpr double scale = 0.05625;
	static std::string singularName();
	static std::string pluralName();
};
struct degrees_tag
{
	static constexpr double scale = 1.0;
	static std::string singularName();
	static std::string pluralName();
};
struct radians_tag
{
	static constexpr double scale = 57.2957795131;
	static std::string singularName();
	static std::string pluralName();
};


using Mils = NumericValue<mils_tag, angle_tag>;

using Degrees = NumericValue<degrees_tag, angle_tag>;

using Radians = NumericValue<radians_tag, angle_tag>;



USER_DEFINED_LITERALS(Mils, mils);

USER_DEFINED_LITERALS(Degrees, degrees);

USER_DEFINED_LITERALS(Radians, radians);



}
}

#endif /* INCLUDE_ANGLE_UNITS_H_ */
