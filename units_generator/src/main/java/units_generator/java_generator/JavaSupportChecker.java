package units_generator.java_generator;

import units_schema.UnitScale;
import units_schema.UnitType;

public class JavaSupportChecker {

	public static boolean isSupported(UnitScale unitScale) { 
		return unitScale.getIsBasic();
	}
	
	public static boolean isSupported(UnitType unitType) { 
		return unitType.getRatio() == null;
	}
}
