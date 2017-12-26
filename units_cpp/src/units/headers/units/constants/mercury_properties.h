/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef _MERCURY_PROPERTIES_
#define _MERCURY_PROPERTIES_

#include <units/acceleration_units.h>
#include <units/density_units.h>
#include <units/duration_units.h>
#include <units/length_units.h>
#include <units/mass_units.h>
#include <units/speed_units.h>


namespace units {
namespace mercury_properties
{

//the equatorail radius (aka semi-major axis) of mercury
constexpr length::Kilometers mercuryEquatorialRadius{2439.7};

//the minimum speed needed for an object to escape from the gravitational influence of mercury
constexpr speed::MetersPerSecond mercuryEscapeVelocity{4300.0};

//the mass of mercury
constexpr mass::Kilograms mercuryMass{3.3011E23};

//the mean ratio of the mass of mercury to the volume of space it takes up
constexpr density::KilogramsPerLiter mercuryMeanDensity{5.427};

//the time it takes mercury to make a whole spin around itself
constexpr duration::Seconds mercurySiderealRotationPeriod{5067360.0};

//the gravitational acceleration experienced at the surface of mercury
constexpr acceleration::MetersPerSquareSecond mercurySurfaceGravity{3.7};


}
}

#endif /* _MERCURY_PROPERTIES_ */