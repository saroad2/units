package units_generator.cpp_generator;

import units_schema.UnitScale;

public class CppUnitScale {
	
	private double scale;
	private String singularName;
	private String pluralName;
	private String tagName;
	private String className;
	private String userDefinedLiteral;

	public double getScale() {
		return scale;
	}

	public String getSingularName() {
		return singularName;
	}

	public String getPluralName() {
		return pluralName;
	}
	
	public String getTagName() {
		return tagName;
	}
	
	public String getClassName() {
		return className;
	}
	
	public String getUserDefinedLiteral() {
		return userDefinedLiteral;
	}
	
	public CppUnitScale(UnitScale unitScale)
	{
		scale = unitScale.getScale();
		singularName = unitScale.getSingularName();
		pluralName = unitScale.getPluralName();
		tagName = (pluralName + "_tag").replaceAll(" ", "_");
		className = CppNamesFormatter.formatClassname(pluralName);
		userDefinedLiteral = pluralName.replaceAll(" ", "_");
	}
	
	public String toString() {
		return "{scale=" + scale +
				", singular_name=" + singularName +
				", plural_name=" + pluralName + "}";
	}
}
