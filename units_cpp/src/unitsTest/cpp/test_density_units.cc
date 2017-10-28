/*
 * test_density_units.cc
 *
 *  Created on: Oct 20, 2017
 *      Author: oriash93
 */

 #include <units/cases.h>
 #include <units/density_units.h>
 
 using namespace units::density;
 
 class TestDensityUnitsPrintings : public TestUnitsPrintings
 {
 };
 
 TEST_F(TestDensityUnitsPrintings, print_kilograms_per_cubic_meter)
 {
     check_print<KilogramsPerCubicMeter>("kilograms per cubic meter");
 }
 
 TEST_F(TestDensityUnitsPrintings, print_kilograms_per_liter)
 {
     check_print<KilogramsPerLiter>("kilograms per liter");
 }
 // ============================================================
 
 #define TEST_DENSITY_USER_DEFINE_LITERALS(Name, name) \
         TEST_USER_DEFINES_LITERALS(Density, Name, name);
 
 TEST_DENSITY_USER_DEFINE_LITERALS(KilogramsPerCubicMeter, kilograms_per_cubic_meter);
 TEST_DENSITY_USER_DEFINE_LITERALS(KilogramsPerLiter, kilograms_per_liter);
 