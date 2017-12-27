/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#include <units/cases.h>
#include <units/length_units.h>
#include <units/all_units.h>

#include <gtest/gtest.h>

using namespace testing;
using namespace units::length;

template<class UnitType>
class TestLengthBasicUsage : public Test
{
};

using MyTypes = Types<LENGTH_UNITS()>;

TYPED_TEST_CASE(TestLengthBasicUsage, MyTypes);

TYPED_TEST(TestLengthBasicUsage, test_double_constructor)
{
	double value = 5.123;
	TypeParam unit{value};
	EXPECT_EQ(unit.value(), value);
}

TYPED_TEST(TestLengthBasicUsage, test_copy_constructor)
{
	double value = 5.123;
	TypeParam unit1{value};
	TypeParam unit2{unit1};
	EXPECT_EQ(unit1.value(), value);
	EXPECT_EQ(unit2.value(), value);
}

TYPED_TEST(TestLengthBasicUsage, test_move_constructor)
{
	double value = 5.123;
	auto unit2 = [&value]{
		TypeParam unit1{value};
		return std::move(unit1);
	}();
	EXPECT_EQ(unit2.value(), value);
}

TYPED_TEST(TestLengthBasicUsage, test_assignment)
{
	double value1 = 5.123;
	double value2 = 3.956;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	unit1 = unit2;
	EXPECT_EQ(unit1.value(), value2);
	EXPECT_EQ(unit2.value(), value2);
}

TYPED_TEST(TestLengthBasicUsage, test_double_operator)
{
	double value = 5.123;
	TypeParam unit{value};
	EXPECT_EQ((double)unit, value);
}

TYPED_TEST(TestLengthBasicUsage, test_operator_plus_equal)
{
	double value1 = 5.123;
	double value2 = 3.956;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	unit1 += unit2;
	EXPECT_EQ(unit1.value(), value1 + value2);
	EXPECT_EQ(unit2.value(), value2);
}

TYPED_TEST(TestLengthBasicUsage, test_operator_minus_equal)
{
	double value1 = 5.123;
	double value2 = 3.956;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	unit1 -= unit2;
	EXPECT_EQ(unit1.value(), value1 - value2);
	EXPECT_EQ(unit2.value(), value2);
}

TYPED_TEST(TestLengthBasicUsage, test_operator_multiply_equal)
{
	double value = 5.123;
	double scalar = 3.956;
	TypeParam unit{value};
	unit *= scalar;
	EXPECT_EQ(unit.value(), value * scalar);
}

TYPED_TEST(TestLengthBasicUsage, test_operator_divide_equal)
{
	double value = 5.123;
	double scalar = 3.956;
	TypeParam unit{value};
	unit /= scalar;
	EXPECT_EQ(unit.value(), value / scalar);
}

TYPED_TEST(TestLengthBasicUsage, test_equality_pass)
{
	double value1 = 5.123;
	TypeParam unit1{value1};
	TypeParam unit2{value1};
	EXPECT_TRUE(unit1 == unit2);
}

TYPED_TEST(TestLengthBasicUsage, test_equality_not_pass)
{
	double value1 = 5.123;
	double value2 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_FALSE(unit1 == unit2);
}

TYPED_TEST(TestLengthBasicUsage, test_inequality_pass)
{
	double value1 = 5.123;
	double value2 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_TRUE(unit1 != unit2);
}

TYPED_TEST(TestLengthBasicUsage, test_inequality_not_pass)
{
	double value1 = 5.123;
	TypeParam unit1{value1};
	TypeParam unit2{value1};
	EXPECT_FALSE(unit1 != unit2);
}

TYPED_TEST(TestLengthBasicUsage, test_less_than_pass)
{
	double value1 = 5.122;
	double value2 = 5.123;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_TRUE(unit1 < unit2);
}

TYPED_TEST(TestLengthBasicUsage, test_less_than_not_pass_because_of_equality)
{
	double value1 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value1};
	EXPECT_FALSE(unit1 < unit2);
}

TYPED_TEST(TestLengthBasicUsage, test_less_than_not_pass_because_of_too_big_value)
{
	double value1 = 5.123;
	double value2 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_FALSE(unit1 < unit2);
}

TYPED_TEST(TestLengthBasicUsage, test_less_than_equal_pass_because_of_small_enough_value)
{
	double value1 = 5.122;
	double value2 = 5.123;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_TRUE(unit1 <= unit2);
}

TYPED_TEST(TestLengthBasicUsage, test_less_than_equal_not_pass_because_of_equality)
{
	double value1 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value1};
	EXPECT_TRUE(unit1 <= unit2);
}

TYPED_TEST(TestLengthBasicUsage, test_less_than_equal_not_pass_because_of_too_big_value)
{
	double value1 = 5.123;
	double value2 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_FALSE(unit1 <= unit2);
}

TYPED_TEST(TestLengthBasicUsage, test_bigger_than_pass)
{
	double value1 = 5.123;
	double value2 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_TRUE(unit1 > unit2);
}

TYPED_TEST(TestLengthBasicUsage, test_bigger_than_pass_because_of_equality)
{
	double value1 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value1};
	EXPECT_FALSE(unit1 > unit2);
}

TYPED_TEST(TestLengthBasicUsage, test_bigger_than_not_pass_because_of_too_small_value)
{
	double value1 = 5.122;
	double value2 = 5.123;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_FALSE(unit1 > unit2);
}

TYPED_TEST(TestLengthBasicUsage, test_bigger_than_equal_pass_because_of_big_enough_value)
{
	double value1 = 5.123;
	double value2 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_TRUE(unit1 >= unit2);
}

TYPED_TEST(TestLengthBasicUsage, test_bigger_than_equal_pass_because_of_equality)
{
	double value1 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value1};
	EXPECT_TRUE(unit1 >= unit2);
}

TYPED_TEST(TestLengthBasicUsage, test_bigger_than_equal_not_pass_because_of_too_small_value)
{
	double value1 = 5.122;
	double value2 = 5.123;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_FALSE(unit1 >= unit2);
}

TYPED_TEST(TestLengthBasicUsage, test_operator_plus)
{
	double value1 = 5.123;
	double value2 = 3.956;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	auto unit3 = unit1 + unit2;
	EXPECT_EQ(unit1.value(), value1);
	EXPECT_EQ(unit2.value(), value2);
	EXPECT_EQ(unit3.value(), value1 + value2);
}

TYPED_TEST(TestLengthBasicUsage, test_self_operator_minus)
{
	double value = 5.123;
	TypeParam unit1{value};
	auto unit2 = -unit1;
	EXPECT_EQ(unit1.value(), value);
	EXPECT_EQ(unit2.value(), -value);
}

TYPED_TEST(TestLengthBasicUsage, test_operator_minus)
{
	double value1 = 5.123;
	double value2 = 3.956;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	auto unit3 = unit1 - unit2;
	EXPECT_EQ(unit1.value(), value1);
	EXPECT_EQ(unit2.value(), value2);
	EXPECT_EQ(unit3.value(), value1 - value2);
}

TYPED_TEST(TestLengthBasicUsage, test_multiply_by_scalar_from_the_left)
{
	double value = 5.123;
	double scalar = 7.1;
	TypeParam unit1{value};
	auto unit2 = scalar * unit1;
	EXPECT_EQ(unit1.value(), value);
	EXPECT_EQ(unit2.value(), scalar * value);
	EXPECT_EQ(unit2.scalarRatio(unit1), scalar);
}

TYPED_TEST(TestLengthBasicUsage, test_multiply_by_scalar_from_the_right)
{
	double value = 5.123;
	double scalar = 7.1;
	TypeParam unit1{value};
	auto unit2 = unit1 * scalar;
	EXPECT_EQ(unit1.value(), value);
	EXPECT_EQ(unit2.value(), scalar * value);
	EXPECT_EQ(unit2.scalarRatio(unit1), scalar);
}

TYPED_TEST(TestLengthBasicUsage, test_divide_by_scalar)
{
	double value = 5.123;
	double scalar = 7.1;
	TypeParam unit1{value};
	auto unit2 = unit1 / scalar;
	EXPECT_EQ(unit1.value(), value);
	EXPECT_EQ(unit2.value(), value / scalar);
}

// ============================================================

class TestLengthUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestLengthUnitsPrintings, print_meters)
{
	check_print<Meters>("meters");
}
TEST_F(TestLengthUnitsPrintings, print_inches)
{
	check_print<Inches>("inches");
}
TEST_F(TestLengthUnitsPrintings, print_feet)
{
	check_print<Feet>("feet");
}
TEST_F(TestLengthUnitsPrintings, print_yards)
{
	check_print<Yards>("yards");
}
TEST_F(TestLengthUnitsPrintings, print_statute_miles)
{
	check_print<StatuteMiles>("statute miles");
}
TEST_F(TestLengthUnitsPrintings, print_nautical_miles)
{
	check_print<NauticalMiles>("nautical miles");
}
TEST_F(TestLengthUnitsPrintings, print_geographical_miles)
{
	check_print<GeographicalMiles>("geographical miles");
}
TEST_F(TestLengthUnitsPrintings, print_degrees_of_latitude)
{
	check_print<DegreesOfLatitude>("degrees of latitude");
}
TEST_F(TestLengthUnitsPrintings, print_micrometers)
{
	check_print<Micrometers>("micrometers");
}
TEST_F(TestLengthUnitsPrintings, print_millimeters)
{
	check_print<Millimeters>("millimeters");
}
TEST_F(TestLengthUnitsPrintings, print_centimeters)
{
	check_print<Centimeters>("centimeters");
}
TEST_F(TestLengthUnitsPrintings, print_kilometers)
{
	check_print<Kilometers>("kilometers");
}


// ============================================================

TEST(TestLengthUserDefinedLiterals, test_meters_int_user_defined_literal)
{
	EXPECT_EQ(Meters{5}, 5_meters);
}

TEST(TestLengthUserDefinedLiterals, test_meters_double_user_defined_literal)
{
	EXPECT_EQ(Meters{5.123}, 5.123_meters);
}

TEST(TestLengthUserDefinedLiterals, test_inches_int_user_defined_literal)
{
	EXPECT_EQ(Inches{5}, 5_inches);
}

TEST(TestLengthUserDefinedLiterals, test_inches_double_user_defined_literal)
{
	EXPECT_EQ(Inches{5.123}, 5.123_inches);
}

TEST(TestLengthUserDefinedLiterals, test_feet_int_user_defined_literal)
{
	EXPECT_EQ(Feet{5}, 5_feet);
}

TEST(TestLengthUserDefinedLiterals, test_feet_double_user_defined_literal)
{
	EXPECT_EQ(Feet{5.123}, 5.123_feet);
}

TEST(TestLengthUserDefinedLiterals, test_yards_int_user_defined_literal)
{
	EXPECT_EQ(Yards{5}, 5_yards);
}

TEST(TestLengthUserDefinedLiterals, test_yards_double_user_defined_literal)
{
	EXPECT_EQ(Yards{5.123}, 5.123_yards);
}

TEST(TestLengthUserDefinedLiterals, test_statute_miles_int_user_defined_literal)
{
	EXPECT_EQ(StatuteMiles{5}, 5_statute_miles);
}

TEST(TestLengthUserDefinedLiterals, test_statute_miles_double_user_defined_literal)
{
	EXPECT_EQ(StatuteMiles{5.123}, 5.123_statute_miles);
}

TEST(TestLengthUserDefinedLiterals, test_nautical_miles_int_user_defined_literal)
{
	EXPECT_EQ(NauticalMiles{5}, 5_nautical_miles);
}

TEST(TestLengthUserDefinedLiterals, test_nautical_miles_double_user_defined_literal)
{
	EXPECT_EQ(NauticalMiles{5.123}, 5.123_nautical_miles);
}

TEST(TestLengthUserDefinedLiterals, test_geographical_miles_int_user_defined_literal)
{
	EXPECT_EQ(GeographicalMiles{5}, 5_geographical_miles);
}

TEST(TestLengthUserDefinedLiterals, test_geographical_miles_double_user_defined_literal)
{
	EXPECT_EQ(GeographicalMiles{5.123}, 5.123_geographical_miles);
}

TEST(TestLengthUserDefinedLiterals, test_degrees_of_latitude_int_user_defined_literal)
{
	EXPECT_EQ(DegreesOfLatitude{5}, 5_degrees_of_latitude);
}

TEST(TestLengthUserDefinedLiterals, test_degrees_of_latitude_double_user_defined_literal)
{
	EXPECT_EQ(DegreesOfLatitude{5.123}, 5.123_degrees_of_latitude);
}

TEST(TestLengthUserDefinedLiterals, test_micrometers_int_user_defined_literal)
{
	EXPECT_EQ(Micrometers{5}, 5_micrometers);
}

TEST(TestLengthUserDefinedLiterals, test_micrometers_double_user_defined_literal)
{
	EXPECT_EQ(Micrometers{5.123}, 5.123_micrometers);
}

TEST(TestLengthUserDefinedLiterals, test_millimeters_int_user_defined_literal)
{
	EXPECT_EQ(Millimeters{5}, 5_millimeters);
}

TEST(TestLengthUserDefinedLiterals, test_millimeters_double_user_defined_literal)
{
	EXPECT_EQ(Millimeters{5.123}, 5.123_millimeters);
}

TEST(TestLengthUserDefinedLiterals, test_centimeters_int_user_defined_literal)
{
	EXPECT_EQ(Centimeters{5}, 5_centimeters);
}

TEST(TestLengthUserDefinedLiterals, test_centimeters_double_user_defined_literal)
{
	EXPECT_EQ(Centimeters{5.123}, 5.123_centimeters);
}

TEST(TestLengthUserDefinedLiterals, test_kilometers_int_user_defined_literal)
{
	EXPECT_EQ(Kilometers{5}, 5_kilometers);
}

TEST(TestLengthUserDefinedLiterals, test_kilometers_double_user_defined_literal)
{
	EXPECT_EQ(Kilometers{5.123}, 5.123_kilometers);
}

