/*
 * test_sun_properties.cc
 *
 *  Created on: Dec 26, 2017
 *      Author: sagis
 */

#include <units/constants/sun_properties.h>
#include <units/constants/physical_constants.h>
#include <units/units_multiply.h>
#include <units/units_ratio.h>
#include <units/units_pow.h>
#include <units/units_sqrt.h>
#include <units/planetary_constants_test_suite.h>

using namespace units::sun_properties;
using namespace units;
using units::physical_constants::gravitationalConstant;

class TestSunProperties : public PlanetaryConstantsTestSuite
{
protected:
	TestSunProperties()
	: PlanetaryConstantsTestSuite{0.14} // %
	{
	}
};

TEST_F(TestSunProperties, test_surface_gravity)
{
	auto calculatedSurfaceGravity =
			units_ratio<units::acceleration::MetersPerSquareSecond>(
					auto_units_multiply(gravitationalConstant, sunMass),
					auto_units_multiply(sunEquatorialRadius, sunEquatorialRadius));
	checkEqualValue(sunSurfaceGravity, calculatedSurfaceGravity);
}

TEST_F(TestSunProperties, test_mass)
{
	auto calculatedMass = (M_PI * 4 / 3) *
			units_multiply<units::mass::Kilograms>(
					sunMeanDensity ,units_pow<3>(sunEquatorialRadius));
	checkEqualValue(sunMass, calculatedMass);
}

TEST_F(TestSunProperties, test_escape_velocity)
{
	auto calculatedEscapeVelocity = units_sqrt<units::speed::MetersPerSecond> (
			2 * auto_units_ratio(
					auto_units_multiply(gravitationalConstant, sunMass),
					sunEquatorialRadius
				)
			);
	checkEqualValue(sunEscapeVelocity, calculatedEscapeVelocity);
}

TEST_F(TestSunProperties, test_solar_mass)
{
	checkEqualValue(units_cast<mass::SolarMasses>(sunMass), mass::SolarMasses{1});
}
