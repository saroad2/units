/*
 * length_units.cc
 *
 *  Created on: Jun 24, 2017
 *      Author: sagis
 */

#include "units/include/length_units.h"

namespace units {
namespace length
{

using std::string;

string inches_tag::singularName() {return "inch";}
string inches_tag::pluralName() {return "inches";}

string feet_tag::singularName() {return "foot";}
string feet_tag::pluralName() {return "feet";}

string yards_tag::singularName() {return "yard";}
string yards_tag::pluralName() {return "yards";}

string meters_tag::singularName() {return "meter";}
string meters_tag::pluralName() {return "meters";}
}
}
