/*
 * tagging_internals.h
 *
 *  Created on: Jul 12, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_INTERNAL_TAGS_H_
#define INCLUDE_INTERNAL_TAGS_H_

#include <type_traits>

namespace units
{

/*============= Contains =============*/

template<class CheckedTag, class... OtherTags>
struct contains
{
	constexpr static bool value = false;
};

template<class CheckedTag, class FirstTag, class... OtherTags>
struct contains<CheckedTag, FirstTag, OtherTags...>
{
	constexpr static bool value =
			std::is_same<CheckedTag, FirstTag>::value or contains<CheckedTag, OtherTags...>::value;
};

/*============= TagsClass =============*/
template<class... ActualTags>
struct Tags
{
};

/*============= Concatenate Tags =============*/

template<class Tags1, class Tags2>
struct concatenate_tags{};

template<class... ActualTags1, class... ActualTags2>
struct concatenate_tags<Tags<ActualTags1...>, Tags<ActualTags2...>>
{
	using type = Tags<ActualTags1..., ActualTags2...>;
};

template<class TagsTuple1, class TagsTuple2>
using ConcatenateTags = typename concatenate_tags<TagsTuple1, TagsTuple2>::type;

/*============= has_tag =============*/

template<class Unit, class Tag>
struct has_tag
{
	constexpr static bool value = has_tag<typename Unit::_tags, Tag>::value;
};

template<class... ActualTags, class Tag>
struct has_tag<Tags<ActualTags...>, Tag>
{
	constexpr static bool value = contains<Tag, ActualTags...>::value;
};

}

#endif /* INCLUDE_INTERNAL_TAGS_H_ */
