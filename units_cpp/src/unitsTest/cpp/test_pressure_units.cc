/*
 * test_pressure_units.cc
 *
 *  Created on: Oct 29, 2017
 *      Author: oriash93
 */

 #include <units/cases.h>
 #include <units/pressure_units.h>
 
 #include <gtest/gtest.h>
 
 using namespace testing;
 using namespace units::pressure;
 
 class TestPressureUnitsPrintings : public TestUnitsPrintings
 {
 };
 
 TEST_F(TestPressureUnitsPrintings, print_pascals)
 {
     check_print<Pascals>("pascals");
 }
 
 // ============================================================
 
 #define TEST_PRESSURE_USER_DEFINE_LITERALS(Name, name) \
         TEST_USER_DEFINES_LITERALS(Pressure, Name, name);
 
 TEST_PRESSURE_USER_DEFINE_LITERALS(Pascals, pascals);
 