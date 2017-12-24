package units_generator.java_generator;

import java.util.Set;
import java.util.TreeSet;

import units_generator.internal.ConstantInterface;
import units_schema.Constant;

public class JavaConstant implements ConstantInterface {

	private String name;
	private String variableName;
	private String unitScale;
	private double value;
	private String valueAsString;
	private String description;
	private Set<String> neededImports;
	
	public JavaConstant(JavaUnitsSchema schema, Constant constant) {
		name = constant.getName();
		variableName = JavaNamesFormatter.toLowerCamelCase(name);
		value = constant.getValue();
		initializeUnitScale(schema, constant);
		description = constant.getDescription();
	}
	
	private void initializeUnitScale(JavaUnitsSchema schema, Constant constant) {
		neededImports = new TreeSet<>();
		if (constant.getUnitScale() == null) {
			unitScale = "double";
			valueAsString = String.valueOf(value);
			return;
		}
		JavaUnitScale javaUnitScale = (JavaUnitScale)schema.getUnitScale(constant.getUnitScale());
		unitScale = javaUnitScale.getClassName();
		valueAsString = "new " + unitScale + "(" + value + ")"; 
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

	public String getValueAsString() {
		return valueAsString;
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
