/*
 * angle_units.h
 *
 *  Created on: Jun 24, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_ANGLE_UNITS_H_
#define INCLUDE_ANGLE_UNITS_H_

#include "internal/numeric_value.h"
#include "internal/utils.h"

#include <math.h>
#include <ratio>

namespace units {
namespace angle
{

struct angle_type {	using code = std::ratio<3, 1>; };

struct mil_tag
{
	static constexpr double scale = 360.0 / 6400;
	static std::string singularName();
	static std::string pluralName();
};

struct degrees_tag
{
	static constexpr double scale = 1;
	static std::string singularName();
	static std::string pluralName();
};

struct radians_tag
{
	static constexpr double scale = 180 / M_PI;
	static std::string singularName();
	static std::string pluralName();
};

using Mils = NumericValue<mil_tag, angle_type>;
using Degrees = NumericValue<degrees_tag, angle_type>;
using Radians = NumericValue<radians_tag, angle_type>;

USER_DEFINED_LITERALS(Mils, mils);
USER_DEFINED_LITERALS(Degrees, degrees);
USER_DEFINED_LITERALS(Radians, radians);

}
}

#endif /* INCLUDE_ANGLE_UNITS_H_ */