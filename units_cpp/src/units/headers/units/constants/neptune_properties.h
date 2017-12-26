/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef _NEPTUNE_PROPERTIES_
#define _NEPTUNE_PROPERTIES_

#include <units/acceleration_units.h>
#include <units/density_units.h>
#include <units/duration_units.h>
#include <units/length_units.h>
#include <units/mass_units.h>
#include <units/speed_units.h>


namespace units {
namespace neptune_properties
{

//the equatorail radius (aka semi-major axis) of neptune
constexpr length::Kilometers neptuneEquatorialRadius{24764.0};

//the minimum speed needed for an object to escape from the gravitational influence of neptune
constexpr speed::MetersPerSecond neptuneEscapeVelocity{23500.0};

//the mass of neptune
constexpr mass::Kilograms neptuneMass{1.02413E26};

//the mean ratio of the mass of neptune to the volume of space it takes up
constexpr density::KilogramsPerLiter neptuneMeanDensity{1.638};

//the time it takes neptune to make a whole spin around itself
constexpr duration::Seconds neptuneSiderealRotationPeriod{57996.0};

//the gravitational acceleration experienced at the surface of neptune
constexpr acceleration::MetersPerSquareSecond neptuneSurfaceGravity{11.15};


}
}

#endif /* _NEPTUNE_PROPERTIES_ */