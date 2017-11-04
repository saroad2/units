/*
 * planetary_rotation_periods.h
 *
 *  Created on: Nov 3, 2017
 *      Author: oriash93
 */

#ifndef SRC_UNITS_HEADERS_UNITS_CONSTANTS_PLANETARY_ROTATION_PERIODS_H_
#define SRC_UNITS_HEADERS_UNITS_CONSTANTS_PLANETARY_ROTATION_PERIODS_H_

#include <units/duration_units.h>

namespace units {
namespace planetary_rotation_periods
{

constexpr duration::Seconds sunRotationPeriod{2192831.6};
constexpr duration::Seconds mercuryRotationPeriod{5067030};
constexpr duration::Seconds venusRotationPeriod{-20996760};
constexpr duration::Seconds earthRotationPeriod{86164.091};
constexpr duration::Seconds marsRotationPeriod{88642.663};
constexpr duration::Seconds jupiterRotationPeriod{35730};
constexpr duration::Seconds saturnRotationPeriod{36840};
constexpr duration::Seconds uranusRotationPeriod{-62064};
constexpr duration::Seconds neptuneRotationPeriod{57996};
    
}
}

#endif /* SRC_UNITS_HEADERS_UNITS_CONSTANTS_PLANETARY_ROTATION_PERIODS_H_ */
