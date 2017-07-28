/*
 * tagging.h
 *
 *  Created on: Jul 12, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_TAGGING_H_
#define INCLUDE_TAGGING_H_

#include <units/internal/numeric_value.h>
#include <units/internal/tags.h>

namespace units
{

/*====== builders ====*/

template<class Unit, class... ActualTags>
struct tag_builder
{
	using tags = typename concatenate_tags<typename Unit::_tags, Tags<ActualTags...>>::type;
	using result = NumericValue<typename Unit::_scale, tags>;
};

template<class Unit, class... RemovedTags>
struct untag_builder
{
	using result = NumericValue<
		typename Unit::_scale,
		typename untag_calculate<typename Unit::_tags, RemovedTags...>::type>;
};

template<class Unit>
struct untag_all_builder
{
	using result = NumericValue<typename Unit::_scale>;
};

/*====== typedefs ====*/

template<class Unit, class... ActualTags>
using Tag = typename tag_builder<Unit, ActualTags...>::result;

template<class Unit, class... RemovedTags>
using Untag = typename untag_builder<Unit, RemovedTags...>::result;

template<class Unit>
using UntagAll = typename untag_all_builder<Unit>::result;

/*====== functions ====*/

template<class... ActualTags, class Unit>
auto tag(const Unit& unit)
{
	return Tag<Unit, ActualTags...>{unit.value()};
}

template<class... RemovedTags, class Unit>
auto untag(const Unit& unit)
{
	return Untag<Unit, RemovedTags...>{unit.value()};
}

template<class Unit>
auto untagAll(const Unit& unit)
{
	return UntagAll<Unit>{unit.value()};
}

}



#endif /* INCLUDE_TAGGING_H_ */
