/*
 * energy_units.h
 *
 *  Created on: Jul 5, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_ENERGY_UNITS_H_
#define INCLUDE_ENERGY_UNITS_H_

#include "units/include/internal/numeric_value.h"
#include "units/include/force_units.h"
#include "units/include/length_units.h"
#include "units/include/internal/utils.h"

#include <ratio>

namespace units {
namespace energy
{

struct energy_tag
{
	using code = std::ratio_multiply<
			typename force::force_tag::code,
			typename length::length_tag::code>;
};

struct joules_tag
{
	static constexpr double scale = Multiply<force::Newtons, length::Meters>::scale();
	static std::string singularName();
	static std::string pluralName();
};

using Joules = NumericValue<joules_tag, energy_tag>;
using Kilojoules = Kilo<Joules>;
using Megajoules = Mega<Joules>;

USER_DEFINED_LITERALS(Joules, joules);
USER_DEFINED_LITERALS(Kilojoules, kilojoules);
USER_DEFINED_LITERALS(Megajoules, megajoules);
}
}

#endif /* INCLUDE_ENERGY_UNITS_H_ */
