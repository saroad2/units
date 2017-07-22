/*
 * energy_units.cc
 *
 *  Created on: Jul 5, 2017
 *      Author: sagis
 */

#include "energy_units.h"

namespace units {
namespace energy
{

using std::string;

string joules_tag::singularName() {return "joule"; }
string joules_tag::pluralName() {return "joules"; }

string kilojoules_tag::singularName() {return "kilojoule"; }
string kilojoules_tag::pluralName() {return "kilojoules"; }

string megajoules_tag::singularName() {return "megajoule"; }
string megajoules_tag::pluralName() {return "megajoules"; }
}
}
