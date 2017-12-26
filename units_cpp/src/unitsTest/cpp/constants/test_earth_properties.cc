/*
 * test_earth_properties.cc
 *
 *  Created on: Dec 27, 2017
 *      Author: sagis
 */

#include <units/constants/earth_properties.h>
#include <units/constants/wgs84.h>
#include <units/constants/physical_constants.h>
#include <units/units_multiply.h>
#include <units/units_ratio.h>
#include <units/units_pow.h>
#include <units/units_sqrt.h>
#include <units/planetary_constants_test_suite.h>

using namespace units::earth_properties;
using namespace units;
using units::physical_constants::gravitationalConstant;
using units::wgs84::semiMajorAxis;


class TestEarthProperties : public PlanetaryConstantsTestSuite
{
protected:
	TestEarthProperties()
	: PlanetaryConstantsTestSuite{0.35} // %
	{
	}
};

TEST_F(TestEarthProperties, test_surface_gravity)
{
	auto calculatedSurfaceGravity =
			units_ratio<units::acceleration::MetersPerSquareSecond>(
					auto_units_multiply(gravitationalConstant, earthMass),
					auto_units_multiply(semiMajorAxis, semiMajorAxis));
	checkEqualValue(earthSurfaceGravity, calculatedSurfaceGravity);
}

TEST_F(TestEarthProperties, test_mass)
{
	auto calculatedMass = (M_PI * 4 / 3) *
			units_multiply<units::mass::Kilograms>(
					earthMeanDensity ,units_pow<3>(semiMajorAxis));
	checkEqualValue(earthMass, calculatedMass);
}

TEST_F(TestEarthProperties, test_escape_velocity)
{
	auto calculatedEscapeVelocity = units_sqrt<units::speed::MetersPerSecond> (
			2 * auto_units_ratio(
					auto_units_multiply(gravitationalConstant, earthMass),
					semiMajorAxis
				)
			);
	checkEqualValue(earthEscapeVelocity, calculatedEscapeVelocity);
}
