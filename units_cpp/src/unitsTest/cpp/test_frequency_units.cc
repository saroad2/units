/*
 * test_frequency_units.cc
 *
 *  Created on: Jul 5, 2017
 *      Author: sagis
 */

#include "cases.h"
#include <units/frequency_units.h>

using namespace units::frequency;

class TestFrequencyUnitsConversions : public TestUnitsConversions
{
};

TEST_F(TestFrequencyUnitsConversions, hertz_to_kilohertz)
{
	maxError = 1e-10;
	check_conversions<Hertz, Kilohertz>(1e-3, 1e+3);
}

TEST_F(TestFrequencyUnitsConversions, hertz_to_megahertz)
{
	maxError = 1e-10;
	check_conversions<Hertz, Megahertz>(1e-6, 1e+6);
}

TEST_F(TestFrequencyUnitsConversions, kilohertz_to_megahertz)
{
	maxError = 1e-10;
	check_conversions<Kilohertz, Megahertz>(1e-3, 1e+3);
}

// ============================================================

class TestFrequencyUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestFrequencyUnitsPrintings, print_hertz)
{
	check_print<Hertz>("hertz");
}

TEST_F(TestFrequencyUnitsPrintings, print_kilohertz)
{
	check_print<Kilohertz>("kilohertz");
}

TEST_F(TestFrequencyUnitsPrintings, print_megahertz)
{
	check_print<Megahertz>("megahertz");
}
// ============================================================

#define TEST_FREQUENCY_USER_DEFINE_LITERALS(Name, name) \
		TEST_USER_DEFINES_LITERALS(Frequency, Name, name);

TEST_FREQUENCY_USER_DEFINE_LITERALS(Hertz, hertz);
TEST_FREQUENCY_USER_DEFINE_LITERALS(Kilohertz, kilohertz);
TEST_FREQUENCY_USER_DEFINE_LITERALS(Megahertz, megahertz);
