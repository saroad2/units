/*
 * length_units.h
 *
 *  Created on: Jun 24, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_LENGTH_UNITS_H_
#define INCLUDE_LENGTH_UNITS_H_

#include "units/include/numeric_value.h"

namespace units {
namespace length
{

struct yards_tag
{
	static std::string singularName();
	static std::string pluralName();
};

struct meters_tag
{
	static std::string singularName();
	static std::string pluralName();
};

using Yards = NumericValue<yards_tag>;
using Meters = NumericValue<meters_tag>;

}
}

#endif /* INCLUDE_LENGTH_UNITS_H_ */
