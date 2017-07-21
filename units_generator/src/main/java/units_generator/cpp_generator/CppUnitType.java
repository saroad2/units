package units_generator.cpp_generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import units_schema.UnitScale;
import units_schema.UnitType;

import units_generator.CodeGetter;

public class CppUnitType {
	
	public static CodeGetter codeGetter = new CodeGetter();
	
	private String typeName;
	private String namespace;
	private String tagName;
	private List<String> tagIncludes;
	private List<String> unitIncludes;
	private CppUnitType numeratorType;
	private CppUnitType denumeratorType;
	private String code;
	private String headerIncludeGurad;
	private String tagsHeaderIncludeGurad;
	private List<CppUnitScale> basicScales;
	private List<CppUnitScale> unitScales;
	private Map<String, CppUnitScale> nameToScale;
	private String headerFileName;
	private String tagsHeaderFileName;
	private String tagsSourceFileName;
	private boolean tagsOnly;

	private boolean isRatio;
	private boolean hasMultiplyers;

	public String getTypeName() {
		return typeName;
	}

	public String getNamespace() {
		return namespace;
	}

	public String getTagName() {
		return tagName;
	}
	
	public List<String> getTagIncludes() {
		return tagIncludes;
	}
	
	public List<String> getUnitIncludes() {
		return unitIncludes;
	}
	
	public CppUnitType getNumeratorType() {
		return numeratorType;
	}
	
	public CppUnitType getDenumeratorType() {
		return denumeratorType;
	}

	public String getCode() {
		return code;
	}
	
	public String getHeaderIncludeGurad() {
		return headerIncludeGurad;
	}
	
	public String getTagsHeaderIncludeGurad() {
		return tagsHeaderIncludeGurad;
	}

	public List<CppUnitScale> getBasicScales() {
		return basicScales;
	}

	public List<CppUnitScale> getUnitScales() {
		return unitScales;
	}

	public Map<String, CppUnitScale> getNameToScale() {
		return nameToScale;
	}
	
	public String getHeaderFileName() {
		return headerFileName;
	}
	
	public String getTagsHeaderFileName() {
		return tagsHeaderFileName;
	}

	public String getTagsSourceFileName() {
		return tagsSourceFileName;
	}
	
	public boolean isTagsOnly() {
		return tagsOnly;
	}
	
	public CppUnitType(UnitType unitType, Map<String, CppUnitType> nameToUnitType) {
		typeName = unitType.getTypeName();
		namespace = typeName.replaceAll(" " , "_") ; 
		tagName = namespace + "_tag";
		initializeIncludes();
		initializeRatio(unitType, nameToUnitType);
		initializeCode();
		headerIncludeGurad = "INCLUDE_" + typeName.toUpperCase() + "_UNITS_H_";
		tagsHeaderIncludeGurad = "INCLUDE_" + typeName.toUpperCase() + "_TAGS_H_";
		initializeScales(unitType);
		headerFileName = typeName + "_units.h";
		tagsHeaderFileName = typeName + "_tags.h";
		tagsSourceFileName = typeName + "_tags.cc";
		tagsOnly = unitType.getTagsOnly();
	}
	
	private void initializeIncludes()
	{
		initializeUnitIncludes();
		initializeTagIncludes();
	}

	private void initializeUnitIncludes() {
		unitIncludes = new ArrayList<>();
		unitIncludes.add("\"internal/numeric_value.h\"");
		unitIncludes.add("\"internal/utils.h\"");
	}

	private void initializeTagIncludes() {
		tagIncludes = new ArrayList<>();
		tagIncludes.add("<ratio>");
		tagIncludes.add("<string>");
	}
	
	private void initializeRatio(
			UnitType unitType,
			Map<String, CppUnitType> nameToUnitType) {
		if (unitType.getRatio() == null) {
			isRatio = false;
		}
		else {
			isRatio = true;
			numeratorType = nameToUnitType.get(unitType.getRatio().getNumerator());
			denumeratorType = nameToUnitType.get(unitType.getRatio().getDenumerator());
		}		
	}
	
	private void initializeCode() {
		if (isRatio) {
			initialieRatioCode();
		}
		else {
			initializeBasicCode();
		}
			
	}

	private void initializeBasicCode() {
		code = "std::ratio<" + Integer.toString(codeGetter.getNextAndBump()) + ", 1>";
	}

	private void initialieRatioCode() {
		code = "ratio_type_tag<" +
				numeratorType.getNamespace() + "::tags::" + numeratorType.getTagName() + ", " +
				denumeratorType.getNamespace() + "::tags::" + denumeratorType.getTagName()  + ">::code";
		tagIncludes.add("\"internal/units_ratio_type.h\"");
		tagIncludes.add("\"" + numeratorType.getTagsHeaderFileName() + "\"");
		tagIncludes.add("\"" + denumeratorType.getTagsHeaderFileName() + "\"");
		unitIncludes.add("\"" + numeratorType.getHeaderFileName() + "\"");
		unitIncludes.add("\"" + denumeratorType.getHeaderFileName() + "\"");
	}

	private void initializeScales(UnitType unitType) {
		basicScales = new ArrayList<CppUnitScale>();
		unitScales = new ArrayList<CppUnitScale>();
		hasMultiplyers = false;
		nameToScale = new HashMap<String, CppUnitScale>();
		for (UnitScale unitScale : unitType.getUnitScales()) {
			addScale(unitScale);
		}
	}

	private void addScale(UnitScale unitScale) {
		CppUnitScale scale = new CppUnitScale(unitScale, this); 
		if (!scale.isComplex()) {
			basicScales.add(scale);
		}
		addToUnitScales(scale);
		if (scale.hasMultiplyers()) {
			addMultiplyers(scale);
		}
	}

	private void addMultiplyers(CppUnitScale scale) {
		if (!hasMultiplyers) {
			unitIncludes.add("\"internal/multiplyer_scales.h\"");
			hasMultiplyers = true;
		}
		for (CppUnitScale multiplyerScale : scale.getMultiplyers()) {
			addToUnitScales(multiplyerScale);
		}
	}

	private void addToUnitScales(CppUnitScale scale) {
		unitScales.add(scale);
		nameToScale.put(scale.getPluralName(), scale);
	}
	
	public String toString() {
		return "{type_name=" + typeName +
				", unit_scales=" + unitScales +"}";
	}
}
