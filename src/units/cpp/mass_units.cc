/*
 * mass_units.cc
 *
 *  Created on: Jul 1, 2017
 *      Author: sagis
 */

#include "mass_units.h"

namespace units {
namespace mass
{

using std::string;

string grams_tag::singularName() { return "gram"; }
string grams_tag::pluralName() { return "grams"; }

string pounds_tag::singularName() { return "pound"; }
string pounds_tag::pluralName() { return "pounds"; }

string tonnes_tag::singularName() { return "tonne"; }
string tonnes_tag::pluralName() { return "tonnes"; }

}
}

