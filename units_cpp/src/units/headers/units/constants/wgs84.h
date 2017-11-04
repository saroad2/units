/*
 * earth_properties.h
 *
 *  Created on: Nov 1, 2017
 *      Author: sagis
 */

#ifndef SRC_UNITS_HEADERS_UNITS_CONSTANTS_WGS84_H_
#define SRC_UNITS_HEADERS_UNITS_CONSTANTS_WGS84_H_

#include <units/length_units.h>

namespace units {
namespace wgs84
{

constexpr length::Meters semiMajorAxis{6378137};
constexpr length::Meters semiMinorAxis{6356752.3142};
constexpr double flattening{0.00335281066};
constexpr double firstEccentricity{0.081819190842622};
constexpr double secondEccentricity{0.082094437949696};

}
}

#endif /* SRC_UNITS_HEADERS_UNITS_CONSTANTS_WGS84_H_ */
