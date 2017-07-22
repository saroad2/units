/*
 * area_units.cc
 *
 *  Created on: Jun 30, 2017
 *      Author: sagis
 */

#include "volume_units.h"

namespace units {
namespace volume
{
using std::string;

string liters_scale_tag::singularName() { return "liter";}
string liters_scale_tag::pluralName() { return "liters";}

string milliliters_scale_tag::singularName() { return "milliliter";}
string milliliters_scale_tag::pluralName() { return "milliliters";}

}
}
