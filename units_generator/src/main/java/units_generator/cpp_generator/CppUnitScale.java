package units_generator.cpp_generator;

import java.util.ArrayList;

import units_generator.cpp_generator.CppMultiplyer;
import units_schema.UnitScale;
import units_schema.Multiplyer;

public class CppUnitScale {
	
	private double scale;
	private String singularName;
	private String pluralName;
	private String tagName;
	private String className;
	private String userDefinedLiteral;
	private ArrayList<CppMultiplyer> multiplyers;

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
	
	public ArrayList<CppMultiplyer> getMultiplyers() {
		return multiplyers;
	}
	
	public CppUnitScale(UnitScale unitScale)
	{
		scale = unitScale.getScale();
		singularName = unitScale.getSingularName();
		pluralName = unitScale.getPluralName();
		tagName = (pluralName + "_tag").replaceAll(" ", "_");
		className = CppNamesFormatter.formatClassname(pluralName);
		userDefinedLiteral = pluralName.replaceAll(" ", "_");
		multiplyers = new ArrayList<CppMultiplyer>();
		for (Multiplyer multiplyer : unitScale.getMultiplyers())
			multiplyers.add(new CppMultiplyer(multiplyer));
	}
	
	public boolean hasMultiplyers() {
		return !multiplyers.isEmpty();
	}
	
	public String toString() {
		return "{scale=" + scale +
				", singular_name=" + singularName +
				", plural_name=" + pluralName + "}";
	}
}
