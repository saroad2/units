/*
 * test_mercury_properties.cc
 *
 *  Created on: Dec 27, 2017
 *      Author: sagis
 */

#include <units/constants/mercury_properties.h>
#include <units/constants/physical_constants.h>
#include <units/units_multiply.h>
#include <units/units_ratio.h>
#include <units/units_pow.h>
#include <units/units_sqrt.h>
#include <units/planetary_constants_test_suite.h>

using namespace units::mercury_properties;
using namespace units;
using units::physical_constants::gravitationalConstant;

class TestMercuryProperties : public PlanetaryConstantsTestSuite
{
protected:
	TestMercuryProperties()
	: PlanetaryConstantsTestSuite{1.2} // %
	{
	}
};

TEST_F(TestMercuryProperties, test_surface_gravity)
{
	auto calculatedSurfaceGravity =
			units_ratio<units::acceleration::MetersPerSquareSecond>(
					auto_units_multiply(gravitationalConstant, mercuryMass),
					auto_units_multiply(mercuryEquatorialRadius, mercuryEquatorialRadius));
	checkEqualValue(mercurySurfaceGravity, calculatedSurfaceGravity);
}

TEST_F(TestMercuryProperties, test_mass)
{
	auto calculatedMass = (M_PI * 4 / 3) *
			units_multiply<units::mass::Kilograms>(
					mercuryMeanDensity ,units_pow<3>(mercuryEquatorialRadius));
	checkEqualValue(mercuryMass, calculatedMass);
}

TEST_F(TestMercuryProperties, test_escape_velocity)
{
	auto calculatedEscapeVelocity = units_sqrt<units::speed::MetersPerSecond> (
			2 * auto_units_ratio(
					auto_units_multiply(gravitationalConstant, mercuryMass),
					mercuryEquatorialRadius
				)
			);
	checkEqualValue(mercuryEscapeVelocity, calculatedEscapeVelocity);
}
