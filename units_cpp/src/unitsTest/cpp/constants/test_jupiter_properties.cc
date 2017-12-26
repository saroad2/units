/*
 * test_jupiter_properties.cc
 *
 *  Created on: Dec 27, 2017
 *      Author: sagis
 */

#include <units/constants/jupiter_properties.h>
#include <units/constants/physical_constants.h>
#include <units/units_multiply.h>
#include <units/units_ratio.h>
#include <units/units_pow.h>
#include <units/units_sqrt.h>
#include <units/planetary_constants_test_suite.h>

using namespace units::jupiter_properties;
using namespace units;
using units::physical_constants::gravitationalConstant;

class TestJupiterProperties : public PlanetaryConstantsTestSuite
{
protected:
	TestJupiterProperties()
	: PlanetaryConstantsTestSuite{6.5} // %
	{
	}
};

TEST_F(TestJupiterProperties, test_surface_gravity)
{
	auto calculatedSurfaceGravity =
			units_ratio<units::acceleration::MetersPerSquareSecond>(
					auto_units_multiply(gravitationalConstant, jupiterMass),
					auto_units_multiply(jupiterEquatorialRadius, jupiterEquatorialRadius));
	checkEqualValue(jupiterSurfaceGravity, calculatedSurfaceGravity);
}

TEST_F(TestJupiterProperties, test_mass)
{
	auto calculatedMass = (M_PI * 4 / 3) *
			units_multiply<units::mass::Kilograms>(
					jupiterMeanDensity ,units_pow<3>(jupiterEquatorialRadius));
	checkEqualValue(jupiterMass, calculatedMass);
}

TEST_F(TestJupiterProperties, test_escape_velocity)
{
	auto calculatedEscapeVelocity = units_sqrt<units::speed::MetersPerSecond> (
			2 * auto_units_ratio(
					auto_units_multiply(gravitationalConstant, jupiterMass),
					jupiterEquatorialRadius
				)
			);
	checkEqualValue(jupiterEscapeVelocity, calculatedEscapeVelocity);
}
