/*
 * power_units.cc
 *
 *  Created on: Jul 4, 2017
 *      Author: sagis
 */

#include "force_units.h"

namespace units {
namespace force
{

using std::string;

string newtons_tag::singularName() {return "newton"; }
string newtons_tag::pluralName() {return "newtons"; }

string dynes_tag::singularName() {return "dyne"; }
string dynes_tag::pluralName() {return "dynes"; }

}
}
