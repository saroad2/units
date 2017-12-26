/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef _MARS_PROPERTIES_
#define _MARS_PROPERTIES_

#include <units/acceleration_units.h>
#include <units/density_units.h>
#include <units/duration_units.h>
#include <units/length_units.h>
#include <units/mass_units.h>
#include <units/speed_units.h>


namespace units {
namespace mars_properties
{

//the equatorail radius (aka semi-major axis) of mars
constexpr length::Kilometers marsEquatorialRadius{3396.2};

//the minimum speed needed for an object to escape from the gravitational influence of mars
constexpr speed::MetersPerSecond marsEscapeVelocity{5030.0};

//the mass of mars
constexpr mass::Kilograms marsMass{6.4171E23};

//the mean ratio of the mass of mars to the volume of space it takes up
constexpr density::KilogramsPerLiter marsMeanDensity{3.933};

//the time it takes mars to make a whole spin around itself
constexpr duration::Seconds marsSiderealRotationPeriod{88642.44};

//the gravitational acceleration experienced at the surface of mars
constexpr acceleration::MetersPerSquareSecond marsSurfaceGravity{3.71};


}
}

#endif /* _MARS_PROPERTIES_ */