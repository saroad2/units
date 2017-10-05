package units_generator.cpp_generator;

import units_generator.internal.LanguageSupportChecker;
import units_schema.UnitScale;
import units_schema.UnitType;

public class CppSupportChecker implements LanguageSupportChecker{

	public boolean isSupported(UnitScale unitScale) { 
		return true;
	}
	
	public boolean isSupported(UnitType unitType) { 
		return true;
	}
}
