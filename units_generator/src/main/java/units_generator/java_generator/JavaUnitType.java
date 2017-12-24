package units_generator.java_generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import units_generator.internal.NamesManipulator;
import units_generator.internal.UnitScaleInterface;
import units_generator.internal.AbstractUnitType;

import units_schema.UnitType;
import units_schema.Ratio;
import units_schema.UnitScale;

public class JavaUnitType extends AbstractUnitType {

	private JavaUnitsSchema schema;
	private String typeName;
	private String packageName;
	private String className;
	private String code;
	private Set<String> imports;
	private List<UnitScaleInterface> unitScales;
	
	private static JavaSupportChecker supportChecker = new JavaSupportChecker();
	
	public JavaUnitType(JavaUnitsSchema schema, UnitType unitType) {
		this.schema = schema;
		typeName = NamesManipulator.getName(unitType);
		packageName = JavaNamesFormatter.toLowerUnderscore(typeName);
		className = JavaNamesFormatter.toUpperCamelCase(typeName);
		code = JavaUnitTypeCodeCalculator.getCode(unitType);
		initializeImports(unitType);
		initializeUnitScales(unitType);
	}

	private void initializeImports(UnitType unitType) {
		imports = new TreeSet<>();
		Ratio ratio = unitType.getRatio();
		if (ratio == null)
			return;
		initializeImportsFromList(ratio.getNumerators());
		initializeImportsFromList(ratio.getDenominators());
	}
	
	private void initializeImportsFromList(List<String> unitTypesList) {
		if (unitTypesList == null)
			return;
		for (String unitTypeName : unitTypesList) {
			imports.add(
					"com.units." +
					JavaNamesFormatter.toLowerUnderscore(unitTypeName) + "." +
					JavaNamesFormatter.toUpperCamelCase(unitTypeName));
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

	public Set<String> getImports() {
		return imports;
	}

	@Override
	public List<UnitScaleInterface> getUnitScales() {
		return unitScales;
	}

}
