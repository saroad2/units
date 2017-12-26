/*
 * test_pluto_properties.cc
 *
 *  Created on: Dec 27, 2017
 *      Author: sagis
 */

#include <units/constants/pluto_properties.h>
#include <units/constants/physical_constants.h>
#include <units/units_multiply.h>
#include <units/units_ratio.h>
#include <units/units_pow.h>
#include <units/units_sqrt.h>
#include <units/planetary_constants_test_suite.h>

using namespace units::pluto_properties;
using namespace units;
using units::physical_constants::gravitationalConstant;

class TestPlutoProperties : public PlanetaryConstantsTestSuite
{
protected:
	TestPlutoProperties()
	: PlanetaryConstantsTestSuite{0.46} // %
	{
	}
};

TEST_F(TestPlutoProperties, test_surface_gravity)
{
	auto calculatedSurfaceGravity =
			units_ratio<units::acceleration::MetersPerSquareSecond>(
					auto_units_multiply(gravitationalConstant, plutoMass),
					auto_units_multiply(plutoEquatorialRadius, plutoEquatorialRadius));
	checkEqualValue(plutoSurfaceGravity, calculatedSurfaceGravity);
}

TEST_F(TestPlutoProperties, test_mass)
{
	auto calculatedMass = (M_PI * 4 / 3) *
			units_multiply<units::mass::Kilograms>(
					plutoMeanDensity ,units_pow<3>(plutoEquatorialRadius));
	checkEqualValue(plutoMass, calculatedMass);
}

TEST_F(TestPlutoProperties, test_escape_velocity)
{
	auto calculatedEscapeVelocity = units_sqrt<units::speed::MetersPerSecond> (
			2 * auto_units_ratio(
					auto_units_multiply(gravitationalConstant, plutoMass),
					plutoEquatorialRadius
				)
			);
	checkEqualValue(plutoEscapeVelocity, calculatedEscapeVelocity);
}
