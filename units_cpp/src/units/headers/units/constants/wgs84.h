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

constexpr length::Kilometers semiMajorAxis{6378.1370};
constexpr length::Kilometers semiMinorAxis{6356.752314245};
constexpr double flattening{0.0033640898210047098};

}
}

#endif /* SRC_UNITS_HEADERS_UNITS_CONSTANTS_WGS84_H_ */
