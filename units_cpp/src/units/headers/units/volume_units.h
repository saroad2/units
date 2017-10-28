/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_VOLUME_UNITS_H_
#define INCLUDE_VOLUME_UNITS_H_

#include <units/internal/numeric_value.h>
#include <units/internal/utils.h>
#include <units/length_units.h>

#include <units/tags/volume_tags.h>

namespace units {
namespace volume
{

using CubicFeet = NumericValue<tags::cubic_feet_tag>;
using CubicYards = NumericValue<tags::cubic_yards_tag>;
using CubicMeters = NumericValue<tags::cubic_meters_tag>;
using CubicKilometers = NumericValue<tags::cubic_kilometers_tag>;
using Liters = NumericValue<tags::liters_tag>;
using Milliliters = NumericValue<tags::milliliters_tag>;


USER_DEFINED_LITERALS(CubicFeet, cubic_feet);
USER_DEFINED_LITERALS(CubicYards, cubic_yards);
USER_DEFINED_LITERALS(CubicMeters, cubic_meters);
USER_DEFINED_LITERALS(CubicKilometers, cubic_kilometers);
USER_DEFINED_LITERALS(Liters, liters);
USER_DEFINED_LITERALS(Milliliters, milliliters);


}
}

#endif /* INCLUDE_VOLUME_UNITS_H_ */