/*
 * test_venus_properties.cc
 *
 *  Created on: Dec 27, 2017
 *      Author: sagis
 */

#include <units/constants/venus_properties.h>
#include <units/constants/physical_constants.h>
#include <units/units_multiply.h>
#include <units/units_ratio.h>
#include <units/units_pow.h>
#include <units/units_sqrt.h>
#include <units/planetary_constants_test_suite.h>

using namespace units::venus_properties;
using namespace units;
using units::physical_constants::gravitationalConstant;

class TestVenusProperties : public PlanetaryConstantsTestSuite
{
protected:
	TestVenusProperties()
	: PlanetaryConstantsTestSuite{0.1} // %
	{
	}
};

TEST_F(TestVenusProperties, test_surface_gravity)
{
	auto calculatedSurfaceGravity =
			units_ratio<units::acceleration::MetersPerSquareSecond>(
					auto_units_multiply(gravitationalConstant, venusMass),
					auto_units_multiply(venusEquatorialRadius, venusEquatorialRadius));
	checkEqualValue(venusSurfaceGravity, calculatedSurfaceGravity);
}

TEST_F(TestVenusProperties, test_mass)
{
	auto calculatedMass = (M_PI * 4 / 3) *
			units_multiply<units::mass::Kilograms>(
					venusMeanDensity ,units_pow<3>(venusEquatorialRadius));
	checkEqualValue(venusMass, calculatedMass);
}

TEST_F(TestVenusProperties, test_escape_velocity)
{
	auto calculatedEscapeVelocity = units_sqrt<units::speed::MetersPerSecond> (
			2 * auto_units_ratio(
					auto_units_multiply(gravitationalConstant, venusMass),
					venusEquatorialRadius
				)
			);
	checkEqualValue(venusEscapeVelocity, calculatedEscapeVelocity);
}
