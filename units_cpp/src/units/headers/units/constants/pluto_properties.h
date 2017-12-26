/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef _PLUTO_PROPERTIES_
#define _PLUTO_PROPERTIES_

#include <units/acceleration_units.h>
#include <units/density_units.h>
#include <units/duration_units.h>
#include <units/length_units.h>
#include <units/mass_units.h>
#include <units/speed_units.h>


namespace units {
namespace pluto_properties
{

//the equatorail radius (aka semi-major axis) of pluto
constexpr length::Kilometers plutoEquatorialRadius{1187.0};

//the minimum speed needed for an object to escape from the gravitational influence of pluto
constexpr speed::MetersPerSecond plutoEscapeVelocity{1210.0};

//the mass of pluto
constexpr mass::Kilograms plutoMass{1.303E22};

//the mean ratio of the mass of pluto to the volume of space it takes up
constexpr density::KilogramsPerLiter plutoMeanDensity{1.86};

//the time it takes pluto to make a whole spin around itself
constexpr duration::Seconds plutoSiderealRotationPeriod{-551854.08};

//the gravitational acceleration experienced at the surface of pluto
constexpr acceleration::MetersPerSquareSecond plutoSurfaceGravity{0.62};


}
}

#endif /* _PLUTO_PROPERTIES_ */