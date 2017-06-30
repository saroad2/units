/*
 * power_units.h
 *
 *  Created on: Jun 30, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_POWER_UNITS_H_
#define INCLUDE_POWER_UNITS_H_

#include "units/include/numeric_value.h"

#include <string>

namespace units
{

extern std::string powerSymbol;

template<class Unit>
constexpr double powerCodeCalculator(int power)
{
	return Unit::typeCode() * (power == 1 ? 1 : powerCodeCalculator<Unit>(power - 1));
}

template<class Unit, int power>
struct power_type_tag
{
	static constexpr int code = powerCodeCalculator<Unit>(power);
};

template<class Unit>
constexpr double powerScaleCalculator(int power)
{
	return Unit::scale() * (power == 1 ? 1 : powerScaleCalculator<Unit>(power - 1));
}

template<class Unit, int power>
struct power_scale_tag
{
	static constexpr double scale = powerScaleCalculator<Unit>(power);
	static std::string singularName()
	{
		return Unit::singularName() + powerSymbol + std::to_string(power);
	}
	static std::string pluralName()
	{
		return Unit::pluralName() + powerSymbol + std::to_string(power);
	}
};

template<class Unit, int power>
using Pow = NumericValue<power_scale_tag<Unit, power>, power_type_tag<Unit, power>>;

template<class Unit>
using Squared = Pow<Unit, 2>;

template<class Unit>
using Cubed = Pow<Unit, 3>;

}



#endif /* INCLUDE_POWER_UNITS_H_ */
