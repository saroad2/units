package units_generator.java_generator;

import units_generator.internal.LanguageSupportChecker;
import units_schema.Constant;
import units_schema.UnitScale;
import units_schema.UnitType;

public class JavaSupportChecker implements LanguageSupportChecker{

	@Override
	public boolean isSupported(UnitScale unitScale) { 
		return true;
	}
	
	@Override
	public boolean isSupported(UnitType unitType) { 
		return true;
	}

	@Override
	public boolean isSupported(Constant constant) {
		return true;
	}
}
