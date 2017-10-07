/*
 * test_volume_units.cc
 *
 *  Created on: Jun 30, 2017
 *      Author: sagis
 */

#include "cases.h"
#include <units/volume_units.h>

using namespace units::volume;

class TestVolumeUnitsConversions : public TestUnitsConversions
{
};

TEST_F(TestVolumeUnitsConversions, cubic_feet_to_cubic_meters)
{
	check_conversions<CubicFeet, CubicMeters>(0.028316846592, 35.3146667214886);
}

TEST_F(TestVolumeUnitsConversions, cubic_yards_to_cubic_meters)
{
	check_conversions<CubicYards, CubicMeters>(0.764554857984, 1.3079506193143928);
}

TEST_F(TestVolumeUnitsConversions, liters_to_cubic_meters)
{
	check_conversions<Liters, CubicMeters>(1e-3, 1e+3);
}

TEST_F(TestVolumeUnitsConversions, milliliters_to_cubic_meters)
{
	check_conversions<Milliliters, CubicMeters>(1e-6, 1e+6);
}

TEST_F(TestVolumeUnitsConversions, cubic_kilometers_to_cubic_meters)
{
	check_conversions<CubicKilometers, CubicMeters>(1e+9, 1e-9);
}

TEST_F(TestVolumeUnitsConversions, cubic_yards_to_cubic_feet)
{
	check_conversions<CubicYards, CubicFeet>(27, 0.03703703703703);
}

TEST_F(TestVolumeUnitsConversions, liters_to_cubic_feet)
{
	check_conversions<Liters, CubicFeet>(0.0353146667214886, 28.316846592);
}

TEST_F(TestVolumeUnitsConversions, milliliters_to_cubic_feet)
{
	check_conversions<Milliliters, CubicFeet>(3.53146667214886e-5, 28316.846592);
}

TEST_F(TestVolumeUnitsConversions, cubic_kilometers_to_cubic_feet)
{
	check_conversions<CubicKilometers, CubicFeet>(35314666721.4886, 2.8316846592e-11);
}

TEST_F(TestVolumeUnitsConversions, liters_to_cubic_yards)
{
	check_conversions<Liters, CubicYards>(1.3079506193143928e-3, 764.554857984);
}

TEST_F(TestVolumeUnitsConversions, milliliters_to_cubic_yards)
{
	check_conversions<Milliliters, CubicYards>(1.3079506193143928e-6, 764554.8579839998);
}

TEST_F(TestVolumeUnitsConversions, cubic_kilometers_to_cubic_yards)
{
	check_conversions<CubicKilometers, CubicYards>(1.3079506193143928e+9, 7.64554857984e-10);
}

TEST_F(TestVolumeUnitsConversions, cubic_kilometers_to_liters)
{
	check_conversions<CubicKilometers, Liters>(1e+12, 1e-12);
}

TEST_F(TestVolumeUnitsConversions, cubic_kilometers_to_milliliters)
{
	check_conversions<CubicKilometers, Milliliters>(1e+15, 1e-15);
}

// ============================================================

class TestVolumeUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestVolumeUnitsPrintings, print_cubic_feet)
{
	check_print<CubicFeet>("feet^3");
}

TEST_F(TestVolumeUnitsPrintings, print_cubic_yards)
{
	check_print<CubicYards>("yards^3");
}

TEST_F(TestVolumeUnitsPrintings, print_cubic_meters)
{
	check_print<CubicMeters>("meters^3");
}

TEST_F(TestVolumeUnitsPrintings, print_cubic_kilometers)
{
	check_print<CubicKilometers>("kilometers^3");
}

TEST_F(TestVolumeUnitsPrintings, print_liters)
{
	check_print<Liters>("liters");
}

TEST_F(TestVolumeUnitsPrintings, print_milliliters)
{
	check_print<Milliliters>("milliliters");
}

// ============================================================

#define TEST_VOLUME_USER_DEFINE_LITERALS(Name, name) \
		TEST_USER_DEFINES_LITERALS(Volume, Name, name);

TEST_VOLUME_USER_DEFINE_LITERALS(CubicFeet, cubic_feet);
TEST_VOLUME_USER_DEFINE_LITERALS(CubicYards, cubic_yards);
TEST_VOLUME_USER_DEFINE_LITERALS(CubicMeters, cubic_meters);
TEST_VOLUME_USER_DEFINE_LITERALS(CubicKilometers, cubic_kilometers);
TEST_VOLUME_USER_DEFINE_LITERALS(Liters, liters);
TEST_VOLUME_USER_DEFINE_LITERALS(Milliliters, milliliters);
