struct $scale.tagName$
{
$\t$static constexpr double scale = $scale.scale$$if(scale.relative)$ * $scale.relativeTo$_tag::scale$endif$;
$\t$static std::string singularName();
$\t$static std::string pluralName();
};$\n$