package units_generator.cpp_generator;

import java.util.ArrayList;

import units_schema.UnitScale;
import units_schema.UnitType;

import units_generator.CodeGetter;

public class CppUnitType {
	
	public static CodeGetter codeGetter = new CodeGetter();
	
	private String typeName;
	private int code;
	private String includeGurad;
	private ArrayList<String> includes;
	private ArrayList<CppUnitScale> unitScales;
	private String headerFileName;
	private String sourceFileName;

	public String getTypeName() {
		return typeName;
	}

	public int getCode() {
		return code;
	}
	
	public String getIncludeGurad() {
		return includeGurad;
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

	public String getSourceFileName() {
		return sourceFileName;
	}
	
	public CppUnitType(UnitType unitType) {
		typeName = unitType.getTypeName();
		code = codeGetter.getNextAndBump();
		includeGurad = "INCLUDE_" + typeName.toUpperCase() + "_UNITS_H_";
		unitScales = new ArrayList<CppUnitScale>();
		for (UnitScale unitScale : unitType.getUnitScales()) {
			unitScales.add(new CppUnitScale(unitScale));
		}
		initializeIncludes();
		headerFileName = typeName + "_units.h";
		sourceFileName = typeName + "_units.cc";
	}
	
	public void initializeIncludes()
	{
		includes = new ArrayList<>();
		includes.add("\"internal/numeric_value.h\"");
		includes.add("\"internal/utils.h\"");
		includes.add("<ratio>");
	}
	
	public String toString() {
		return "{type_name=" + typeName +
				", unit_scales=" + unitScales +"}";
	}
}
