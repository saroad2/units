/*
 * duration_units.cc
 *
 *  Created on: Jun 29, 2017
 *      Author: sagis
 */
#include "units/include/duration_units.h"

namespace units {
namespace duration
{

using std::string;

string seconds_tag::singularName() {return "second";}
string seconds_tag::pluralName() {return "seconds";}

string minutes_tag::singularName() {return "minute";}
string minutes_tag::pluralName() {return "minutes";}

string hours_tag::singularName() {return "hour";}
string hours_tag::pluralName() {return "hours";}

string days_tag::singularName() {return "day";}
string days_tag::pluralName() {return "days";}

string years_tag::singularName() {return "year";}
string years_tag::pluralName() {return "years";}

}
}
