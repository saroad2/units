/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef _VENUS_PROPERTIES_
#define _VENUS_PROPERTIES_

#include <units/acceleration_units.h>
#include <units/density_units.h>
#include <units/duration_units.h>
#include <units/length_units.h>
#include <units/mass_units.h>
#include <units/speed_units.h>


namespace units {
namespace venus_properties
{

//the equatorail radius (aka semi-major axis) of venus
constexpr length::Kilometers venusEquatorialRadius{6051.8};

//the minimum speed needed for an object to escape from the gravitational influence of venus
constexpr speed::MetersPerSecond venusEscapeVelocity{10360.0};

//the mass of venus
constexpr mass::Kilograms venusMass{4.8675E24};

//the mean ratio of the mass of venus to the volume of space it takes up
constexpr density::KilogramsPerLiter venusMeanDensity{5.243};

//the time it takes venus to make a whole spin around itself
constexpr duration::Seconds venusSiderealRotationPeriod{-2.099736E7};

//the gravitational acceleration experienced at the surface of venus
constexpr acceleration::MetersPerSquareSecond venusSurfaceGravity{8.87};


}
}

#endif /* _VENUS_PROPERTIES_ */