package units_generator.java_generator;

import java.util.ArrayList;
import java.util.List;

import units_generator.internal.NamesManipulator;
import units_generator.internal.UnitScaleInterface;
import units_generator.internal.UnitTypeInterface;

import units_schema.UnitType;
import units_schema.UnitScale;

public class JavaUnitType implements UnitTypeInterface {

	private String typeName;
	private String packageName;
	private String className;
	private List<UnitScaleInterface> unitScales;
	
	private static JavaSupportChecker supportChecker = new JavaSupportChecker();
	
	public JavaUnitType(UnitType unitType) {
		typeName = NamesManipulator.getName(unitType);
		packageName = typeName.replaceAll(" ", "_");
		className = JavaNamesFormatter.formatClassname(packageName);
		unitScales = new ArrayList<>();
		for (UnitScale unitScale : unitType.getUnitScales()) {
			if (supportChecker.isSupported(unitScale)) {
				unitScales.add(new JavaUnitScale(this, unitScale));
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
	
	@Override
	public List<UnitScaleInterface> getUnitScales() {
		return unitScales;
	}

}
