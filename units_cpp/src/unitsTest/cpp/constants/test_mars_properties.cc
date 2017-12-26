/*
 * test_mars_properties.cc
 *
 *  Created on: Dec 27, 2017
 *      Author: sagis
 */

#include <units/constants/mars_properties.h>
#include <units/constants/physical_constants.h>
#include <units/units_multiply.h>
#include <units/units_ratio.h>
#include <units/units_pow.h>
#include <units/units_sqrt.h>
#include <units/planetary_constants_test_suite.h>

using namespace units::mars_properties;
using namespace units;
using units::physical_constants::gravitationalConstant;

class TestMarsProperties : public PlanetaryConstantsTestSuite
{
protected:
	TestMarsProperties()
	: PlanetaryConstantsTestSuite{0.6} // %
	{
	}
};

TEST_F(TestMarsProperties, test_surface_gravity)
{
	auto calculatedSurfaceGravity =
			units_ratio<units::acceleration::MetersPerSquareSecond>(
					auto_units_multiply(gravitationalConstant, marsMass),
					auto_units_multiply(marsEquatorialRadius, marsEquatorialRadius));
	checkEqualValue(marsSurfaceGravity, calculatedSurfaceGravity);
}

TEST_F(TestMarsProperties, test_mass)
{
	auto calculatedMass = (M_PI * 4 / 3) *
			units_multiply<units::mass::Kilograms>(
					marsMeanDensity ,units_pow<3>(marsEquatorialRadius));
	checkEqualValue(marsMass, calculatedMass);
}

TEST_F(TestMarsProperties, test_escape_velocity)
{
	auto calculatedEscapeVelocity = units_sqrt<units::speed::MetersPerSecond> (
			2 * auto_units_ratio(
					auto_units_multiply(gravitationalConstant, marsMass),
					marsEquatorialRadius
				)
			);
	checkEqualValue(marsEscapeVelocity, calculatedEscapeVelocity);
}
