package units_generator.java_generator;

import java.util.Set;
import java.util.TreeSet;

import units_generator.internal.ConstantInterface;
import units_schema.Constant;

public class JavaConstant implements ConstantInterface {

	private String name;
	private String variableName;
	private String unitScale;
	private boolean isDouble;
	private double value;
	private String description;
	private Set<String> neededImports;
	
	public JavaConstant(JavaUnitsSchema schema, Constant constant) {
		name = constant.getName();
		variableName = JavaNamesFormatter.toLowerCamelCase(name);
		initializeUnitScale(schema, constant);
		value = constant.getValue();
		description = constant.getDescription();
	}
	
	private void initializeUnitScale(JavaUnitsSchema schema, Constant constant) {
		neededImports = new TreeSet<>();
		if (constant.getUnitScale() == null) {
			unitScale = "double";
			isDouble = true;
			return;
		}
		JavaUnitScale javaUnitScale = (JavaUnitScale)schema.getUnitScale(constant.getUnitScale());
		unitScale = javaUnitScale.getClassName();
		isDouble = false;
		neededImports.add("com.units." + javaUnitScale.getPackageName() + "." +javaUnitScale.getClassName());
	}
	
	@Override
	public String getName() {
		return name;
	}

	public String getVariableName() {
		return variableName;
	}

	@Override
	public String getUnitScale() {
		return unitScale;
	}

	public boolean getIsDouble() {
		return isDouble;
	}

	@Override
	public double getValue() {
		return value;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public Set<String> getNeededImports() {
		return neededImports;
	}

}
