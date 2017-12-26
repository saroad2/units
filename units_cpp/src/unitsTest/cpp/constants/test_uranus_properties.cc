/*
 * test_uranus_properties.cc
 *
 *  Created on: Dec 27, 2017
 *      Author: sagis
 */

#include <units/constants/uranus_properties.h>
#include <units/constants/physical_constants.h>
#include <units/units_multiply.h>
#include <units/units_ratio.h>
#include <units/units_pow.h>
#include <units/units_sqrt.h>
#include <units/planetary_constants_test_suite.h>

using namespace units::uranus_properties;
using namespace units;
using units::physical_constants::gravitationalConstant;

class TestUranusProperties : public PlanetaryConstantsTestSuite
{
protected:
	TestUranusProperties()
	: PlanetaryConstantsTestSuite{2.4} // %
	{
	}
};

TEST_F(TestUranusProperties, test_surface_gravity)
{
	auto calculatedSurfaceGravity =
			units_ratio<units::acceleration::MetersPerSquareSecond>(
					auto_units_multiply(gravitationalConstant, uranusMass),
					auto_units_multiply(uranusEquatorialRadius, uranusEquatorialRadius));
	checkEqualValue(uranusSurfaceGravity, calculatedSurfaceGravity);
}

TEST_F(TestUranusProperties, test_mass)
{
	auto calculatedMass = (M_PI * 4 / 3) *
			units_multiply<units::mass::Kilograms>(
					uranusMeanDensity ,units_pow<3>(uranusEquatorialRadius));
	checkEqualValue(uranusMass, calculatedMass);
}

TEST_F(TestUranusProperties, test_escape_velocity)
{
	auto calculatedEscapeVelocity = units_sqrt<units::speed::MetersPerSecond> (
			2 * auto_units_ratio(
					auto_units_multiply(gravitationalConstant, uranusMass),
					uranusEquatorialRadius
				)
			);
	checkEqualValue(uranusEscapeVelocity, calculatedEscapeVelocity);
}
