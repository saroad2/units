/*
 * test_neptune_properties.cc
 *
 *  Created on: Dec 27, 2017
 *      Author: sagis
 */

#include <units/constants/neptune_properties.h>
#include <units/constants/physical_constants.h>
#include <units/units_multiply.h>
#include <units/units_ratio.h>
#include <units/units_pow.h>
#include <units/units_sqrt.h>
#include <units/planetary_constants_test_suite.h>

using namespace units::neptune_properties;
using namespace units;
using units::physical_constants::gravitationalConstant;

class TestNeptuneProperties : public PlanetaryConstantsTestSuite
{
protected:
	TestNeptuneProperties()
	: PlanetaryConstantsTestSuite{1.72} // %
	{
	}
};

TEST_F(TestNeptuneProperties, test_surface_gravity)
{
	auto calculatedSurfaceGravity =
			units_ratio<units::acceleration::MetersPerSquareSecond>(
					auto_units_multiply(gravitationalConstant, neptuneMass),
					auto_units_multiply(neptuneEquatorialRadius, neptuneEquatorialRadius));
	checkEqualValue(neptuneSurfaceGravity, calculatedSurfaceGravity);
}

TEST_F(TestNeptuneProperties, test_mass)
{
	auto calculatedMass = (M_PI * 4 / 3) *
			units_multiply<units::mass::Kilograms>(
					neptuneMeanDensity ,units_pow<3>(neptuneEquatorialRadius));
	checkEqualValue(neptuneMass, calculatedMass);
}

TEST_F(TestNeptuneProperties, test_escape_velocity)
{
	auto calculatedEscapeVelocity = units_sqrt<units::speed::MetersPerSecond> (
			2 * auto_units_ratio(
					auto_units_multiply(gravitationalConstant, neptuneMass),
					neptuneEquatorialRadius
				)
			);
	checkEqualValue(neptuneEscapeVelocity, calculatedEscapeVelocity);
}
