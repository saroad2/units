$declaration()$

#ifndef $unitType.tagsHeaderIncludeGurad$
#define $unitType.tagsHeaderIncludeGurad$

#include <ratio>
#include <string>

namespace units {
namespace $unitType.typeName$ {
namespace tags
{

struct $unitType.typeName$_tag { using code = std::ratio<$unitType.code$, 1>; };

$unitType.unitScales:{scale | $scale_tag(scale)$}$

}
}
}

#endif /* $unitType.tagsHeaderIncludeGurad$ */