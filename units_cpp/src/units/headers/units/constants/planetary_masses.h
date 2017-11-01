/*
 * planetary_masses.h
 *
 *  Created on: Nov 1, 2017
 *      Author: sagis
 */

#ifndef SRC_UNITS_HEADERS_UNITS_CONSTANTS_PLANETARY_MASSES_H_
#define SRC_UNITS_HEADERS_UNITS_CONSTANTS_PLANETARY_MASSES_H_


#include <units/mass_units.h>

namespace units {
namespace plantary_masses
{

constexpr mass::SolarMasses sunMass{1};
constexpr mass::SolarMasses mercuryMass{1.6601e-7};
constexpr mass::SolarMasses venuxMass{2.4478383e-6};
constexpr mass::SolarMasses earthMass{3.00348959632e-6};
constexpr mass::SolarMasses marsMass{3.227151e-7};
constexpr mass::SolarMasses jupiterMass{954.79194e-6};
constexpr mass::SolarMasses saturnMass{285.8860e-6};
constexpr mass::SolarMasses uranusMass{43.66244e-6};
constexpr mass::SolarMasses neptuneMass{51.51389e-6};

}
}



#endif /* SRC_UNITS_HEADERS_UNITS_CONSTANTS_PLANETARY_MASSES_H_ */
