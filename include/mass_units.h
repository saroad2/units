/*
 * mass_units.h
 *
 *  Created on: Jul 1, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_MASS_UNITS_H_
#define INCLUDE_MASS_UNITS_H_

#include "units/include/internal/numeric_value.h"
#include "units/include/internal/multiplyer_scales.h"
#include "units/include/internal/utils.h"

#include <ratio>
#include <string>

namespace units {
namespace mass
{

struct mass_tag { using code = std::ratio<7, 1>; };

struct grams_tag
{
	static constexpr double scale = 1;
	static std::string singularName();
	static std::string pluralName();
};

struct pounds_tag
{
	static constexpr double scale = 453.592333346094;
	static std::string singularName();
	static std::string pluralName();
};

using Grams = NumericValue<grams_tag, mass_tag>;
using Pounds = NumericValue<pounds_tag, mass_tag>;

struct tonnes_tag
{
	static constexpr double scale = Mega<Grams>::scale;
	static std::string singularName();
	static std::string pluralName();
};

using Milligrams = Milli<Grams>;
using Kilograms = Kilo<Grams>;
using Tonnes = NumericValue<tonnes_tag, mass_tag>;


USER_DEFINED_LITERALS(Grams, grams);
USER_DEFINED_LITERALS(Pounds, pounds);
USER_DEFINED_LITERALS(Milligrams, milligrams);
USER_DEFINED_LITERALS(Kilograms, kilograms);
USER_DEFINED_LITERALS(Tonnes, tonnes);
}
}

#endif /* INCLUDE_MASS_UNITS_H_ */
