/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#include <units/cases.h>
#include <units/speed_units.h>
#include <units/all_units.h>

#include <gtest/gtest.h>

using namespace testing;
using namespace units::speed;

template<class UnitType>
class TestSpeedBasicUsage : public Test
{
};

using MyTypes = Types<SPEED_UNITS()>;

TYPED_TEST_CASE(TestSpeedBasicUsage, MyTypes);

TYPED_TEST(TestSpeedBasicUsage, test_double_constructor)
{
	double value = 5.123;
	TypeParam unit{value};
	EXPECT_EQ(unit.value(), value);
}

TYPED_TEST(TestSpeedBasicUsage, test_copy_constructor)
{
	double value = 5.123;
	TypeParam unit1{value};
	TypeParam unit2{unit1};
	EXPECT_EQ(unit1.value(), value);
	EXPECT_EQ(unit2.value(), value);
}

TYPED_TEST(TestSpeedBasicUsage, test_move_constructor)
{
	double value = 5.123;
	auto unit2 = [&value]{
		TypeParam unit1{value};
		return std::move(unit1);
	}();
	EXPECT_EQ(unit2.value(), value);
}

TYPED_TEST(TestSpeedBasicUsage, test_assignment)
{
	double value1 = 5.123;
	double value2 = 3.956;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	unit1 = unit2;
	EXPECT_EQ(unit1.value(), value2);
	EXPECT_EQ(unit2.value(), value2);
}

TYPED_TEST(TestSpeedBasicUsage, test_double_operator)
{
	double value = 5.123;
	TypeParam unit{value};
	EXPECT_EQ((double)unit, value);
}

TYPED_TEST(TestSpeedBasicUsage, test_operator_plus_equal)
{
	double value1 = 5.123;
	double value2 = 3.956;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	unit1 += unit2;
	EXPECT_EQ(unit1.value(), value1 + value2);
	EXPECT_EQ(unit2.value(), value2);
}

TYPED_TEST(TestSpeedBasicUsage, test_operator_minus_equal)
{
	double value1 = 5.123;
	double value2 = 3.956;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	unit1 -= unit2;
	EXPECT_EQ(unit1.value(), value1 - value2);
	EXPECT_EQ(unit2.value(), value2);
}

TYPED_TEST(TestSpeedBasicUsage, test_operator_multiply_equal)
{
	double value = 5.123;
	double scalar = 3.956;
	TypeParam unit{value};
	unit *= scalar;
	EXPECT_EQ(unit.value(), value * scalar);
}

TYPED_TEST(TestSpeedBasicUsage, test_operator_divide_equal)
{
	double value = 5.123;
	double scalar = 3.956;
	TypeParam unit{value};
	unit /= scalar;
	EXPECT_EQ(unit.value(), value / scalar);
}

TYPED_TEST(TestSpeedBasicUsage, test_equality_pass)
{
	double value1 = 5.123;
	TypeParam unit1{value1};
	TypeParam unit2{value1};
	EXPECT_TRUE(unit1 == unit2);
}

TYPED_TEST(TestSpeedBasicUsage, test_equality_not_pass)
{
	double value1 = 5.123;
	double value2 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_FALSE(unit1 == unit2);
}

TYPED_TEST(TestSpeedBasicUsage, test_inequality_pass)
{
	double value1 = 5.123;
	double value2 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_TRUE(unit1 != unit2);
}

TYPED_TEST(TestSpeedBasicUsage, test_inequality_not_pass)
{
	double value1 = 5.123;
	TypeParam unit1{value1};
	TypeParam unit2{value1};
	EXPECT_FALSE(unit1 != unit2);
}

TYPED_TEST(TestSpeedBasicUsage, test_less_than_pass)
{
	double value1 = 5.122;
	double value2 = 5.123;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_TRUE(unit1 < unit2);
}

TYPED_TEST(TestSpeedBasicUsage, test_less_than_not_pass_because_of_equality)
{
	double value1 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value1};
	EXPECT_FALSE(unit1 < unit2);
}

TYPED_TEST(TestSpeedBasicUsage, test_less_than_not_pass_because_of_too_big_value)
{
	double value1 = 5.123;
	double value2 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_FALSE(unit1 < unit2);
}

TYPED_TEST(TestSpeedBasicUsage, test_less_than_equal_pass_because_of_small_enough_value)
{
	double value1 = 5.122;
	double value2 = 5.123;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_TRUE(unit1 <= unit2);
}

TYPED_TEST(TestSpeedBasicUsage, test_less_than_equal_not_pass_because_of_equality)
{
	double value1 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value1};
	EXPECT_TRUE(unit1 <= unit2);
}

TYPED_TEST(TestSpeedBasicUsage, test_less_than_equal_not_pass_because_of_too_big_value)
{
	double value1 = 5.123;
	double value2 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_FALSE(unit1 <= unit2);
}

TYPED_TEST(TestSpeedBasicUsage, test_bigger_than_pass)
{
	double value1 = 5.123;
	double value2 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_TRUE(unit1 > unit2);
}

TYPED_TEST(TestSpeedBasicUsage, test_bigger_than_pass_because_of_equality)
{
	double value1 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value1};
	EXPECT_FALSE(unit1 > unit2);
}

TYPED_TEST(TestSpeedBasicUsage, test_bigger_than_not_pass_because_of_too_small_value)
{
	double value1 = 5.122;
	double value2 = 5.123;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_FALSE(unit1 > unit2);
}

TYPED_TEST(TestSpeedBasicUsage, test_bigger_than_equal_pass_because_of_big_enough_value)
{
	double value1 = 5.123;
	double value2 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_TRUE(unit1 >= unit2);
}

TYPED_TEST(TestSpeedBasicUsage, test_bigger_than_equal_pass_because_of_equality)
{
	double value1 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value1};
	EXPECT_TRUE(unit1 >= unit2);
}

TYPED_TEST(TestSpeedBasicUsage, test_bigger_than_equal_not_pass_because_of_too_small_value)
{
	double value1 = 5.122;
	double value2 = 5.123;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_FALSE(unit1 >= unit2);
}

TYPED_TEST(TestSpeedBasicUsage, test_operator_plus)
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

TYPED_TEST(TestSpeedBasicUsage, test_self_operator_minus)
{
	double value = 5.123;
	TypeParam unit1{value};
	auto unit2 = -unit1;
	EXPECT_EQ(unit1.value(), value);
	EXPECT_EQ(unit2.value(), -value);
}

TYPED_TEST(TestSpeedBasicUsage, test_operator_minus)
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

TYPED_TEST(TestSpeedBasicUsage, test_multiply_by_scalar_from_the_left)
{
	double value = 5.123;
	double scalar = 7.1;
	TypeParam unit1{value};
	auto unit2 = scalar * unit1;
	EXPECT_EQ(unit1.value(), value);
	EXPECT_EQ(unit2.value(), scalar * value);
	EXPECT_EQ(unit2.scalarRatio(unit1), scalar);
}

TYPED_TEST(TestSpeedBasicUsage, test_multiply_by_scalar_from_the_right)
{
	double value = 5.123;
	double scalar = 7.1;
	TypeParam unit1{value};
	auto unit2 = unit1 * scalar;
	EXPECT_EQ(unit1.value(), value);
	EXPECT_EQ(unit2.value(), scalar * value);
	EXPECT_EQ(unit2.scalarRatio(unit1), scalar);
}

TYPED_TEST(TestSpeedBasicUsage, test_divide_by_scalar)
{
	double value = 5.123;
	double scalar = 7.1;
	TypeParam unit1{value};
	auto unit2 = unit1 / scalar;
	EXPECT_EQ(unit1.value(), value);
	EXPECT_EQ(unit2.value(), value / scalar);
}

// ============================================================

class TestSpeedUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestSpeedUnitsPrintings, print_feet_per_second)
{
	check_print<FeetPerSecond>("feet/second");
}
TEST_F(TestSpeedUnitsPrintings, print_yards_per_second)
{
	check_print<YardsPerSecond>("yards/second");
}
TEST_F(TestSpeedUnitsPrintings, print_meters_per_second)
{
	check_print<MetersPerSecond>("meters/second");
}
TEST_F(TestSpeedUnitsPrintings, print_kilometers_per_hour)
{
	check_print<KilometersPerHour>("kilometers/hour");
}
TEST_F(TestSpeedUnitsPrintings, print_knots)
{
	check_print<Knots>("knots");
}


// ============================================================

#define TEST_SPEED_USER_DEFINE_LITERALS(Name, name) \
		TEST_USER_DEFINES_LITERALS(Speed, Name, name);

TEST_SPEED_USER_DEFINE_LITERALS(FeetPerSecond, feet_per_second);
TEST_SPEED_USER_DEFINE_LITERALS(YardsPerSecond, yards_per_second);
TEST_SPEED_USER_DEFINE_LITERALS(MetersPerSecond, meters_per_second);
TEST_SPEED_USER_DEFINE_LITERALS(KilometersPerHour, kilometers_per_hour);
TEST_SPEED_USER_DEFINE_LITERALS(Knots, knots);
