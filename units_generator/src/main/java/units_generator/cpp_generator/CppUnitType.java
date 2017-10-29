package units_generator.cpp_generator;

import java.util.ArrayList;
import java.util.List;

import units_generator.internal.NamesManipulator;
import units_generator.internal.UnitScaleInterface;
import units_generator.internal.UnitTypeInterface;
import units_schema.UnitScale;
import units_schema.UnitType;

public class CppUnitType implements UnitTypeInterface{
	
	private CppSchema schema;
	private String typeName;
	private String upperCaseName;
	private String namespace;
	private String codeName;
	private List<String> tagIncludes;
	private List<String> unitIncludes;
	private String code;
	private String headerIncludeGurad;
	private String tagsHeaderIncludeGurad;
	private List<UnitScaleInterface> unitScales;
	private String headerFileName;
	private String tagsHeaderFileName;
	private String tagsSourceFileName;
	private boolean tagsOnly;

	private boolean hasMultipliers;

	private static CppSupportChecker supportChecker = new CppSupportChecker();

	@Override
	public String getTypeName() {
		return typeName;
	}

	public String getUpperCaseName() {
		return upperCaseName;
	}

	public String getNamespace() {
		return namespace;
	}

	public String getCodeName() {
		return codeName;
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

	@Override
	public List<UnitScaleInterface> getUnitScales() {
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
	
	public CppUnitType(CppSchema schema, UnitType unitType) {
		this.schema = schema;
		typeName = NamesManipulator.getName(unitType);
		namespace = CppNamesFormatter.formatNamespaceName(typeName); 
		upperCaseName = namespace.toUpperCase();
		codeName = CppNamesFormatter.formatCodeName(typeName);
		initializeIncludes();
		initializeCode(unitType);
		headerIncludeGurad = "INCLUDE_" + namespace.toUpperCase() + "_UNITS_H_";
		tagsHeaderIncludeGurad = "INCLUDE_" + namespace.toUpperCase() + "_TAGS_H_";
		initializeScales(unitType);
		headerFileName = CppNamesFormatter.formatUnitTypeHeaderName(typeName);
		tagsHeaderFileName = namespace + "_tags.h";
		tagsSourceFileName = namespace + "_tags.cc";
		tagsOnly = unitType.getTagsOnly();
	}
	
	private void initializeIncludes()
	{
		initializeUnitIncludes();
		initializeTagIncludes();
	}

	private void initializeUnitIncludes() {
		unitIncludes = new ArrayList<>();
		unitIncludes.add("<units/internal/numeric_value.h>");
		unitIncludes.add("<units/internal/utils.h>");
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
		unitScales = new ArrayList<UnitScaleInterface>();
		hasMultipliers = false;
		for (UnitScale unitScale : unitType.getUnitScales()) {
			if (!supportChecker.isSupported(unitScale))
				continue;
			addScale(unitScale);
		}
	}

	private void addScale(UnitScale unitScale) {
		CppUnitScale scale = new CppUnitScale(schema, typeName, unitScale);
		if (scale.isStringMultiplier() && !hasMultipliers) {
			tagIncludes.add("<units/internal/multiplier_scales.h>");
			hasMultipliers = true;
		}
		addToUnitScales(scale);
	}

	private void addToUnitScales(CppUnitScale scale) {
		unitScales.add(scale);
	}
	
	public String toString() {
		return "{type_name=" + typeName +
				", unit_scales=" + unitScales +"}";
	}
}
