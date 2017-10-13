/*
 * trigo.h
 *
 *  Created on: Jun 29, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_TRIGO_H_
#define INCLUDE_TRIGO_H_

#include "angle_units.h"
#include "units_cast.h"

#include <cmath>

namespace units {
namespace trigo
{

template<class Unit>
constexpr double cos(const Unit& unit)
{
	return std::cos(units_cast<units::angle::Radians>(unit).value());
}

template<class Unit>
constexpr double sin(const Unit& unit)
{
	return std::sin(units_cast<units::angle::Radians>(unit).value());
}

template<class Unit>
constexpr double tan(const Unit& unit)
{
	return std::tan(units_cast<units::angle::Radians>(unit).value());
}

template<class Unit>
constexpr Unit acos(double value)
{
	return units_cast<Unit>(units::angle::Radians{std::acos(value)});
}

template<class Unit>
constexpr Unit asin(double value)
{
	return units_cast<Unit>(units::angle::Radians{std::asin(value)});
}

template<class Unit>
constexpr Unit atan(double value)
{
	return units_cast<Unit>(units::angle::Radians{std::atan(value)});
}

template<class AngleUnit, class LengthUnit1, class LengthUnit2>
constexpr AngleUnit atan2(LengthUnit1 y, LengthUnit2 x)
{
	VALIDATE_SAME_UNIT(LengthUnit1, LengthUnit2);
	return units_cast<AngleUnit>(units::angle::Radians{std::atan2(y.value(), x.value())});
}

}
}

#endif /* INCLUDE_TRIGO_H_ */
