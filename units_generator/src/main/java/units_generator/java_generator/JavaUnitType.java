package units_generator.java_generator;

import java.util.ArrayList;
import java.util.List;

import units_generator.internal.NamesManipulator;
import units_generator.internal.UnitScaleInterface;
import units_generator.internal.UnitTypeInterface;

import units_schema.UnitType;
import units_schema.Ratio;
import units_schema.UnitScale;

public class JavaUnitType implements UnitTypeInterface {

	private JavaUnitsSchema schema;
	private String typeName;
	private String packageName;
	private String className;
	private String code;
	private List<String> imports;
	private List<UnitScaleInterface> unitScales;
	
	private static JavaSupportChecker supportChecker = new JavaSupportChecker();
	
	public JavaUnitType(JavaUnitsSchema schema, UnitType unitType) {
		this.schema = schema;
		typeName = NamesManipulator.getName(unitType);
		packageName = JavaNamesFormatter.formatPackageName(typeName);
		className = JavaNamesFormatter.formatClassName(typeName);
		code = JavaUnitTypeCodeCalculator.getCode(unitType);
		initializeImports(unitType);
		initializeUnitScales(unitType);
	}

	private void initializeImports(UnitType unitType) {
		imports = new ArrayList<>();
		Ratio ratio = unitType.getRatio();
		if (ratio == null)
			return;
		initializeImportsFromList(ratio.getNumerators());
		initializeImportsFromList(ratio.getDenumerators());
	}
	
	private void initializeImportsFromList(List<String> unitTypesList) {
		if (unitTypesList == null)
			return;
		for (String unitTypeName : unitTypesList) {
			imports.add(
					"com.units." +
					JavaNamesFormatter.formatPackageName(unitTypeName) + "." +
					JavaNamesFormatter.formatClassName(unitTypeName));
		}
	}

	private void initializeUnitScales(UnitType unitType) {
		unitScales = new ArrayList<>();
		for (UnitScale unitScale : unitType.getUnitScales()) {
			if (supportChecker.isSupported(unitScale)) {
				unitScales.add(new JavaUnitScale(schema, this, unitScale));
			}
		}
	}
	
	@Override
	public String getTypeName() {
		return typeName;
	}
	
	public String getPackageName() {
		return packageName;
	}

	public String getClassName() {
		return className;
	}
	
	public String getCode() {
		return code;
	}

	public List<String> getImports() {
		return imports;
	}

	@Override
	public List<UnitScaleInterface> getUnitScales() {
		return unitScales;
	}

}
