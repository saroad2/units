/*
 * tagging.h
 *
 *  Created on: Jul 12, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_TAGGING_H_
#define INCLUDE_TAGGING_H_

#include "units/include/internal/tags.h"
#include "units/include/internal/numeric_value.h"

namespace units
{

template<class Unit, class... ActualTags>
using Tag = NumericValue<
		typename Unit::_scale,
		typename Unit::_type,
		ConcatenateTags<typename Unit::_tags, Tags<ActualTags...>>>;

template<class Unit, class... RemovedTags>
using Untag = NumericValue<
		typename Unit::_scale,
		typename Unit::_type,
		typename untag_calculate<typename Unit::_tags, RemovedTags...>::type>;

template<class Unit>
using UntagAll = NumericValue<
		typename Unit::_scale,
		typename Unit::_type>;

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
