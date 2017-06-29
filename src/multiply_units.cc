/*
 * multiply_units.cc
 *
 *  Created on: Jun 30, 2017
 *      Author: sagis
 */

#include "units/include/multiply_units.h"

namespace units {

using std::string;
string multiplySymbol{"*"};

string none_scale_tag::singularName() { return "";}
string none_scale_tag::pluralName() { return "";}

}
