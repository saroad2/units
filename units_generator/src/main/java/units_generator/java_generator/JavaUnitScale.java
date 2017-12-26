package units_generator.java_generator;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import units_generator.internal.NamesManipulator;
import units_generator.internal.UnitScaleInterface;
import units_schema.Ratio;
import units_schema.UnitScale;

public class JavaUnitScale implements UnitScaleInterface {

	private JavaUnitsSchema schema;
	private JavaUnitType unitType;
	private String packageName;
	private String name;
	private String className;
	private String pluralName;
	private String typeClassName;
	private String scale;
	private Set<String> imports;
	
	public JavaUnitScale(JavaUnitsSchema schema, JavaUnitType unitType, UnitScale unitScale) {
		this.schema = schema;
		this.unitType = unitType;
		this.packageName = unitType.getPackageName();
		this.name = NamesManipulator.getName(unitScale);
		this.className = JavaNamesFormatter.toUpperCamelCase(name);
		this.pluralName = unitScale.getPluralName();
		this.typeClassName = unitType.getClassName();
		this.scale = JavaScaleCalculator.calculateScale(unitScale);
		initializeImports(unitScale);
	}

	private void initializeImports(UnitScale unitScale) {
		this.imports = new TreeSet<>();
		if (unitScale.getMultiplierString() != null)
			this.imports.add("com.units.internal.Multipliers");
		initializeImportsFromRatio(unitScale.getRatio());
	}
	
	private void initializeImportsFromRatio(Ratio ratio) {
		if (ratio == null)
			return;
		initializeImportsFromUnitScalesList(ratio.getNumerators());
		initializeImportsFromUnitScalesList(ratio.getDenominators());
	}
	
	private void initializeImportsFromUnitScalesList(List<String> unitScalesList) {
		if (unitScalesList == null)
			return;
		for (String unitScaleName : unitScalesList) {
			String unitTypeName = schema.getUnitTypeOfScale(unitScaleName).getTypeName();
			imports.add(
					"com.units." +
					JavaNamesFormatter.toLowerUnderscore(unitTypeName) + "." +
					JavaNamesFormatter.toUpperCamelCase(unitScaleName));
		}
	}
	
	public JavaUnitType getUnitType() {
		return unitType;
	}

	public String getPackageName() {
		return packageName;
	}

	@Override
	public String getName() {
		return name;
	}

	public String getClassName() {
		return className;
	}

	public String getPluralName() {
		return pluralName;
	}

	public String getTypeClassName() {
		return typeClassName;
	}

	@Override
	public String getScale() {
		return scale;
	}

	public Set<String> getImports() {
		return imports;
	}

}
