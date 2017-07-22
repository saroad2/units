/*
 * energy_units.h
 *
 *  Created on: Jul 5, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_ENERGY_UNITS_H_
#define INCLUDE_ENERGY_UNITS_H_

#include "internal/numeric_value.h"
#include "internal/units_ratio_type.h"
#include "force_units.h"
#include "length_units.h"
#include "internal/utils.h"

#include <ratio>

namespace units {
namespace energy
{

struct energy_tag
{
	using code = ratio_type_tag<force::force_tag, length::tags::length_tag>::code;
};

struct joules_tag
{
	static constexpr double scale = Multiply<force::Newtons, length::Meters>::scale;
	static std::string singularName();
	static std::string pluralName();
};

struct kilojoules_tag
{
	static constexpr double scale = kilo * joules_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};

struct megajoules_tag
{
	static constexpr double scale = mega * joules_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
using Joules = NumericValue<joules_tag, energy_tag>;
using Kilojoules = NumericValue<kilojoules_tag, energy_tag>;
using Megajoules = NumericValue<megajoules_tag, energy_tag>;

USER_DEFINED_LITERALS(Joules, joules);
USER_DEFINED_LITERALS(Kilojoules, kilojoules);
USER_DEFINED_LITERALS(Megajoules, megajoules);
}
}

#endif /* INCLUDE_ENERGY_UNITS_H_ */
