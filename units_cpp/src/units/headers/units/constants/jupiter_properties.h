/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef _JUPITER_PROPERTIES_
#define _JUPITER_PROPERTIES_

#include <units/acceleration_units.h>
#include <units/density_units.h>
#include <units/duration_units.h>
#include <units/length_units.h>
#include <units/mass_units.h>
#include <units/speed_units.h>


namespace units {
namespace jupiter_properties
{

//the equatorail radius (aka semi-major axis) of jupiter
constexpr length::Kilometers jupiterEquatorialRadius{71492.0};

//the minimum speed needed for an object to escape from the gravitational influence of jupiter
constexpr speed::MetersPerSecond jupiterEscapeVelocity{59500.0};

//the mass of jupiter
constexpr mass::Kilograms jupiterMass{1.89819E27};

//the mean ratio of the mass of jupiter to the volume of space it takes up
constexpr density::KilogramsPerLiter jupiterMeanDensity{1.326};

//the time it takes jupiter to make a whole spin around itself
constexpr duration::Seconds jupiterSiderealRotationPeriod{35730.0};

//the gravitational acceleration experienced at the surface of jupiter
constexpr acceleration::MetersPerSquareSecond jupiterSurfaceGravity{24.79};


}
}

#endif /* _JUPITER_PROPERTIES_ */