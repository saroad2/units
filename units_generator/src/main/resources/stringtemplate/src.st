$declaration()$

#include "$unitType.headerFileName$"

namespace units {
namespace $unitType.typeName$
{

using std::string;

$unitType.unitScales:{scale | $scale_names_declerations(scale)$}$
} 
}