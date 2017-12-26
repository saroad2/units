/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef _URANUS_PROPERTIES_
#define _URANUS_PROPERTIES_

#include <units/acceleration_units.h>
#include <units/density_units.h>
#include <units/duration_units.h>
#include <units/length_units.h>
#include <units/mass_units.h>
#include <units/speed_units.h>


namespace units {
namespace uranus_properties
{

//the equatorail radius (aka semi-major axis) of uranus
constexpr length::Kilometers uranusEquatorialRadius{25559.0};

//the minimum speed needed for an object to escape from the gravitational influence of uranus
constexpr speed::MetersPerSecond uranusEscapeVelocity{21300.0};

//the mass of uranus
constexpr mass::Kilograms uranusMass{8.6813E25};

//the mean ratio of the mass of uranus to the volume of space it takes up
constexpr density::KilogramsPerLiter uranusMeanDensity{1.271};

//the time it takes uranus to make a whole spin around itself
constexpr duration::Seconds uranusSiderealRotationPeriod{-62064.0};

//the gravitational acceleration experienced at the surface of uranus
constexpr acceleration::MetersPerSquareSecond uranusSurfaceGravity{8.87};


}
}

#endif /* _URANUS_PROPERTIES_ */