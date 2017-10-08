package units_generator.java_generator;

import java.util.ArrayList;
import java.util.List;

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
	private String typeInterfaceName;
	private String scale;
	private List<String> imports;
	
	public JavaUnitScale(JavaUnitsSchema schema, JavaUnitType unitType, UnitScale unitScale) {
		this.schema = schema;
		this.unitType = unitType;
		this.packageName = unitType.getPackageName();
		this.name = NamesManipulator.getName(unitScale);
		this.className = JavaNamesFormatter.formatClassName(name);
		this.pluralName = unitScale.getPluralName();
		this.typeInterfaceName = unitType.getClassName();
		this.scale = JavaScaleCalculator.calculateScale(unitScale);
		initializeImports(unitScale);
	}

	private void initializeImports(UnitScale unitScale) {
		this.imports = new ArrayList<>();
		if (unitScale.getMultiplyerString() != null)
			this.imports.add("com.units.internal.Multiplyers");
		initializeImportsFromRatio(unitScale.getRatio());
	}
	
	private void initializeImportsFromRatio(Ratio ratio) {
		if (ratio == null)
			return;
		initializeImportsFromUnitScalesList(ratio.getNumerators());
		initializeImportsFromUnitScalesList(ratio.getDenumerators());
	}
	
	private void initializeImportsFromUnitScalesList(List<String> unitScalesList) {
		if (unitScalesList == null)
			return;
		for (String unitScaleName : unitScalesList) {
			String unitTypeName = schema.getUnitTypeOfScale(unitScaleName);
			imports.add(
					"com.units." +
					JavaNamesFormatter.formatPackageName(unitTypeName) + "." +
					JavaNamesFormatter.formatClassName(unitScaleName));
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

	public String getTypeInterfaceName() {
		return typeInterfaceName;
	}

	@Override
	public String getScale() {
		return scale;
	}

	public List<String> getImports() {
		return imports;
	}

}
