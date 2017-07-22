package units_generator.cpp_generator;

import java.util.ArrayList;

import units_schema.UnitScale;
import units_schema.Multiplyer;

public class CppUnitScale {
	
	private CppUnitType unitType;
	private CppUnitScale numeratorScale;
	private CppUnitScale denumeratorScale;
	private boolean complex;
	private String scale;
	private boolean stringMultiplyer;
	private String singularName;
	private String pluralName;
	private String tagName;
	private String className;
	private String classDeclaration;
	private String userDefinedLiteral;
	
	public boolean isComplex() {
		return complex;
	}
	
	public String getScale() {
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
	
	public String getClassDeclaration() {
		return classDeclaration;
	}
	
	public String getUserDefinedLiteral() {
		return userDefinedLiteral;
	}
	
	public boolean isStringMultiplyer() {
		return stringMultiplyer;
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

	private void initiazlizeComplex(
			UnitScale unitScale) {
		if(unitScale.getRatio() != null){
			complex = true;
			numeratorScale = 
				UnitsRepository.getInstance().getScale(unitScale.getRatio().getNumerator());
			denumeratorScale =
				UnitsRepository.getInstance().getScale(unitScale.getRatio().getDenumerator());
		}
		else {
			complex = false;
		}
	}

	private void initializeBasicScale(UnitScale unitScale) {
		initializeScale(unitScale);
		singularName = unitScale.getSingularName();
		pluralName = unitScale.getPluralName();
		tagName = (pluralName + "_tag").replaceAll(" ", "_");
		className = CppNamesFormatter.formatClassname(pluralName.replaceAll(" ", "_"));
		classDeclaration = "NumericValue<tags::" + tagName + ", tags::" + unitType.getTagName() + ">";
		userDefinedLiteral = pluralName.replaceAll(" ", "_");
	}

	private void initializeScale(UnitScale unitScale) {
		stringMultiplyer = false;
		if (unitScale.getIsBasic()) {
			scale = "1";
			return;
		}
		if (unitScale.getMultiplyerNumber() != null) {
			scale = Double.toString(unitScale.getMultiplyerNumber());
		}
		if (unitScale.getMultiplyerString() != null) {
			scale = unitScale.getMultiplyerString();
			stringMultiplyer = true;
		}
		if (unitScale.getRelativeTo() != null) {
			CppUnitScale relativeTo = UnitsRepository.getInstance().getScale(unitScale.getRelativeTo());
			scale += " * " + relativeTo.getTagName() + "::scale";
		}
		
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
