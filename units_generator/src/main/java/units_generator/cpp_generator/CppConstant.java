package units_generator.cpp_generator;

import java.util.HashSet;
import java.util.Set;

import units_generator.internal.ConstantInterface;
import units_schema.Constant;

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
		if (constant.getUnitScale() == null) {
			this.unitScale = "double";
			return;
		}
		CppUnitType unitType = (CppUnitType)schema.getUnitTypeOfScale(constant.getUnitScale());		
		unitScale = unitType.getNamespace() + "::" + CppNamesFormatter.formatClassName(constant.getUnitScale());
		includeNeeded.add("units/" + unitType.getHeaderFileName());
	}
	
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
