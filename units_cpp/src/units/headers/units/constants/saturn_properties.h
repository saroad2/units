/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef _SATURN_PROPERTIES_
#define _SATURN_PROPERTIES_

#include <units/acceleration_units.h>
#include <units/density_units.h>
#include <units/duration_units.h>
#include <units/length_units.h>
#include <units/mass_units.h>
#include <units/speed_units.h>


namespace units {
namespace saturn_properties
{

//the equatorail radius (aka semi-major axis) of saturn
constexpr length::Kilometers saturnEquatorialRadius{60268.0};

//the minimum speed needed for an object to escape from the gravitational influence of saturn
constexpr speed::MetersPerSecond saturnEscapeVelocity{35500.0};

//the mass of saturn
constexpr mass::Kilograms saturnMass{5.6834E26};

//the mean ratio of the mass of saturn to the volume of space it takes up
constexpr density::KilogramsPerLiter saturnMeanDensity{0.687};

//the time it takes saturn to make a whole spin around itself
constexpr duration::Seconds saturnSiderealRotationPeriod{38361.6};

//the gravitational acceleration experienced at the surface of saturn
constexpr acceleration::MetersPerSquareSecond saturnSurfaceGravity{10.44};


}
}

#endif /* _SATURN_PROPERTIES_ */