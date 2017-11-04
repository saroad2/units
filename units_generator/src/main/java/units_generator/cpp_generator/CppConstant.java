package units_generator.cpp_generator;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import units_generator.internal.ConstantInterface;
import units_schema.Constant;
import units_schema.Ratio;

public class CppConstant implements ConstantInterface {

	private String name;
	private String unitScale;
	private double value;
	private String description;
	private Set<String> includeNeeded;
	
	public CppConstant(CppSchema schema, Constant constant) {
		name = CppNamesFormatter.toLowerCamelCase(constant.getName());
		initializeUnitScaleAndIncludes(schema, constant);
		value = constant.getValue();
		description = constant.getDescription();
	}

	private void initializeUnitScaleAndIncludes(CppSchema schema, Constant constant) {
		includeNeeded = new HashSet<>();
		unitScale = "";
		if (constant.getUnitScale() != null) {
			insertUnitScale(schema, constant.getUnitScale());
			return;
		}
		if (constant.getRatio() != null) {
			initializeByRatio(schema, constant.getRatio());
			return;
		}			
		this.unitScale = "double";
	}

	private void insertUnitScale(CppSchema schema, String unitScale) {
		CppUnitType unitType = (CppUnitType)schema.getUnitTypeOfScale(unitScale);		
		this.unitScale += unitType.getNamespace() + "::" + CppNamesFormatter.formatClassName(unitScale);
		includeNeeded.add("units/" + unitType.getHeaderFileName());
	}

	private void initializeByRatio(CppSchema schema, Ratio ratio) {
		unitScale = "";
		if (ratio.getDenominators().size() != 0) {
			includeNeeded.add("units/internal/units_ratio_type.h");
			if (ratio.getNumerators().size() != 0)
				unitScale += "Ratio<\n\t";
			else
				unitScale += "Inverse<";
		}
		insertUnitScalesList(schema, ratio.getNumerators());
		if (ratio.getNumerators().size() != 0 && ratio.getDenominators().size() != 0)
			unitScale += ",\n\t";
		insertUnitScalesList(schema, ratio.getDenominators());
		if (ratio.getDenominators().size() != 0)
			unitScale += ">";
	}
	
	private void insertUnitScalesList(CppSchema schema, List<String> unitScalesList) {
		if (unitScalesList.size() == 0)
			return;
		if (unitScalesList.size() == 1) {
			insertUnitScale(schema, unitScalesList.get(0));
			return;
		}
		includeNeeded.add("units/internal/units_multiply_type.h");
		unitScale += "Multiply<";
		insertUnitScale(schema, unitScalesList.get(0));
		for (int i=1 ; i < unitScalesList.size(); ++i) {
			unitScale += ", ";
			insertUnitScale(schema, unitScalesList.get(i));
		}
		unitScale += ">";
	};
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getUnitScale() {
		return unitScale;
	}

	@Override
	public double getValue() {
		return value;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public Set<String> getIncludeNeeded() {
		return includeNeeded;
	}

}
