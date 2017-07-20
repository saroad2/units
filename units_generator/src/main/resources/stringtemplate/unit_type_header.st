$declaration()$

#ifndef $unitType.headerIncludeGurad$
#define $unitType.headerIncludeGurad$

$unitType.includes:{header | $include(header)$}$
#include "tags/$unitType.tagsHeaderFileName$"

namespace units {
namespace $unitType.typeName$
{

$unitType.unitScales:{scale | $scale_class(scale)$}$

$unitType.unitScales:{scale | $scale_user_defined_literal(scale)$}$

}
}

#endif /* $unitType.headerIncludeGurad$ */
