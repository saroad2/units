package units_generator.java_generator;

import java.util.ArrayList;
import java.util.List;

import units_generator.internal.NamesManipulator;
import units_generator.internal.UnitScaleInterface;
import units_schema.UnitScale;

public class JavaUnitScale implements UnitScaleInterface {

	private JavaUnitType unitType;
	private String packageName;
	private String name;
	private String className;
	private String pluralName;
	private String typeInterfaceName;
	private String scale;
	private List<String> imports;
	
	public JavaUnitScale(JavaUnitType unitType, UnitScale unitScale) {
		this.unitType = unitType;
		this.packageName = unitType.getPackageName();
		this.name = NamesManipulator.getName(unitScale);
		this.className = JavaNamesFormatter.formatClassName(name);
		this.pluralName = unitScale.getPluralName();
		this.typeInterfaceName = unitType.getClassName();
		this.scale = JavaScaleCalculator.calculateScale(unitScale);
		this.imports = new ArrayList<>();
		if (unitScale.getMultiplyerString() != null)
			this.imports.add("com.units.internal.Multiplyers");
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
