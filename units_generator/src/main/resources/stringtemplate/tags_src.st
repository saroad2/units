$declaration()$

#include "tags/$unitType.tagsHeaderFileName$"

namespace units {
namespace $unitType.typeName$ {
namespace tags
{

using std::string;

$unitType.unitScales:{scale | $scale_names_declerations(scale)$}$

}
} 
}