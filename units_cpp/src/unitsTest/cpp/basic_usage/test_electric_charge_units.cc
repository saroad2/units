/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#include <units/cases.h>
#include <units/electric_charge_units.h>
#include <units/all_units.h>

#include <gtest/gtest.h>

using namespace testing;
using namespace units::electric_charge;

template<class UnitType>
class TestElectricChargeBasicUsage : public Test
{
};

using MyTypes = Types<ELECTRIC_CHARGE_UNITS()>;

TYPED_TEST_CASE(TestElectricChargeBasicUsage, MyTypes);

TYPED_TEST(TestElectricChargeBasicUsage, test_double_constructor)
{
	double value = 5.123;
	TypeParam unit{value};
	EXPECT_EQ(unit.value(), value);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_copy_constructor)
{
	double value = 5.123;
	TypeParam unit1{value};
	TypeParam unit2{unit1};
	EXPECT_EQ(unit1.value(), value);
	EXPECT_EQ(unit2.value(), value);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_move_constructor)
{
	double value = 5.123;
	auto unit2 = [&value]{
		TypeParam unit1{value};
		return std::move(unit1);
	}();
	EXPECT_EQ(unit2.value(), value);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_assignment)
{
	double value1 = 5.123;
	double value2 = 3.956;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	unit1 = unit2;
	EXPECT_EQ(unit1.value(), value2);
	EXPECT_EQ(unit2.value(), value2);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_double_operator)
{
	double value = 5.123;
	TypeParam unit{value};
	EXPECT_EQ((double)unit, value);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_operator_plus_equal)
{
	double value1 = 5.123;
	double value2 = 3.956;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	unit1 += unit2;
	EXPECT_EQ(unit1.value(), value1 + value2);
	EXPECT_EQ(unit2.value(), value2);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_operator_minus_equal)
{
	double value1 = 5.123;
	double value2 = 3.956;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	unit1 -= unit2;
	EXPECT_EQ(unit1.value(), value1 - value2);
	EXPECT_EQ(unit2.value(), value2);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_operator_multiply_equal)
{
	double value = 5.123;
	double scalar = 3.956;
	TypeParam unit{value};
	unit *= scalar;
	EXPECT_EQ(unit.value(), value * scalar);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_operator_divide_equal)
{
	double value = 5.123;
	double scalar = 3.956;
	TypeParam unit{value};
	unit /= scalar;
	EXPECT_EQ(unit.value(), value / scalar);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_equality_pass)
{
	double value1 = 5.123;
	TypeParam unit1{value1};
	TypeParam unit2{value1};
	EXPECT_TRUE(unit1 == unit2);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_equality_not_pass)
{
	double value1 = 5.123;
	double value2 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_FALSE(unit1 == unit2);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_inequality_pass)
{
	double value1 = 5.123;
	double value2 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_TRUE(unit1 != unit2);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_inequality_not_pass)
{
	double value1 = 5.123;
	TypeParam unit1{value1};
	TypeParam unit2{value1};
	EXPECT_FALSE(unit1 != unit2);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_less_than_pass)
{
	double value1 = 5.122;
	double value2 = 5.123;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_TRUE(unit1 < unit2);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_less_than_not_pass_because_of_equality)
{
	double value1 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value1};
	EXPECT_FALSE(unit1 < unit2);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_less_than_not_pass_because_of_too_big_value)
{
	double value1 = 5.123;
	double value2 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_FALSE(unit1 < unit2);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_less_than_equal_pass_because_of_small_enough_value)
{
	double value1 = 5.122;
	double value2 = 5.123;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_TRUE(unit1 <= unit2);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_less_than_equal_not_pass_because_of_equality)
{
	double value1 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value1};
	EXPECT_TRUE(unit1 <= unit2);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_less_than_equal_not_pass_because_of_too_big_value)
{
	double value1 = 5.123;
	double value2 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_FALSE(unit1 <= unit2);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_bigger_than_pass)
{
	double value1 = 5.123;
	double value2 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_TRUE(unit1 > unit2);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_bigger_than_pass_because_of_equality)
{
	double value1 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value1};
	EXPECT_FALSE(unit1 > unit2);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_bigger_than_not_pass_because_of_too_small_value)
{
	double value1 = 5.122;
	double value2 = 5.123;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_FALSE(unit1 > unit2);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_bigger_than_equal_pass_because_of_big_enough_value)
{
	double value1 = 5.123;
	double value2 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_TRUE(unit1 >= unit2);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_bigger_than_equal_pass_because_of_equality)
{
	double value1 = 5.122;
	TypeParam unit1{value1};
	TypeParam unit2{value1};
	EXPECT_TRUE(unit1 >= unit2);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_bigger_than_equal_not_pass_because_of_too_small_value)
{
	double value1 = 5.122;
	double value2 = 5.123;
	TypeParam unit1{value1};
	TypeParam unit2{value2};
	EXPECT_FALSE(unit1 >= unit2);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_operator_plus)
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

TYPED_TEST(TestElectricChargeBasicUsage, test_self_operator_minus)
{
	double value = 5.123;
	TypeParam unit1{value};
	auto unit2 = -unit1;
	EXPECT_EQ(unit1.value(), value);
	EXPECT_EQ(unit2.value(), -value);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_operator_minus)
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

TYPED_TEST(TestElectricChargeBasicUsage, test_multiply_by_scalar_from_the_left)
{
	double value = 5.123;
	double scalar = 7.1;
	TypeParam unit1{value};
	auto unit2 = scalar * unit1;
	EXPECT_EQ(unit1.value(), value);
	EXPECT_EQ(unit2.value(), scalar * value);
	EXPECT_EQ(unit2.scalarRatio(unit1), scalar);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_multiply_by_scalar_from_the_right)
{
	double value = 5.123;
	double scalar = 7.1;
	TypeParam unit1{value};
	auto unit2 = unit1 * scalar;
	EXPECT_EQ(unit1.value(), value);
	EXPECT_EQ(unit2.value(), scalar * value);
	EXPECT_EQ(unit2.scalarRatio(unit1), scalar);
}

TYPED_TEST(TestElectricChargeBasicUsage, test_divide_by_scalar)
{
	double value = 5.123;
	double scalar = 7.1;
	TypeParam unit1{value};
	auto unit2 = unit1 / scalar;
	EXPECT_EQ(unit1.value(), value);
	EXPECT_EQ(unit2.value(), value / scalar);
}

// ============================================================

class TestElectricChargeUnitsPrintings : public TestUnitsPrintings
{
};

TEST_F(TestElectricChargeUnitsPrintings, print_coulombs)
{
	check_print<Coulombs>("coulombs");
}


// ============================================================

TEST(TestElectricChargeUserDefinedLiterals, test_coulombs_int_user_defined_literal)
{
	EXPECT_EQ(Coulombs{5}, 5_coulombs);
}

TEST(TestElectricChargeUserDefinedLiterals, test_coulombs_double_user_defined_literal)
{
	EXPECT_EQ(Coulombs{5.123}, 5.123_coulombs);
}

