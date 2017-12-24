package units_generator.internal;

import units_schema.Constant;
import units_schema.UnitScale;
import units_schema.UnitType;

public interface LanguageSupportChecker {
	
	public boolean isSupported(UnitScale unitScale);
	public boolean isSupported(UnitType unitType);
	public boolean isSupported(Constant unitType);
}
