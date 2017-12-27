/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#include <units/cases.h>
#include <units/area_units.h>
#include <units/all_units.h>

#include <gtest/gtest.h>

using namespace testing;
using namespace units::area;

template<class UnitType>
class TestAreaBasicUsage : public Test
{
};

using MyTypes = Types<AREA_UNITS()>;

TYPED_TEST_CASE(TestAreaBasicUsage, MyTypes);

TYPED_TEST(TestAreaBasicUsage, test_double_constructor)
{
	double value = 5.123;
	TypeParam unit{value};
	EXPECT_EQ(unit.value(), value);
}

TYPED_TEST(TestAreaBasicUsage, test_copy_constructor)
{
	double value = 5.123;
	TypeParam unit1{value};
	TypeParam unit2{unit1};
	EXPECT_EQ(unit1.value(), value);
	EXPECT_EQ(unit2.value(), value);
}

TYPED_TEST(TestAreaBasicUsage, test_move_constructor)
{
	double value = 5.123;
	auto unit2 = [&value]{
		TypeParam unit1{value};
		return std::move(unit1);
	}();
	EXPECT_EQ(unit2.value(), value);
}

TYPED_TEST(TestAreaBasicUsage, test_assignment)
{
	double value1 = 5.123;
	double value2 = 3.956;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	unit1 = unit2;
	EXPECT_EQ(unit1.value(), value2);
	EXPECT_EQ(unit2.value(), value2);
}

TYPED_TEST(TestAreaBasicUsage, test_double_operator)
{
	double value = 5.123;
	TypeParam unit{value};
	EXPECT_EQ((double)unit, value);
}

TYPED_TEST(TestAreaBasicUsage, test_operator_plus_equal)
{
	double value1 = 5.123;
	double value2 = 3.956;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	unit1 += unit2;
	EXPECT_EQ(unit1.value(), value1 + value2);
	EXPECT_EQ(unit2.value(), value2);
}

TYPED_TEST(TestAreaBasicUsage, test_operator_minus_equal)
{
	double value1 = 5.123;
	double value2 = 3.956;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	unit1 -= unit2;
	EXPECT_EQ(unit1.value(), value1 - value2);
	EXPECT_EQ(unit2.value(), value2);
}

TYPED_TEST(TestAreaBasicUsage, test_operator_multiply_equal)
{
	double value = 5.123;
	double scalar = 3.956;
	TypeParam unit{value};
	unit *= scalar;
	EXPECT_EQ(unit.value(), value * scalar);
}

TYPED_TEST(TestAreaBasicUsage, test_operator_divide_equal)
{
	double value = 5.123;
	double scalar = 3.956;
	TypeParam unit{value};
	unit /= scalar;
	EXPECT_EQ(unit.value(), value / scalar);
}

TYPED_TEST(TestAreaBasicUsage, test_equality_pass)
{
	double value1 = 5.123;
	TypeParam unit1{value1};
	TypeParam unit2{value1};
	EXPECT_TRUE(unit1 == unit2);
}

TYPED_TEST(TestAreaBasicUsage, test_equality_not_pass)
{
	double value1 = 5.123;
	double value2 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_FALSE(unit1 == unit2);
}

TYPED_TEST(TestAreaBasicUsage, test_inequality_pass)
{
	double value1 = 5.123;
	double value2 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_TRUE(unit1 != unit2);
}

TYPED_TEST(TestAreaBasicUsage, test_inequality_not_pass)
{
	double value1 = 5.123;
	TypeParam unit1{value1};
	TypeParam unit2{value1};
	EXPECT_FALSE(unit1 != unit2);
}

TYPED_TEST(TestAreaBasicUsage, test_less_than_pass)
{
	double value1 = 5.122;
	double value2 = 5.123;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_TRUE(unit1 < unit2);
}

TYPED_TEST(TestAreaBasicUsage, test_less_than_not_pass_because_of_equality)
{
	double value1 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value1};
	EXPECT_FALSE(unit1 < unit2);
}

TYPED_TEST(TestAreaBasicUsage, test_less_than_not_pass_because_of_too_big_value)
{
	double value1 = 5.123;
	double value2 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_FALSE(unit1 < unit2);
}

TYPED_TEST(TestAreaBasicUsage, test_less_than_equal_pass_because_of_small_enough_value)
{
	double value1 = 5.122;
	double value2 = 5.123;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_TRUE(unit1 <= unit2);
}

TYPED_TEST(TestAreaBasicUsage, test_less_than_equal_not_pass_because_of_equality)
{
	double value1 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value1};
	EXPECT_TRUE(unit1 <= unit2);
}

TYPED_TEST(TestAreaBasicUsage, test_less_than_equal_not_pass_because_of_too_big_value)
{
	double value1 = 5.123;
	double value2 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_FALSE(unit1 <= unit2);
}

TYPED_TEST(TestAreaBasicUsage, test_bigger_than_pass)
{
	double value1 = 5.123;
	double value2 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_TRUE(unit1 > unit2);
}

TYPED_TEST(TestAreaBasicUsage, test_bigger_than_pass_because_of_equality)
{
	double value1 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value1};
	EXPECT_FALSE(unit1 > unit2);
}

TYPED_TEST(TestAreaBasicUsage, test_bigger_than_not_pass_because_of_too_small_value)
{
	double value1 = 5.122;
	double value2 = 5.123;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_FALSE(unit1 > unit2);
}

TYPED_TEST(TestAreaBasicUsage, test_bigger_than_equal_pass_because_of_big_enough_value)
{
	double value1 = 5.123;
	double value2 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_TRUE(unit1 >= unit2);
}

TYPED_TEST(TestAreaBasicUsage, test_bigger_than_equal_pass_because_of_equality)
{
	double value1 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value1};
	EXPECT_TRUE(unit1 >= unit2);
}

TYPED_TEST(TestAreaBasicUsage, test_bigger_than_equal_not_pass_because_of_too_small_value)
{
	double value1 = 5.122;
	double value2 = 5.123;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_FALSE(unit1 >= unit2);
}

TYPED_TEST(TestAreaBasicUsage, test_operator_plus)
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

TYPED_TEST(TestAreaBasicUsage, test_self_operator_minus)
{
	double value = 5.123;
	TypeParam unit1{value};
	auto unit2 = -unit1;
	EXPECT_EQ(unit1.value(), value);
	EXPECT_EQ(unit2.value(), -value);
}

TYPED_TEST(TestAreaBasicUsage, test_operator_minus)
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

TYPED_TEST(TestAreaBasicUsage, test_multiply_by_scalar_from_the_left)
{
	double value = 5.123;
	double scalar = 7.1;
	TypeParam unit1{value};
	auto unit2 = scalar * unit1;
	EXPECT_EQ(unit1.value(), value);
	EXPECT_EQ(unit2.value(), scalar * value);
	EXPECT_EQ(unit2.scalarRatio(unit1), scalar);
}

TYPED_TEST(TestAreaBasicUsage, test_multiply_by_scalar_from_the_right)
{
	double value = 5.123;
	double scalar = 7.1;
	TypeParam unit1{value};
	auto unit2 = unit1 * scalar;
	EXPECT_EQ(unit1.value(), value);
	EXPECT_EQ(unit2.value(), scalar * value);
	EXPECT_EQ(unit2.scalarRatio(unit1), scalar);
}

TYPED_TEST(TestAreaBasicUsage, test_divide_by_scalar)
{
	double value = 5.123;
	double scalar = 7.1;
	TypeParam unit1{value};
	auto unit2 = unit1 / scalar;
	EXPECT_EQ(unit1.value(), value);
	EXPECT_EQ(unit2.value(), value / scalar);
}

// ============================================================

class TestAreaUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestAreaUnitsPrintings, print_square_feet)
{
	check_print<SquareFeet>("feet^2");
}
TEST_F(TestAreaUnitsPrintings, print_square_yards)
{
	check_print<SquareYards>("yards^2");
}
TEST_F(TestAreaUnitsPrintings, print_square_meters)
{
	check_print<SquareMeters>("meters^2");
}
TEST_F(TestAreaUnitsPrintings, print_square_kilometers)
{
	check_print<SquareKilometers>("kilometers^2");
}
TEST_F(TestAreaUnitsPrintings, print_dunams)
{
	check_print<Dunams>("dunams");
}


// ============================================================

TEST(TestAreaUserDefinedLiterals, test_square_feet_int_user_defined_literal)
{
	EXPECT_EQ(SquareFeet{5}, 5_square_feet);
}

TEST(TestAreaUserDefinedLiterals, test_square_feet_double_user_defined_literal)
{
	EXPECT_EQ(SquareFeet{5.123}, 5.123_square_feet);
}

TEST(TestAreaUserDefinedLiterals, test_square_yards_int_user_defined_literal)
{
	EXPECT_EQ(SquareYards{5}, 5_square_yards);
}

TEST(TestAreaUserDefinedLiterals, test_square_yards_double_user_defined_literal)
{
	EXPECT_EQ(SquareYards{5.123}, 5.123_square_yards);
}

TEST(TestAreaUserDefinedLiterals, test_square_meters_int_user_defined_literal)
{
	EXPECT_EQ(SquareMeters{5}, 5_square_meters);
}

TEST(TestAreaUserDefinedLiterals, test_square_meters_double_user_defined_literal)
{
	EXPECT_EQ(SquareMeters{5.123}, 5.123_square_meters);
}

TEST(TestAreaUserDefinedLiterals, test_square_kilometers_int_user_defined_literal)
{
	EXPECT_EQ(SquareKilometers{5}, 5_square_kilometers);
}

TEST(TestAreaUserDefinedLiterals, test_square_kilometers_double_user_defined_literal)
{
	EXPECT_EQ(SquareKilometers{5.123}, 5.123_square_kilometers);
}

TEST(TestAreaUserDefinedLiterals, test_dunams_int_user_defined_literal)
{
	EXPECT_EQ(Dunams{5}, 5_dunams);
}

TEST(TestAreaUserDefinedLiterals, test_dunams_double_user_defined_literal)
{
	EXPECT_EQ(Dunams{5.123}, 5.123_dunams);
}

