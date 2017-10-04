package units_generator.java_generator;

import units_generator.NamesManipulator;
import units_generator.internal.UnitScaleInterface;
import units_schema.UnitScale;

public class JavaUnitScale implements UnitScaleInterface {

	private String name;
	private String scale;
	
	public JavaUnitScale(UnitScale unitScale) {
		name = NamesManipulator.getName(unitScale);
		scale = "1";
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getScale() {
		return scale;
	}

}
