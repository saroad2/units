/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */

#ifndef INCLUDE_VOLUME_UNITS_H_
#define INCLUDE_VOLUME_UNITS_H_

#include "internal/numeric_value.h"
#include "internal/utils.h"
#include "length_units.h"

#include "tags/volume_tags.h"

namespace units {
namespace volume
{

using CubicFeet = NumericValue<tags::cubic_feet_tag, tags::volume_tag>;
using CubicYards = NumericValue<tags::cubic_yards_tag, tags::volume_tag>;
using CubicMeters = NumericValue<tags::cubic_meters_tag, tags::volume_tag>;
using CubicKilometers = NumericValue<tags::cubic_kilometers_tag, tags::volume_tag>;
using Liters = NumericValue<tags::liters_tag, tags::volume_tag>;
using Milliliters = NumericValue<tags::milliliters_tag, tags::volume_tag>;


USER_DEFINED_LITERALS(CubicFeet, cubic_feet);
USER_DEFINED_LITERALS(CubicYards, cubic_yards);
USER_DEFINED_LITERALS(CubicMeters, cubic_meters);
USER_DEFINED_LITERALS(CubicKilometers, cubic_kilometers);
USER_DEFINED_LITERALS(Liters, liters);
USER_DEFINED_LITERALS(Milliliters, milliliters);


}
}

#endif /* INCLUDE_VOLUME_UNITS_H_ */
