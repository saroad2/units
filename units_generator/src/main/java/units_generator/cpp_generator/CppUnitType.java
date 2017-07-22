package units_generator.cpp_generator;

import java.util.ArrayList;
import java.util.List;

import units_schema.UnitScale;
import units_schema.UnitType;

public class CppUnitType {
	
	private String typeName;
	private String namespace;
	private String tagName;
	private List<String> tagIncludes;
	private List<String> unitIncludes;
	private String code;
	private String headerIncludeGurad;
	private String tagsHeaderIncludeGurad;
	private List<CppUnitScale> unitScales;
	private String headerFileName;
	private String tagsHeaderFileName;
	private String tagsSourceFileName;
	private boolean tagsOnly;

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

	public String getCode() {
		return code;
	}
	
	public String getHeaderIncludeGurad() {
		return headerIncludeGurad;
	}
	
	public String getTagsHeaderIncludeGurad() {
		return tagsHeaderIncludeGurad;
	}

	public List<CppUnitScale> getUnitScales() {
		return unitScales;
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
	
	public CppUnitType(UnitType unitType) {
		typeName = unitType.getTypeName();
		namespace = typeName.replaceAll(" " , "_") ; 
		tagName = namespace + "_tag";
		initializeIncludes();
		initializeCode(unitType);
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
	
	private void initializeCode(UnitType unitType) {
		CppTypeCodeCalculator.Result codeResult = CppTypeCodeCalculator.calculate(unitType);
		code = codeResult.code;
		tagIncludes.addAll(codeResult.tagIncludes);
		unitIncludes.addAll(codeResult.unitIncludes);
	}

	private void initializeScales(UnitType unitType) {
		unitScales = new ArrayList<CppUnitScale>();
		hasMultiplyers = false;
		for (UnitScale unitScale : unitType.getUnitScales()) {
			addScale(unitScale);
		}
	}

	private void addScale(UnitScale unitScale) {
		CppUnitScale scale = new CppUnitScale(unitScale, this);
		if (scale.isStringMultiplyer() && !hasMultiplyers) {
			tagIncludes.add("\"internal/multiplyer_scales.h\"");
			hasMultiplyers = true;
		}
		addToUnitScales(scale);
	}

	private void addToUnitScales(CppUnitScale scale) {
		unitScales.add(scale);
		UnitsRepository.getInstance().addScale(scale);
	}
	
	public String toString() {
		return "{type_name=" + typeName +
				", unit_scales=" + unitScales +"}";
	}
}
