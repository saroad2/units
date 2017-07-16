/*
 * speed_units.cc
 *
 *  Created on: Jul 1, 2017
 *      Author: sagis
 */

#include "speed_units.h"

namespace units {
namespace speed
{

using std::string;

string knots_tag::singularName() { return "knot"; }
string knots_tag::pluralName() { return "knots"; }

}
}
