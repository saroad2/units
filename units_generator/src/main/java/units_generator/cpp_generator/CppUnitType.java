package units_generator.cpp_generator;

import java.util.ArrayList;

import units_schema.UnitScale;
import units_schema.UnitType;

import units_generator.CodeGetter;

public class CppUnitType {
	
	public static CodeGetter codeGetter = new CodeGetter();
	
	private String typeName;
	private int code;
	private String headerIncludeGurad;
	private String tagsHeaderIncludeGurad;
	private ArrayList<String> includes;
	private ArrayList<CppUnitScale> unitScales;
	private String headerFileName;
	private String tagsHeaderFileName;
	private String tagsSourceFileName;
	private boolean tagsOnly;

	private boolean hasMultiplyers;

	public String getTypeName() {
		return typeName;
	}

	public int getCode() {
		return code;
	}
	
	public String getHeaderIncludeGurad() {
		return headerIncludeGurad;
	}
	
	public String getTagsHeaderIncludeGurad() {
		return tagsHeaderIncludeGurad;
	}
	
	public ArrayList<String> getIncludes() {
		return includes;
	}

	public ArrayList<CppUnitScale> getUnitScales() {
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
		code = codeGetter.getNextAndBump();
		headerIncludeGurad = "INCLUDE_" + typeName.toUpperCase() + "_UNITS_H_";
		tagsHeaderIncludeGurad = "INCLUDE_" + typeName.toUpperCase() + "_TAGS_H_";
		unitScales = new ArrayList<CppUnitScale>();
		initializeIncludes();
		addScales(unitType);
		headerFileName = typeName + "_units.h";
		tagsHeaderFileName = typeName + "_tags.h";
		tagsSourceFileName = typeName + "_tags.cc";
		tagsOnly = unitType.getTagsOnly();
	}
	
	public void initializeIncludes()
	{
		includes = new ArrayList<>();
		includes.add("\"internal/numeric_value.h\"");
		includes.add("\"internal/utils.h\"");
	}

	private void addScales(UnitType unitType) {
		hasMultiplyers = false;
		for (UnitScale unitScale : unitType.getUnitScales()) {
			addScale(unitScale);
		}
	}

	private void addScale(UnitScale unitScale) {
		CppUnitScale scale = new CppUnitScale(unitScale); 
		unitScales.add(scale);
		if (scale.hasMultiplyers() && !hasMultiplyers) {
			includes.add("\"internal/multiplyer_scales.h\"");
			hasMultiplyers = true;
		}
	}
	
	public String toString() {
		return "{type_name=" + typeName +
				", unit_scales=" + unitScales +"}";
	}
}
