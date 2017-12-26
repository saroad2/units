/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef _SUN_PROPERTIES_
#define _SUN_PROPERTIES_

#include <units/acceleration_units.h>
#include <units/density_units.h>
#include <units/duration_units.h>
#include <units/length_units.h>
#include <units/mass_units.h>
#include <units/speed_units.h>


namespace units {
namespace sun_properties
{

//the equatorail radius (aka semi-major axis) of the sun
constexpr length::Kilometers sunEquatorialRadius{695700.0};

//the minimum speed needed for an object to escape from the gravitational influence of the sun
constexpr speed::MetersPerSecond sunEscapeVelocity{617700.0};

//the mass of the sun
constexpr mass::Kilograms sunMass{1.98855E30};

//the mean ratio of the mass of the sun to the volume of space it takes up
constexpr density::KilogramsPerLiter sunMeanDensity{1.408};

//the time it takes the sun to make a whole spin around itself
constexpr duration::Seconds sunSiderealRotationPeriod{2192831.6};

//the gravitational acceleration experienced at the surface of the sun
constexpr acceleration::MetersPerSquareSecond sunSurfaceGravity{274.0};


}
}

#endif /* _SUN_PROPERTIES_ */