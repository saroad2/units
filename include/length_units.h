/*
 * length_units.h
 *
 *  Created on: Jun 24, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_LENGTH_UNITS_H_
#define INCLUDE_LENGTH_UNITS_H_

#include "units/include/internal/numeric_value.h"
#include "units/include/internal/multiplyer_scales.h"
#include "units/include/internal/utils.h"

#include <ratio>

namespace units {
namespace length
{

struct length_tag {	using code = std::ratio<2, 1>; };

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
	static constexpr double scale = 1;
	static std::string singularName();
	static std::string pluralName();
};

using Inches = NumericValue<inches_tag, length_tag>;
using Feet = NumericValue<feet_tag, length_tag>;
using Yards = NumericValue<yards_tag, length_tag>;
using Meters = NumericValue<meters_tag, length_tag>;

using Micrometers = Micro<Meters>;
using Millimeters = Milli<Meters>;
using Centimeters = Centi<Meters>;
using Kilometers = Kilo<Meters>;

USER_DEFINED_LITERALS(Inches, inches);
USER_DEFINED_LITERALS(Feet, feet);
USER_DEFINED_LITERALS(Yards, yards);
USER_DEFINED_LITERALS(Meters, meters);
USER_DEFINED_LITERALS(Micrometers, micrometers);
USER_DEFINED_LITERALS(Millimeters, millimeters);
USER_DEFINED_LITERALS(Centimeters, centimeters);
USER_DEFINED_LITERALS(Kilometers, kilometers);
}
}

#endif /* INCLUDE_LENGTH_UNITS_H_ */
