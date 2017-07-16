/*
 * angle_units.cc
 *
 *  Created on: Jun 28, 2017
 *      Author: sagis
 */

#include "angle_units.h"

using namespace units::angle;
using std::string;

string mil_tag::singularName() {return "mil";}
string mil_tag::pluralName() {return "mils";}

string degrees_tag::singularName() {return "degree";}
string degrees_tag::pluralName() {return "degrees";}

string radians_tag::singularName() {return "radian";}
string radians_tag::pluralName() {return "radians";}
