package units_generator.cpp_generator;

import units_generator.internal.NamesManipulator;
import units_generator.internal.UnitScaleInterface;
import units_schema.UnitScale;

public class CppUnitScale implements UnitScaleInterface{
	
	private CppUnitType unitType;
	private String scale;
	private boolean stringMultiplyer;
	private String name;
	private String singularName;
	private String pluralName;
	private String tagName;
	private String typeCodeName;
	private String className;
	private String userDefinedLiteral;
	
	@Override
	public String getScale() {
		return scale;
	}

	public String getSingularName() {
		return singularName;
	}

	@Override
	public String getName() {
		return name;
	}
	
	public String getPluralName() {
		return pluralName;
	}
	
	public String getTagName() {
		return tagName;
	}
	
	public String getTypeCodeName() {
		return typeCodeName;
	}
	
	public String getClassName() {
		return className;
	}
	
	public String getUserDefinedLiteral() {
		return userDefinedLiteral;
	}
	
	public boolean isStringMultiplyer() {
		return stringMultiplyer;
	}
	
	public String getNamespace() {
		return unitType.getNamespace();
	}
	
	public CppUnitScale(
			UnitScale unitScale,
			CppUnitType _unitType)
	{
		unitType = _unitType;
		initializeScale(unitScale);
		initializeNames(unitScale);
		tagName = (name + "_tag").replaceAll(" ", "_");
		typeCodeName = unitType.getCodeName();
		className = CppNamesFormatter.formatClassname(name.replaceAll(" ", "_"));
		userDefinedLiteral = name.replaceAll(" ", "_");
	}

	private void initializeNames(UnitScale unitScale) {
		singularName = unitScale.getSingularName();
		pluralName = unitScale.getPluralName();
		name = NamesManipulator.getName(unitScale);
	}

	private void initializeScale(UnitScale unitScale) {
		CppScaleValueCalculator.Result result = CppScaleValueCalculator.calculate(unitScale);
		scale = result.scale;
		stringMultiplyer = result.isStringMultiplyer;
	}
	
	public String toString() {
		return "{scale=" + scale +
				", singular_name=" + singularName +
				", plural_name=" + pluralName + "}";
	}
}
