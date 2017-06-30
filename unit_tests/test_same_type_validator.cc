/*
 * test_same_type_validator.cc
 *
 *  Created on: Jun 30, 2017
 *      Author: sagis
 */

#include "units/include/internal/same_type_validator.h"
#include "units/include/internal/multiply_units.h"
#include "units/include/internal/numeric_value.h"

#include <gtest/gtest.h>

using units::is_from_the_same_type;
using units::Multiply;
using units::NumericValue;
using namespace testing;

struct a_type_tag { static constexpr int code = 2; };
struct b_type_tag { static constexpr int code = 3; };
struct c_type_tag { static constexpr int code = 5; };
struct d_type_tag { static constexpr int code = 7; };
struct e_type_tag { static constexpr int code = 11; };

struct a_scale_tag {};
struct b_scale_tag {};
struct c_scale_tag {};
struct d_scale_tag {};
struct e_scale_tag {};

using A = NumericValue<a_scale_tag, a_type_tag>;
using B = NumericValue<b_scale_tag, b_type_tag>;
using C = NumericValue<c_scale_tag, c_type_tag>;
using D = NumericValue<d_scale_tag, d_type_tag>;
using E = NumericValue<e_scale_tag, e_type_tag>;

class TestSameTypeValidator : public Test
{
protected:

	template<class A, class B>
	void check_from_the_same_type()
	{
		check_from_the_same_type_one_side<A, B>();
		check_from_the_same_type_one_side<B, A>();
	}

	template<class A, class B>
	void check_not_from_the_same_type()
	{
		check_not_from_the_same_type_one_side<A, B>();
		check_not_from_the_same_type_one_side<B, A>();
	}
private:

	template<class A, class B>
	void check_from_the_same_type_one_side()
	{
		auto result = is_from_the_same_type<A,B>::value();
		EXPECT_TRUE(result);
	}

	template<class A, class B>
	void check_not_from_the_same_type_one_side()
	{
		auto result = is_from_the_same_type<A,B>::value();
		EXPECT_FALSE(result);
	}
};

TEST_F(TestSameTypeValidator, same_types_return_true)
{
	check_from_the_same_type<A, A>();
}

TEST_F(TestSameTypeValidator, not_same_types_return_false)
{
	check_not_from_the_same_type<A, B>();
}

TEST_F(TestSameTypeValidator, type_and_multiply_type_with_itself_returns_true)
{
	check_from_the_same_type<A, Multiply<A>>();
	check_not_from_the_same_type<A, Multiply<B>>();
}

TEST_F(TestSameTypeValidator, multiply_is_commutative_with_two_arguments)
{
	check_from_the_same_type<Multiply<A, B>, Multiply<A, B>>();
	check_from_the_same_type<Multiply<A, B>, Multiply<B, A>>();
	check_not_from_the_same_type<Multiply<A, B>, Multiply<A, C>>();
	check_not_from_the_same_type<Multiply<A, B>, Multiply<C, A>>();
	check_not_from_the_same_type<Multiply<A, B>, Multiply<C, B>>();
	check_not_from_the_same_type<Multiply<A, B>, Multiply<B, C>>();
	check_not_from_the_same_type<Multiply<A, B>, Multiply<C, D>>();
}

TEST_F(TestSameTypeValidator, multiply_is_commutative_with_three_arguments)
{
	check_from_the_same_type<Multiply<A, B, C>, Multiply<A, B, C>>();
	check_from_the_same_type<Multiply<A, B, C>, Multiply<A, C, B>>();
	check_from_the_same_type<Multiply<A, B, C>, Multiply<B, A, C>>();
	check_from_the_same_type<Multiply<A, B, C>, Multiply<B, C, A>>();
	check_from_the_same_type<Multiply<A, B, C>, Multiply<C, A, B>>();
	check_from_the_same_type<Multiply<A, B, C>, Multiply<C, B, A>>();
	check_not_from_the_same_type<Multiply<A, B, C>, Multiply<A, B, D>>();
	check_not_from_the_same_type<Multiply<A, B, C>, Multiply<A, D, C>>();
	check_not_from_the_same_type<Multiply<A, B, C>, Multiply<D, B, C>>();
	check_not_from_the_same_type<Multiply<A, B, C>, Multiply<C, D, A>>();
	check_not_from_the_same_type<Multiply<A, B, C>, Multiply<A, D, E>>();
}

TEST_F(TestSameTypeValidator, same_type_with_multiply_inside_multiply)
{
	check_from_the_same_type<
		Multiply<A, B, C>,
		Multiply<A, Multiply<B, C>>>();
	check_from_the_same_type<
		Multiply<A, B, C>,
		Multiply<Multiply<A, B>, C>>();
	check_from_the_same_type<
		Multiply<A, B, C>,
		Multiply<Multiply<A, B, C>>>();
	check_not_from_the_same_type<
		Multiply<A, B, C>,
		Multiply<A, Multiply<B, D>>>();
	check_not_from_the_same_type<
		Multiply<A, B, C>,
		Multiply<Multiply<A, B>, D>>();
	check_not_from_the_same_type<
		Multiply<A, B, C>,
		Multiply<Multiply<A, B, D>>>();
}
