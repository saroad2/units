/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_AREA_UNITS_H_
#define INCLUDE_AREA_UNITS_H_

#include <units/internal/numeric_value.h>
#include <units/internal/utils.h>
#include <units/length_units.h>

#include <units/tags/area_tags.h>

namespace units {
namespace area
{

using SquareFeet = NumericValue<tags::square_feet_tag>;
using SquareYards = NumericValue<tags::square_yards_tag>;
using SquareMeters = NumericValue<tags::square_meters_tag>;
using SquareKilometers = NumericValue<tags::square_kilometers_tag>;
using Dunams = NumericValue<tags::dunams_tag>;


USER_DEFINED_LITERALS(SquareFeet, square_feet);
USER_DEFINED_LITERALS(SquareYards, square_yards);
USER_DEFINED_LITERALS(SquareMeters, square_meters);
USER_DEFINED_LITERALS(SquareKilometers, square_kilometers);
USER_DEFINED_LITERALS(Dunams, dunams);


}
}

#endif /* INCLUDE_AREA_UNITS_H_ */