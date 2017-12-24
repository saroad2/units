package units_generator.java_generator;

import java.util.Set;
import java.util.TreeSet;

import units_generator.internal.ConstantInterface;
import units_schema.Constant;
import units_schema.Ratio;

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
		if (constant.getUnitScale() != null) {
			initializeSimpleUnitScale(schema, constant);
			return;
		}
		if (constant.getRatio() != null) {
			initializeRatioUnitScale(schema, constant.getRatio());
			return;
		}
		unitScale = "double";
		valueAsString = String.valueOf(value);
	}

	private void initializeSimpleUnitScale(JavaUnitsSchema schema, Constant constant) {
		JavaUnitScale javaUnitScale = (JavaUnitScale)schema.getUnitScale(constant.getUnitScale());
		unitScale = javaUnitScale.getClassName();
		valueAsString = "new " + unitScale + "(" + value + ")"; 
		neededImports.add(importPath(javaUnitScale));
	}

	private void initializeRatioUnitScale(JavaUnitsSchema schema, Ratio ratio) {
		neededImports.add("com.units.internal.AnonymousUnit");
		unitScale = "AnonymousUnit";
		valueAsString = calculateRatioValue(schema, ratio); 
	}
	
	private String calculateRatioValue(JavaUnitsSchema schema, Ratio ratio) {
		JavaUnitScale firstUnitScale = (JavaUnitScale)schema.getUnitScale(ratio.getNumerators().get(0));	
		String returned = "new " + firstUnitScale.getClassName() + "(" + value + ")";
		neededImports.add(importPath(firstUnitScale));
		returned += "\n\t\t";
		for (int i=1; i < ratio.getNumerators().size(); ++i) {
			JavaUnitScale javaUnitScale = (JavaUnitScale)schema.getUnitScale(ratio.getNumerators().get(i));
			returned += ".multiply(" + javaUnitScale.getClassName() + ".one())";
			neededImports.add(importPath(javaUnitScale));
		}
		if (!ratio.getDenominators().isEmpty()) {
			returned += "\n\t\t";
			for (String denominator : ratio.getDenominators()) {
				JavaUnitScale javaUnitScale = (JavaUnitScale)schema.getUnitScale(denominator);
				returned += ".divide(" + javaUnitScale.getClassName() + ".one())";
				neededImports.add(importPath(javaUnitScale));
			}
		}
		return returned;
	}
	
	private String importPath(JavaUnitScale unitScale) {
		return "com.units." + unitScale.getPackageName() + "." +unitScale.getClassName();
		
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
