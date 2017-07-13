/*
 * test_tagging.cc
 *
 *  Created on: Jul 12, 2017
 *      Author: sagis
 */

#include "units/include/tagging.h"

#include "units/include/units_cast.h"
#include "units/include/units_ratio.h"
#include "units/include/units_multiply.h"
#include "units/include/units_pow.h"

#include "units/include/length_units.h"
#include "units/include/duration_units.h"
#include "units/include/speed_units.h"
#include "units/include/area_units.h"

#include <gtest/gtest.h>

using namespace units;
using namespace units::length;
using namespace units::duration;
using namespace units::speed;
using namespace units::area;
using namespace testing;

struct tag1{};
struct tag2{};
struct tag3{};

TEST(TestTagging, test_class_tagging_with_one_tag)
{
	using TaggedMeters = Tag<Meters, tag1>;
	bool hasTag1 = has_tag<TaggedMeters, tag1>::value;
	bool hasTag2 = has_tag<TaggedMeters, tag2>::value;
	bool hasTag3 = has_tag<TaggedMeters, tag3>::value;
	EXPECT_TRUE(hasTag1);
	EXPECT_FALSE(hasTag2);
	EXPECT_FALSE(hasTag3);
}

TEST(TestTagging, test_class_tagging_with_two_tags)
{
	using TaggedMeters = Tag<Meters, tag1, tag2>;
	bool hasTag1 = has_tag<TaggedMeters, tag1>::value;
	bool hasTag2 = has_tag<TaggedMeters, tag2>::value;
	bool hasTag3 = has_tag<TaggedMeters, tag3>::value;
	EXPECT_TRUE(hasTag1);
	EXPECT_TRUE(hasTag2);
	EXPECT_FALSE(hasTag3);
}

TEST(TestTagging, test_class_tagging_with_the_same_tag_twice)
{
	using TaggedMeters = Tag<Meters, tag1, tag1>;
	bool hasTag1 = has_tag<TaggedMeters, tag1>::value;
	bool hasTag2 = has_tag<TaggedMeters, tag2>::value;
	bool hasTag3 = has_tag<TaggedMeters, tag3>::value;
	EXPECT_TRUE(hasTag1);
	EXPECT_FALSE(hasTag2);
	EXPECT_FALSE(hasTag3);
}

TEST(TestTagging, test_class_tagging_twice)
{
	using TaggedMeters1 = Tag<Meters, tag1>;
	using TaggedMeters2 = Tag<TaggedMeters1, tag2>;
	bool hasTag1 = has_tag<TaggedMeters2, tag1>::value;
	bool hasTag2 = has_tag<TaggedMeters2, tag2>::value;
	bool hasTag3 = has_tag<TaggedMeters2, tag3>::value;
	EXPECT_TRUE(hasTag1);
	EXPECT_TRUE(hasTag2);
	EXPECT_FALSE(hasTag3);
}

TEST(TestTagging, test_object_tagging_with_one_tag)
{
	Meters m{3};
	auto tm = tag<tag1>(m);
	EXPECT_TRUE(tm.hasTag<tag1>());
	EXPECT_FALSE(tm.hasTag<tag2>());
	EXPECT_FALSE(tm.hasTag<tag3>());
}

TEST(TestTagging, test_object_tagging_with_two_tags)
{
	Meters m{3};
	auto tm = tag<tag1, tag2>(m);
	EXPECT_TRUE(tm.hasTag<tag1>());
	EXPECT_TRUE(tm.hasTag<tag2>());
	EXPECT_FALSE(tm.hasTag<tag3>());
}

TEST(TestTagging, test_object_tagging_with_the_same_tag_twice)
{
	Meters m{3};
	auto tm = tag<tag1, tag1>(m);
	EXPECT_TRUE(tm.hasTag<tag1>());
	EXPECT_FALSE(tm.hasTag<tag2>());
	EXPECT_FALSE(tm.hasTag<tag3>());
}

TEST(TestTagging, test_object_tagging_twice)
{
	Meters m{3};
	auto tm1 = tag<tag1>(m);
	auto tm2 = tag<tag2>(tm1);
	EXPECT_TRUE(tm2.hasTag<tag1>());
	EXPECT_TRUE(tm2.hasTag<tag2>());
	EXPECT_FALSE(tm2.hasTag<tag3>());
}

TEST(TestTagging, test_units_cast_takes_only_tags_from_destination_unit)
{
	using TaggedMeters = Tag<Meters, tag1>;
	using TaggedYards = Tag<Meters, tag2>;
	Meters m{4};
	TaggedMeters tm{3};

	EXPECT_FALSE(units_cast<Yards>(m).hasTag<tag1>());
	EXPECT_FALSE(units_cast<Yards>(m).hasTag<tag2>());
	EXPECT_FALSE(units_cast<Yards>(m).hasTag<tag3>());

	EXPECT_FALSE(units_cast<Yards>(tm).hasTag<tag1>());
	EXPECT_FALSE(units_cast<Yards>(tm).hasTag<tag2>());
	EXPECT_FALSE(units_cast<Yards>(tm).hasTag<tag3>());

	EXPECT_FALSE(units_cast<TaggedYards>(m).hasTag<tag1>());
	EXPECT_TRUE(units_cast<TaggedYards>(m).hasTag<tag2>());
	EXPECT_FALSE(units_cast<TaggedYards>(m).hasTag<tag3>());

	EXPECT_FALSE(units_cast<TaggedYards>(tm).hasTag<tag1>());
	EXPECT_TRUE(units_cast<TaggedYards>(tm).hasTag<tag2>());
	EXPECT_FALSE(units_cast<TaggedYards>(tm).hasTag<tag3>());
}

TEST(TestTagging, test_units_ratio_takes_only_tags_from_destination_unit)
{
	using TaggedMeters = Tag<Meters, tag1>;
	using TaggedSeconds = Tag<Seconds, tag2>;
	using TaggedMetersPerSecond = Tag<MetersPerSecond, tag3>;
	Meters m{4};
	TaggedMeters tm{3};
	Seconds s{5};
	TaggedSeconds ts{6};

	EXPECT_FALSE(units_ratio<MetersPerSecond>(m, s).hasTag<tag1>());
	EXPECT_FALSE(units_ratio<MetersPerSecond>(m, s).hasTag<tag2>());
	EXPECT_FALSE(units_ratio<MetersPerSecond>(m, s).hasTag<tag3>());

	EXPECT_FALSE(units_ratio<MetersPerSecond>(tm, s).hasTag<tag1>());
	EXPECT_FALSE(units_ratio<MetersPerSecond>(tm, s).hasTag<tag2>());
	EXPECT_FALSE(units_ratio<MetersPerSecond>(tm, s).hasTag<tag3>());

	EXPECT_FALSE(units_ratio<MetersPerSecond>(m, ts).hasTag<tag1>());
	EXPECT_FALSE(units_ratio<MetersPerSecond>(m, ts).hasTag<tag2>());
	EXPECT_FALSE(units_ratio<MetersPerSecond>(m, ts).hasTag<tag3>());

	EXPECT_FALSE(units_ratio<MetersPerSecond>(tm, ts).hasTag<tag1>());
	EXPECT_FALSE(units_ratio<MetersPerSecond>(tm, ts).hasTag<tag2>());
	EXPECT_FALSE(units_ratio<MetersPerSecond>(tm, ts).hasTag<tag3>());

	EXPECT_FALSE(units_ratio<TaggedMetersPerSecond>(m, s).hasTag<tag1>());
	EXPECT_FALSE(units_ratio<TaggedMetersPerSecond>(m, s).hasTag<tag2>());
	EXPECT_TRUE(units_ratio<TaggedMetersPerSecond>(m, s).hasTag<tag3>());

	EXPECT_FALSE(units_ratio<TaggedMetersPerSecond>(tm, s).hasTag<tag1>());
	EXPECT_FALSE(units_ratio<TaggedMetersPerSecond>(tm, s).hasTag<tag2>());
	EXPECT_TRUE(units_ratio<TaggedMetersPerSecond>(tm, s).hasTag<tag3>());

	EXPECT_FALSE(units_ratio<TaggedMetersPerSecond>(m, ts).hasTag<tag1>());
	EXPECT_FALSE(units_ratio<TaggedMetersPerSecond>(m, ts).hasTag<tag2>());
	EXPECT_TRUE(units_ratio<TaggedMetersPerSecond>(m, ts).hasTag<tag3>());

	EXPECT_FALSE(units_ratio<TaggedMetersPerSecond>(tm, ts).hasTag<tag1>());
	EXPECT_FALSE(units_ratio<TaggedMetersPerSecond>(tm, ts).hasTag<tag2>());
	EXPECT_TRUE(units_ratio<TaggedMetersPerSecond>(tm, ts).hasTag<tag3>());
}

TEST(TestTagging, test_units_multiply_takes_only_tags_from_destination_unit)
{
	using TaggedMeters1 = Tag<Meters, tag1>;
	using TaggedMeters2 = Tag<Meters, tag2>;
	using TaggedSquareMeters = Tag<SquareMeters, tag3>;
	Meters m1{4};
	Meters m2{5};
	TaggedMeters1 tm1{3};
	TaggedMeters2 tm2{6};

	EXPECT_FALSE(units_multiply<SquareMeters>(m1, m2).hasTag<tag1>());
	EXPECT_FALSE(units_multiply<SquareMeters>(m1, m2).hasTag<tag2>());
	EXPECT_FALSE(units_multiply<SquareMeters>(m1, m2).hasTag<tag3>());

	EXPECT_FALSE(units_multiply<SquareMeters>(tm1, m2).hasTag<tag1>());
	EXPECT_FALSE(units_multiply<SquareMeters>(tm1, m2).hasTag<tag2>());
	EXPECT_FALSE(units_multiply<SquareMeters>(tm1, m2).hasTag<tag3>());

	EXPECT_FALSE(units_multiply<SquareMeters>(m1, tm2).hasTag<tag1>());
	EXPECT_FALSE(units_multiply<SquareMeters>(m1, tm2).hasTag<tag2>());
	EXPECT_FALSE(units_multiply<SquareMeters>(m1, tm2).hasTag<tag3>());

	EXPECT_FALSE(units_multiply<SquareMeters>(tm1, tm2).hasTag<tag1>());
	EXPECT_FALSE(units_multiply<SquareMeters>(tm1, tm2).hasTag<tag2>());
	EXPECT_FALSE(units_multiply<SquareMeters>(tm1, tm2).hasTag<tag3>());

	EXPECT_FALSE(units_multiply<TaggedSquareMeters>(m1, m2).hasTag<tag1>());
	EXPECT_FALSE(units_multiply<TaggedSquareMeters>(m1, m2).hasTag<tag2>());
	EXPECT_TRUE(units_multiply<TaggedSquareMeters>(m1, m2).hasTag<tag3>());

	EXPECT_FALSE(units_multiply<TaggedSquareMeters>(tm1, m2).hasTag<tag1>());
	EXPECT_FALSE(units_multiply<TaggedSquareMeters>(tm1, m2).hasTag<tag2>());
	EXPECT_TRUE(units_multiply<TaggedSquareMeters>(tm1, m2).hasTag<tag3>());

	EXPECT_FALSE(units_multiply<TaggedSquareMeters>(m1, tm2).hasTag<tag1>());
	EXPECT_FALSE(units_multiply<TaggedSquareMeters>(m1, tm2).hasTag<tag2>());
	EXPECT_TRUE(units_multiply<TaggedSquareMeters>(m1, tm2).hasTag<tag3>());

	EXPECT_FALSE(units_multiply<TaggedSquareMeters>(tm1, tm2).hasTag<tag1>());
	EXPECT_FALSE(units_multiply<TaggedSquareMeters>(tm1, tm2).hasTag<tag2>());
	EXPECT_TRUE(units_multiply<TaggedSquareMeters>(tm1, tm2).hasTag<tag3>());
}

TEST(TestTagging, test_units_pow_keeps_tags)
{
	using TaggedMeters = Tag<Meters, tag1>;
	Meters m{4};
	TaggedMeters tm{5};

	EXPECT_FALSE(units_pow<2>(m).hasTag<tag1>());
	EXPECT_FALSE(units_pow<2>(m).hasTag<tag2>());
	EXPECT_FALSE(units_pow<2>(m).hasTag<tag3>());

	EXPECT_FALSE(units_pow<3>(m).hasTag<tag1>());
	EXPECT_FALSE(units_pow<3>(m).hasTag<tag2>());
	EXPECT_FALSE(units_pow<3>(m).hasTag<tag3>());

	EXPECT_TRUE(units_pow<2>(tm).hasTag<tag1>());
	EXPECT_FALSE(units_pow<2>(tm).hasTag<tag2>());
	EXPECT_FALSE(units_pow<2>(tm).hasTag<tag3>());

	EXPECT_TRUE(units_pow<3>(tm).hasTag<tag1>());
	EXPECT_FALSE(units_pow<3>(tm).hasTag<tag2>());
	EXPECT_FALSE(units_pow<3>(tm).hasTag<tag3>());
}
