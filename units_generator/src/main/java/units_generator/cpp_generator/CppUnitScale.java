package units_generator.cpp_generator;

import java.util.ArrayList;

import units_schema.UnitScale;
import units_schema.Multiplyer;

public class CppUnitScale {
	
	private CppUnitType unitType;
	private CppUnitScale numeratorScale;
	private CppUnitScale denumeratorScale;
	private boolean complex;
	private String multiplyer;
	private String scale;
	private String relativeTo;
	private boolean relative;
	private String singularName;
	private String pluralName;
	private String tagName;
	private String className;
	private String classDeclaration;
	private String userDefinedLiteral;
	private ArrayList<CppUnitScale> multiplyers;
	
	public boolean isComplex() {
		return complex;
	}
	
	public String getScale() {
		return scale;
	}
	
	public String getRelativeTo() {
		return relativeTo;
	}

	public boolean isRelative() {
		return relative;
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
	
	public String getClassDeclaration() {
		return classDeclaration;
	}
	
	public String getUserDefinedLiteral() {
		return userDefinedLiteral;
	}
	
	public ArrayList<CppUnitScale> getMultiplyers() {
		return multiplyers;
	}
	
	public boolean hasMultiplyers() {
		return multiplyers != null && !multiplyers.isEmpty();
	}
	
	public CppUnitScale(
			UnitScale unitScale,
			CppUnitType _unitType)
	{
		unitType = _unitType;
		initiazlizeComplex(unitScale);
		if (!complex) {
			initializeBasicScale(unitScale);
		}
		else {
			initializeComplexScale(unitScale);
		}
	}
	
	public CppUnitScale(
			Multiplyer _multiplyer,
			CppUnitScale unitScale,
			CppUnitType _unitType)
	{
		unitType = _unitType;
		multiplyer = _multiplyer.toString();
		singularName = multiplyer + unitScale.getSingularName();
		pluralName = multiplyer + unitScale.getPluralName();
		className = CppNamesFormatter.formatClassname(pluralName.replaceAll(" ", "_"));
		classDeclaration = CppNamesFormatter.formatClassname(multiplyer) + "<" + unitScale.getClassName() + ">";
		userDefinedLiteral = pluralName.replaceAll(" ", "_");
	}

	private void initiazlizeComplex(
			UnitScale unitScale) {
		if(unitScale.getRatio() != null){
			complex = true;
			numeratorScale =
				unitType.getNumeratorType().getNameToScale().get(unitScale.getRatio().getNumerator());
			denumeratorScale =
				unitType.getDenumeratorType().getNameToScale().get(unitScale.getRatio().getDenumerator());
		}
		else {
			complex = false;
		}
	}

	private void initializeBasicScale(UnitScale unitScale) {
		scale = Double.toString(unitScale.getScale());
		relativeTo = unitScale.getRelativeTo();
		relative = relativeTo != "" && relativeTo != null;
		singularName = unitScale.getSingularName();
		pluralName = unitScale.getPluralName();
		tagName = (pluralName + "_tag").replaceAll(" ", "_");
		className = CppNamesFormatter.formatClassname(pluralName.replaceAll(" ", "_"));
		classDeclaration = "NumericValue<tags::" + tagName + ", tags::" + unitType.getTagName() + ">";
		userDefinedLiteral = pluralName.replaceAll(" ", "_");
		multiplyers = new ArrayList<CppUnitScale>();
		for (Multiplyer multiplyer : unitScale.getMultiplyers())
			multiplyers.add(new CppUnitScale(multiplyer, this, unitType));
	}

	private void initializeComplexScale(
			UnitScale unitScale) {
		singularName = numeratorScale.getSingularName() + " per " + denumeratorScale.getSingularName();
		pluralName = numeratorScale.getPluralName() + " per " + denumeratorScale.getSingularName();
		className = CppNamesFormatter.formatClassname(pluralName.replaceAll(" ", "_"));
		classDeclaration = "Ratio<" +
			numeratorScale.unitType.getNamespace() + "::" + numeratorScale.className + ", " +
			denumeratorScale.unitType.getNamespace() + "::" + denumeratorScale.className + ">";
		userDefinedLiteral = pluralName.replaceAll(" ", "_");
	}
	
	public String toString() {
		return "{scale=" + scale +
				", singular_name=" + singularName +
				", plural_name=" + pluralName + "}";
	}
}
