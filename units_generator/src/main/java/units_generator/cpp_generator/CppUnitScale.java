package units_generator.cpp_generator;

import java.util.ArrayList;
import java.util.List;

import units_generator.internal.NamesManipulator;
import units_generator.internal.UnitScaleInterface;
import units_schema.UnitScale;

public class CppUnitScale implements UnitScaleInterface{

	private CppSchema schema;
	private String scale;
	private boolean stringMultiplyer;
	private String namespace;
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
		return namespace;
	}
	
	public CppUnitScale(
			CppSchema schema,
			String unitTypeName,
			UnitScale unitScale)
	{
		this.schema = schema;
		initializeScale(unitScale);
		initializeNames(unitScale);
		tagName = CppNamesFormatter.formatTagName(name);
		namespace = CppNamesFormatter.formatNamespaceName(unitTypeName);
		typeCodeName = CppNamesFormatter.formatCodeName(unitTypeName);
		className = CppNamesFormatter.formatClassName(name);
		userDefinedLiteral = CppNamesFormatter.toLowerUnderscore(name);
	}

	private void initializeNames(UnitScale unitScale) {
		singularName = unitScale.getSingularName();
		pluralName = unitScale.getPluralName();
		name = NamesManipulator.getName(unitScale);
	}

	private void initializeScale(UnitScale unitScale) {
		if (unitScale.getIsBasic()) {
			initializeBasicScale();
			return;
		}
		if(unitScale.getRatio() != null) {
			initializeRatioScale(unitScale);
			return;
		}
		initializeRelativeScale(unitScale);
	}
	
	public void initializeBasicScale() {
		scale = "1";
		stringMultiplyer = false;
	}
	
	public void initializeRatioScale(UnitScale unitScale) {
		List<String> numerators = unitScale.getRatio().getNumerators();
		List<String> denumerators = unitScale.getRatio().getDenumerators();

		scale = getScaleFromNumeratorsAndDenumerators(numerators, denumerators);
		stringMultiplyer = false;
	}
	

	private String getScaleFromNumeratorsAndDenumerators(
			List<String> numerators,
			List<String> denumerators) {
		if (numerators.size() == 0)
			return getInverseScale(denumerators);
		if (denumerators.size() == 0)
			return toTag(numerators) + "::scale";
		return getRatioScale(numerators, denumerators);
	}

	private String toTag(List<String> unitScalenames) {
		List<String> tagsList = new ArrayList<String>();
		for (String unitScaleName : unitScalenames) {
			String unitTypeName = schema.getUnitTypeOfScale(unitScaleName);
			tagsList.add(
				CppNamesFormatter.formatNamespaceName(unitTypeName) +
				"::tags::" +
				CppNamesFormatter.formatTagName(unitScaleName));
		}
		return combineTags(tagsList);
	}
	
	private String combineTags(List<String> tags) {
		if (tags.size() == 0)
			return "";
		if (tags.size() == 1)
			return tags.get(0);
		return "multiply_scale_tag<" + String.join(", ", tags) + ">";
	}
	
	private String getInverseScale(List<String> denumerators) {
		return "inverse_scale_tag<" + toTag(denumerators) + ">::scale";
	}
	
	private String getRatioScale(List<String> numerators, List<String> denumerators) {
		String result = "";
		boolean addTabs = numerators.size() >= 2 || denumerators.size() >= 2;
		result += "ratio_scale_tag<"; 
		if (addTabs)
			result += "\n\t\t";
		result += toTag(numerators) + ", " ;
		if (addTabs)
			result += "\n\t\t";
		result += toTag(denumerators) + ">::scale";
		return result;
	}
	
	private void initializeRelativeScale(UnitScale unitScale) {
		String relativeToTagName = CppNamesFormatter.formatTagName(unitScale.getRelativeTo());
		if (unitScale.getMultiplyerNumber() != null) {
			scale = unitScale.getMultiplyerNumber() + 
					" * " + relativeToTagName + "::scale";
			stringMultiplyer = false;
			return;
		}
		scale = "multiplyBy<std::" +
				unitScale.getMultiplyerString() +
				">(" + relativeToTagName + "::scale)";
		stringMultiplyer = true;
	}
	
	public String toString() {
		return "{scale=" + scale +
				", singular_name=" + singularName +
				", plural_name=" + pluralName + "}";
	}
}
