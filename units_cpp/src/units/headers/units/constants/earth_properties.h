/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef _EARTH_PROPERTIES_
#define _EARTH_PROPERTIES_

#include <units/acceleration_units.h>
#include <units/density_units.h>
#include <units/duration_units.h>
#include <units/mass_units.h>
#include <units/speed_units.h>


namespace units {
namespace earth_properties
{

//the minimum speed needed for an object to escape from the gravitational influence of earth
constexpr speed::MetersPerSecond earthEscapeVelocity{11186.0};

//the mass of earth
constexpr mass::Kilograms earthMass{5.9723E24};

//the mean ratio of the mass of earth to the volume of space it takes up
constexpr density::KilogramsPerLiter earthMeanDensity{5.514};

//the time it takes earth to make a whole spin around itself
constexpr duration::Seconds earthSiderealRotationPeriod{86164.2};

//the gravitational acceleration experienced at the surface of earth
constexpr acceleration::MetersPerSquareSecond earthSurfaceGravity{9.798};


}
}

#endif /* _EARTH_PROPERTIES_ */