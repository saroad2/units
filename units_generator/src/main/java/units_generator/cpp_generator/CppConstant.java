package units_generator.cpp_generator;

import units_generator.internal.ConstantInterface;
import units_schema.Constant;

public class CppConstant implements ConstantInterface {

	private String name;
	private String unitScale;
	private double value;
	private String description;
	private String namespace;
	private String includeNeeded;
	
	public CppConstant(CppSchema schema, Constant constant) {
		name = CppNamesFormatter.toLowerCamelCase(constant.getName());
		unitScale = CppNamesFormatter.formatClassName(constant.getUnitScale());
		value = constant.getValue();
		description = constant.getDescription();
		CppUnitType unitType = (CppUnitType)schema.getUnitTypeOfScale(constant.getUnitScale());
		namespace = unitType.getNamespace();
		includeNeeded = "units/" + unitType.getHeaderFileName();
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

	public String getNamespace() {
		return namespace;
	}

	public String getIncludeNeeded() {
		return includeNeeded;
	}

}
