/*
 * length_units.h
 *
 *  Created on: Jun 24, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_LENGTH_UNITS_H_
#define INCLUDE_LENGTH_UNITS_H_

#include "units/include/numeric_value.h"
#include "units/include/multiplyer_scales.h"

namespace units {
namespace length
{

struct length_tag{};

struct inches_tag
{
	static constexpr double scale = 0.025399999961392000225;
	static std::string singularName();
	static std::string pluralName();
};

struct feet_tag
{
	static constexpr double scale = 0.3047999995367040027;
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

}
}

#endif /* INCLUDE_LENGTH_UNITS_H_ */
