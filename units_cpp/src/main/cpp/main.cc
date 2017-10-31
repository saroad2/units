/*
 * main.cc
 *
 *  Created on: Oct 19, 2017
 *      Author: sagis
 */

#include <units/length_units.h>
#include <units/duration_units.h>
#include <units/speed_units.h>
#include <units/area_units.h>
#include <units/angle_units.h>
#include <units/angular_speed_units.h>

#include <units/units_cast.h>
#include <units/units_ratio.h>
#include <units/units_multiply.h>
#include <units/cast_from_chrono.h>

#include <iostream>
#include <chrono>
#include <math.h>

using namespace std;
using namespace units::length;
using namespace units::duration;
using namespace units::speed;
using namespace units::area;
using namespace units::angle;
using namespace units::angular_speed;
using units::units_cast;
using units::units_ratio;
using units::units_multiply;

template<class AreaUnit, class LengthUnit1, class LengthUnit2>
constexpr AreaUnit calculateTriangleArea(
	const LengthUnit1& baseWidth,
	const LengthUnit2& height)
{
	/* You can multiply units by one another.
	 * In this case the result unit will be from a multiplication unit type of
	 * the given units and its value will be the multiplication of them.
	 * The result unit is validated to be from the right type.
	 *
	 * You can also multiply all units with scalars (doubles).
	 * In this case the result unit will stay the same.
	 * */
	return 0.5 * units_multiply<AreaUnit>(baseWidth, height);
}

int main()
{
	/* All units are printed with their values and unit names
	 * */
	Meters m{3};
	cout << m << endl;
	cout << endl;

	/* All units have a user defined literal.
	 * */
	auto m2 = 3.56_meters; // This is from Meters type
	cout << m2 << endl;
	cout << endl;

	/* You can sum and subtract units from one another
	 * only if they're from the same unit.
	 * */

	cout << m + m2 << endl;
	cout << m + 1.2_meters << endl;
	cout << m2 - m << endl;
	cout << -m2 << endl;
	/* cout << m - 2_feet << endl;
	 * This will not compile since you cannot subtract Meters from Feet
	 * without casting.
	 * */
	cout << endl;

	/* Time units have built-in integration with chrono
	 * */
	Seconds s = cast_from_chrono(std::chrono::seconds{2});
	cout << 3.6_seconds - s << endl;
	cout << endl;

	/* You can cast between units.
	 * When casting units, it is validated the both units,
	 * the converted and the result unit, are from the same type.
	 * */
	cout << units_cast<Yards>(m2) << endl;
	cout << units_cast<Feet>(m2) << endl;
	cout << units_cast<Inches>(m2) << endl;
	cout << units_cast<Centimeters>(m2) << endl;
	/* cout << units_cast<Knots>(m2) << endl;
	 * This will not compile since Meters is a length unit and
	 * Knots is a speed unit.
	 * */
	cout << endl;

	/* You can divide units by one another.
	 * In this case the result unit will be from a ratio type
	 * of the given units and its value will be the ratio of them.
	 * The result unit is validated to be from the right type.
	 * */
	cout << units_ratio<MetersPerSecond>(m2, s) << endl;
	cout << units_ratio<DegreesPerSecond>(Radians{M_PI_2}, s) << endl;
	cout << units_ratio<Knots>(50_inches, 1.5_minutes) << endl;
	/* cout << units_ratio<Radians>(50_inches, 1.5_minutes) << endl;
	 * This will not compile since Radians is an angle unit and not a speed unit
	 * */
	cout << endl;

	/* Working with the units library helps your code be more dynamic.
	 * */
	Yards y{8.2};
	cout << calculateTriangleArea<SquareYards>(m, m2) << endl;
	cout << calculateTriangleArea<SquareMeters>(m, y) << endl;
	cout << calculateTriangleArea<Dunams>(3.45_inches, y) << endl;
	/* cout << calculateTriangleArea<RadiansPerSecond>(3.45_inches, y) << endl;
	 * This will not compile since RadiansPerSecond is not an area unit.
	 * */
	cout << endl;

	return 0;
}
