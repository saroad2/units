/*
 * test_saturn_properties.cc
 *
 *  Created on: Dec 27, 2017
 *      Author: sagis
 */

#include <units/constants/saturn_properties.h>
#include <units/constants/physical_constants.h>
#include <units/units_multiply.h>
#include <units/units_ratio.h>
#include <units/units_pow.h>
#include <units/units_sqrt.h>
#include <units/planetary_constants_test_suite.h>

using namespace units::saturn_properties;
using namespace units;
using units::physical_constants::gravitationalConstant;

class TestSaturnProperties : public PlanetaryConstantsTestSuite
{
protected:
	TestSaturnProperties()
	: PlanetaryConstantsTestSuite{9.8} // %
	{
	}
};

TEST_F(TestSaturnProperties, test_surface_gravity)
{
	auto calculatedSurfaceGravity =
			units_ratio<units::acceleration::MetersPerSquareSecond>(
					auto_units_multiply(gravitationalConstant, saturnMass),
					auto_units_multiply(saturnEquatorialRadius, saturnEquatorialRadius));
	checkEqualValue(saturnSurfaceGravity, calculatedSurfaceGravity);
}

TEST_F(TestSaturnProperties, test_mass)
{
	auto calculatedMass = (M_PI * 4 / 3) *
			units_multiply<units::mass::Kilograms>(
					saturnMeanDensity ,units_pow<3>(saturnEquatorialRadius));
	checkEqualValue(saturnMass, calculatedMass);
}

TEST_F(TestSaturnProperties, test_escape_velocity)
{
	auto calculatedEscapeVelocity = units_sqrt<units::speed::MetersPerSecond> (
			2 * auto_units_ratio(
					auto_units_multiply(gravitationalConstant, saturnMass),
					saturnEquatorialRadius
				)
			);
	checkEqualValue(saturnEscapeVelocity, calculatedEscapeVelocity);
}
