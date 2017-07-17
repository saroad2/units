$declaration()$

#ifndef $unitType.includeGurad$
#define $unitType.includeGurad$

$unitType.includes:{header | $include(header)$}$

namespace units {
namespace $unitType.typeName$
{

struct $unitType.typeName$_tag { using code = std::ratio<$unitType.code$, 1>; };

$unitType.unitScales:{scale | $scale_tag(scale)$}$

$unitType.unitScales:{scale | $scale_class(scale)$}$

$unitType.unitScales:{scale | $scale_user_defined_literal(scale)$}$

}
}

#endif /* $unitType.includeGurad$ */
