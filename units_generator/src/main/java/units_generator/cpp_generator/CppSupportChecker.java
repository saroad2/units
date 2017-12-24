package units_generator.cpp_generator;

import units_generator.internal.LanguageSupportChecker;
import units_schema.Constant;
import units_schema.UnitScale;
import units_schema.UnitType;

public class CppSupportChecker implements LanguageSupportChecker{

	@Override
	public boolean isSupported(UnitScale unitScale) { 
		return true;
	}
	
	@Override
	public boolean isSupported(UnitType unitType) { 
		return true;
	}

	@Override
	public boolean isSupported(Constant unitType) {
		return true;
	}
}
