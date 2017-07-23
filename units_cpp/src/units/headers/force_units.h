/*
 * power_units.h
 *
 *  Created on: Jul 4, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_FORCE_UNITS_H_
#define INCLUDE_FORCE_UNITS_H_

#include "internal/numeric_value.h"
#include "internal/units_pow_type.h"
#include "internal/units_ratio_type.h"
#include "internal/utils.h"
#include "length_units.h"
#include "mass_units.h"
#include "duration_units.h"

#include <ratio>
#include "internal/units_multiply_type.h"

namespace units {
namespace force
{

struct force_tag
{
	using code = ratio_type_tag<multiply_type_tag<mass::tags::mass_tag, length::tags::length_tag>,
								pow_type_tag<duration::tags::duration_tag, 2>>::code;
};

struct newtons_tag
{
	constexpr static double scale = Ratio<
			Multiply<mass::Kilograms, length::Meters>,
			Square<duration::Seconds>>::scale;
	static std::string singularName();
	static std::string pluralName();
};

using Newtons = NumericValue<newtons_tag, force_tag>;

struct dynes_tag
{
	constexpr static double scale = Newtons::scale * 1e-5;
	static std::string singularName();
	static std::string pluralName();
};

using Dynes = NumericValue<dynes_tag, force_tag>;

USER_DEFINED_LITERALS(Newtons, newtons);
USER_DEFINED_LITERALS(Dynes, dynes);

}
}


#endif /* INCLUDE_FORCE_UNITS_H_ */
